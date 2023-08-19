package com.example.examplemod.items;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.init.ModItems;
import com.example.examplemod.items.ItemBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHealthBoost;
import net.minecraft.potion.PotionHelper;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class MovementItem extends ItemBase {
    PotionEffect effect;
    boolean isActive = false;
    public MovementItem(String name) {
        super(name);
        setMaxStackSize(1);
    }



    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand hand)
    {
        player.getCooldownTracker().setCooldown(this, 1 * (2 * 20)); //Sets a cooldown of one second
        {
            player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY,15,0, false, false));
            player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 15, 30, false, false));
            player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS,25,30,false,false)); //different time for blindness so it can align with the other effects

            player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS,5*20, 1, false,false));

            if(player.isElytraFlying())
            {
                player.getCooldownTracker().setCooldown(this, 4*20);
                Vec3d look = player.getLookVec(); //Lets you check the coordinates the player is facing
                player.setVelocity(look.x * 4, look.y * 4, look.z * 4); //setting the player's velocity towards the direction they are looking at


                return super.onItemRightClick(worldIn, player, hand); //A return method, since this method isn't a void
            }

            if(player.isInWater())
            {
                player.getCooldownTracker().setCooldown(this, 5);
                Vec3d look = player.getLookVec(); //Lets you check the coordinates the player is facing
                player.setVelocity(look.x * 4, look.y * 4, look.z * 4); //setting the player's velocity towards the direction they are looking at
                return super.onItemRightClick(worldIn, player, hand); //A return method, since this method isn't a void
            }

            if(player.isInLava())
            {
                player.getCooldownTracker().setCooldown(this, 60*20);
                Vec3d look = player.getLookVec(); //Lets you check the coordinates the player is facing
                player.setVelocity(look.x * 4, look.y * 4, look.z * 4); //setting the player's velocity towards the direction they are looking at
                return super.onItemRightClick(worldIn, player, hand); //A return method, since this method isn't a void
            }

            else
            {
                Vec3d look = player.getLookVec(); //Lets you check the coordinates the player is facing
                player.setVelocity(look.x * 1.5, look.y * 1.5, look.z * 1.5); //setting the player's velocity towards the direction they are looking at


                return super.onItemRightClick(worldIn, player, hand); //A return method, since this method isn't a void
            }




        }



    }


}