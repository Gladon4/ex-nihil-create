package com.goldhand.ex_nihilo_create.item;

import com.goldhand.ex_nihilo_create.ExNihiloCreate;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ExNihiloCreateItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExNihiloCreate.MODID);

    public static final RegistryObject<Item> NETHERRACK_ROD = ITEMS.register("netherrack_rod",
            () -> new Item(new Item.Properties().tab(ExNihiloCreateCreativeTab.EX_NIHILO_CREATE_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
