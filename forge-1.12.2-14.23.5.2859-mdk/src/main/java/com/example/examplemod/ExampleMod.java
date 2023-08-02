package com.example.examplemod;

import com.example.examplemod.Proxy.ClientProxy;
import com.example.examplemod.tabs.ModTab;
import com.example.examplemod.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.apache.logging.log4j.Logger;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final CreativeTabs modtab = new ModTab("modtab");
    public static final String MODID = "godworks";
    public static final String NAME = "God Works";
    public static final String VERSION = "1.0";
    public static final String CLIENT_PROXY_CLASS = "com.example.examplemod.Proxy.ClientProxy";
    public static final String COMMON_PROXY_CLASS = "com.example.examplemod.Proxy.CommonProxy";
    @SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = COMMON_PROXY_CLASS)
    public static ClientProxy proxy;

    //private static Logger logger;



    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

        RegistryHandler.preInitRegistries(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        //RegistryHandler.initRegistries();
    }
    @EventHandler
    public void serverInit(FMLServerStartingEvent event)
    {

        RegistryHandler.serverRegistries(event);
    }
}
