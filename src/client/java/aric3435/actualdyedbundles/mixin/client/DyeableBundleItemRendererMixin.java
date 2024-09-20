package aric3435.actualdyedbundles.mixin;

import aric3435.actualdyedbundles.DyeableBundleItem;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemRenderer.class)
public class DyeableBundleItemRendererMixin {
    @Inject(method = "renderItem", at = @At("HEAD"), cancellable = true)
    private void renderDyeableBundle(ItemStack stack, ModelTransformation.Mode mode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay, BakedModel model, CallbackInfo ci) {
        if (stack.getItem() instanceof DyeableBundleItem) {
            int color = DyeableBundleItem.getColor(stack);
            // rendering code is in WIP - aric3435
        }
    }
}
