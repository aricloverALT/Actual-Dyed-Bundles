package aric3435.actualdyedbundles;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;

public class DyeableBundleItem extends Item {
    public DyeableBundleItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack itemStack = player.getStackInHand(hand);
        // WORK IN PROGRESS - aric3435
        return new TypedActionResult<>(ActionResult.SUCCESS, itemStack);
    }

    public static void applyDye(ItemStack stack, int color) {
        NbtCompound nbt = stack.getOrCreateNbt();
        nbt.putInt("CustomColor", color);
    }

    public static int getColor(ItemStack stack) {
        NbtCompound nbt = stack.getNbt();
        return nbt != null && nbt.contains("CustomColor") ? nbt.getInt("CustomColor") : 0xFFFFFF;
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return getColor(stack) != 0xFFFFFF;
    }
}
