package com.example;

import com.example.ActionBarPacket;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.util.Identifier;

public class PacketHandler {
    public static final Identifier Action_Bar = new Identifier("tntrun", "networking");
    public static void registerPackets() {
        ClientPlayNetworking.registerGlobalReceiver(Action_Bar, ActionBarPacket::receive);

    }
}
