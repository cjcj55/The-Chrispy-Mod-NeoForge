package com.cjcj55.chrispymod.item;

import com.cjcj55.chrispymod.ChrispyMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ChrispyMod.MOD_ID);

    public static final DeferredItem<Item> MY_ITEM = ITEMS.registerSimpleItem("my_item");

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
