package com.cjcj55.chrispymod.datagen;

import com.cjcj55.chrispymod.ChrispyMod;
import com.cjcj55.chrispymod.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ChrispyMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.BLUE_EMERALD_BLOCK.get())
                .add(ModBlocks.COBALT_BLOCK.get())
                .add(ModBlocks.COBALT_ORE.get())
                .add(ModBlocks.DEEPSLATE_COBALT_ORE.get())
                .add(ModBlocks.EXPERIENCE_ORE.get())
                .add(ModBlocks.DEEPSLATE_EXPERIENCE_ORE.get())
//                .add(ModBlocks.FLAME_BLOCK.get())
                .add(ModBlocks.FLAME_ORE_NETHER.get())
                .add(ModBlocks.HARDENED_REDSTONE_BLOCK.get())
                .add(ModBlocks.HELLFIRE_ORE_NETHER.get())
                .add(ModBlocks.LIGHTNING_BLOCK.get())
                .add(ModBlocks.NATURAL_ESSENCE_ORE.get())
                .add(ModBlocks.DEEPSLATE_NATURAL_ESSENCE_ORE.get())
                .add(ModBlocks.OPAL_BLOCK.get())
                .add(ModBlocks.OPAL_ORE.get())
                .add(ModBlocks.DEEPSLATE_OPAL_ORE.get())
                .add(ModBlocks.PARYTH_BLOCK.get())
                .add(ModBlocks.PARYTH_ORE.get())
                .add(ModBlocks.DEEPSLATE_PARYTH_ORE.get())
                .add(ModBlocks.TANGERINE_BLOCK.get())
                .add(ModBlocks.TANGERINE_ORE.get())
                .add(ModBlocks.DEEPSLATE_TANGERINE_ORE.get())
                .add(ModBlocks.RUBY_BLOCK.get())
                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.get())
                .add(ModBlocks.RUBY_ORE_NETHER.get())
                .add(ModBlocks.WHITE_DWARF_STAR_ORE.get())
                .add(ModBlocks.DEEPSLATE_WHITE_DWARF_STAR_ORE.get())
                .add(ModBlocks.SKINNY_SLANTED_BRICKS.get())
                .add(ModBlocks.SLANTED_BRICKS.get())
                .add(ModBlocks.SKINNY_BRICKS.get())
                .add(ModBlocks.CIRCULAR_BRICKS.get())
                .add(ModBlocks.CRACKED_BRICKS.get())
                .add(ModBlocks.ENCASED_BRICKS.get())
                .add(ModBlocks.MOSAIC_BRICKS.get())
                .add(ModBlocks.ORNATE_BRICKS.get())
                .add(ModBlocks.ROAD_BRICKS.get())
                .add(ModBlocks.SOLID_BRICKS.get())
                .add(ModBlocks.WEAVER_BRICKS.get())
//                .add(ModBlocks.ALLOY_FURNACE.get())
//                .add(ModBlocks.JAM_AND_JELLY_MAKER.get());
;
        this.tag(BlockTags.MINEABLE_WITH_AXE);

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.EXPERIENCE_ORE.get())
                .add(ModBlocks.DEEPSLATE_EXPERIENCE_ORE.get())
                .add(ModBlocks.OPAL_BLOCK.get())
                .add(ModBlocks.OPAL_ORE.get())
                .add(ModBlocks.DEEPSLATE_OPAL_ORE.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
//                .add(ModBlocks.FLAME_BLOCK.get())
                .add(ModBlocks.FLAME_ORE_NETHER.get())
                .add(ModBlocks.HARDENED_REDSTONE_BLOCK.get())
                .add(ModBlocks.HELLFIRE_ORE_NETHER.get())
                .add(ModBlocks.NATURAL_ESSENCE_ORE.get())
                .add(ModBlocks.DEEPSLATE_NATURAL_ESSENCE_ORE.get())
                .add(ModBlocks.PARYTH_BLOCK.get())
                .add(ModBlocks.PARYTH_ORE.get())
                .add(ModBlocks.DEEPSLATE_PARYTH_ORE.get())
                .add(ModBlocks.RUBY_BLOCK.get())
                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.get())
                .add(ModBlocks.RUBY_ORE_NETHER.get())
                .add(ModBlocks.TANGERINE_BLOCK.get())
                .add(ModBlocks.TANGERINE_ORE.get())
                .add(ModBlocks.DEEPSLATE_TANGERINE_ORE.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.BLUE_EMERALD_BLOCK.get())
                .add(ModBlocks.COBALT_BLOCK.get())
                .add(ModBlocks.COBALT_ORE.get())
                .add(ModBlocks.DEEPSLATE_COBALT_ORE.get())
                .add(ModBlocks.LIGHTNING_BLOCK.get())
                .add(ModBlocks.WHITE_DWARF_STAR_ORE.get())
                .add(ModBlocks.DEEPSLATE_WHITE_DWARF_STAR_ORE.get());


//        this.tag(CMBlockTags.RUBY_ORE)
//                .add(ModBlocks.RUBY_ORE.get())
//                .add(ModBlocks.DEEPSLATE_RUBY_ORE.get())
//                .add(ModBlocks.RUBY_ORE_NETHER.get());
//        this.tag(CMBlockTags.OPAL_ORE)
//                .add(ModBlocks.OPAL_ORE.get())
//                .add(ModBlocks.DEEPSLATE_OPAL_ORE.get());
//        this.tag(CMBlockTags.TANGERINE_ORE)
//                .add(ModBlocks.TANGERINE_ORE.get())
//                .add(ModBlocks.DEEPSLATE_TANGERINE_ORE.get());
//        this.tag(CMBlockTags.COBALT_ORE)
//                .add(ModBlocks.COBALT_ORE.get())
//                .add(ModBlocks.DEEPSLATE_COBALT_ORE.get());
//        this.tag(CMBlockTags.PARYTH_ORE)
//                .add(ModBlocks.PARYTH_ORE.get())
//                .add(ModBlocks.DEEPSLATE_PARYTH_ORE.get());
//        this.tag(CMBlockTags.WHITE_DWARF_STAR_ORE)
//                .add(ModBlocks.WHITE_DWARF_STAR_ORE.get())
//                .add(ModBlocks.DEEPSLATE_WHITE_DWARF_STAR_ORE.get());
//        this.tag(CMBlockTags.NATURAL_ESSENCE_ORE)
//                .add(ModBlocks.NATURAL_ESSENCE_ORE.get())
//                .add(ModBlocks.DEEPSLATE_NATURAL_ESSENCE_ORE.get());
//        this.tag(CMBlockTags.EXPERIENCE_ORE)
//                .add(ModBlocks.EXPERIENCE_ORE.get())
//                .add(ModBlocks.DEEPSLATE_EXPERIENCE_ORE.get());
    }
}
