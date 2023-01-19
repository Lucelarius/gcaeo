package by.lucelarius.gcaoe.util;

import by.lucelarius.gcaoe.block.Blocks_GCAOE;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TABGCAOE extends CreativeTabs
{
    public TABGCAOE()
    {
        super("GCAOresExtended");
    }

    @Override
    public Item getTabIconItem()
    {
        return Item.getItemFromBlock(Blocks_GCAOE.ores1);
    }
}
