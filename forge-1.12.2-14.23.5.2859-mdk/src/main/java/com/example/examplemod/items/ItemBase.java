package com.example.examplemod.items;
import com.example.examplemod.ExampleMod;
import com.example.examplemod.init.ModItems;
import com.example.examplemod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ExampleMod.modtab);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        
        ExampleMod.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
