package com.example.examplemod.items.food;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class FoodEffectBaseGlowingLore extends FoodBase{

    PotionEffect effect;
    public FoodEffectBaseGlowingLore(String name, int amount, float saturation, boolean isAnimalFood, PotionEffect effect){
        super(name, amount, saturation, isAnimalFood);
        setAlwaysEdible();
        this.effect = effect;
    }


    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player){
        if(!worldIn.isRemote){
            player.addPotionEffect(new PotionEffect(effect.getPotion(), effect.getDuration(), effect.getAmplifier(), effect.getIsAmbient(), effect.doesShowParticles()));
        }
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

    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack){
        return true;
    }
}