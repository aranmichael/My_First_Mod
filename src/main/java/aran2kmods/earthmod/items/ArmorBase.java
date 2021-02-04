package aran2kmods.earthmod.items;

import aran2kmods.earthmod.EarthMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor {

    private final String name;

    public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, CreativeTabs tabs) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        this.name = name;
        setRegistryName(EarthMod.MODID, name);
        setUnlocalizedName(name);
        setCreativeTab(tabs);
    }

    public void registerItemModel() {
        EarthMod.proxy.registerItemRenderer(this, 0, name);
    }


}
