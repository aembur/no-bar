package com.aembr.nobar;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = NoBar.MODID, name = NoBar.NAME, version = NoBar.VERSION, clientSideOnly = true)

public class NoBar {
    public static final String MODID = "nobar";
    public static final String NAME = "NoBar";
    public static final String VERSION = "1.12.2-0.1.2";

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new MessageHandler());
    }

}
