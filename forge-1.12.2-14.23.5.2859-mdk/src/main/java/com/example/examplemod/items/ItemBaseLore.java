package com.example.examplemod.items;
import com.example.examplemod.ExampleMod;
import com.example.examplemod.init.ModItems;
import com.example.examplemod.util.IHasModel;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import java.util.List;

public class ItemBaseLore extends Item implements IHasModel {

    public ItemBaseLore(String name){
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
    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        //Newline func does NOT WORK, you have to add a new tooltip.add every new line, default colour is gray
        tooltip.add(TextFormatting.GOLD + "Effects:");
        tooltip.add(TextFormatting.AQUA + "Regeneration (FULL HEALTH REGEN)");
        tooltip.add(TextFormatting.AQUA + "50% of your max hunger bar (plus 50% in saturation)");
    }
}
