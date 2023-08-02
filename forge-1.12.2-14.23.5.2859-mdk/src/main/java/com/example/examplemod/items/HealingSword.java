package com.example.examplemod.items;

import net.minecraft.entity.item.EntityExpBottle;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSplashPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHealthBoost;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class HealingSword extends ItemBase { //lol it's not even a actual sword but I'm to lazy to change this sutff. Deal with it owo.
    public HealingSword(String name) {
        super(name);
    }
    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand handIn)
    {
        player.getCooldownTracker().setCooldown(this,  10*20); //Sets a cooldown of one second (just so I remember for later)
        {

            EntityChicken chicken = new EntityChicken(world);
            EntityPotion splashPotion = new EntityPotion(world);
            Vec3d aim = player.getLookVec();
            splashPotion.setPosition(player.posX + aim.x,player.posY + 1.5D,player.posZ + aim.z);
            world.spawnEntity(splashPotion);

            return super.onItemRightClick(world, player, handIn); //A return method, since this method isn't a void but you already knew that, didn't you <3

        }

    }
}
