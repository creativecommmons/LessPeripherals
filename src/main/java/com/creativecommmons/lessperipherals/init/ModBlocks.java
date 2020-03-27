package com.creativecommmons.lessperipherals.init;

import com.creativecommmons.lessperipherals.blocks.BlockBase;
import com.creativecommmons.lessperipherals.blocks.ChatboxBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block CHATBOX_BLOCK = new ChatboxBlock("chatbox_block", Material.CLOTH);

}
