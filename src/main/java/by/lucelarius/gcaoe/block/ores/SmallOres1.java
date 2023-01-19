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

public class SmallOres1 extends Block
{
    public IIcon[] blockIcons;

    public SmallOres1(String assetName)
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
        this.blockIcons = new IIcon[9];
        this.blockIcons[0] = reg.registerIcon(GCAOE.TEXTURE_PREFIX + "Small" + "CertusQuartz");
        this.blockIcons[1] = reg.registerIcon(GCAOE.TEXTURE_PREFIX + "Small" + "Cooperite");
        this.blockIcons[2] = reg.registerIcon(GCAOE.TEXTURE_PREFIX + "Small" + "Dolamide");
        this.blockIcons[3] = reg.registerIcon(GCAOE.TEXTURE_PREFIX + "Small" + "Iridium");
        this.blockIcons[4] = reg.registerIcon(GCAOE.TEXTURE_PREFIX + "Small" + "Naquadah");
        this.blockIcons[5] = reg.registerIcon(GCAOE.TEXTURE_PREFIX + "Small" + "Pyrite");
        this.blockIcons[6] = reg.registerIcon(GCAOE.TEXTURE_PREFIX + "Small" + "Scheelite");
        this.blockIcons[7] = reg.registerIcon(GCAOE.TEXTURE_PREFIX + "Small" + "Sperrylite");
        this.blockIcons[8] = reg.registerIcon(GCAOE.TEXTURE_PREFIX + "Small" + "Trinium");
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
        for (int i = 0; i < 9; i++) {
            list.add(new ItemStack(item, 1, i));
        }
    }
}
