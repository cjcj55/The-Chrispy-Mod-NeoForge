package com.cjcj55.chrispymod.creativetab;

import com.cjcj55.chrispymod.ChrispyMod;
import com.cjcj55.chrispymod.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Collection;
import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChrispyMod.MOD_ID);

    public static final Supplier<CreativeModeTab> CHRISPY_MOD_ITEM_TAB = CREATIVE_MODE_TABS.register("chrispy_mod_item_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.chrispymod.chrispy_mod_item_tab"))
            .icon(() -> new ItemStack(ModItems.BLUE_EMERALD.get()))
            .withSearchBar()
            .displayItems(((itemDisplayParameters, output) -> {
                Collection<DeferredHolder<Item, ? extends Item>> items = ModItems.ITEMS.getEntries();
                for (DeferredHolder<Item, ? extends Item> item : items) {
                    output.accept((ItemLike) item);
                }
            }))
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
