package com.example.examplemod.init;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.util.IHasModel;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel {

    public ArmorBase(String name, ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlot)
    {
        super(material, renderIndex, equipmentSlot);
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
