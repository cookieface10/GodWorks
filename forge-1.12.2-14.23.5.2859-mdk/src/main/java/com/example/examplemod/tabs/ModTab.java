package com.example.examplemod.tabs;

import com.example.examplemod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModTab extends CreativeTabs
{
    public ModTab(String label){
        super("modtab");
        //this.setBackgroundImageName()
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.HEALING_SWORD);
    }
}
