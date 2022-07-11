package com.Epichaburger52.yacm.config;

import net.minecraftforge.common.ForgeConfigSpec;

import java.util.Spliterator;

public class YetAnotherCoreModClientConfig {
    public static final ForgeConfigSpec.Builder BUIDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    
static
{
    BUIDER.push("client configs for YACM");



    BUIDER.pop();
    SPEC = BUIDER.build();


}


}
