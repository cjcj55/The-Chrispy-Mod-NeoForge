package com.cjcj55.chrispymod.item;

import com.cjcj55.chrispymod.ChrispyMod;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ChrispyMod.MOD_ID);

    // ITEMS
    public static final DeferredItem<Item> RUBY = ITEMS.registerSimpleItem("ruby");
    public static final DeferredItem<Item> OPAL = ITEMS.registerSimpleItem("opal");
    public static final DeferredItem<Item> TANGERINE = ITEMS.registerSimpleItem("tangerine");
    public static final DeferredItem<Item> COBALT = ITEMS.registerSimpleItem("cobalt");
    public static final DeferredItem<Item> BLUE_EMERALD = ITEMS.registerSimpleItem("blue_emerald");
    public static final DeferredItem<Item> PARYTH = ITEMS.registerSimpleItem("paryth");
    public static final DeferredItem<Item> LIGHTNING = ITEMS.registerSimpleItem("lightning");
    public static final DeferredItem<Item> FLAME = ITEMS.registerSimpleItem("flame");
    public static final DeferredItem<Item> REDSTONE_INGOT = ITEMS.registerSimpleItem("redstone_ingot");
    public static final DeferredItem<Item> HELLFIRE = ITEMS.register("hellfire", () -> new HellfireItem(new Item.Properties()));
    public static final DeferredItem<Item> WHITE_DWARF_STAR = ITEMS.registerItem("white_dwarf_star", Item::new, new Item.Properties().component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true));
    public static final DeferredItem<Item> NATURAL_ESSENCE = ITEMS.registerSimpleItem("natural_essence");
    public static final DeferredItem<Item> HONEY_STICK = ITEMS.registerSimpleItem("honey_stick");
    public static final DeferredItem<Item> EDIBLE_EXPERIENCE = ITEMS.register("edible_experience", () -> new EdibleExperienceItem(new Item.Properties()));

    // TOOLS
