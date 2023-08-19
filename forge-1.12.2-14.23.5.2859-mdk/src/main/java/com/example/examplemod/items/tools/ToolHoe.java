package com.example.examplemod.items.tools;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.init.ModItems;
import com.example.examplemod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class ToolHoe extends ItemHoe implements IHasModel {


        public ToolHoe(String name, ToolMaterial material) {
            super(material);
            setUnlocalizedName(name);
            setRegistryName(name);
            setCreativeTab(ExampleMod.modtab);

            ModItems.ITEMS.add(this);

    }
    @Override
    public void registerModels() {
        ExampleMod.proxy.registerItemRenderer(this, 0 , "inventory");
    }


    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand hand)
    {
        RayTraceResult lookingAt = Minecraft.getMinecraft().objectMouseOver;
        BlockPos pos = lookingAt.getBlockPos();
        worldIn.setBlockToAir(pos);

        if (lookingAt != null && lookingAt.typeOfHit == RayTraceResult.Type.BLOCK) {







            // now the coordinates you want are in pos. Example of use:
            worldIn.setBlockState(pos.add(0,0,0), Blocks.WHEAT.getDefaultState(),0);
            // this is a bit oversimplified - you have to send a packet to the server, since only the client knows the BlockPos, but only the server can change blocks
        } else {
            // not looking at a block, or too far away from one to tell
        }
        return super.onItemRightClick(worldIn, player, hand);
    }
}
