package com.example.examplemod.items.armor;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.init.ModItems;
import com.example.examplemod.util.IHasModel;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel {

    public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
    {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ExampleMod.modtab);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        ExampleMod.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
