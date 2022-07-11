package com.Epichaburger52.yacm.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class YetAnotherCoreModServerConfig {
    public static final ForgeConfigSpec.Builder BUIDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;


    public static final ForgeConfigSpec.ConfigValue<Integer> SILL_POINTS_GAIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> SILL_POINTS_COST_MULTIPLIER;
    static
    {
        BUIDER.push("Server configs for YACM");

        SILL_POINTS_GAIN = BUIDER.comment("The rate that you gather skill points")
                        .define("points gained",5);

        SILL_POINTS_COST_MULTIPLIER = BUIDER.comment("The cost multiplier of the skills")
                        .define("cost multiplier",1);

        BUIDER.pop();
        SPEC = BUIDER.build();


    }


}
