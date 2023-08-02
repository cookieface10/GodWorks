package com.example.examplemod.init;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.items.HealingSword;
import com.example.examplemod.items.TestingItem;
import com.example.examplemod.items.armor.ArmorBase;
import com.example.examplemod.items.food.FoodEffectBase;
import com.example.examplemod.items.food.FoodEffectBaseGlowing;
import com.example.examplemod.items.tools.*;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;

import java.util.ArrayList;

import  java.util.List;

import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    //Material types
    public static final Item.ToolMaterial MATERIAL_EMERALD = EnumHelper.addToolMaterial("material_emerald", 3, 32, 7.0F, 2.5F, 20);
    public static final Item.ToolMaterial MATERIAL_HEALING = EnumHelper.addToolMaterial("material_healing", 0, 32, 8.0f, 2.5f, 20);
    public static final ItemArmor.ArmorMaterial ARMOR_EMERALD = EnumHelper.addArmorMaterial("armor emerald", ExampleMod.MODID + ":emerald", 1300, new int [] {3, 6, 7, 3}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
    public static final Item.ToolMaterial MATERIAL_TEST = EnumHelper.addToolMaterial("material_test", 999,9999,999, 0, 20);
    //items

    public static final Item POO = new FoodEffectBase("poop", 1, 0, false, new PotionEffect(MobEffects.POISON, 2* (60 * 20), 40, false, true));

    public static final Item CRYSTALIZED_APPLE = new FoodEffectBaseGlowing("crystal_apple", 10, 10, false, new PotionEffect(MobEffects.REGENERATION,  20, 30, true, true));

    //Fancy items (items with special features)
    public static final Item HEALING_SWORD = new HealingSword("heal_sword");
    public static final Item TEST_ITEM = new TestingItem("tester_item");

    //Tools
    public static final ItemSword EMERALD_SWORD = new ToolSword("emerald_sword", MATERIAL_EMERALD);
    public static final ItemSpade EMERALD_SPADE = new ToolSpade("emerald_shovel", MATERIAL_EMERALD);
    public static final ItemPickaxe EMERALD_PICKAXE = new ToolPickaxe("emerald_pickaxe", MATERIAL_EMERALD);
    public static final ItemAxe EMERALD_AXE = new ToolAxe("emerald_axe", MATERIAL_EMERALD);


    //Armor
    public  static  final Item HELMET_EMERALD = new ArmorBase("helmet_emerald", ARMOR_EMERALD, 1, EntityEquipmentSlot.HEAD);
    public  static  final Item CHESTPLATE_EMERALD = new ArmorBase("chestplate_emerald", ARMOR_EMERALD, 1, EntityEquipmentSlot.CHEST);
    public  static  final Item LEGGINGS_EMERALD = new ArmorBase("leggings_emerald", ARMOR_EMERALD, 2, EntityEquipmentSlot.LEGS);
    public  static  final Item BOOTS_EMERALD = new ArmorBase("boots_emerald", ARMOR_EMERALD, 1, EntityEquipmentSlot.FEET);

}
