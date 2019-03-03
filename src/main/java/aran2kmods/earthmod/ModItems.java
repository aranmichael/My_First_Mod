package aran2kmods.earthmod;

import aran2kmods.earthmod.items.Baton;
import aran2kmods.earthmod.items.EarthIngot;
import aran2kmods.earthmod.items.ItemEarthBow;
import aran2kmods.earthmod.items.WaterIngot;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    public static Baton DIAMOND_BATON = new Baton(Item.ToolMaterial.DIAMOND);
    public static ItemEarthBow EARTH_BOW = new ItemEarthBow();

    public static EarthIngot EARTH_INGOT = new EarthIngot();
    public static WaterIngot WATER_INGOT = new WaterIngot();

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                EARTH_BOW,
                DIAMOND_BATON,
                EARTH_INGOT,
                WATER_INGOT
        );
    }

    public static void registerModels() {
        DIAMOND_BATON.registerItemModel();
        EARTH_BOW.registerItemModel();
        EARTH_INGOT.registerItemModel();
        WATER_INGOT.registerItemModel();
    }
}
