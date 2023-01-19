package by.lucelarius.gcaoe.block.ores;

import by.lucelarius.gcaoe.GCAOE;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class Ores2 extends Block
{
    public IIcon[] blockIcons;

    public Ores2(String assetName)
    {
        super(Material.rock);
        this.setHardness(3.0F);
        this.setResistance(15F);
        this.setLightLevel(0F);
        this.setLightOpacity(15);
        this.setBlockName(assetName);
    }

    @Override
    public CreativeTabs getCreativeTabToDisplayOn()
    {
        return GCAOE.CREATAB;
    }

    @Override
    public void registerBlockIcons(IIconRegister reg)
    {
        this.blockIcons = new IIcon[12];
        this.blockIcons[0] = reg.registerIcon(GCAOE.TEXTURE_PREFIX + "Arsenopyrite");
        this.blockIcons[1] = reg.registerIcon(GCAOE.TEXTURE_PREFIX + "Barite");
        this.blockIcons[2] = reg.registerIcon(GCAOE.TEXTURE_PREFIX + "Chalcopyrite");
        this.blockIcons[3] = reg.registerIcon(GCAOE.TEXTURE_PREFIX + "DuraniumHexachloride");
        this.blockIcons[4] = reg.registerIcon(GCAOE.TEXTURE_PREFIX + "DuraniumHexafluoride");
        this.blockIcons[5] = reg.registerIcon(GCAOE.TEXTURE_PREFIX + "DuraniumHexaiodide");
        this.blockIcons[6] = reg.registerIcon(GCAOE.TEXTURE_PREFIX + "Gold");
        this.blockIcons[7] = reg.registerIcon(GCAOE.TEXTURE_PREFIX + "MilkyQuartz");
        this.blockIcons[8] = reg.registerIcon(GCAOE.TEXTURE_PREFIX + "Palladium");
        this.blockIcons[9] = reg.registerIcon(GCAOE.TEXTURE_PREFIX + "Pinalite");
        this.blockIcons[10] = reg.registerIcon(GCAOE.TEXTURE_PREFIX + "Russellite");
        this.blockIcons[11] = reg.registerIcon(GCAOE.TEXTURE_PREFIX + "Tungstate");
        this.blockIcon = this.blockIcons[0];
    }

    @Override
    public IIcon getIcon(int side, int meta)
    {
        if (meta < 0 || meta >= this.blockIcons.length)
        {
            return this.blockIcon;
        }

        return this.blockIcons[meta];
    }

    @Override
    public int damageDropped(int meta) {
        return meta;
    }

    @Override
    public void getSubBlocks(Item item, CreativeTabs tab, List list) {
        for (int i = 0; i < 12; i++) {
            list.add(new ItemStack(item, 1, i));
        }
    }
}
