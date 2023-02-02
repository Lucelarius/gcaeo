package by.lucelarius.gcaoe.common.util;

import by.lucelarius.gcaoe.common.block.EBlock;
import gregapi.data.MT;
import gregapi.data.OP;
import gregapi.util.OM;
import gregapi.util.ST;

public class GT6_OreDict {

    public static void init() {
        OM.reg(OP.oreSpace, MT.CertusQuartz, ST.make(EBlock.ore1, 1, 0));
        OM.reg(OP.oreSpace, MT.OREMATS.Cooperite, ST.make(EBlock.ore1, 1, 1));
        OM.reg(OP.oreSpace, MT.Dolamide, ST.make(EBlock.ore1, 1, 2));
        OM.reg(OP.oreSpace, MT.Ir, ST.make(EBlock.ore1, 1, 3));
        OM.reg(OP.oreSpace, MT.Nq, ST.make(EBlock.ore1, 1, 4));
        OM.reg(OP.oreSpace, MT.Pyrite, ST.make(EBlock.ore1, 1, 5));
        OM.reg(OP.oreSpace, MT.OREMATS.Scheelite, ST.make(EBlock.ore1, 1, 6));
        OM.reg(OP.oreSpace, MT.OREMATS.Sperrylite, ST.make(EBlock.ore1, 1, 7));
        OM.reg(OP.oreSpace, MT.Ke, ST.make(EBlock.ore1, 1, 8));

        OM.reg(OP.oreSpace, MT.OREMATS.Arsenopyrite, ST.make(EBlock.ore2, 1, 0));
        OM.reg(OP.oreSpace, MT.OREMATS.Barite, ST.make(EBlock.ore2, 1, 1));
        OM.reg(OP.oreSpace, MT.OREMATS.Chalcopyrite, ST.make(EBlock.ore2, 1, 2));
        OM.reg(OP.oreSpace, MT.OREMATS.DuraniumHexachloride, ST.make(EBlock.ore2, 1, 3));
        OM.reg(OP.oreSpace, MT.OREMATS.DuraniumHexafluoride, ST.make(EBlock.ore2, 1, 4));
        OM.reg(OP.oreSpace, MT.OREMATS.DuraniumHexaiodide, ST.make(EBlock.ore2, 1, 5));
        OM.reg(OP.oreSpace, MT.Au, ST.make(EBlock.ore2, 1, 6));
        OM.reg(OP.oreSpace, MT.MilkyQuartz, ST.make(EBlock.ore2, 1, 7));
        OM.reg(OP.oreSpace, MT.Pd, ST.make(EBlock.ore2, 1, 8));
        OM.reg(OP.oreSpace, MT.OREMATS.Pinalite, ST.make(EBlock.ore2, 1, 9));
        OM.reg(OP.oreSpace, MT.OREMATS.Russellite, ST.make(EBlock.ore2, 1, 10));
        OM.reg(OP.oreSpace, MT.OREMATS.Tungstate, ST.make(EBlock.ore2, 1, 11));
    }
}
