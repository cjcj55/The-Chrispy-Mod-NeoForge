package com.cjcj55.chrispymod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    /*
    WOOD(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 59, 2.0F, 0.0F, 15, () -> {
        return Ingredient.of(ItemTags.PLANKS);
    }),
    STONE(BlockTags.INCORRECT_FOR_STONE_TOOL, 131, 4.0F, 1.0F, 5, () -> {
        return Ingredient.of(ItemTags.STONE_TOOL_MATERIALS);
    }),
    IRON(BlockTags.INCORRECT_FOR_IRON_TOOL, 250, 6.0F, 2.0F, 14, () -> {
        return Ingredient.of(new ItemLike[]{Items.IRON_INGOT});
    }),
    DIAMOND(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1561, 8.0F, 3.0F, 10, () -> {
        return Ingredient.of(new ItemLike[]{Items.DIAMOND});
    }),
    GOLD(BlockTags.INCORRECT_FOR_GOLD_TOOL, 32, 12.0F, 0.0F, 22, () -> {
        return Ingredient.of(new ItemLike[]{Items.GOLD_INGOT});
    }),
    NETHERITE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2031, 9.0F, 4.0F, 15, () -> {
        return Ingredient.of(new ItemLike[]{Items.NETHERITE_INGOT});
    });
    */
    public static final Tier RUBY = new SimpleTier(         BlockTags.INCORRECT_FOR_IRON_TOOL, 750,     6.0f, 2.0f, 14, () -> Ingredient.of(ModItems.RUBY.get()));
    public static final Tier OPAL = new SimpleTier(         BlockTags.INCORRECT_FOR_IRON_TOOL, 250,     4.5f, 1.0f, 17, () -> Ingredient.of(ModItems.OPAL.get()));
    public static final Tier TANGERINE = new SimpleTier(    BlockTags.INCORRECT_FOR_IRON_TOOL, 280,     3.0f, 1.0f, 8, () -> Ingredient.of(ModItems.TANGERINE.get()));
    public static final Tier COBALT = new SimpleTier(       BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 600,     7.0f, 2.0f, 10, () -> Ingredient.of(ModItems.COBALT.get()));
    public static final Tier BLUE_EMERALD = new SimpleTier( BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1675,    8.5f, 3.0f, 11, () -> Ingredient.of(ModItems.BLUE_EMERALD.get()));
    public static final Tier PARYTH = new SimpleTier(       BlockTags.INCORRECT_FOR_IRON_TOOL, 382,     5.5f, 1.5f, 6, () -> Ingredient.of(ModItems.PARYTH.get()));
    public static final Tier LIGHTNING = new SimpleTier(    BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 850,     8.0f, 0.0f, 9, () -> Ingredient.of(ModItems.LIGHTNING.get()));
    public static final Tier FLAME = new SimpleTier(        BlockTags.INCORRECT_FOR_IRON_TOOL, 275,     6.0f, 2.0f, 12, () -> Ingredient.of(ModItems.FLAME.get()));
    public static final Tier REDSTONE = new SimpleTier(     BlockTags.INCORRECT_FOR_IRON_TOOL, 250,     6.0f, 2.0f, 14, () -> Ingredient.of(ModItems.REDSTONE_INGOT.get()));
    public static final Tier EMERALD = new SimpleTier(      BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 550,     7.0f, 2.5f, 12, () -> Ingredient.of(Items.EMERALD));
    public static final Tier HONEY = new SimpleTier(        BlockTags.INCORRECT_FOR_IRON_TOOL, 400,     4.0f, 1.5f, 15, () -> Ingredient.of(Items.HONEY_BLOCK));
}
