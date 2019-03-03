package aran2kmods.earthmod;

import aran2kmods.earthmod.blocks.BlockOre;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
    public static BlockOre EARTH_ORE = new BlockOre("earth_ore", ModItems.EARTH_INGOT, 1, 3, 3f, 5f);
    public static BlockOre WATER_ORE = new BlockOre("water_ore", ModItems.WATER_INGOT, 1, 3, 3f, 5f);


    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                EARTH_ORE,
                WATER_ORE
        );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                EARTH_ORE.createItemBlock(),
                WATER_ORE.createItemBlock()
        );
    }

    public static void registerModels() {
        EARTH_ORE.registerItemModel(Item.getItemFromBlock(EARTH_ORE));
        WATER_ORE.registerItemModel(Item.getItemFromBlock(WATER_ORE));
    }
}
