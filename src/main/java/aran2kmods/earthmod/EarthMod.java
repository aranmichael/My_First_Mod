package aran2kmods.earthmod;

import aran2kmods.earthmod.gen.OreGen;
import aran2kmods.earthmod.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import org.apache.logging.log4j.Logger;

@Mod(modid = EarthMod.MODID, name = EarthMod.NAME, version = EarthMod.VERSION)
@Mod.EventBusSubscriber
public class EarthMod {

    public static final String MODID = "aran2k_earthmod";
    public static final String NAME = "Earth Mod";
    public static final String VERSION = "0.2";

    private static Logger logger;

    @SidedProxy(serverSide = "aran2kmods.earthmod.proxy.CommonProxy", clientSide = "aran2kmods.earthmod.proxy.ClientProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        OreDictionary.registerOre("oreEarth", ModBlocks.EARTH_ORE);
        OreDictionary.registerOre("oreWater", ModBlocks.WATER_ORE);
        GameRegistry.registerWorldGenerator(new OreGen(), 0);

        logger.info("                                                  ");
        logger.info(" █████╗ ██████╗  █████╗ ███╗   ██╗██████╗ ██╗  ██╗");
        logger.info("██╔══██╗██╔══██╗██╔══██╗████╗  ██║╚════██╗██║ ██╔╝");
        logger.info("███████║██████╔╝███████║██╔██╗ ██║ █████╔╝█████╔╝ ");
        logger.info("██╔══██║██╔══██╗██╔══██║██║╚██╗██║██╔═══╝ ██╔═██╗ ");
        logger.info("██║  ██║██║  ██║██║  ██║██║ ╚████║███████╗██║  ██╗");
        logger.info("╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝╚══════╝╚═╝  ╚═╝");
        logger.info("                                                  ");
        logger.info("==========  Aran2K's EarthMod initialized!  ==========");

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        ModItems.register(event.getRegistry());
        ModBlocks.registerItemBlocks(event.getRegistry());
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        ModBlocks.register(event.getRegistry());
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        ModItems.registerModels();
        ModBlocks.registerModels();
    }

}
