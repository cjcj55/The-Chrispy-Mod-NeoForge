package com.cjcj55.chrispymod.datagen;

import com.cjcj55.chrispymod.block.ModBlocks;
import com.cjcj55.chrispymod.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider provider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
    }

    @Override
    protected void generate() {
//        this.dropSelf(ModBlocks.ALLOY_FURNACE.get());
//        this.dropSelf(ModBlocks.JAM_AND_JELLY_MAKER.get());

        this.dropSelf(ModBlocks.BLUE_EMERALD_BLOCK.get());
        this.dropSelf(ModBlocks.HARDENED_REDSTONE_BLOCK.get());
//        this.dropSelf(ModBlocks.LAVA_SPONGE.get());
//        this.dropSelf(ModBlocks.WET_LAVA_SPONGE.get());
        this.dropSelf(ModBlocks.LIGHTNING_BLOCK.get());
        this.dropSelf(ModBlocks.SUGAR_CANE_BLOCK.get());
        this.dropSelf(ModBlocks.SUGAR_BLOCK.get());

        this.dropSelf(ModBlocks.COBALT_BLOCK.get());
        this.add(ModBlocks.COBALT_ORE.get(),
                (block) -> createOreDrop(ModBlocks.COBALT_ORE.get(), ModItems.COBALT.get()));
        this.add(ModBlocks.DEEPSLATE_COBALT_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_COBALT_ORE.get(), ModItems.COBALT.get()));

        this.add(ModBlocks.EXPERIENCE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.EXPERIENCE_ORE.get(), ModItems.EDIBLE_EXPERIENCE.get()));
        this.add(ModBlocks.DEEPSLATE_EXPERIENCE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_EXPERIENCE_ORE.get(), ModItems.EDIBLE_EXPERIENCE.get()));

        this.add(ModBlocks.NATURAL_ESSENCE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.NATURAL_ESSENCE_ORE.get(), ModItems.NATURAL_ESSENCE.get()));
        this.add(ModBlocks.DEEPSLATE_NATURAL_ESSENCE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_NATURAL_ESSENCE_ORE.get(), ModItems.NATURAL_ESSENCE.get()));

        this.dropSelf(ModBlocks.OPAL_BLOCK.get());
        this.add(ModBlocks.OPAL_ORE.get(),
                (block) -> createOreDrop(ModBlocks.OPAL_ORE.get(), ModItems.OPAL.get()));
        this.add(ModBlocks.DEEPSLATE_OPAL_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_OPAL_ORE.get(), ModItems.OPAL.get()));

        this.dropSelf(ModBlocks.PARYTH_BLOCK.get());
        this.add(ModBlocks.PARYTH_ORE.get(),
                (block) -> createOreDrop(ModBlocks.PARYTH_ORE.get(), ModItems.PARYTH.get()));
        this.add(ModBlocks.DEEPSLATE_PARYTH_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_PARYTH_ORE.get(), ModItems.PARYTH.get()));

        this.dropSelf(ModBlocks.RUBY_BLOCK.get());
        this.add(ModBlocks.RUBY_ORE.get(),
                (block) -> createOreDrop(ModBlocks.RUBY_ORE.get(), ModItems.RUBY.get()));
        this.add(ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_RUBY_ORE.get(), ModItems.RUBY.get()));

        this.dropSelf(ModBlocks.TANGERINE_BLOCK.get());
        this.add(ModBlocks.TANGERINE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.TANGERINE_ORE.get(), ModItems.TANGERINE.get()));
        this.add(ModBlocks.DEEPSLATE_TANGERINE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_TANGERINE_ORE.get(), ModItems.TANGERINE.get()));

        this.add(ModBlocks.WHITE_DWARF_STAR_ORE.get(),
                (block) -> createOreDrop(ModBlocks.WHITE_DWARF_STAR_ORE.get(), ModItems.WHITE_DWARF_STAR.get()));
        this.add(ModBlocks.DEEPSLATE_WHITE_DWARF_STAR_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_WHITE_DWARF_STAR_ORE.get(), ModItems.WHITE_DWARF_STAR.get()));

        this.dropSelf(ModBlocks.FLAME_BLOCK.get());
        this.add(ModBlocks.FLAME_ORE_NETHER.get(),
                (block) -> createOreDrop(ModBlocks.FLAME_ORE_NETHER.get(), ModItems.FLAME.get()));

        this.add(ModBlocks.RUBY_ORE_NETHER.get(),
                (block) -> createOreDrop(ModBlocks.RUBY_ORE_NETHER.get(), ModItems.RUBY.get()));

        this.add(ModBlocks.HELLFIRE_ORE_NETHER.get(),
                (block) -> createOreDrop(ModBlocks.HELLFIRE_ORE_NETHER.get(), ModItems.HELLFIRE.get()));

        this.dropSelf(ModBlocks.CIRCULAR_BRICKS.get());
        this.dropSelf(ModBlocks.WEAVER_BRICKS.get());
        this.dropSelf(ModBlocks.SOLID_BRICKS.get());
        this.dropSelf(ModBlocks.ROAD_BRICKS.get());
        this.dropSelf(ModBlocks.ORNATE_BRICKS.get());
        this.dropSelf(ModBlocks.MOSAIC_BRICKS.get());
        this.dropSelf(ModBlocks.SLANTED_BRICKS.get());
        this.dropSelf(ModBlocks.SKINNY_BRICKS.get());
        this.dropSelf(ModBlocks.SKINNY_SLANTED_BRICKS.get());
        this.dropSelf(ModBlocks.CRACKED_BRICKS.get());
        this.dropSelf(ModBlocks.ENCASED_BRICKS.get());

        this.dropSelf(ModBlocks.BLACK_REDSTONE_LAMP.get());
        this.dropSelf(ModBlocks.BLUE_REDSTONE_LAMP.get());
        this.dropSelf(ModBlocks.BROWN_REDSTONE_LAMP.get());
        this.dropSelf(ModBlocks.CYAN_REDSTONE_LAMP.get());
        this.dropSelf(ModBlocks.GRAY_REDSTONE_LAMP.get());
        this.dropSelf(ModBlocks.GREEN_REDSTONE_LAMP.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_REDSTONE_LAMP.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_REDSTONE_LAMP.get());
        this.dropSelf(ModBlocks.LIME_REDSTONE_LAMP.get());
        this.dropSelf(ModBlocks.MAGENTA_REDSTONE_LAMP.get());
        this.dropSelf(ModBlocks.ORANGE_REDSTONE_LAMP.get());
        this.dropSelf(ModBlocks.PINK_REDSTONE_LAMP.get());
        this.dropSelf(ModBlocks.PURPLE_REDSTONE_LAMP.get());
        this.dropSelf(ModBlocks.RED_REDSTONE_LAMP.get());
        this.dropSelf(ModBlocks.WHITE_REDSTONE_LAMP.get());
        this.dropSelf(ModBlocks.YELLOW_REDSTONE_LAMP.get());
    }

    protected LootTable.Builder createMultipleOreDrops(Block block, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(block, (LootPoolEntryContainer.Builder<?>)this.applyExplosionDecay(block,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                                .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
