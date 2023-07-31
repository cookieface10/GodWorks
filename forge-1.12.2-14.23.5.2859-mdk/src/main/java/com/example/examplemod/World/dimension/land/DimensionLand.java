package com.example.examplemod.World.dimension.land;

import com.example.examplemod.init.BiomeInit;
import com.example.examplemod.init.DimensionInit;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;

public class DimensionLand extends WorldProvider {
    public DimensionLand(){
        this.biomeProvider = new BiomeProviderSingle(BiomeInit.LAND_DIMENSION);
    }

    @Override
    public DimensionType getDimensionType() {
        return DimensionInit.LAND;
    }

    @Override
    public IChunkGenerator createChunkGenerator() {
        return new ChunkGeneratorLand(world, false, world.getSeed());
    }

    @Override
    public boolean canRespawnHere() {
        return false;
    }

    @Override
    public boolean isSurfaceWorld() {
        return false;
    }
}
