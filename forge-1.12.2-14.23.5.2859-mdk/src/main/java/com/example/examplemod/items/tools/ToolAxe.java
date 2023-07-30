package com.example.examplemod.items.tools;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.init.ModItems;
import com.example.examplemod.util.IHasModel;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel {
    public ToolAxe(String name, ToolMaterial material){
        super(material, 6.0f, -3.2f);
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
