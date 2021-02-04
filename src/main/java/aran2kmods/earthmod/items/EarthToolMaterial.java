package aran2kmods.earthmod.items;

import aran2kmods.earthmod.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public enum EarthToolMaterial {
    EARTH(3, 11561, 8.0F, 9000.0F, 10),
    WATER(3, 11561, 12.0F, 90.0F, 200);

    /** The level of material this tool can harvest (3 = DIAMOND, 2 = IRON, 1 = STONE, 0 = WOOD/GOLD) */
    private final int harvestLevel;
    /** The number of uses this material allows. (wood = 59, stone = 131, iron = 250, diamond = 1561, gold = 32) */
    private final int maxUses;
    /** The strength of this tool material against blocks which it is effective against. */
    private final float efficiency;
    /** Damage versus entities. */
    private final float attackDamage;
    /** Defines the natural enchantability factor of the material. */
    private final int enchantability;
    //Added by forge for custom Tool materials.
    private ItemStack repairMaterial = ItemStack.EMPTY;

    private EarthToolMaterial(int harvestLevel, int maxUses, float efficiency, float damageVsEntity, int enchantability)
    {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = damageVsEntity;
        this.enchantability = enchantability;
    }

    /**
     * The number of uses this material allows. (wood = 59, stone = 131, iron = 250, diamond = 1561, gold = 32)
     */
    public int getMaxUses()
    {
        return this.maxUses;
    }

    /**
     * The strength of this tool material against blocks which it is effective against.
     */
    public float getEfficiency()
    {
        return this.efficiency;
    }

    /**
     * Returns the damage against a given entity.
     */
    public float getAttackDamage()
    {
        return this.attackDamage;
    }

    /**
     * The level of material this tool can harvest (3 = DIAMOND, 2 = IRON, 1 = STONE, 0 = IRON/GOLD)
     */
    public int getHarvestLevel()
    {
        return this.harvestLevel;
    }

    /**
     * Return the natural enchantability factor of the material.
     */
    public int getEnchantability()
    {
        return this.enchantability;
    }

    @Deprecated // Use getRepairItemStack below
    public Item getRepairItem()
    {
        if (this == EARTH) {
            return ModItems.EARTH_INGOT;
        } else {
            return ModItems.WATER_INGOT;
        }
    }

    public EarthToolMaterial setRepairItem(ItemStack stack)
    {
        if (!this.repairMaterial.isEmpty()) throw new RuntimeException("Repair material has already been set");
        this.repairMaterial = stack;
        return this;
    }

    public ItemStack getRepairItemStack()
    {
        if (!repairMaterial.isEmpty()) return repairMaterial;
        Item ret = this.getRepairItem();
        if (ret != null) repairMaterial = new ItemStack(ret, 1, net.minecraftforge.oredict.OreDictionary.WILDCARD_VALUE);
        return repairMaterial;
    }
}
