package by.lucelarius.gcaoe.common.block.ore;

import by.lucelarius.gcaoe.GCAOE;
import by.lucelarius.gcaoe.common.creative.CTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import gregapi.code.ArrayListNoNulls;
import gregapi.data.MT;
import gregapi.data.OP;
import gregapi.oredict.OreDictMaterial;
import gregapi.util.ST;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EOreSmall1 extends Block {
    @SideOnly(Side.CLIENT)
    public IIcon[] blockIcons;
    private static final String TEXTURE_PREFIX = GCAOE.MOD_ID + ":smallore/" + "oreSmall";
    public static final Random REXP = new Random();
    public final int expBase, expRandom;

    public EOreSmall1(String assetName) {
        super(Material.rock);
        this.setHardness(3.0F);
        this.setResistance(15F);
        this.setLightLevel(0F);
        this.setLightOpacity(15);
        this.setBlockName(assetName);
        this.setCreativeTab(CTab.INSTANCE);
        expBase = Math.max(0, 1);
        expRandom = Math.max(0, 2);
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
        for (int i = 0; i < 9; i++) {
            list.add(new ItemStack(item, 1, i));
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg) {
        this.blockIcons = new IIcon[9];
        this.blockIcons[0] = reg.registerIcon(TEXTURE_PREFIX + "CertusQuartz");
        this.blockIcons[1] = reg.registerIcon(TEXTURE_PREFIX + "Cooperite");
        this.blockIcons[2] = reg.registerIcon(TEXTURE_PREFIX + "Dolamide");
        this.blockIcons[3] = reg.registerIcon(TEXTURE_PREFIX + "Iridium");
        this.blockIcons[4] = reg.registerIcon(TEXTURE_PREFIX + "Naquadah");
        this.blockIcons[5] = reg.registerIcon(TEXTURE_PREFIX + "Pyrite");
        this.blockIcons[6] = reg.registerIcon(TEXTURE_PREFIX + "Scheelite");
        this.blockIcons[7] = reg.registerIcon(TEXTURE_PREFIX + "Sperrylite");
        this.blockIcons[8] = reg.registerIcon(TEXTURE_PREFIX + "Trinium");
        this.blockIcon = this.blockIcons[0];
    }

    public static final OreDictMaterial[] aMaterial = {MT.CertusQuartz, MT.OREMATS.Cooperite, MT.Dolamide, MT.Ir, MT.Nq, MT.Pyrite, MT.OREMATS.Scheelite, MT.OREMATS.Sperrylite, MT.Ke, MT.NULL, MT.NULL, MT.NULL, MT.NULL, MT.NULL, MT.NULL, MT.NULL};

    public ArrayList<ItemStack> getDrops(World World, int aX, int aY, int aZ, int aMetaData, int aFortune) {
        ArrayList<ItemStack> rList = new ArrayList<ItemStack>();
        OreDictMaterial mSecondaryDrop = MT.STONES.SpaceRock;
        if (aMaterial[aMetaData] != null) aMaterial[aMetaData] = aMaterial[aMetaData].mTargetCrushing.mMaterial;

        if (aMaterial[aMetaData] != null) {
            Random tRandom = new Random(aX ^ aY ^ aZ);
            for (int i = 0; i < 16; i++) tRandom.nextInt(10000);
            if (aMaterial[aMetaData] == MT.STONES.Gneiss || aMaterial[aMetaData] == MT.PetrifiedWood) {
                ItemStack tStack = OP.rockGt.mat(aMaterial[aMetaData], 1);
                for (int i = 0, j = Math.max(1, aMaterial[aMetaData].mOreMultiplier*aMaterial[aMetaData].mOreProcessingMultiplier+(aFortune>0?(tRandom.nextInt((1+aFortune)*aMaterial[aMetaData].mOreMultiplier*aMaterial[aMetaData].mOreProcessingMultiplier)):0)/2+tRandom.nextInt(2)); i < j; i++) {
                    rList.add(ST.update(ST.copy(tStack)));
                }
            } else {
                ItemStack tStack = OP.gemLegendary.mat(aMaterial[aMetaData], 1);
                if (tStack != null && tRandom.nextInt(10000) <= aFortune) {
                    rList.add(ST.update(tStack));
                } else {
                    ArrayList<ItemStack> tSelector = new ArrayList<ItemStack>();
                    tStack = OP.gemExquisite.mat(aMaterial[aMetaData], OP.gem.mat(aMaterial[aMetaData], 4), 1);
                    if (tStack != null) for (int i = 0, j = 1; i < j; i++) tSelector.add(tStack);
                    tStack = OP.gemFlawless.mat(aMaterial[aMetaData], OP.gem.mat(aMaterial[aMetaData], 2), 1);
                    if (tStack != null) for (int i = 0, j = 2; i < j; i++) tSelector.add(tStack);
                    tStack = OP.gem.mat(aMaterial[aMetaData], 1);
                    if (tStack != null) for (int i = 0, j = 12; i < j; i++) tSelector.add(tStack);

                    tStack = OP.gemFlawed.mat(aMaterial[aMetaData], 2);
                    if (tStack != null){for (int i = 0, j = 5; i < j; i++) tSelector.add(tStack);
                        tStack = OP.crushed.mat(aMaterial[aMetaData], 1);
                        if (tStack != null) for (int i = 0, j = 10; i < j; i++) tSelector.add(tStack);
                    } else {
                        tStack = OP.crushed.mat(aMaterial[aMetaData], 1);
                        if (tStack != null) for (int i = 0, j = 15; i < j; i++) tSelector.add(tStack);
                    }

                    tStack = OP.gemChipped.mat(aMaterial[aMetaData], 4);
                    if (tStack != null){for (int i = 0, j = 5; i < j; i++) tSelector.add(tStack);
                        tStack = OP.crushed.mat(aMaterial[aMetaData], OP.dust.mat(aMaterial[aMetaData], 1), 1);
                        if (tStack != null) for (int i = 0, j = 10; i < j; i++) tSelector.add(tStack);
                    } else {
                        tStack = OP.crushed.mat(aMaterial[aMetaData], 1);
                        if (tStack != null) for (int i = 0, j = 15; i < j; i++) tSelector.add(tStack);
                    }

                    if (tSelector.size() > 0) {
                        for (int i = 0, j = Math.max(1, aMaterial[aMetaData].mOreMultiplier*aMaterial[aMetaData].mOreProcessingMultiplier+(aFortune>0?(tRandom.nextInt((1+aFortune)*aMaterial[aMetaData].mOreMultiplier*aMaterial[aMetaData].mOreProcessingMultiplier)):0)/2); i < j; i++) {
                            rList.add(ST.update(ST.copy(tSelector.get(tRandom.nextInt(tSelector.size())))));
                        }
                    }
                }
            }
            if (tRandom.nextInt(3+aFortune)>1) rList.add(ST.update(OP.dust.mat(mSecondaryDrop.mTargetCrushing.mMaterial, 1)));
        }
        return rList;
    }

    public int getExpDrop(IBlockAccess world, int metadata, int fortune)
    {
        return expBase + REXP.nextInt(1 + expRandom);
    }
}
