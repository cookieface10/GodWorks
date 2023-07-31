package com.example.examplemod.World;

import net.minecraft.world.biome.Biome;

public class BiomeLand extends Biome {
    public BiomeLand(){
        super(new BiomeProperties("Land").setBaseHeight(1.5F).setHeightVariation(1.2F).setTemperature(0.6F).setRainDisabled().setWaterColor(16711680));

    }
}
