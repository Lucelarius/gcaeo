package by.lucelarius.gcaoe;

import by.lucelarius.gcaoe.block.Blocks_GCAOE;
import by.lucelarius.gcaoe.item.ItemOres;
import by.lucelarius.gcaoe.util.TABGCAOE;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import gregapi.data.MT;
import gregapi.data.OP;
import gregapi.util.OM;
import gregapi.util.ST;
import java.util.HashMap;
import net.minecraft.item.ItemStack;

@Mod(modid = GCAOE.MODID, version = GCAOE.VERSION)
public class GCAOE {
    public static final String MODID = "GCAOresExtended";
    public static final String VERSION = "1.0";

    public static HashMap<String, ItemStack> itemList = new HashMap<String, ItemStack>();
    public static HashMap<String, ItemStack> blocksList = new HashMap<String, ItemStack>();

    public static final TABGCAOE CREATAB;

    public static String ASSET_PREFIX = "gcaoe";
    public static String TEXTURE_PREFIX = GCAOE.ASSET_PREFIX + ":" + "ore";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        Blocks_GCAOE.initBlocks();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        GameRegistry.registerBlock(Blocks_GCAOE.ores1, ItemOres.class, Blocks_GCAOE.ores1.getUnlocalizedName());
        GameRegistry.registerBlock(Blocks_GCAOE.ores2, ItemOres.class, Blocks_GCAOE.ores2.getUnlocalizedName());
        GameRegistry.registerBlock(Blocks_GCAOE.smallores1, ItemOres.class, Blocks_GCAOE.smallores1.getUnlocalizedName());
        GameRegistry.registerBlock(Blocks_GCAOE.smallores2, ItemOres.class, Blocks_GCAOE.smallores2.getUnlocalizedName());

        OM.reg(OP.oreSpace, MT.CertusQuartz, ST.make(Blocks_GCAOE.ores1, 1, 0));
        OM.reg(OP.oreSpace, MT.OREMATS.Cooperite, ST.make(Blocks_GCAOE.ores1, 1, 1));
        OM.reg(OP.oreSpace, MT.Dolamide, ST.make(Blocks_GCAOE.ores1, 1, 2));
        OM.reg(OP.oreSpace, MT.Ir, ST.make(Blocks_GCAOE.ores1, 1, 3));
        OM.reg(OP.oreSpace, MT.Nq, ST.make(Blocks_GCAOE.ores1, 1, 4));
        OM.reg(OP.oreSpace, MT.Pyrite, ST.make(Blocks_GCAOE.ores1, 1, 5));
        OM.reg(OP.oreSpace, MT.OREMATS.Scheelite, ST.make(Blocks_GCAOE.ores1, 1, 6));
        OM.reg(OP.oreSpace, MT.OREMATS.Sperrylite, ST.make(Blocks_GCAOE.ores1, 1, 7));
        OM.reg(OP.oreSpace, MT.Ke, ST.make(Blocks_GCAOE.ores1, 1, 8));

        OM.reg(OP.oreSpace, MT.OREMATS.Arsenopyrite, ST.make(Blocks_GCAOE.ores2, 1, 0));
        OM.reg(OP.oreSpace, MT.OREMATS.Barite, ST.make(Blocks_GCAOE.ores2, 1, 1));
        OM.reg(OP.oreSpace, MT.OREMATS.Chalcopyrite, ST.make(Blocks_GCAOE.ores2, 1, 2));
        OM.reg(OP.oreSpace, MT.OREMATS.DuraniumHexachloride, ST.make(Blocks_GCAOE.ores2, 1, 3));
        OM.reg(OP.oreSpace, MT.OREMATS.DuraniumHexafluoride, ST.make(Blocks_GCAOE.ores2, 1, 4));
        OM.reg(OP.oreSpace, MT.OREMATS.DuraniumHexaiodide, ST.make(Blocks_GCAOE.ores2, 1, 5));
        OM.reg(OP.oreSpace, MT.Au, ST.make(Blocks_GCAOE.ores2, 1, 6));
        OM.reg(OP.oreSpace, MT.MilkyQuartz, ST.make(Blocks_GCAOE.ores2, 1, 7));
        OM.reg(OP.oreSpace, MT.Pd, ST.make(Blocks_GCAOE.ores2, 1, 8));
        OM.reg(OP.oreSpace, MT.OREMATS.Pinalite, ST.make(Blocks_GCAOE.ores2, 1, 9));
        OM.reg(OP.oreSpace, MT.OREMATS.Russellite, ST.make(Blocks_GCAOE.ores2, 1, 10));
        OM.reg(OP.oreSpace, MT.OREMATS.Tungstate, ST.make(Blocks_GCAOE.ores2, 1, 11));
    }

    static
    {
        CREATAB = new TABGCAOE();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
