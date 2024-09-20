package aric3435.actualdyedbundles;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BundleMod implements ModInitializer {
    public static final Item DYEABLE_BUNDLE = new DyeableBundleItem(new Item.Settings().maxCount(1));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("actualdyedbundles", "dyeable_bundle"), DYEABLE_BUNDLE);
    }
}
