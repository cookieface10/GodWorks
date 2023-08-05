package com.example.examplemod.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityExpBottle;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSplashPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHealthBoost;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class HealingSword extends ItemBase { //lol it's not even a actual sword but I'm to lazy to change this sutff. Deal with it owo.
    public HealingSword(String name) {
        super(name);
        setMaxStackSize(1);
    }
    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand handIn)
    {
        player.getCooldownTracker().setCooldown(this,  10*20); //Sets a cooldown of one second (just so I remember for later)
        {

            EntityChicken chicken = new EntityChicken(world);
            ItemStack splashPotion = new ItemStack(Items.SPLASH_POTION, 1,1);
            EntityPotion potion = new EntityPotion(world);
            PotionEffect potionEffect = new PotionEffect(MobEffects.REGENERATION, 500, 100);





            Vec3d aim = player.getLookVec();
            potion.setPosition(player.posX + aim.x,player.posY + 1.5D,player.posZ + aim.z);
            potion.setItem(splashPotion);
            world.spawnEntity(potion);

            return super.onItemRightClick(world, player, handIn); //A return method, since this method isn't a void but you already knew that, didn't you <3

        }

    }
}
