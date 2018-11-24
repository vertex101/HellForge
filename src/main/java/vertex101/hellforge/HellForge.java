package vertex101.hellforge;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import vertex101.hellforge.proxy.CommonProxy;

@Mod(modid = HellForge.MODID, name = HellForge.MODNAME, version = HellForge.MODVERSION, dependencies = "required-after:forge@[14.23.5.2768,)", useMetadata = true)
public class HellForge {

    public static final String MODID = "hellforge";
    public static final String MODNAME = "HellForge";
    public static final String MODVERSION= "0.0.1";

    @SidedProxy(clientSide = "vertex101.hellforge.proxy.ClientProxy", serverSide = "vertex101.hellforge.proxy.ServerProxy")
    public static CommonProxy proxy;

    public static CreativeTabs creativeTab = new CreativeTabs("hellforge") {
        @Override
        public ItemStack getTabIconItem() {
            return null;
        }
    };

    @Mod.Instance
    public static HellForge instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
