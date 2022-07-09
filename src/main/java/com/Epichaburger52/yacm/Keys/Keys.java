package com.Epichaburger52.yacm.Keys;

import com.Epichaburger52.yacm.YetAnotherrCoreMod;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.ClientRegistry;

import java.awt.event.KeyEvent;

@OnlyIn(Dist.CLIENT)
public final class Keys {
    public static KeyMapping OpenGUI;

    private Keys(){


    }


public static void  init()
{


OpenGUI = registerKey("open_gui", "key.category." + YetAnotherrCoreMod.MOD_ID, KeyEvent.VK_V);

}



    private static KeyMapping registerKey(String name, String category, int keycode) {
        final var key = new KeyMapping("key." + YetAnotherrCoreMod.MOD_ID + "." + name, keycode, category);
        ClientRegistry.registerKeyBinding(key);
        return key;
    }


}
