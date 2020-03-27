package com.creativecommmons.lessperipherals.items;

import com.creativecommmons.lessperipherals.Main;
import com.creativecommmons.lessperipherals.init.ModItems;
import com.creativecommmons.lessperipherals.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.REDSTONE);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {

        Main.proxy.registerItemRenderer(this, 0, "inventory");

    }
}
