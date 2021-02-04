package aran2kmods.earthmod;

import aran2kmods.earthmod.items.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {


    public static Item.ToolMaterial EARTH_MATERIAL = EnumHelper.addToolMaterial("material_earth", 3, 10999, 8.0F, 100.0F, 10);
    public static Item.ToolMaterial WATER_MATERIAL = EnumHelper.addToolMaterial("material_water", 3, 10999, 8.0F, 100.0F, 10);

    public static EarthIngot EARTH_INGOT = new EarthIngot();
    public static CreativeTabs EARTH_TAB = new CreativeTabs("earth") {
        @Override
        public ItemStack getTabIconItem() {
            return EARTH_INGOT.getDefaultInstance();
        }
    };

    public static WaterIngot WATER_INGOT = new WaterIngot();
    public static CreativeTabs WATER_TAB = new CreativeTabs("water") {
        @Override
        public ItemStack getTabIconItem() {
            return WATER_INGOT.getDefaultInstance();
        }
    };

    public static AxeBase EARTH_AXE = new AxeBase("earth_axe", EARTH_MATERIAL, EARTH_TAB, 1900.0F, -2.0F);
    public static AxeBase WATER_AXE = new AxeBase("water_axe", WATER_MATERIAL, WATER_TAB, 1900.0F, -2.0F);
    public static HoeBase EARTH_HOE = new HoeBase("earth_hoe", EARTH_MATERIAL, EARTH_TAB);
    public static HoeBase WATER_HOE = new HoeBase("water_hoe", WATER_MATERIAL, WATER_TAB);
    public static PickaxeBase EARTH_PICKAXE = new PickaxeBase("earth_pickaxe", EARTH_MATERIAL, EARTH_TAB);
    public static PickaxeBase WATER_PICKAXE = new PickaxeBase("water_pickaxe", WATER_MATERIAL, WATER_TAB);
    public static SpadeBase EARTH_SPADE = new SpadeBase("earth_shovel", EARTH_MATERIAL, EARTH_TAB);
    public static SpadeBase WATER_SPADE = new SpadeBase("water_shovel", WATER_MATERIAL, WATER_TAB);
    public static SwordBase EARTH_SWORD = new SwordBase("earth_sword", EARTH_MATERIAL, EARTH_TAB);
    public static SwordBase WATER_SWORD = new SwordBase("water_sword", WATER_MATERIAL, WATER_TAB);
    public static ItemEarthBow EARTH_BOW = new ItemEarthBow();


    public static ItemArmor.ArmorMaterial EARTH_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("armor_material_earth", EarthMod.MODID + ":earth", 10999, new int[]{3, 6, 8, 3}, 35, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);

    public static ArmorBase EARTH_BOOTS = new ArmorBase("earth_boots", EARTH_ARMOR_MATERIAL, 1, EntityEquipmentSlot.FEET, ModItems.EARTH_TAB);
    public static ArmorBase EARTH_LEGGINGS = new ArmorBase("earth_leggings", EARTH_ARMOR_MATERIAL, 2, EntityEquipmentSlot.LEGS, ModItems.EARTH_TAB);
    public static ArmorBase EARTH_CHESTPLATE = new ArmorBase("earth_chestplate", EARTH_ARMOR_MATERIAL, 1, EntityEquipmentSlot.CHEST, ModItems.EARTH_TAB);
    public static ArmorBase EARTH_HELMET = new ArmorBase("earth_helmet", EARTH_ARMOR_MATERIAL, 1, EntityEquipmentSlot.HEAD, ModItems.EARTH_TAB);


    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                EARTH_BOW,
                EARTH_AXE,
                EARTH_HOE,
                EARTH_PICKAXE,
                EARTH_SPADE,
                WATER_AXE,
                WATER_HOE,
                WATER_PICKAXE,
                WATER_SPADE,
                EARTH_SWORD,
                WATER_SWORD,
                EARTH_INGOT,
                WATER_INGOT,
                EARTH_BOOTS,
                EARTH_LEGGINGS,
                EARTH_CHESTPLATE,
                EARTH_HELMET
        );
    }

    public static void registerModels() {
        EARTH_INGOT.registerItemModel();
        WATER_INGOT.registerItemModel();

        EARTH_BOW.registerItemModel();
        EARTH_AXE.registerItemModel();
        EARTH_HOE.registerItemModel();
        EARTH_PICKAXE.registerItemModel();
        EARTH_SPADE.registerItemModel();
        EARTH_SWORD.registerItemModel();

        WATER_AXE.registerItemModel();
        WATER_HOE.registerItemModel();
        WATER_PICKAXE.registerItemModel();
        WATER_SPADE.registerItemModel();
        WATER_SWORD.registerItemModel();

        EARTH_BOOTS.registerItemModel();
        EARTH_LEGGINGS.registerItemModel();
        EARTH_CHESTPLATE.registerItemModel();
        EARTH_HELMET.registerItemModel();

    }
}
