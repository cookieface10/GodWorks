package com.example.examplemod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PooBlock extends BlockBase {

    public PooBlock(String name, Material material) {
        super(name, material);
        setSoundType(SoundType.SLIME);
        setHardness(0.1F);
        setResistance(1.0F);
        //setHarvestLevel("spade", 0);
    }
}
