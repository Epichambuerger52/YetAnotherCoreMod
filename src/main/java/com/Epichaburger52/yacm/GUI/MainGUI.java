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
    int HEIGHT = 201;
    int WIDTH = 145;
    int relHEIGHT =(height - HEIGHT)/2 ;
    int relWIDTH= (width - WIDTH)/2 ;


public  MainGUI()
{


    super(new TranslatableComponent("main gui"));
}


    @Override
    public void render(PoseStack pPoseStack, int pMouseX, int pMouseY, float pPartialTick) {
        RenderSystem.colorMask(true,true,true,true);
        RenderSystem.setShaderTexture(0, GUI);

        int relHEIGHT =(height - HEIGHT)/2 ;
        int relWIDTH= (width - WIDTH)/2 ;

        blit(pPoseStack,relWIDTH,relHEIGHT,0,0,HEIGHT,WIDTH);






        super.render(pPoseStack, pMouseX, pMouseY, pPartialTick);
    }




    @Override
    public boolean isPauseScreen() {
        return false;
    }
}


