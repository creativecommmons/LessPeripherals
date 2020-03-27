package com.creativecommmons.lessperipherals.creativetab;

import com.creativecommmons.lessperipherals.init.ModBlocks;
import com.creativecommmons.lessperipherals.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CreativeTab {

    public static final CreativeTabs LP_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {

        @SideOnly(Side.CLIENT)
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Item.getItemFromBlock(ModBlocks.CHATBOX_BLOCK));
        }

    };

}
