package com.example.examplemod.items.tools;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.init.ModItems;
import com.example.examplemod.util.IHasModel;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel {
    public ToolPickaxe(String name, ToolMaterial material){
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ExampleMod.modtab);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        ExampleMod.proxy.registerItemRenderer(this, 0 , "inventory");
    }
}
