package aran2kmods.earthmod.blocks;

import aran2kmods.earthmod.EarthMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BlockBase extends Block {

    private Logger logger = LogManager.getLogger(EarthMod.MODID);

    protected String name;

    public BlockBase(Material material, String name) {
        super(material);

        this.name = name;

        setUnlocalizedName(name);
        setRegistryName(EarthMod.MODID, name);
    }

    public Item createItemBlock() {
        Item item = new ItemBlock(this).setRegistryName(getRegistryName());
        return item;
    }

    public void registerItemModel(Item itemBlock) {
        EarthMod.proxy.registerItemRenderer(itemBlock, 0, name);
    }

    @Override
    public BlockBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}