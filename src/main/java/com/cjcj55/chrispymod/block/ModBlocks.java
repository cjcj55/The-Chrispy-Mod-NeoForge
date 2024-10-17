package com.cjcj55.chrispymod.block;

import com.cjcj55.chrispymod.ChrispyMod;

import com.cjcj55.chrispymod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ChrispyMod.MOD_ID);

    // BLOCKS (FROM ORE)
    public static final DeferredBlock<Block> RUBY_BLOCK = registerBlock("ruby_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(5.1f, 31.0f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> OPAL_BLOCK = registerBlock("opal_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).strength(4.5f, 31.0f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> TANGERINE_BLOCK = registerBlock("tangerine_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).strength(5.3f, 31.0f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> COBALT_BLOCK = registerBlock("cobalt_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_BLUE).strength(6.0f, 45.0f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BLUE_EMERALD_BLOCK = registerBlock("blue_emerald_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE).strength(9.0f, 50.0f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PARYTH_BLOCK = registerBlock("paryth_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).strength(5.6f, 35.0f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> LIGHTNING_BLOCK = registerBlock("lightning_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).strength(8.5f, 40.0f).sound(SoundType.METAL).requiresCorrectToolForDrops().lightLevel((p_152684_) -> {return 15;})));
    public static final DeferredBlock<Block> FLAME_BLOCK = registerBlock("flame_block", () -> new FlameBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(5.1f, 40.0f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> HARDENED_REDSTONE_BLOCK = registerBlock("hardened_redstone_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(3.2f, 18.0f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    // ORES
    public static final DeferredBlock<Block> RUBY_ORE = registerBlock("ruby_ore", () -> new DropExperienceBlock(UniformInt.of(1, 3), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(5.0f, 15.0f).sound(SoundType.METAL).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore", () -> new DropExperienceBlock(UniformInt.of(1, 3), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(5.0f, 15.0f).sound(SoundType.METAL).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> OPAL_ORE = registerBlock("opal_ore", () -> new DropExperienceBlock(UniformInt.of(0, 2), BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).strength(3.8f, 12.0f).sound(SoundType.METAL).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> DEEPSLATE_OPAL_ORE = registerBlock("deepslate_opal_ore", () -> new DropExperienceBlock(UniformInt.of(0, 2), BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).strength(3.8f, 12.0f).sound(SoundType.METAL).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> TANGERINE_ORE = registerBlock("tangerine_ore", () -> new DropExperienceBlock(UniformInt.of(1, 2), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).strength(5.5f, 25.0f).sound(SoundType.METAL).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> DEEPSLATE_TANGERINE_ORE = registerBlock("deepslate_tangerine_ore", () -> new DropExperienceBlock(UniformInt.of(1, 2), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).strength(5.5f, 25.0f).sound(SoundType.METAL).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> COBALT_ORE = registerBlock("cobalt_ore", () -> new DropExperienceBlock(UniformInt.of(2, 3), BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_BLUE).strength(6.5f, 35.0f).sound(SoundType.METAL).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> DEEPSLATE_COBALT_ORE = registerBlock("deepslate_cobalt_ore", () -> new DropExperienceBlock(UniformInt.of(2, 3), BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_BLUE).strength(6.5f, 35.0f).sound(SoundType.METAL).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PARYTH_ORE = registerBlock("paryth_ore", () -> new DropExperienceBlock(UniformInt.of(0, 2), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).strength(5.5f, 35.0f).sound(SoundType.METAL).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> DEEPSLATE_PARYTH_ORE = registerBlock("deepslate_paryth_ore", () -> new DropExperienceBlock(UniformInt.of(0, 2), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).strength(5.5f, 35.0f).sound(SoundType.METAL).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> WHITE_DWARF_STAR_ORE = registerBlock("white_dwarf_star_ore", () -> new DropExperienceBlock(UniformInt.of(4, 8), BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).strength(6.0f, 200.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> DEEPSLATE_WHITE_DWARF_STAR_ORE = registerBlock("deepslate_white_dwarf_star_ore", () -> new DropExperienceBlock(UniformInt.of(4, 8), BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).strength(6.0f, 200.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NATURAL_ESSENCE_ORE = registerBlock("natural_essence_ore", () -> new DropExperienceBlock(UniformInt.of(1, 3), BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).strength(2.0f, 8.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> DEEPSLATE_NATURAL_ESSENCE_ORE = registerBlock("deepslate_natural_essence_ore", () -> new DropExperienceBlock(UniformInt.of(1, 3), BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).strength(2.0f, 8.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> EXPERIENCE_ORE = registerBlock("experience_ore", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).strength(4.0f, 13.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> DEEPSLATE_EXPERIENCE_ORE = registerBlock("deepslate_experience_ore", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).strength(4.0f, 13.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    // NETHER ORES
    public static final DeferredBlock<Block> RUBY_ORE_NETHER = registerBlock("ruby_ore_nether", () -> new DropExperienceBlock(UniformInt.of(1, 3), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(2.0f, 8.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> FLAME_ORE_NETHER = registerBlock("flame_ore_nether", () -> new DropExperienceBlock(UniformInt.of(3, 5), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(2.0f, 8.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> HELLFIRE_ORE_NETHER = registerBlock("hellfire_ore_nether", () -> new DropExperienceBlock(UniformInt.of(3, 6), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(2.0f, 8.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    // BRICKS
    public static final DeferredBlock<Block> SKINNY_SLANTED_BRICKS = registerBlock("skinny_slanted_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    public static final DeferredBlock<Block> SLANTED_BRICKS = registerBlock("slanted_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(SKINNY_SLANTED_BRICKS.get())));
    public static final DeferredBlock<Block> SKINNY_BRICKS = registerBlock("skinny_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(SKINNY_SLANTED_BRICKS.get())));
    public static final DeferredBlock<Block> CIRCULAR_BRICKS = registerBlock("circular_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(SKINNY_SLANTED_BRICKS.get())));
    public static final DeferredBlock<Block> CRACKED_BRICKS = registerBlock("cracked_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(SKINNY_SLANTED_BRICKS.get())));
    public static final DeferredBlock<Block> ENCASED_BRICKS = registerBlock("encased_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(SKINNY_SLANTED_BRICKS.get())));
    public static final DeferredBlock<Block> MOSAIC_BRICKS = registerBlock("mosaic_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(SKINNY_SLANTED_BRICKS.get())));
    public static final DeferredBlock<Block> ORNATE_BRICKS = registerBlock("ornate_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(SKINNY_SLANTED_BRICKS.get())));
    public static final DeferredBlock<Block> ROAD_BRICKS = registerBlock("road_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(SKINNY_SLANTED_BRICKS.get())));
    public static final DeferredBlock<Block> SOLID_BRICKS = registerBlock("solid_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(SKINNY_SLANTED_BRICKS.get())));
    public static final DeferredBlock<Block> WEAVER_BRICKS = registerBlock("weaver_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(SKINNY_SLANTED_BRICKS.get())));

    // REDSTONE LAMPS
    public static final DeferredBlock<Block> BLACK_REDSTONE_LAMP = registerBlock("black_redstone_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of().lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).mapColor(MapColor.COLOR_BLACK)));
    public static final DeferredBlock<Block> BLUE_REDSTONE_LAMP = registerBlock("blue_redstone_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of().lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).mapColor(MapColor.COLOR_BLUE)));
    public static final DeferredBlock<Block> BROWN_REDSTONE_LAMP = registerBlock("brown_redstone_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of().lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).mapColor(MapColor.COLOR_BROWN)));
    public static final DeferredBlock<Block> CYAN_REDSTONE_LAMP = registerBlock("cyan_redstone_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of().lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).mapColor(MapColor.COLOR_CYAN)));
    public static final DeferredBlock<Block> GRAY_REDSTONE_LAMP = registerBlock("gray_redstone_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of().lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).mapColor(MapColor.COLOR_GRAY)));
    public static final DeferredBlock<Block> GREEN_REDSTONE_LAMP = registerBlock("green_redstone_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of().lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).mapColor(MapColor.COLOR_GREEN)));
    public static final DeferredBlock<Block> LIGHT_BLUE_REDSTONE_LAMP = registerBlock("light_blue_redstone_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of().lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final DeferredBlock<Block> LIGHT_GRAY_REDSTONE_LAMP = registerBlock("light_gray_redstone_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of().lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final DeferredBlock<Block> LIME_REDSTONE_LAMP = registerBlock("lime_redstone_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of().lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).mapColor(MapColor.COLOR_LIGHT_GREEN)));
    public static final DeferredBlock<Block> MAGENTA_REDSTONE_LAMP = registerBlock("magenta_redstone_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of().lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).mapColor(MapColor.COLOR_MAGENTA)));
    public static final DeferredBlock<Block> ORANGE_REDSTONE_LAMP = registerBlock("orange_redstone_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of().lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).mapColor(MapColor.COLOR_ORANGE)));
    public static final DeferredBlock<Block> PINK_REDSTONE_LAMP = registerBlock("pink_redstone_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of().lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).mapColor(MapColor.COLOR_PINK)));
    public static final DeferredBlock<Block> PURPLE_REDSTONE_LAMP = registerBlock("purple_redstone_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of().lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).mapColor(MapColor.COLOR_PURPLE)));
    public static final DeferredBlock<Block> RED_REDSTONE_LAMP = registerBlock("red_redstone_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of().lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).mapColor(MapColor.COLOR_RED)));
    public static final DeferredBlock<Block> WHITE_REDSTONE_LAMP = registerBlock("white_redstone_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of().lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final DeferredBlock<Block> YELLOW_REDSTONE_LAMP = registerBlock("yellow_redstone_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of().lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).mapColor(MapColor.COLOR_YELLOW)));

    // MISC BLOCKS
    public static final DeferredBlock<Block> SUGAR_BLOCK = registerBlock("sugar_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).strength(1.0f, 8.0f).sound(SoundType.SWEET_BERRY_BUSH)));
    public static final DeferredBlock<Block> SUGAR_CANE_BLOCK = registerBlock("sugar_cane_block", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).strength(1.2f, 10.0f).sound(SoundType.CROP)));
//    public static final DeferredBlock<Block> LAVA_SPONGE = registerBlock("lava_sponge", () -> new LavaSpongeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).strength(0.6f).sound(SoundType.GRASS)), new Item.Properties().fireResistant());
//    public static final DeferredBlock<Block> WET_LAVA_SPONGE = registerBlock("wet_lava_sponge", () -> new WetLavaSpongeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).strength(0.6f).sound(SoundType.GRASS)), new Item.Properties().fireResistant());

//    public static final DeferredBlock<Block> ALLOY_FURNACE = registerBlock("alloy_furnace", () -> new AlloyFurnaceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).strength(4.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()));


    private static ToIntFunction<BlockState> litBlockEmission(int lightValue) {
        return p_50763_ -> p_50763_.getValue(BlockStateProperties.LIT) ? lightValue : 0;
    }


    private static <T extends Block> DeferredBlock<T> registerOnlyBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    // Helper methods with 2 params
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    // Helper methods with 3 params
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block, Item.Properties properties) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, properties);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block, Item.Properties properties) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
