package com.cjcj55.chrispymod.datagen;

import com.cjcj55.chrispymod.ChrispyMod;
import com.cjcj55.chrispymod.block.ModBlocks;
import com.cjcj55.chrispymod.item.ModItems;
import com.cjcj55.chrispymod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, ChrispyMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(Tags.Items.GEMS)
                .add(ModItems.BLUE_EMERALD.get())
                .add(ModItems.COBALT.get())
                .add(ModItems.OPAL.get())
                .add(ModItems.RUBY.get())
                .add(ModItems.WHITE_DWARF_STAR.get())
                .add(ModItems.COBALT.get());

        this.tag(ModTags.Items.RUBY_ORE)
                .add(ModBlocks.RUBY_ORE.get().asItem())
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.get().asItem())
                .add(ModBlocks.RUBY_ORE_NETHER.get().asItem());
        this.tag(ModTags.Items.OPAL_ORE)
                .add(ModBlocks.OPAL_ORE.get().asItem())
                .add(ModBlocks.DEEPSLATE_OPAL_ORE.get().asItem());
        this.tag(ModTags.Items.TANGERINE_ORE)
                .add(ModBlocks.TANGERINE_ORE.get().asItem())
                .add(ModBlocks.DEEPSLATE_TANGERINE_ORE.get().asItem());
        this.tag(ModTags.Items.COBALT_ORE)
                .add(ModBlocks.COBALT_ORE.get().asItem())
                .add(ModBlocks.DEEPSLATE_COBALT_ORE.get().asItem());
        this.tag(ModTags.Items.PARYTH_ORE)
                .add(ModBlocks.PARYTH_ORE.get().asItem())
                .add(ModBlocks.DEEPSLATE_PARYTH_ORE.get().asItem());
        this.tag(ModTags.Items.WHITE_DWARF_STAR_ORE)
                .add(ModBlocks.WHITE_DWARF_STAR_ORE.get().asItem())
                .add(ModBlocks.DEEPSLATE_WHITE_DWARF_STAR_ORE.get().asItem());
        this.tag(ModTags.Items.NATURAL_ESSENCE_ORE)
                .add(ModBlocks.NATURAL_ESSENCE_ORE.get().asItem())
                .add(ModBlocks.DEEPSLATE_NATURAL_ESSENCE_ORE.get().asItem());
        this.tag(ModTags.Items.EXPERIENCE_ORE)
                .add(ModBlocks.EXPERIENCE_ORE.get().asItem())
                .add(ModBlocks.DEEPSLATE_EXPERIENCE_ORE.get().asItem());
    }
}
