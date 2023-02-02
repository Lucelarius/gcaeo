package by.lucelarius.gcaoe;

import by.lucelarius.gcaoe.common.CommonProxy;
import by.lucelarius.gcaoe.common.block.EBlock;
import by.lucelarius.gcaoe.common.util.GT6_OreDict;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import static by.lucelarius.gcaoe.GCAOE.*;

@Mod(modid = MOD_ID, name = NAME, version = VERSION)
public class GCAOE {
    public static final String MOD_ID = "gcaoe";
    public static final String VERSION = "1.0.0";
    public static final String NAME = "GCAOE Mod";

    @SidedProxy(
            clientSide = "by.lucelarius.gcaoe.client.ClientProxy",
            serverSide = "by.lucelarius.gcaoe.common.CommonProxy"
    )
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        EBlock.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        EBlock.register();
        GT6_OreDict.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
