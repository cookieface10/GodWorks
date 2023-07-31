package com.example.examplemod.items.tools;

import com.example.examplemod.items.ItemBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class TestingItem extends ItemBase {
    public TestingItem(String name) {
        super(name);

    }

/*
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand hand, EnumFacing facing) {
        ItemStack item = playerIn.getHeldItem(hand);
        Vec3d aim = playerIn.getLookVec();
        EntityLargeFireball fireball = new EntityLargeFireball(worldIn, playerIn, 1, 1, 1);

        fireball.setPosition(playerIn.posX + aim.x * 1.5, playerIn.posX + aim.y * 1.5, playerIn.posZ + aim.z * 1.5);
        fireball.accelerationX = aim.x * 0.1;
        fireball.accelerationY = aim.y * 0.1;
        fireball.accelerationZ = aim.z * 0.1;
        worldIn.spawnEntity(fireball);

        item.damageItem(1, playerIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
    }
    
 */
}