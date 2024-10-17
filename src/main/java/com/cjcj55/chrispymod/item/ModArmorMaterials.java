package com.cjcj55.chrispymod.item;

import com.cjcj55.chrispymod.ChrispyMod;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.EnumMap;
import java.util.List;

public class ModArmorMaterials {
    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS = DeferredRegister.create(Registries.ARMOR_MATERIAL, ChrispyMod.MOD_ID);

    public static final Holder<ArmorMaterial> RUBY = ARMOR_MATERIALS.register("ruby", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 5);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 3);
            }), 14, SoundEvents.ARMOR_EQUIP_IRON, () -> Ingredient.of(ModItems.RUBY.get()),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(ChrispyMod.MOD_ID, "ruby"))),
            0, 0));
    public static final Holder<ArmorMaterial> OPAL = ARMOR_MATERIALS.register("opal", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 1);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 5);
                map.put(ArmorItem.Type.HELMET, 1);
                map.put(ArmorItem.Type.BODY, 2);
            }), 17, SoundEvents.ARMOR_EQUIP_IRON, () -> Ingredient.of(ModItems.OPAL.get()),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(ChrispyMod.MOD_ID, "opal"))),
            0, 0));
    public static final Holder<ArmorMaterial> TANGERINE = ARMOR_MATERIALS.register("tangerine", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 5);
                map.put(ArmorItem.Type.HELMET, 1);
                map.put(ArmorItem.Type.BODY, 2);
            }), 8, SoundEvents.ARMOR_EQUIP_IRON, () -> Ingredient.of(ModItems.TANGERINE.get()),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(ChrispyMod.MOD_ID, "tangerine"))),
            0, 0));
    public static final Holder<ArmorMaterial> COBALT = ARMOR_MATERIALS.register("cobalt", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 5);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 3);
            }), 10, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> Ingredient.of(ModItems.COBALT.get()),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(ChrispyMod.MOD_ID, "cobalt"))),
            0, 0));
    public static final Holder<ArmorMaterial> BLUE_EMERALD = ARMOR_MATERIALS.register("blue_emerald", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 9);
                map.put(ArmorItem.Type.HELMET, 4);
                map.put(ArmorItem.Type.BODY, 4);
            }), 11, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> Ingredient.of(ModItems.BLUE_EMERALD.get()),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(ChrispyMod.MOD_ID, "blue_emerald"))),
            2, 0));
    public static final Holder<ArmorMaterial> PARYTH = ARMOR_MATERIALS.register("paryth", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 1);
                map.put(ArmorItem.Type.LEGGINGS, 5);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 3);
            }), 6, SoundEvents.ARMOR_EQUIP_GOLD, () -> Ingredient.of(ModItems.PARYTH.get()),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(ChrispyMod.MOD_ID, "paryth"))),
            0, 0));
    public static final Holder<ArmorMaterial> LIGHTNING = ARMOR_MATERIALS.register("lightning", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 5);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 3);
            }), 9, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> Ingredient.of(ModItems.LIGHTNING.get()),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(ChrispyMod.MOD_ID, "lightning"))),
            1, 0));
    public static final Holder<ArmorMaterial> FLAME = ARMOR_MATERIALS.register("flame", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 5);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 2);
            }), 12, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(ModItems.FLAME.get()),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(ChrispyMod.MOD_ID, "flame"))),
            0, 0));
    public static final Holder<ArmorMaterial> REDSTONE = ARMOR_MATERIALS.register("redstone", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 5);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 2);
            }), 15, SoundEvents.ARMOR_EQUIP_GENERIC, () -> Ingredient.of(ModItems.REDSTONE_INGOT.get()),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(ChrispyMod.MOD_ID, "redstone"))),
            0, 0));
    public static final Holder<ArmorMaterial> EMERALD = ARMOR_MATERIALS.register("emerald", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 7);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 3);
            }), 12, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> Ingredient.of(Items.EMERALD),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(ChrispyMod.MOD_ID, "emerald"))),
            0, 0));
    public static final Holder<ArmorMaterial> WHITE_DWARF_STAR = ARMOR_MATERIALS.register("white_dwarf_star", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 5);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 2);
            }), 16, SoundEvents.ARMOR_EQUIP_NETHERITE, () -> Ingredient.of(ModItems.WHITE_DWARF_STAR.get()),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(ChrispyMod.MOD_ID, "white_dwarf_star"))),
            0, 0));
    public static final Holder<ArmorMaterial> HONEY = ARMOR_MATERIALS.register("honey", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 1);
                map.put(ArmorItem.Type.LEGGINGS, 2);
                map.put(ArmorItem.Type.CHESTPLATE, 3);
                map.put(ArmorItem.Type.HELMET, 1);
                map.put(ArmorItem.Type.BODY, 1);
            }), 15, SoundEvents.ARMOR_EQUIP_TURTLE, () -> Ingredient.of(Blocks.HONEY_BLOCK),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(ChrispyMod.MOD_ID, "honey"))),
            0, 0));

    public static void register(IEventBus eventBus) {
        ARMOR_MATERIALS.register(eventBus);
    }
}
