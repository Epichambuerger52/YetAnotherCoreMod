package com.Epichaburger52.yacm.Network;

import com.Epichaburger52.yacm.YetAnotherrCoreMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;
import org.lwjgl.system.windows.MSG;

public class Networking {
    private static SimpleChannel INSTANCE;

    private static int packetID = 0;
    private static int id()
    {
        return packetID++;

    }

    public static void register()
    {
        SimpleChannel net = NetworkRegistry.ChannelBuilder
                .named(new ResourceLocation
                (YetAnotherrCoreMod.MOD_ID,"messages"))
                .networkProtocolVersion(()-> "0.0.1")
                .clientAcceptedVersions(s -> true)
                .serverAcceptedVersions(s -> true)
                .simpleChannel();

            INSTANCE = net;



    }



    public static <MSG> void sendtoserver(MSG message)
    {
        INSTANCE.sendToServer(message);
    }
}
