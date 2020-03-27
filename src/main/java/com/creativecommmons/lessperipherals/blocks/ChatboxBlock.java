package com.creativecommmons.lessperipherals.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ChatboxBlock extends BlockBase {


    public ChatboxBlock(String name, Material material) {
        super(name, material);

        setSoundType(SoundType.CLOTH);
        setHardness(0.8f);
        setResistance(2.5f);

    }
}
