package aric3435.actualdyedbundles;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ActualDyedBundlesMod implements ModInitializer {
    public static final Item WHITE_BUNDLE = new DyeableBundleItem(new Item.Settings().maxCount(1));
    public static final Item ORANGE_BUNDLE = new DyeableBundleItem(new Item.Settings().maxCount(1));
    public static final Item MAGENTA_BUNDLE = new DyeableBundleItem(new Item.Settings().maxCount(1));
    public static final Item LIGHT_BLUE_BUNDLE = new DyeableBundleItem(new Item.Settings().maxCount(1));
    public static final Item YELLOW_BUNDLE = new DyeableBundleItem(new Item.Settings().maxCount(1));
    public static final Item LIME_BUNDLE = new DyeableBundleItem(new Item.Settings().maxCount(1));
    public static final Item PINK_BUNDLE = new DyeableBundleItem(new Item.Settings().maxCount(1));
    public static final Item GRAY_BUNDLE = new DyeableBundleItem(new Item.Settings().maxCount(1));
    public static final Item LIGHT_GRAY_BUNDLE = new DyeableBundleItem(new Item.Settings().maxCount(1));
    public static final Item CYAN_BUNDLE = new DyeableBundleItem(new Item.Settings().maxCount(1));
    public static final Item PURPLE_BUNDLE = new DyeableBundleItem(new Item.Settings().maxCount(1));
    public static final Item BLUE_BUNDLE = new DyeableBundleItem(new Item.Settings().maxCount(1));
    public static final Item BROWN_BUNDLE = new DyeableBundleItem(new Item.Settings().maxCount(1));
    public static final Item GREEN_BUNDLE = new DyeableBundleItem(new Item.Settings().maxCount(1));
    public static final Item RED_BUNDLE = new DyeableBundleItem(new Item.Settings().maxCount(1));
    public static final Item BLACK_BUNDLE = new DyeableBundleItem(new Item.Settings().maxCount(1));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("actualdyedbundles", "white_bundle"), WHITE_BUNDLE);
        Registry.register(Registry.ITEM, new Identifier("actualdyedbundles", "orange_bundle"), ORANGE_BUNDLE);
        Registry.register(Registry.ITEM, new Identifier("actualdyedbundles", "magenta_bundle"), MAGENTA_BUNDLE);
        Registry.register(Registry.ITEM, new Identifier("actualdyedbundles", "light_blue_bundle"), LIGHT_BLUE_BUNDLE);
        Registry.register(Registry.ITEM, new Identifier("actualdyedbundles", "yellow_bundle"), YELLOW_BUNDLE);
        Registry.register(Registry.ITEM, new Identifier("actualdyedbundles", "lime_bundle"), LIME_BUNDLE);
        Registry.register(Registry.ITEM, new Identifier("actualdyedbundles", "pink_bundle"), PINK_BUNDLE);
        Registry.register(Registry.ITEM, new Identifier("actualdyedbundles", "gray_bundle"), GRAY_BUNDLE);
        Registry.register(Registry.ITEM, new Identifier("actualdyedbundles", "light_gray_bundle"), LIGHT_GRAY_BUNDLE);
        Registry.register(Registry.ITEM, new Identifier("actualdyedbundles", "cyan_bundle"), CYAN_BUNDLE);
        Registry.register(Registry.ITEM, new Identifier("actualdyedbundles", "purple_bundle"), PURPLE_BUNDLE);
        Registry.register(Registry.ITEM, new Identifier("actualdyedbundles", "blue_bundle"), BLUE_BUNDLE);
        Registry.register(Registry.ITEM, new Identifier("actualdyedbundles", "brown_bundle"), BROWN_BUNDLE);
        Registry.register(Registry.ITEM, new Identifier("actualdyedbundles", "green_bundle"), GREEN_BUNDLE);
        Registry.register(Registry.ITEM, new Identifier("actualdyedbundles", "red_bundle"), RED_BUNDLE);
        Registry.register(Registry.ITEM, new Identifier("actualdyedbundles", "black_bundle"), BLACK_BUNDLE);
    }
}
