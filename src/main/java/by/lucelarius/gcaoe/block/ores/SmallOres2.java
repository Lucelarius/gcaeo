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

public class SmallOres2 extends Block
{
    public IIcon[] blockIcons;

    public SmallOres2(String assetName)
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
        this.blockIcons = new IIcon[11];
        this.blockIcons[0] = reg.registerIcon(GCAOE.TEXTURE_PREFIX + "Small" + "Bismuth");
        this.blockIcons[1] = reg.registerIcon(GCAOE.TEXTURE_PREFIX + "Small" + "Coltan");
        this.blockIcons[2] = reg.registerIcon(GCAOE.TEXTURE_PREFIX + "Small" + "Copper");
        this.blockIcons[3] = reg.registerIcon(GCAOE.TEXTURE_PREFIX + "Small" + "Craponite");
        this.blockIcons[4] = reg.registerIcon(GCAOE.TEXTURE_PREFIX + "Small" + "Diamond");
        this.blockIcons[5] = reg.registerIcon(GCAOE.TEXTURE_PREFIX + "Small" + "Graphite");
        this.blockIcons[6] = reg.registerIcon(GCAOE.TEXTURE_PREFIX + "Small" + "Lead");
        this.blockIcons[7] = reg.registerIcon(GCAOE.TEXTURE_PREFIX + "Small" + "Platinum");
        this.blockIcons[8] = reg.registerIcon(GCAOE.TEXTURE_PREFIX + "Small" + "Silver");
        this.blockIcons[9] = reg.registerIcon(GCAOE.TEXTURE_PREFIX + "Small" + "Tin");
        this.blockIcons[10] = reg.registerIcon(GCAOE.TEXTURE_PREFIX + "Small" + "Zinc");
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
        for (int i = 0; i < 11; i++) {
            list.add(new ItemStack(item, 1, i));
        }
    }
}
