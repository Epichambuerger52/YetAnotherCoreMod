package com.Epichaburger52.yacm.GUI;

import com.Epichaburger52.yacm.YetAnotherrCoreMod;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;

public class MainGUI extends Screen {

    final ResourceLocation GUI = new ResourceLocation(YetAnotherrCoreMod.MOD_ID,"textures/gui/gui.png");
    int GUIX =  200;
    int GUIY = 175;
    int relx =(this.height - GUIX)/2 ;
    int rely= (this.height - GUIY)/2 ;


public  MainGUI()
{


    super(new TranslatableComponent("main gui"));
}


    @Override
    public void render(PoseStack pPoseStack, int pMouseX, int pMouseY, float pPartialTick) {
        RenderSystem.colorMask(true,true,true,true);
        Minecraft.getInstance().textureManager.bindForSetup(GUI);

        int relx =(this.height - GUIX)/2 ;
        int rely= (this.height - GUIY)/2 ;

        blit(pPoseStack,relx,rely,0,0,GUIX,GUIY);






        super.render(pPoseStack, pMouseX, pMouseY, pPartialTick);
    }




    @Override
    public boolean isPauseScreen() {
        return false;
    }
}


