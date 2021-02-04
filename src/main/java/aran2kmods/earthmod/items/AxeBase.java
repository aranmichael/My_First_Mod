package aran2kmods.earthmod.items;

import aran2kmods.earthmod.EarthMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class AxeBase extends ItemAxe {

    private String name;

    public AxeBase(String name, ToolMaterial material, CreativeTabs tab) {
        super(material);
        this.name = name;
        setRegistryName(EarthMod.MODID, name);
        setUnlocalizedName(name);
        setCreativeTab(tab);
    }

    public AxeBase(String name, ToolMaterial material, CreativeTabs tab, float damage, float speed) {
        super(material, damage, speed);
        this.name = name;
        setRegistryName(EarthMod.MODID, name);
        setUnlocalizedName(name);
        setCreativeTab(tab);
    }

    public void registerItemModel() {
        EarthMod.proxy.registerItemRenderer(this, 0, name);
    }

}
