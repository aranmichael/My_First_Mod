package aran2kmods.earthmod.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockOre extends BlockBase {

    private final Item toDrop;
    private final int minDropAmount;
    private final int maxDropAmount;

    public BlockOre(String name, Item toDrop, int minDropAmount, int maxDropAmount, float hardness, float resistance) {
        super(Material.ROCK, name);
        this.toDrop = toDrop;
        this.minDropAmount = minDropAmount;
        this.maxDropAmount = maxDropAmount;
        setHardness(hardness);
        setResistance(resistance);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return toDrop == null ? Item.getItemFromBlock(this) : toDrop;
    }

    @Override
    public int quantityDropped(Random random) {
        return this.minDropAmount + random.nextInt(this.maxDropAmount - this.minDropAmount + 1);
    }

    @Override
    public int quantityDroppedWithBonus(int fortune, Random random) {
        if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped(this.getDefaultState(), random, fortune))
        {
            int i = random.nextInt(fortune + 2) - 1;
            if (i < 0)
            {
                i = 0;
            }
            return this.quantityDropped(random) * (i + 1);
        }
        else
        {
            return this.quantityDropped(random);
        }
    }

    @Override
    public BlockOre setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }


}