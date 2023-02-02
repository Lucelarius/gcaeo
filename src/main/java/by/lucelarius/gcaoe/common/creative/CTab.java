package by.lucelarius.gcaoe.common.creative;

import by.lucelarius.gcaoe.GCAOE;
import by.lucelarius.gcaoe.common.block.EBlock;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CTab extends CreativeTabs {
    public static final CTab INSTANCE = new CTab();

    private CTab() {
        super(GCAOE.MOD_ID);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
        return Item.getItemFromBlock(EBlock.ore1);
    }
}
