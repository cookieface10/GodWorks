package com.example.examplemod.init;

import com.example.examplemod.World.dimension.land.DimensionLand;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DimensionInit {
    public static final DimensionType LAND = DimensionType.register("Land", "_land", 2, DimensionLand.class, false);

    public static void registerDimensions(){
        DimensionManager.registerDimension(2, LAND);
    }
}
