package com.creativecommmons.lessperipherals.blocks;

import com.creativecommmons.lessperipherals.Main;
import com.creativecommmons.lessperipherals.creativetab.CreativeTab;
import com.creativecommmons.lessperipherals.init.ModBlocks;
import com.creativecommmons.lessperipherals.init.ModItems;
import com.creativecommmons.lessperipherals.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

    public BlockBase(String name, Material material) {

        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTab.LP_TAB);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }


    @Override
    public void registerModels() {

        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");

    }
}
