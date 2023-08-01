package com.example.examplemod.items;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.init.ModItems;
import com.example.examplemod.items.ItemBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class TestingItem extends ItemBase {
    public TestingItem(String name) {
        super(name);
    }


    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand handIn)
    {
        player.getCooldownTracker().setCooldown(this, 1 * (2 * 20)); //Sets a cooldown of one second
        {
            Vec3d look = player.getLookVec(); //Lets you check the coordinates the player is facing
            player.setVelocity(look.x * 2, look.y * 2, look.z * 2); //setting the player's velocity towards the direction they are looking at
            return super.onItemRightClick(worldIn, player, handIn); //A return method, since this method isn't a void
        }

    }


}