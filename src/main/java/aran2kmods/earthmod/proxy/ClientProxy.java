package aran2kmods.earthmod.proxy;

import aran2kmods.earthmod.EarthMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClientProxy extends CommonProxy {

    private Logger logger = LogManager.getLogger(EarthMod.MODID);
    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        logger.info("registering item renderer {} with id {}", item, id);
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(EarthMod.MODID + ":" + id, "inventory"));
    }

}
