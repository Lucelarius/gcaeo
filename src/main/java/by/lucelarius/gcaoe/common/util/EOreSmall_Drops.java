package by.lucelarius.gcaoe.common.util;

import gregapi.data.MT;
import gregapi.data.OP;
import gregapi.oredict.OreDictMaterial;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.ArrayList;

public class EOreSmall_Drops {

    private final OreDictMaterial rockDrop;

    public EOreSmall_Drops() {
        this.rockDrop = MT.STONES.SpaceRock;
    }

    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
    {
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
        ret.add(new ItemStack(OP.dust.mat(this.rockDrop, 1).getItem()));
        ret.add(new ItemStack(Items.diamond, 2));

        return ret;
    }
}
