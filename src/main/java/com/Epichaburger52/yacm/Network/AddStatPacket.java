package com.Epichaburger52.yacm.Network;

import com.Epichaburger52.yacm.data.SkillsManager;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class AddStatPacket {

    public static final String MESSAGE_NO_SKILL_POINTS = "message.noskillponts";

    public AddStatPacket()
    {

    }
    public AddStatPacket(FriendlyByteBuf buf)
    {

    }
    public void toBytes(FriendlyByteBuf buf)
    {

    }

    public boolean handle(Supplier<NetworkEvent.Context> Supplier){
        NetworkEvent.Context ctx = Supplier.get();
        ctx.enqueueWork(() -> {
            ServerPlayer player = ctx.getSender();


        });

        return true;
    }

}
