package com.aembr.nobar;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MessageHandler {
    @SubscribeEvent
    public void onMessageSent(ClientChatEvent event) {
        String message = event.getMessage();
        if (message.equals("/bar") || (message.equals("/warp bar"))) {
            EntityPlayer player = Minecraft.getMinecraft().player;
            player.sendMessage(new TextComponentString("Don't gamble.").setStyle(new Style().setColor(TextFormatting.DARK_RED)));
            event.setCanceled(true);
        }
    }
}
