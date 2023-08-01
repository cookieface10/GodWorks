package com.example.examplemod.items.tools;

import net.minecraft.entity.item.EntityExpBottle;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class HealingSword extends ItemSword {
    public HealingSword(String name, ToolMaterial material) {
        super(material);
    }
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand handIn)
    {
        player.getCooldownTracker().setCooldown(this, 1 * (2 * 20)); //Sets a cooldown of one second
        {
            EntityChicken entity = new EntityChicken(worldIn);
            worldIn.spawnEntity(entity);
            return super.onItemRightClick(worldIn, player, handIn); //A return method, since this method isn't a void
        }

    }
}
