package by.lucelarius.gcaoe.common.block;

import by.lucelarius.gcaoe.common.block.ore.EOre1;
import by.lucelarius.gcaoe.common.block.ore.EOre2;
import by.lucelarius.gcaoe.common.block.ore.EOreSmall1;
import by.lucelarius.gcaoe.common.block.ore.EOreSmall2;
import by.lucelarius.gcaoe.common.item.EItem;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class EBlock {
    public static Block ore1;
    public static Block ore2;
    public static Block smallore1;
    public static Block smallore2;

    public static void init() {
        ore1 = new EOre1("ore1");
        ore2 = new EOre2("ore2");
        smallore1 = new EOreSmall1("smallore1");
        smallore2 = new EOreSmall2("smallore2");
    }

    public static void register() {
        GameRegistry.registerBlock(ore1, EItem.class, ore1.getUnlocalizedName());
        GameRegistry.registerBlock(ore2, EItem.class, ore2.getUnlocalizedName());
        GameRegistry.registerBlock(smallore1, EItem.class, smallore1.getUnlocalizedName());
        GameRegistry.registerBlock(smallore2, EItem.class, smallore2.getUnlocalizedName());

        setHarvestLevels();
    }

    public static void setHarvestLevels()
    {
        ore1.setHarvestLevel("pickaxe", 1, 0);    // CertusQuartz
        ore1.setHarvestLevel("pickaxe", 0, 1);    // Cooperite
        ore1.setHarvestLevel("pickaxe", 0, 2);    // Dolamide
        ore1.setHarvestLevel("pickaxe", 4, 3);    // Iridium
        ore1.setHarvestLevel("pickaxe", 4, 4);    // Naquadah
        ore1.setHarvestLevel("pickaxe", 0, 5);    // Pyrite
        ore1.setHarvestLevel("pickaxe", 3, 6);    // Scheelite
        ore1.setHarvestLevel("pickaxe", 0, 7);    // Sperrylite
        ore1.setHarvestLevel("pickaxe", 4, 8);    // Trinium

        ore2.setHarvestLevel("pickaxe", 0, 0);    // Arsenopyrite
        ore2.setHarvestLevel("pickaxe", 0, 1);    // Barite
        ore2.setHarvestLevel("pickaxe", 0, 2);    // Chalcopyrite
        ore2.setHarvestLevel("pickaxe", 4, 3);    // DuraniumHexachloride
        ore2.setHarvestLevel("pickaxe", 4, 4);    // DuraniumHexafluoride
        ore2.setHarvestLevel("pickaxe", 4, 5);    // DuraniumHexaiodide
        ore2.setHarvestLevel("pickaxe", 2, 6);    // Gold
        ore2.setHarvestLevel("pickaxe", 1, 7);    // MilkyQuartz
        ore2.setHarvestLevel("pickaxe", 2, 8);    // Palladium
        ore2.setHarvestLevel("pickaxe", 3, 9);    // Pinalite
        ore2.setHarvestLevel("pickaxe", 3, 10);   // Russellite
        ore2.setHarvestLevel("pickaxe", 3, 11);   // Tungstate
    }
}
