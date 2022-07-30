package com.Epichaburger52.yacm.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {
    public static final CreativeModeTab YACM_TAB = new CreativeModeTab("coretab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MODIUM_INGOT.get());
        }
    };
}
