package com.dreammaster.loginhandler;

import static net.minecraft.util.EnumChatFormatting.*;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class LoginHandler {

    @SuppressWarnings("unused")
    @SubscribeEvent
    public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {}
}
