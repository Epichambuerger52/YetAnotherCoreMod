package com.Epichaburger52.yacm.Events;


import com.Epichaburger52.yacm.Keys.Keys;
import com.Epichaburger52.yacm.YetAnotherrCoreMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = YetAnotherrCoreMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public final class ClientForgeEvents {
private ClientForgeEvents(){


}

    @SubscribeEvent
    public static void onkeypress(net.minecraftforge.client.event.InputEvent.KeyInputEvent event)
    {
        Minecraft mc = Minecraft.getInstance();
        if(mc.level == null)return;
        oninput(mc, event.getKey(), event.getAction());
    }

    @SubscribeEvent
    public static void onmouseclick(net.minecraftforge.client.event.InputEvent.MouseInputEvent event)
    {
        Minecraft mc = Minecraft.getInstance();
        if(mc.level == null)return;
        oninput(mc, event.getButton(), event.getAction());
    }

    private static void  oninput(Minecraft mc, int key , int action){

        if(mc.screen == null && Keys.OpenGUI.isDown()){



        }


        }

    }
