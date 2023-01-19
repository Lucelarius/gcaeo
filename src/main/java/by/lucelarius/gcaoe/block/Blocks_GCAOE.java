package by.lucelarius.gcaoe.block;

import by.lucelarius.gcaoe.block.ores.Ores1;
import by.lucelarius.gcaoe.block.ores.Ores2;
import by.lucelarius.gcaoe.block.ores.SmallOres1;
import by.lucelarius.gcaoe.block.ores.SmallOres2;
import micdoodle8.mods.galacticraft.planets.asteroids.blocks.AsteroidBlocks;
import gregapi.block.behaviors.Drops;
import gregapi.block.behaviors.Drops_SmallOre;
import gregapi.block.prefixblock.PrefixBlock_;
import gregapi.code.ItemStackContainer;
import gregapi.data.CS;
import gregapi.data.MD;
import gregapi.data.MT;
import gregapi.data.OP;
import net.minecraft.block.Block;

public class Blocks_GCAOE {
    public static Block ores1;
    public static Block ores2;
    public static Block smallores1;
    public static Block smallores2;

    public static void initBlocks()
    {
        Blocks_GCAOE.ores1 = new Ores1("ores1");
        Blocks_GCAOE.ores2 = new Ores2("ores2");
        Blocks_GCAOE.smallores1 = new SmallOres1("smallores1");
        Blocks_GCAOE.smallores2 = new SmallOres2("smallores2");

        Blocks_GCAOE.setHarvestLevels();
    }

    public static void setHarvestLevels()
    {
        Blocks_GCAOE.ores1.setHarvestLevel("pickaxe", 1, 0);    // CertusQuartz
        Blocks_GCAOE.ores1.setHarvestLevel("pickaxe", 0, 1);    // Cooperite
        Blocks_GCAOE.ores1.setHarvestLevel("pickaxe", 0, 2);    // Dolamide
        Blocks_GCAOE.ores1.setHarvestLevel("pickaxe", 4, 3);    // Iridium
        Blocks_GCAOE.ores1.setHarvestLevel("pickaxe", 4, 4);    // Naquadah
        Blocks_GCAOE.ores1.setHarvestLevel("pickaxe", 0, 5);    // Pyrite
        Blocks_GCAOE.ores1.setHarvestLevel("pickaxe", 3, 6);    // Scheelite
        Blocks_GCAOE.ores1.setHarvestLevel("pickaxe", 0, 7);    // Sperrylite
        Blocks_GCAOE.ores1.setHarvestLevel("pickaxe", 4, 8);    // Trinium

        Blocks_GCAOE.ores2.setHarvestLevel("pickaxe", 0, 0);    // Arsenopyrite
        Blocks_GCAOE.ores2.setHarvestLevel("pickaxe", 0, 1);    // Barite
        Blocks_GCAOE.ores2.setHarvestLevel("pickaxe", 0, 2);    // Chalcopyrite
        Blocks_GCAOE.ores2.setHarvestLevel("pickaxe", 4, 3);    // DuraniumHexachloride
        Blocks_GCAOE.ores2.setHarvestLevel("pickaxe", 4, 4);    // DuraniumHexafluoride
        Blocks_GCAOE.ores2.setHarvestLevel("pickaxe", 4, 5);    // DuraniumHexaiodide
        Blocks_GCAOE.ores2.setHarvestLevel("pickaxe", 2, 6);    // Gold
        Blocks_GCAOE.ores2.setHarvestLevel("pickaxe", 1, 7);    // MilkyQuartz
        Blocks_GCAOE.ores2.setHarvestLevel("pickaxe", 2, 8);    // Palladium
        Blocks_GCAOE.ores2.setHarvestLevel("pickaxe", 3, 9);    // Pinalite
        Blocks_GCAOE.ores2.setHarvestLevel("pickaxe", 3, 10);   // Russellite
        Blocks_GCAOE.ores2.setHarvestLevel("pickaxe", 3, 11);   // Tungstate

        Blocks_GCAOE.smallores1.setHarvestLevel("pickaxe", 0, 0);   // CertusQuartz
        Blocks_GCAOE.smallores1.setHarvestLevel("pickaxe", 0, 1);   // Cooperite
        Blocks_GCAOE.smallores1.setHarvestLevel("pickaxe", 0, 2);   // Dolamide
        Blocks_GCAOE.smallores1.setHarvestLevel("pickaxe", 0, 3);   // Iridium
        Blocks_GCAOE.smallores1.setHarvestLevel("pickaxe", 0, 4);   // Naquadah
        Blocks_GCAOE.smallores1.setHarvestLevel("pickaxe", 0, 5);   // Pyrite
        Blocks_GCAOE.smallores1.setHarvestLevel("pickaxe", 0, 6);   // Scheelite
        Blocks_GCAOE.smallores1.setHarvestLevel("pickaxe", 0, 7);   // Sperrylite
        Blocks_GCAOE.smallores1.setHarvestLevel("pickaxe", 0, 8);   // Trinium

        Blocks_GCAOE.smallores2.setHarvestLevel("pickaxe", 0, 0);   // Bismuth
        Blocks_GCAOE.smallores2.setHarvestLevel("pickaxe", 0, 1);   // Coltan
        Blocks_GCAOE.smallores2.setHarvestLevel("pickaxe", 0, 2);   // Copper
        Blocks_GCAOE.smallores2.setHarvestLevel("pickaxe", 0, 3);   // Craponite
        Blocks_GCAOE.smallores2.setHarvestLevel("pickaxe", 0, 4);   // Diamond
        Blocks_GCAOE.smallores2.setHarvestLevel("pickaxe", 0, 5);   // Graphite
        Blocks_GCAOE.smallores2.setHarvestLevel("pickaxe", 0, 6);   // Lead
        Blocks_GCAOE.smallores2.setHarvestLevel("pickaxe", 0, 7);   // Platinum
        Blocks_GCAOE.smallores2.setHarvestLevel("pickaxe", 0, 8);   // Silver
        Blocks_GCAOE.smallores2.setHarvestLevel("pickaxe", 0, 9);   // Tin
        Blocks_GCAOE.smallores2.setHarvestLevel("pickaxe", 0, 10);  // Zinc
    }
}
