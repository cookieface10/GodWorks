package com.example.examplemod.init;

import com.example.examplemod.World.BiomeLand;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BiomeInit
{
    public static final Biome LAND_DIMENSION = new BiomeLand();

    public static void registerBiomes(){
        initBiome(LAND_DIMENSION, "Land", BiomeManager.BiomeType.WARM, BiomeDictionary.Type.SPOOKY, BiomeDictionary.Type.DENSE, BiomeDictionary.Type.WET);
    }

    private static Biome initBiome(Biome biome, String name, BiomeManager.BiomeType biomeType, BiomeDictionary.Type... types){
        biome.setRegistryName(name);
        ForgeRegistries.BIOMES.register(biome);
        System.out.println("Biome Registered");
        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addBiome(biomeType, new BiomeManager.BiomeEntry(biome, 10));
        BiomeManager.addSpawnBiome(biome);
        System.out.println("Biome Added");
        return biome;
    }


}
