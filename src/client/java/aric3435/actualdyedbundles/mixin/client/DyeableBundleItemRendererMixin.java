package aric3435.actualdyedbundles.mixin;

import aric3435.actualdyedbundles.DyeableBundleItem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.model.json.ModelTransformation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemRenderer.class)
public class DyeableBundleItemRendererMixin {
    private static final Identifier BUNDLE_TEXTURE = new Identifier("minecraft", "textures/item/bundle.png");

    @Inject(method = "renderItem", at = @At("HEAD"), cancellable = true)
    private void renderDyeableBundle(ItemStack stack, ModelTransformation.Mode mode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay, BakedModel model, CallbackInfo ci) {
        if (stack.getItem() instanceof DyeableBundleItem) {
            int color = DyeableBundleItem.getColor(stack);
            float red = (color >> 16 & 255) / 255.0F;
            float green = (color >> 8 & 255) / 255.0F;
            float blue = (color & 255) / 255.0F;

            MinecraftClient.getInstance().getTextureManager().bindTexture(BUNDLE_TEXTURE);

            VertexConsumer vertexConsumer = vertexConsumers.getBuffer(RenderLayer.getEntityTranslucent(BUNDLE_TEXTURE));
            model.render(matrices, vertexConsumer, light, overlay, red, green, blue, 1.0F);

            ci.cancel();
        }
    }
}
