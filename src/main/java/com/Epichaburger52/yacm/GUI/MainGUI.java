package com.Epichaburger52.yacm.GUI;

import com.Epichaburger52.yacm.YetAnotherrCoreMod;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;

public class MainGUI extends Screen {

    final ResourceLocation GUI = new ResourceLocation(YetAnotherrCoreMod.MOD_ID,"textures/gui/gui.png");
    final ResourceLocation GUIBUTTON = new ResourceLocation(YetAnotherrCoreMod.MOD_ID,"textures/gui/guibutton.png");
    int HEIGHT = 200;
    int WIDTH = 142;
    int relHEIGHT =(height - HEIGHT)/2 ;
    int relWIDTH= (width - WIDTH)/2 ;
    private Button addstr;

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

        blit(pPoseStack,relWIDTH,relHEIGHT,0,0,WIDTH,HEIGHT);




        //addRenderableWidget(new Button(relWIDTH +10,relHEIGHT +10,11,11,new TranslatableComponent("yacm.menu.button"), pButton -> {

        //}));
        addRenderableWidget(new ImageButton(relWIDTH +10,relHEIGHT +10,10,10,0,10,0,GUIBUTTON,256,256,pButton -> {

        }));

        addRenderableWidget(new ImageButton(relWIDTH +10,relHEIGHT +25,10,10,0,10,0,GUIBUTTON,256,256,pButton -> {

        }));

        addRenderableWidget(new ImageButton(relWIDTH +10,relHEIGHT +40,10,10,0,10,0,GUIBUTTON,256,256,pButton -> {

        }));

        addRenderableWidget(new ImageButton(relWIDTH +10,relHEIGHT +55,10,10,0,10,0,GUIBUTTON,256,256,pButton -> {

        }));

        addRenderableWidget(new ImageButton(relWIDTH +10,relHEIGHT +70,10,10,0,10,0,GUIBUTTON,256,256,pButton -> {

        }));

        addRenderableWidget(new ImageButton(relWIDTH +10,relHEIGHT +85,10,10,0,10,0,GUIBUTTON,256,256,pButton -> {

        }));

        drawString(pPoseStack,font,"000",relWIDTH +20,relHEIGHT +10 + 2,16777215);
        super.render(pPoseStack, pMouseX, pMouseY, pPartialTick);
    }




    @Override
    public boolean isPauseScreen() {
        return false;
    }
}


