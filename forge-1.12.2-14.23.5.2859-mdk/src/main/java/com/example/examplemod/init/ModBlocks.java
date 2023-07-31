package com.example.examplemod.init;
import com.example.examplemod.blocks.BlockTeleporter;
import com.example.examplemod.blocks.PooBlock;
import net.minecraft.block.Block;

import java.util.ArrayList;

import  java.util.List;

import com.example.examplemod.blocks.BlockBase;
import net.minecraft.block.material.Material;

public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block POO_BLOCK = new PooBlock("poo_block", Material.SPONGE);
    public static final Block BLUEPORTAL = new BlockTeleporter("blueportal", Material.IRON);
}
