package com.goldhand.ex_nihilo_create.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ExNihiloCreateCreativeTab {
    public static final CreativeModeTab EX_NIHILO_CREATE_TAB = new CreativeModeTab("ex_nihilo_create_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ExNihiloCreateItems.NETHERRACK_ROD.get());
        }
    };
}
