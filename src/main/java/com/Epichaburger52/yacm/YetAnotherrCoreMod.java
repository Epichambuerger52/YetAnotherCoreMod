package com.Epichaburger52.yacm;

import com.Epichaburger52.yacm.Keys.Keys;
import com.Epichaburger52.yacm.Network.Networking;
import com.Epichaburger52.yacm.config.YetAnotherCoreModClientConfig;
import com.Epichaburger52.yacm.config.YetAnotherCoreModServerConfig;
import com.Epichaburger52.yacm.items.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(YetAnotherrCoreMod.MOD_ID)
public class YetAnotherrCoreMod
{
    public static final String MOD_ID = "yacm";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public YetAnotherrCoreMod()
    {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::setup);

        ModItems.register(eventBus);
        Keys.init();


        ModLoadingContext.get().registerConfig
                (ModConfig.Type.CLIENT, YetAnotherCoreModClientConfig.SPEC,"yacm-client.toml");

        ModLoadingContext.get().registerConfig
                (ModConfig.Type.COMMON, YetAnotherCoreModServerConfig.SPEC,"yacm-common.toml");


        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

        Networking.register();
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());


    }
}

