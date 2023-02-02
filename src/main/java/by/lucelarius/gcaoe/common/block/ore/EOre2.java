package by.lucelarius.gcaoe.common.block.ore;

import by.lucelarius.gcaoe.GCAOE;
import by.lucelarius.gcaoe.common.creative.CTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class EOre2 extends Block {
    @SideOnly(Side.CLIENT)
    public IIcon[] blockIcons;
    private static final String TEXTURE_PREFIX = GCAOE.MOD_ID + ":ore/" + "ore";

    public EOre2(String assetName) {
        super(Material.rock);
        this.setHardness(3.0F);
        this.setResistance(15F);
        this.setLightLevel(0F);
        this.setLightOpacity(15);
        this.setBlockName(assetName);
        this.setCreativeTab(CTab.INSTANCE);
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if (meta < 0 || meta >= this.blockIcons.length)
        {
            return this.blockIcon;
        }
        return this.blockIcons[meta];
    }

    public int damageDropped(int meta) {
        return meta;
    }

    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List list) {
        for (int i = 0; i < 12; i++) {
            list.add(new ItemStack(item, 1, i));
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg) {
        this.blockIcons = new IIcon[12];
        this.blockIcons[0] = reg.registerIcon(TEXTURE_PREFIX + "Arsenopyrite");
        this.blockIcons[1] = reg.registerIcon(TEXTURE_PREFIX + "Barite");
        this.blockIcons[2] = reg.registerIcon(TEXTURE_PREFIX + "Chalcopyrite");
        this.blockIcons[3] = reg.registerIcon(TEXTURE_PREFIX + "DuraniumHexachloride");
        this.blockIcons[4] = reg.registerIcon(TEXTURE_PREFIX + "DuraniumHexafluoride");
        this.blockIcons[5] = reg.registerIcon(TEXTURE_PREFIX + "DuraniumHexaiodide");
        this.blockIcons[6] = reg.registerIcon(TEXTURE_PREFIX + "Gold");
        this.blockIcons[7] = reg.registerIcon(TEXTURE_PREFIX + "MilkyQuartz");
        this.blockIcons[8] = reg.registerIcon(TEXTURE_PREFIX + "Palladium");
        this.blockIcons[9] = reg.registerIcon(TEXTURE_PREFIX + "Pinalite");
        this.blockIcons[10] = reg.registerIcon(TEXTURE_PREFIX + "Russellite");
        this.blockIcons[11] = reg.registerIcon(TEXTURE_PREFIX + "Tungstate");
        this.blockIcon = this.blockIcons[0];
    }
}
