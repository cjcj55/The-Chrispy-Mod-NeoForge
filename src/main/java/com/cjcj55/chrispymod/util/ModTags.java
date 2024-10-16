package com.cjcj55.chrispymod.util;

import com.cjcj55.chrispymod.ChrispyMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(ChrispyMod.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");
        public static final TagKey<Item> RUBY_ORE = createTag("ruby_ore");
        public static final TagKey<Item> OPAL_ORE = createTag("opal_ore");
        public static final TagKey<Item> TANGERINE_ORE = createTag("tangerine_ore");
        public static final TagKey<Item> COBALT_ORE = createTag("cobalt_ore");
        public static final TagKey<Item> PARYTH_ORE = createTag("paryth_ore");
        public static final TagKey<Item> WHITE_DWARF_STAR_ORE = createTag("white_dwarf_star_ore");
        public static final TagKey<Item> NATURAL_ESSENCE_ORE = createTag("natural_essence_ore");
        public static final TagKey<Item> EXPERIENCE_ORE = createTag("experience_ore");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(ChrispyMod.MOD_ID, name));
        }
    }

}
