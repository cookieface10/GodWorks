package com.example.examplemod.util.handlers;

import com.example.examplemod.event.loot.PooAdditionModifier;
import net.minecraftforge.common.MinecraftForge;

public class EventHandler {
    public static void registerEvents(){
        PooAdditionModifier lootevent = new PooAdditionModifier();
        MinecraftForge.EVENT_BUS.register(lootevent);
    }
}
