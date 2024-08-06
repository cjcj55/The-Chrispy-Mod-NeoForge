package com.cjcj55.chrispymod;

import com.cjcj55.chrispymod.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChrispyMod.MOD_ID);

    public static final Supplier<CreativeModeTab> CHRISPY_MOD_TAB = CREATIVE_MODE_TABS.register("chrispy_mod_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.chrispymod.chrispy_mod_tab"))
            .icon(() -> new ItemStack(ModItems.MY_ITEM.get()))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.MY_ITEM);
            }).build());

    public static final Supplier<CreativeModeTab> CHRISPY_MOD_TAB_2 = CREATIVE_MODE_TABS.register("chrispy_mod_tab_2", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.chrispymod.chrispy_mod_tab_2"))
            .icon(() -> new ItemStack(Items.DIAMOND))
            .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ChrispyMod.MOD_ID, "chrispy_mod_tab"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(Blocks.IRON_ORE);

            }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
