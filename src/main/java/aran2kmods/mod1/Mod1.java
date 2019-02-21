package aran2kmods.mod1;

import aran2kmods.mod1.items.Baton;
import aran2kmods.mod1.proxy.CommonProxy;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Mod1.MODID, name = Mod1.NAME, version = Mod1.VERSION)
@Mod.EventBusSubscriber
public class Mod1
{
    public static final String MODID = "aran2k_mod1";
    public static final String NAME = "Mod 1";
    public static final String VERSION = "0.1";

    private static Logger logger;

    @SidedProxy(serverSide = "aran2kmods.mod1.proxy.CommonProxy", clientSide = "aran2kmods.mod1.proxy.ClientProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        logger.info("aran2k_mod1 pre-initialization");
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("                                                  ");
        logger.info(" █████╗ ██████╗  █████╗ ███╗   ██╗██████╗ ██╗  ██╗");
        logger.info("██╔══██╗██╔══██╗██╔══██╗████╗  ██║╚════██╗██║ ██╔╝");
        logger.info("███████║██████╔╝███████║██╔██╗ ██║ █████╔╝█████╔╝ ");
        logger.info("██╔══██║██╔══██╗██╔══██║██║╚██╗██║██╔═══╝ ██╔═██╗ ");
        logger.info("██║  ██║██║  ██║██║  ██║██║ ╚████║███████╗██║  ██╗");
        logger.info("╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝╚══════╝╚═╝  ╚═╝");
        logger.info("                                                  ");
        logger.info("==========  Aran2k's Mod1 initialized!  ==========");


    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        Item diamondBaton = new Baton(Item.ToolMaterial.DIAMOND)
                .setRegistryName(MODID, "diamond_baton")
                .setUnlocalizedName("batonDiamond");
        logger.info("Registering {}", diamondBaton.getRegistryName());
        event.getRegistry().registerAll(diamondBaton);
        proxy.registerItemRenderer(diamondBaton, 0, "diamond_baton");
    }

}
