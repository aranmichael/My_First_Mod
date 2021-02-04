package aran2kmods.earthmod.items;

import aran2kmods.earthmod.EarthMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class PickaxeBase extends ItemPickaxe {
    private final String name;

    public PickaxeBase(String name, ToolMaterial material, CreativeTabs tab) {
        super(material);
        this.name = name;
        setRegistryName(EarthMod.MODID, name);
        setUnlocalizedName(name);
        setCreativeTab(tab);
    }

    public void registerItemModel() {
        EarthMod.proxy.registerItemRenderer(this, 0, name);
    }
}
