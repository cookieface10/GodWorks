package com.example.examplemod.items.tools;

import com.example.examplemod.items.ItemBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class BowingBow extends ItemBase {
    public BowingBow(String name, ToolMaterial toolMaterial) {
        super(name);
    }
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand hand){
        System.out.print("");


        return super.onItemRightClick(worldIn,player,hand);
    }
}
