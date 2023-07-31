package com.example.examplemod.event.loot;

import com.example.examplemod.init.ModItems;
import net.minecraft.entity.passive.*;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.init.Items;

import java.util.Random;

public class PooAdditionModifier{
    @SubscribeEvent
    public void customLootTableDrop(LivingDropsEvent event){
        Random rand = new Random();
        if(event.getEntityLiving() instanceof EntityPig){
            if (rand.nextInt(1) == 0){
                event.getEntityLiving().entityDropItem(new ItemStack(ModItems.POO), 0.0f);
            }
        }
        if(event.getEntityLiving() instanceof EntityCow){
            if (rand.nextInt(1) == 0){
                event.getEntityLiving().entityDropItem(new ItemStack(ModItems.POO), 0.0f);
            }
        }
        if(event.getEntityLiving() instanceof EntityChicken){
            if (rand.nextInt(1) == 0){
                event.getEntityLiving().entityDropItem(new ItemStack(ModItems.POO), 0.0f);
            }
        }
        if(event.getEntityLiving() instanceof EntityLlama){
            if (rand.nextInt(1) == 0){
                event.getEntityLiving().entityDropItem(new ItemStack(ModItems.POO), 0.0f);
            }
        }
        if(event.getEntityLiving() instanceof EntitySheep){
            if (rand.nextInt(1) == 0){
                event.getEntityLiving().entityDropItem(new ItemStack(ModItems.POO), 0.0f);
            }
        }
        if(event.getEntityLiving() instanceof EntityVillager){
            if (rand.nextInt(1) == 0){
                event.getEntityLiving().entityDropItem(new ItemStack(Items.EMERALD), 0.0f);
            }
        }
    }
}
