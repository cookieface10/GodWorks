package com.example.examplemod.init;

import com.example.examplemod.items.food.FoodBase;
import com.example.examplemod.items.food.FoodEffectBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;

import net.minecraft.item.ItemFood;

import java.util.ArrayList;

import  java.util.List;

import com.example.examplemod.items.ItemBase;
import net.minecraft.potion.PotionEffect;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item POO = new FoodEffectBase("poo", 1, 0, false, new PotionEffect(MobEffects.POISON, 2* (60 * 20), 1, false, true));
}