//    public static final DeferredItem<Item> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new ChrispyModSwordItem(ToolMaterials.RUBY, 3, -2.4F));
//    public static final DeferredItem<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ChrispyModShovelItem(ToolMaterials.RUBY, 1.5F, -3.0F));
//    public static final DeferredItem<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new ChrispyModPickaxeItem(ToolMaterials.RUBY, 1, -2.8F));
//    public static final DeferredItem<Item> RUBY_AXE = ITEMS.register("ruby_axe", () -> new ChrispyModAxeItem(ToolMaterials.RUBY, 6.0F, -3.2F));
//    public static final DeferredItem<Item> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new ChrispyModHoeItem(ToolMaterials.RUBY, 0, -3.0F));
//    public static final DeferredItem<Item> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ChrispyModArmorItem(ArmorMaterials.RUBY, EquipmentSlot.HEAD));
//    public static final DeferredItem<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new ChrispyModArmorItem(ArmorMaterials.RUBY, EquipmentSlot.CHEST));
//    public static final DeferredItem<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new ChrispyModArmorItem(ArmorMaterials.RUBY, EquipmentSlot.LEGS));
//    public static final DeferredItem<Item> RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new ChrispyModArmorItem(ArmorMaterials.RUBY, EquipmentSlot.FEET));
//
//    public static final DeferredItem<Item> OPAL_SWORD = ITEMS.register("opal_sword", () -> new ChrispyModSwordItem(ToolMaterials.OPAL, 3, -2.4F));
//    public static final DeferredItem<Item> OPAL_SHOVEL = ITEMS.register("opal_shovel", () -> new ChrispyModShovelItem(ToolMaterials.OPAL, 1.5F, -3.0F));
//    public static final DeferredItem<Item> OPAL_PICKAXE = ITEMS.register("opal_pickaxe", () -> new ChrispyModPickaxeItem(ToolMaterials.OPAL, 1, -2.8F));
//    public static final DeferredItem<Item> OPAL_AXE = ITEMS.register("opal_axe", () -> new ChrispyModAxeItem(ToolMaterials.OPAL, 6.0F, -3.2F));
//    public static final DeferredItem<Item> OPAL_HOE = ITEMS.register("opal_hoe", () -> new ChrispyModHoeItem(ToolMaterials.OPAL, 0, -3.0F));
//    public static final DeferredItem<Item> OPAL_HELMET = ITEMS.register("opal_helmet", () -> new ChrispyModArmorItem(ArmorMaterials.OPAL, EquipmentSlot.HEAD));
//    public static final DeferredItem<Item> OPAL_CHESTPLATE = ITEMS.register("opal_chestplate", () -> new ChrispyModArmorItem(ArmorMaterials.OPAL, EquipmentSlot.CHEST));
//    public static final DeferredItem<Item> OPAL_LEGGINGS = ITEMS.register("opal_leggings", () -> new ChrispyModArmorItem(ArmorMaterials.OPAL, EquipmentSlot.LEGS));
//    public static final DeferredItem<Item> OPAL_BOOTS = ITEMS.register("opal_boots", () -> new ChrispyModArmorItem(ArmorMaterials.OPAL, EquipmentSlot.FEET));
//
//    public static final DeferredItem<Item> TANGERINE_SWORD = ITEMS.register("tangerine_sword", () -> new ChrispyModSwordItem(ToolMaterials.TANGERINE, 3, -2.4F));
//    public static final DeferredItem<Item> TANGERINE_SHOVEL = ITEMS.register("tangerine_shovel", () -> new ChrispyModShovelItem(ToolMaterials.TANGERINE, 1.5F, -3.0F));
//    public static final DeferredItem<Item> TANGERINE_PICKAXE = ITEMS.register("tangerine_pickaxe", () -> new ChrispyModPickaxeItem(ToolMaterials.TANGERINE, 1, -2.8F));
//    public static final DeferredItem<Item> TANGERINE_AXE = ITEMS.register("tangerine_axe", () -> new ChrispyModAxeItem(ToolMaterials.TANGERINE, 6.0F, -3.2F));
//    public static final DeferredItem<Item> TANGERINE_HOE = ITEMS.register("tangerine_hoe", () -> new ChrispyModHoeItem(ToolMaterials.TANGERINE, 0, -3.0F));
//    public static final DeferredItem<Item> TANGERINE_HELMET = ITEMS.register("tangerine_helmet", () -> new ChrispyModArmorItem(ArmorMaterials.TANGERINE, EquipmentSlot.HEAD));
//    public static final DeferredItem<Item> TANGERINE_CHESTPLATE = ITEMS.register("tangerine_chestplate", () -> new ChrispyModArmorItem(ArmorMaterials.TANGERINE, EquipmentSlot.CHEST));
//    public static final DeferredItem<Item> TANGERINE_LEGGINGS = ITEMS.register("tangerine_leggings", () -> new ChrispyModArmorItem(ArmorMaterials.TANGERINE, EquipmentSlot.LEGS));
//    public static final DeferredItem<Item> TANGERINE_BOOTS = ITEMS.register("tangerine_boots", () -> new ChrispyModArmorItem(ArmorMaterials.TANGERINE, EquipmentSlot.FEET));
//
//    public static final DeferredItem<Item> COBALT_SWORD = ITEMS.register("cobalt_sword", () -> new ChrispyModSwordItem(ToolMaterials.COBALT, 3, -2.4F));
//    public static final DeferredItem<Item> COBALT_SHOVEL = ITEMS.register("cobalt_shovel", () -> new ChrispyModShovelItem(ToolMaterials.COBALT, 1.5F, -3.0F));
//    public static final DeferredItem<Item> COBALT_PICKAXE = ITEMS.register("cobalt_pickaxe", () -> new ChrispyModPickaxeItem(ToolMaterials.COBALT, 1, -2.8F));
//    public static final DeferredItem<Item> COBALT_AXE = ITEMS.register("cobalt_axe", () -> new ChrispyModAxeItem(ToolMaterials.COBALT, 6.0F, -3.2F));
//    public static final DeferredItem<Item> COBALT_HOE = ITEMS.register("cobalt_hoe", () -> new ChrispyModHoeItem(ToolMaterials.COBALT, 0, -3.0F));
//    public static final DeferredItem<Item> COBALT_HELMET = ITEMS.register("cobalt_helmet", () -> new ChrispyModArmorItem(ArmorMaterials.COBALT, EquipmentSlot.HEAD));
//    public static final DeferredItem<Item> COBALT_CHESTPLATE = ITEMS.register("cobalt_chestplate", () -> new ChrispyModArmorItem(ArmorMaterials.COBALT, EquipmentSlot.CHEST));
//    public static final DeferredItem<Item> COBALT_LEGGINGS = ITEMS.register("cobalt_leggings", () -> new ChrispyModArmorItem(ArmorMaterials.COBALT, EquipmentSlot.LEGS));
//    public static final DeferredItem<Item> COBALT_BOOTS = ITEMS.register("cobalt_boots", () -> new ChrispyModArmorItem(ArmorMaterials.COBALT, EquipmentSlot.FEET));
//
//    public static final DeferredItem<Item> BLUE_EMERALD_SWORD = ITEMS.register("blue_emerald_sword", () -> new ChrispyModSwordItem(ToolMaterials.BLUE_EMERALD, 3, -2.4F));
//    public static final DeferredItem<Item> BLUE_EMERALD_SHOVEL = ITEMS.register("blue_emerald_shovel", () -> new ChrispyModShovelItem(ToolMaterials.BLUE_EMERALD, 1.5F, -3.0F));
//    public static final DeferredItem<Item> BLUE_EMERALD_PICKAXE = ITEMS.register("blue_emerald_pickaxe", () -> new ChrispyModPickaxeItem(ToolMaterials.BLUE_EMERALD, 1, -2.8F));
//    public static final DeferredItem<Item> BLUE_EMERALD_AXE = ITEMS.register("blue_emerald_axe", () -> new ChrispyModAxeItem(ToolMaterials.BLUE_EMERALD, 6.0F, -3.2F));
//    public static final DeferredItem<Item> BLUE_EMERALD_HOE = ITEMS.register("blue_emerald_hoe", () -> new ChrispyModHoeItem(ToolMaterials.BLUE_EMERALD, 0, -3.0F));
//    public static final DeferredItem<Item> BLUE_EMERALD_HELMET = ITEMS.register("blue_emerald_helmet", () -> new ChrispyModArmorItem(ArmorMaterials.BLUE_EMERALD, EquipmentSlot.HEAD));
//    public static final DeferredItem<Item> BLUE_EMERALD_CHESTPLATE = ITEMS.register("blue_emerald_chestplate", () -> new ChrispyModArmorItem(ArmorMaterials.BLUE_EMERALD, EquipmentSlot.CHEST));
//    public static final DeferredItem<Item> BLUE_EMERALD_LEGGINGS = ITEMS.register("blue_emerald_leggings", () -> new ChrispyModArmorItem(ArmorMaterials.BLUE_EMERALD, EquipmentSlot.LEGS));
//    public static final DeferredItem<Item> BLUE_EMERALD_BOOTS = ITEMS.register("blue_emerald_boots", () -> new ChrispyModArmorItem(ArmorMaterials.BLUE_EMERALD, EquipmentSlot.FEET));
//
//    public static final DeferredItem<Item> PARYTH_SWORD = ITEMS.register("paryth_sword", () -> new ChrispyModSwordItem(ToolMaterials.PARYTH, 3, -2.4F));
//    public static final DeferredItem<Item> PARYTH_SHOVEL = ITEMS.register("paryth_shovel", () -> new ChrispyModShovelItem(ToolMaterials.PARYTH, 1.5F, -3.0F));
//    public static final DeferredItem<Item> PARYTH_PICKAXE = ITEMS.register("paryth_pickaxe", () -> new ChrispyModPickaxeItem(ToolMaterials.PARYTH, 1, -2.8F));
//    public static final DeferredItem<Item> PARYTH_AXE = ITEMS.register("paryth_axe", () -> new ChrispyModAxeItem(ToolMaterials.PARYTH, 6.0F, -3.2F));
//    public static final DeferredItem<Item> PARYTH_HOE = ITEMS.register("paryth_hoe", () -> new ChrispyModHoeItem(ToolMaterials.PARYTH, 0, -3.0F));
//    public static final DeferredItem<Item> PARYTH_HELMET = ITEMS.register("paryth_helmet", () -> new ChrispyModArmorItem(ArmorMaterials.PARYTH, EquipmentSlot.HEAD));
//    public static final DeferredItem<Item> PARYTH_CHESTPLATE = ITEMS.register("paryth_chestplate", () -> new ChrispyModArmorItem(ArmorMaterials.PARYTH, EquipmentSlot.CHEST));
//    public static final DeferredItem<Item> PARYTH_LEGGINGS = ITEMS.register("paryth_leggings", () -> new ChrispyModArmorItem(ArmorMaterials.PARYTH, EquipmentSlot.LEGS));
//    public static final DeferredItem<Item> PARYTH_BOOTS = ITEMS.register("paryth_boots", () -> new ChrispyModArmorItem(ArmorMaterials.PARYTH, EquipmentSlot.FEET));
//
//    public static final DeferredItem<Item> LIGHTNING_SWORD = ITEMS.register("lightning_sword", () -> new LightningSwordItem(ToolMaterials.LIGHTNING, 3, -2.4F));
//    public static final DeferredItem<Item> LIGHTNING_SHOVEL = ITEMS.register("lightning_shovel", () -> new ChrispyModShovelItem(ToolMaterials.LIGHTNING, 1.5F, -3.0F));
//    public static final DeferredItem<Item> LIGHTNING_PICKAXE = ITEMS.register("lightning_pickaxe", () -> new ChrispyModPickaxeItem(ToolMaterials.LIGHTNING, 1, -2.8F));
//    public static final DeferredItem<Item> LIGHTNING_AXE = ITEMS.register("lightning_axe", () -> new ChrispyModAxeItem(ToolMaterials.LIGHTNING, 6.0F, -3.2F));
//    public static final DeferredItem<Item> LIGHTNING_HOE = ITEMS.register("lightning_hoe", () -> new ChrispyModHoeItem(ToolMaterials.LIGHTNING, 0, -3.0F));
//    public static final DeferredItem<Item> LIGHTNING_HELMET = ITEMS.register("lightning_helmet", () -> new ChrispyModArmorItem(ArmorMaterials.LIGHTNING, EquipmentSlot.HEAD));
//    public static final DeferredItem<Item> LIGHTNING_CHESTPLATE = ITEMS.register("lightning_chestplate", () -> new ChrispyModArmorItem(ArmorMaterials.LIGHTNING, EquipmentSlot.CHEST));
//    public static final DeferredItem<Item> LIGHTNING_LEGGINGS = ITEMS.register("lightning_leggings", () -> new ChrispyModArmorItem(ArmorMaterials.LIGHTNING, EquipmentSlot.LEGS));
//    public static final DeferredItem<Item> LIGHTNING_BOOTS = ITEMS.register("lightning_boots", () -> new ChrispyModArmorItem(ArmorMaterials.LIGHTNING, EquipmentSlot.FEET));
//    // Lightning Wand
//    public static final DeferredItem<Item> LIGHTNING_WAND = ITEMS.register("lightning_wand", () -> new LightningWandItem());
//    public static final DeferredItem<Item> FLAME_WAND = ITEMS.register("flame_wand", () -> new FlameWandItem());
//
//
//    public static final DeferredItem<Item> FLAME_SWORD = ITEMS.register("flame_sword", () -> new FlameSwordItem(ToolMaterials.FLAME, 3, -2.4F));
//    public static final DeferredItem<Item> FLAME_SHOVEL = ITEMS.register("flame_shovel", () -> new ChrispyModShovelItem(ToolMaterials.FLAME, 1.5F, -3.0F));
//    public static final DeferredItem<Item> FLAME_PICKAXE = ITEMS.register("flame_pickaxe", () -> new ChrispyModPickaxeItem(ToolMaterials.FLAME, 1, -2.8F));
//    public static final DeferredItem<Item> FLAME_AXE = ITEMS.register("flame_axe", () -> new ChrispyModAxeItem(ToolMaterials.FLAME, 6.0F, -3.2F));
//    public static final DeferredItem<Item> FLAME_HOE = ITEMS.register("flame_hoe", () -> new ChrispyModHoeItem(ToolMaterials.FLAME, 0, -3.0F));
//    public static final DeferredItem<Item> FLAME_HELMET = ITEMS.register("flame_helmet", () -> new FlameArmorItem(ArmorMaterials.FLAME, EquipmentSlot.HEAD));
//    public static final DeferredItem<Item> FLAME_CHESTPLATE = ITEMS.register("flame_chestplate", () -> new ChrispyModArmorItem(ArmorMaterials.FLAME, EquipmentSlot.CHEST));
//    public static final DeferredItem<Item> FLAME_LEGGINGS = ITEMS.register("flame_leggings", () -> new ChrispyModArmorItem(ArmorMaterials.FLAME, EquipmentSlot.LEGS));
//    public static final DeferredItem<Item> FLAME_BOOTS = ITEMS.register("flame_boots", () -> new ChrispyModArmorItem(ArmorMaterials.FLAME, EquipmentSlot.FEET));
//
//    public static final DeferredItem<Item> REDSTONE_SWORD = ITEMS.register("redstone_sword", () -> new ChrispyModSwordItem(ToolMaterials.REDSTONE, 3, -2.4F));
//    public static final DeferredItem<Item> REDSTONE_SHOVEL = ITEMS.register("redstone_shovel", () -> new ChrispyModShovelItem(ToolMaterials.REDSTONE, 1.5F, -3.0F));
//    public static final DeferredItem<Item> REDSTONE_PICKAXE = ITEMS.register("redstone_pickaxe", () -> new ChrispyModPickaxeItem(ToolMaterials.REDSTONE, 1, -2.8F));
//    public static final DeferredItem<Item> REDSTONE_AXE = ITEMS.register("redstone_axe", () -> new ChrispyModAxeItem(ToolMaterials.REDSTONE, 6.0F, -3.2F));
//    public static final DeferredItem<Item> REDSTONE_HOE = ITEMS.register("redstone_hoe", () -> new ChrispyModHoeItem(ToolMaterials.REDSTONE, 0, -3.0F));
//    public static final DeferredItem<Item> REDSTONE_HELMET = ITEMS.register("redstone_helmet", () -> new ChrispyModArmorItem(ArmorMaterials.REDSTONE, EquipmentSlot.HEAD));
//    public static final DeferredItem<Item> REDSTONE_CHESTPLATE = ITEMS.register("redstone_chestplate", () -> new ChrispyModArmorItem(ArmorMaterials.REDSTONE, EquipmentSlot.CHEST));
//    public static final DeferredItem<Item> REDSTONE_LEGGINGS = ITEMS.register("redstone_leggings", () -> new ChrispyModArmorItem(ArmorMaterials.REDSTONE, EquipmentSlot.LEGS));
//    public static final DeferredItem<Item> REDSTONE_BOOTS = ITEMS.register("redstone_boots", () -> new ChrispyModArmorItem(ArmorMaterials.REDSTONE, EquipmentSlot.FEET));
//
//    public static final DeferredItem<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new ChrispyModSwordItem(ToolMaterials.EMERALD, 3, -2.4F));
//    public static final DeferredItem<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () -> new ChrispyModShovelItem(ToolMaterials.EMERALD, 1.5F, -3.0F));
//    public static final DeferredItem<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () -> new ChrispyModPickaxeItem(ToolMaterials.EMERALD, 1, -2.8F));
//    public static final DeferredItem<Item> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new ChrispyModAxeItem(ToolMaterials.EMERALD, 6.0F, -3.2F));
//    public static final DeferredItem<Item> EMERALD_HOE = ITEMS.register("emerald_hoe", () -> new ChrispyModHoeItem(ToolMaterials.EMERALD, 0, -3.0F));
//    public static final DeferredItem<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet", () -> new ChrispyModArmorItem(ArmorMaterials.EMERALD, EquipmentSlot.HEAD));
//    public static final DeferredItem<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () -> new ChrispyModArmorItem(ArmorMaterials.EMERALD, EquipmentSlot.CHEST));
//    public static final DeferredItem<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () -> new ChrispyModArmorItem(ArmorMaterials.EMERALD, EquipmentSlot.LEGS));
//    public static final DeferredItem<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots", () -> new ChrispyModArmorItem(ArmorMaterials.EMERALD, EquipmentSlot.FEET));
//
//    public static final DeferredItem<Item> HONEY_SWORD = ITEMS.register("honey_sword", () -> new ChrispyModSwordItem(ToolMaterials.HONEY, 3, -2.4F));
//    public static final DeferredItem<Item> HONEY_SHOVEL = ITEMS.register("honey_shovel", () -> new ChrispyModShovelItem(ToolMaterials.HONEY, 1.5F, -3.0F));
//    public static final DeferredItem<Item> HONEY_PICKAXE = ITEMS.register("honey_pickaxe", () -> new ChrispyModPickaxeItem(ToolMaterials.HONEY, 1, -2.8F));
//    public static final DeferredItem<Item> HONEY_AXE = ITEMS.register("honey_axe", () -> new ChrispyModAxeItem(ToolMaterials.HONEY, 6.0F, -3.2F));
//    public static final DeferredItem<Item> HONEY_HOE = ITEMS.register("honey_hoe", () -> new ChrispyModHoeItem(ToolMaterials.HONEY, 0, -3.0F));
//    public static final DeferredItem<Item> HONEY_HELMET = ITEMS.register("honey_helmet", () -> new HoneyArmorItem(ArmorMaterials.HONEY, EquipmentSlot.HEAD));
//    public static final DeferredItem<Item> HONEY_CHESTPLATE = ITEMS.register("honey_chestplate", () -> new ChrispyModArmorItem(ArmorMaterials.HONEY, EquipmentSlot.CHEST));
//    public static final DeferredItem<Item> HONEY_LEGGINGS = ITEMS.register("honey_leggings", () -> new ChrispyModArmorItem(ArmorMaterials.HONEY, EquipmentSlot.LEGS));
//    public static final DeferredItem<Item> HONEY_BOOTS = ITEMS.register("honey_boots", () -> new ChrispyModArmorItem(ArmorMaterials.HONEY, EquipmentSlot.FEET));
//
//    public static final DeferredItem<Item> WHITE_DWARF_STAR_HELMET = ITEMS.register("white_dwarf_star_helmet", () -> new WhiteDwarfStarArmorItem(ArmorMaterials.WHITE_DWARF_STAR, EquipmentSlot.HEAD));
//    public static final DeferredItem<Item> WHITE_DWARF_STAR_CHESTPLATE = ITEMS.register("white_dwarf_star_chestplate", () -> new ChrispyModArmorItem(ArmorMaterials.WHITE_DWARF_STAR, EquipmentSlot.CHEST));
//    public static final DeferredItem<Item> WHITE_DWARF_STAR_LEGGINGS = ITEMS.register("white_dwarf_star_leggings", () -> new ChrispyModArmorItem(ArmorMaterials.WHITE_DWARF_STAR, EquipmentSlot.LEGS));
//    public static final DeferredItem<Item> WHITE_DWARF_STAR_BOOTS = ITEMS.register("white_dwarf_star_boots", () -> new ChrispyModArmorItem(ArmorMaterials.WHITE_DWARF_STAR, EquipmentSlot.FEET));
//
//    // FOOD
//    public static final DeferredItem<Item> BLACK_CANDY_CANE = ITEMS.register("black_candy_cane", () -> new ChrispyModFoodItem(FoodList.BLACK_CANDY_CANE));
//    public static final DeferredItem<Item> BLUE_CANDY_CANE = ITEMS.register("blue_candy_cane", () -> new ChrispyModFoodItem(FoodList.BLUE_CANDY_CANE));
//    public static final DeferredItem<Item> BROWN_CANDY_CANE = ITEMS.register("brown_candy_cane", () -> new ChrispyModFoodItem(FoodList.BROWN_CANDY_CANE));
//    public static final DeferredItem<Item> CYAN_CANDY_CANE = ITEMS.register("cyan_candy_cane", () -> new ChrispyModFoodItem(FoodList.CYAN_CANDY_CANE));
//    public static final DeferredItem<Item> GRAY_CANDY_CANE = ITEMS.register("gray_candy_cane", () -> new ChrispyModFoodItem(FoodList.GRAY_CANDY_CANE));
//    public static final DeferredItem<Item> GREEN_CANDY_CANE = ITEMS.register("green_candy_cane", () -> new ChrispyModFoodItem(FoodList.GREEN_CANDY_CANE));
//    public static final DeferredItem<Item> LIGHT_BLUE_CANDY_CANE = ITEMS.register("light_blue_candy_cane", () -> new ChrispyModFoodItem(FoodList.LIGHT_BLUE_CANDY_CANE));
//    public static final DeferredItem<Item> LIGHT_GRAY_CANDY_CANE = ITEMS.register("light_gray_candy_cane", () -> new ChrispyModFoodItem(FoodList.LIGHT_GRAY_CANDY_CANE));
//    public static final DeferredItem<Item> LIME_CANDY_CANE = ITEMS.register("lime_candy_cane", () -> new ChrispyModFoodItem(FoodList.LIME_CANDY_CANE));
//    public static final DeferredItem<Item> MAGENTA_CANDY_CANE = ITEMS.register("magenta_candy_cane", () -> new ChrispyModFoodItem(FoodList.MAGENTA_CANDY_CANE));
//    public static final DeferredItem<Item> ORANGE_CANDY_CANE = ITEMS.register("orange_candy_cane", () -> new ChrispyModFoodItem(FoodList.ORANGE_CANDY_CANE));
//    public static final DeferredItem<Item> PINK_CANDY_CANE = ITEMS.register("pink_candy_cane", () -> new ChrispyModFoodItem(FoodList.PINK_CANDY_CANE));
//    public static final DeferredItem<Item> PURPLE_CANDY_CANE = ITEMS.register("purple_candy_cane", () -> new ChrispyModFoodItem(FoodList.PURPLE_CANDY_CANE));
//    public static final DeferredItem<Item> RED_CANDY_CANE = ITEMS.register("red_candy_cane", () -> new ChrispyModFoodItem(FoodList.RED_CANDY_CANE));
//    public static final DeferredItem<Item> WHITE_CANDY_CANE = ITEMS.register("white_candy_cane", () -> new ChrispyModFoodItem(FoodList.WHITE_CANDY_CANE));
//    public static final DeferredItem<Item> YELLOW_CANDY_CANE = ITEMS.register("yellow_candy_cane", () -> new ChrispyModFoodItem(FoodList.YELLOW_CANDY_CANE));
//    public static final DeferredItem<Item> COOKED_CARROT = ITEMS.register("cooked_carrot", () -> new ChrispyModFoodItem(FoodList.COOKED_CARROT));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
