package com.cjcj55.chrispymod.item;

import com.cjcj55.chrispymod.ChrispyMod;

import com.cjcj55.chrispymod.item.custom.*;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.*;
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
    public static final DeferredItem<Item> HELLFIRE = ITEMS.register("hellfire", HellfireItem::new);
    public static final DeferredItem<Item> WHITE_DWARF_STAR = ITEMS.registerItem("white_dwarf_star", Item::new, new Item.Properties().component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true));
    public static final DeferredItem<Item> NATURAL_ESSENCE = ITEMS.registerSimpleItem("natural_essence");
    public static final DeferredItem<Item> HONEY_STICK = ITEMS.registerSimpleItem("honey_stick");
    public static final DeferredItem<Item> EDIBLE_EXPERIENCE = ITEMS.register("edible_experience", EdibleExperienceItem::new);

    // TOOLS
    public static final DeferredItem<Item> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(ModToolTiers.RUBY, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.RUBY, 3, -2.4F))));
    public static final DeferredItem<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(ModToolTiers.RUBY, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.RUBY, 1.5F, -3.0F))));
    public static final DeferredItem<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ModToolTiers.RUBY, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.RUBY, 1, -2.8F))));
    public static final DeferredItem<Item> RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItem(ModToolTiers.RUBY, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.RUBY, 6.0F, -3.2F))));
    public static final DeferredItem<Item> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(ModToolTiers.RUBY, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.RUBY, 0, -3.0F))));
    public static final DeferredItem<Item> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET,
            new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))));
    public static final DeferredItem<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE,
            new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(15))));
    public static final DeferredItem<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS,
            new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15))));
    public static final DeferredItem<Item> RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS,
            new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(15))));

    public static final DeferredItem<Item> OPAL_SWORD = ITEMS.register("opal_sword", () -> new SwordItem(ModToolTiers.OPAL, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.OPAL, 3, -2.4F))));
    public static final DeferredItem<Item> OPAL_SHOVEL = ITEMS.register("opal_shovel", () -> new ShovelItem(ModToolTiers.OPAL, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.OPAL, 1.5F, -3.0F))));
    public static final DeferredItem<Item> OPAL_PICKAXE = ITEMS.register("opal_pickaxe", () -> new PickaxeItem(ModToolTiers.OPAL,  new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.OPAL, 1, -2.8F))));
    public static final DeferredItem<Item> OPAL_AXE = ITEMS.register("opal_axe", () -> new AxeItem(ModToolTiers.OPAL, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.OPAL, 6.0F, -3.2F))));
    public static final DeferredItem<Item> OPAL_HOE = ITEMS.register("opal_hoe", () -> new HoeItem(ModToolTiers.OPAL, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.OPAL, 0, -3.0F))));
    public static final DeferredItem<Item> OPAL_HELMET = ITEMS.register("opal_helmet", () -> new ArmorItem(ModArmorMaterials.OPAL, ArmorItem.Type.HELMET,
            new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(12))));
    public static final DeferredItem<Item> OPAL_CHESTPLATE = ITEMS.register("opal_chestplate", () -> new ArmorItem(ModArmorMaterials.OPAL, ArmorItem.Type.CHESTPLATE,
            new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(12))));
    public static final DeferredItem<Item> OPAL_LEGGINGS = ITEMS.register("opal_leggings", () -> new ArmorItem(ModArmorMaterials.OPAL, ArmorItem.Type.LEGGINGS,
            new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(12))));
    public static final DeferredItem<Item> OPAL_BOOTS = ITEMS.register("opal_boots", () -> new ArmorItem(ModArmorMaterials.OPAL, ArmorItem.Type.BOOTS,
            new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(12))));

    public static final DeferredItem<Item> TANGERINE_SWORD = ITEMS.register("tangerine_sword", () -> new SwordItem(ModToolTiers.TANGERINE, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.TANGERINE, 3, -2.4F))));
    public static final DeferredItem<Item> TANGERINE_SHOVEL = ITEMS.register("tangerine_shovel", () -> new ShovelItem(ModToolTiers.TANGERINE, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.TANGERINE, 1.5F, -3.0F))));
    public static final DeferredItem<Item> TANGERINE_PICKAXE = ITEMS.register("tangerine_pickaxe", () -> new PickaxeItem(ModToolTiers.TANGERINE, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.TANGERINE, 1, -2.8F))));
    public static final DeferredItem<Item> TANGERINE_AXE = ITEMS.register("tangerine_axe", () -> new AxeItem(ModToolTiers.TANGERINE, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.TANGERINE, 6.0F, -3.2F))));
    public static final DeferredItem<Item> TANGERINE_HOE = ITEMS.register("tangerine_hoe", () -> new HoeItem(ModToolTiers.TANGERINE, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.TANGERINE, 0, -3.0F))));
    public static final DeferredItem<Item> TANGERINE_HELMET = ITEMS.register("tangerine_helmet", () -> new ArmorItem(ModArmorMaterials.TANGERINE, ArmorItem.Type.HELMET,
            new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(8))));
    public static final DeferredItem<Item> TANGERINE_CHESTPLATE = ITEMS.register("tangerine_chestplate", () -> new ArmorItem(ModArmorMaterials.TANGERINE, ArmorItem.Type.CHESTPLATE,
            new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(8))));
    public static final DeferredItem<Item> TANGERINE_LEGGINGS = ITEMS.register("tangerine_leggings", () -> new ArmorItem(ModArmorMaterials.TANGERINE, ArmorItem.Type.LEGGINGS,
            new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(8))));
    public static final DeferredItem<Item> TANGERINE_BOOTS = ITEMS.register("tangerine_boots", () -> new ArmorItem(ModArmorMaterials.TANGERINE, ArmorItem.Type.BOOTS,
            new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(8))));

    public static final DeferredItem<Item> COBALT_SWORD = ITEMS.register("cobalt_sword", () -> new SwordItem(ModToolTiers.COBALT, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.COBALT, 3, -2.4F))));
    public static final DeferredItem<Item> COBALT_SHOVEL = ITEMS.register("cobalt_shovel", () -> new ShovelItem(ModToolTiers.COBALT, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.COBALT, 1.5F, -3.0F))));
    public static final DeferredItem<Item> COBALT_PICKAXE = ITEMS.register("cobalt_pickaxe", () -> new PickaxeItem(ModToolTiers.COBALT, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.COBALT, 1, -2.8F))));
    public static final DeferredItem<Item> COBALT_AXE = ITEMS.register("cobalt_axe", () -> new AxeItem(ModToolTiers.COBALT, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.COBALT, 6.0F, -3.2F))));
    public static final DeferredItem<Item> COBALT_HOE = ITEMS.register("cobalt_hoe", () -> new HoeItem(ModToolTiers.COBALT, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.COBALT, 0, -3.0F))));
    public static final DeferredItem<Item> COBALT_HELMET = ITEMS.register("cobalt_helmet", () -> new ArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.HELMET,
            new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(20))));
    public static final DeferredItem<Item> COBALT_CHESTPLATE = ITEMS.register("cobalt_chestplate", () -> new ArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.CHESTPLATE,
            new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(20))));
    public static final DeferredItem<Item> COBALT_LEGGINGS = ITEMS.register("cobalt_leggings", () -> new ArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.LEGGINGS,
            new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(20))));
    public static final DeferredItem<Item> COBALT_BOOTS = ITEMS.register("cobalt_boots", () -> new ArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.BOOTS,
            new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(20))));

    public static final DeferredItem<Item> BLUE_EMERALD_SWORD = ITEMS.register("blue_emerald_sword", () -> new SwordItem(ModToolTiers.BLUE_EMERALD, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.BLUE_EMERALD, 3, -2.4F))));
    public static final DeferredItem<Item> BLUE_EMERALD_SHOVEL = ITEMS.register("blue_emerald_shovel", () -> new ShovelItem(ModToolTiers.BLUE_EMERALD, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.BLUE_EMERALD, 1.5F, -3.0F))));
    public static final DeferredItem<Item> BLUE_EMERALD_PICKAXE = ITEMS.register("blue_emerald_pickaxe", () -> new PickaxeItem(ModToolTiers.BLUE_EMERALD, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.BLUE_EMERALD, 1, -2.8F))));
    public static final DeferredItem<Item> BLUE_EMERALD_AXE = ITEMS.register("blue_emerald_axe", () -> new AxeItem(ModToolTiers.BLUE_EMERALD, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.BLUE_EMERALD, 6.0F, -3.2F))));
    public static final DeferredItem<Item> BLUE_EMERALD_HOE = ITEMS.register("blue_emerald_hoe", () -> new HoeItem(ModToolTiers.BLUE_EMERALD, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.BLUE_EMERALD, 0, -3.0F))));
    public static final DeferredItem<Item> BLUE_EMERALD_HELMET = ITEMS.register("blue_emerald_helmet", () -> new ArmorItem(ModArmorMaterials.BLUE_EMERALD, ArmorItem.Type.HELMET,
            new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(30))));
    public static final DeferredItem<Item> BLUE_EMERALD_CHESTPLATE = ITEMS.register("blue_emerald_chestplate", () -> new ArmorItem(ModArmorMaterials.BLUE_EMERALD, ArmorItem.Type.CHESTPLATE,
            new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(30))));
    public static final DeferredItem<Item> BLUE_EMERALD_LEGGINGS = ITEMS.register("blue_emerald_leggings", () -> new ArmorItem(ModArmorMaterials.BLUE_EMERALD, ArmorItem.Type.LEGGINGS,
            new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(30))));
    public static final DeferredItem<Item> BLUE_EMERALD_BOOTS = ITEMS.register("blue_emerald_boots", () -> new ArmorItem(ModArmorMaterials.BLUE_EMERALD, ArmorItem.Type.BOOTS,
            new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(30))));

    public static final DeferredItem<Item> PARYTH_SWORD = ITEMS.register("paryth_sword", () -> new SwordItem(ModToolTiers.PARYTH, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.PARYTH, 3, -2.4F))));
    public static final DeferredItem<Item> PARYTH_SHOVEL = ITEMS.register("paryth_shovel", () -> new ShovelItem(ModToolTiers.PARYTH, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.PARYTH, 1.5F, -3.0F))));
    public static final DeferredItem<Item> PARYTH_PICKAXE = ITEMS.register("paryth_pickaxe", () -> new PickaxeItem(ModToolTiers.PARYTH, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.PARYTH, 1, -2.8F))));
    public static final DeferredItem<Item> PARYTH_AXE = ITEMS.register("paryth_axe", () -> new AxeItem(ModToolTiers.PARYTH, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.PARYTH, 6.0F, -3.2F))));
    public static final DeferredItem<Item> PARYTH_HOE = ITEMS.register("paryth_hoe", () -> new HoeItem(ModToolTiers.PARYTH, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.PARYTH, 0, -3.0F))));
    public static final DeferredItem<Item> PARYTH_HELMET = ITEMS.register("paryth_helmet", () -> new ArmorItem(ModArmorMaterials.PARYTH, ArmorItem.Type.HELMET,
            new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(10))));
    public static final DeferredItem<Item> PARYTH_CHESTPLATE = ITEMS.register("paryth_chestplate", () -> new ArmorItem(ModArmorMaterials.PARYTH, ArmorItem.Type.CHESTPLATE,
            new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(10))));
    public static final DeferredItem<Item> PARYTH_LEGGINGS = ITEMS.register("paryth_leggings", () -> new ArmorItem(ModArmorMaterials.PARYTH, ArmorItem.Type.LEGGINGS,
            new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(10))));
    public static final DeferredItem<Item> PARYTH_BOOTS = ITEMS.register("paryth_boots", () -> new ArmorItem(ModArmorMaterials.PARYTH, ArmorItem.Type.BOOTS,
            new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(10))));

    public static final DeferredItem<Item> LIGHTNING_SWORD = ITEMS.register("lightning_sword", () -> new LightningSwordItem(ModToolTiers.LIGHTNING, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.LIGHTNING, 3, -2.4F))));
    public static final DeferredItem<Item> LIGHTNING_SHOVEL = ITEMS.register("lightning_shovel", () -> new ShovelItem(ModToolTiers.LIGHTNING, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.LIGHTNING, 1.5F, -3.0F))));
    public static final DeferredItem<Item> LIGHTNING_PICKAXE = ITEMS.register("lightning_pickaxe", () -> new PickaxeItem(ModToolTiers.LIGHTNING, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.LIGHTNING, 1, -2.8F))));
    public static final DeferredItem<Item> LIGHTNING_AXE = ITEMS.register("lightning_axe", () -> new AxeItem(ModToolTiers.LIGHTNING, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.LIGHTNING, 6.0F, -3.2F))));
    public static final DeferredItem<Item> LIGHTNING_HOE = ITEMS.register("lightning_hoe", () -> new HoeItem(ModToolTiers.LIGHTNING, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.LIGHTNING, 0, -3.0F))));
    public static final DeferredItem<Item> LIGHTNING_HELMET = ITEMS.register("lightning_helmet", () -> new ArmorItem(ModArmorMaterials.LIGHTNING, ArmorItem.Type.HELMET,
            new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(23))));
    public static final DeferredItem<Item> LIGHTNING_CHESTPLATE = ITEMS.register("lightning_chestplate", () -> new ArmorItem(ModArmorMaterials.LIGHTNING, ArmorItem.Type.CHESTPLATE,
            new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(23))));
    public static final DeferredItem<Item> LIGHTNING_LEGGINGS = ITEMS.register("lightning_leggings", () -> new ArmorItem(ModArmorMaterials.LIGHTNING, ArmorItem.Type.LEGGINGS,
            new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(23))));
    public static final DeferredItem<Item> LIGHTNING_BOOTS = ITEMS.register("lightning_boots", () -> new ArmorItem(ModArmorMaterials.LIGHTNING, ArmorItem.Type.BOOTS,
            new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(23))));
    // Wands
    public static final DeferredItem<Item> LIGHTNING_WAND = ITEMS.register("lightning_wand", LightningWandItem::new);
    public static final DeferredItem<Item> FLAME_WAND = ITEMS.register("flame_wand", FlameWandItem::new);


    public static final DeferredItem<Item> FLAME_SWORD = ITEMS.register("flame_sword", () -> new FlameSwordItem(ModToolTiers.FLAME, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.FLAME, 3, -2.4F))));
    public static final DeferredItem<Item> FLAME_SHOVEL = ITEMS.register("flame_shovel", () -> new ShovelItem(ModToolTiers.FLAME, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.FLAME, 1.5F, -3.0F))));
    public static final DeferredItem<Item> FLAME_PICKAXE = ITEMS.register("flame_pickaxe", () -> new PickaxeItem(ModToolTiers.FLAME, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.FLAME, 1, -2.8F))));
    public static final DeferredItem<Item> FLAME_AXE = ITEMS.register("flame_axe", () -> new AxeItem(ModToolTiers.FLAME, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.FLAME, 6.0F, -3.2F))));
    public static final DeferredItem<Item> FLAME_HOE = ITEMS.register("flame_hoe", () -> new HoeItem(ModToolTiers.FLAME, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.FLAME, 0, -3.0F))));
    public static final DeferredItem<Item> FLAME_HELMET = ITEMS.register("flame_helmet", () -> new FlameArmorItem(ModArmorMaterials.FLAME, ArmorItem.Type.HELMET,
            new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(13))));
    public static final DeferredItem<Item> FLAME_CHESTPLATE = ITEMS.register("flame_chestplate", () -> new ArmorItem(ModArmorMaterials.FLAME, ArmorItem.Type.CHESTPLATE,
            new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(13))));
    public static final DeferredItem<Item> FLAME_LEGGINGS = ITEMS.register("flame_leggings", () -> new ArmorItem(ModArmorMaterials.FLAME, ArmorItem.Type.LEGGINGS,
            new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(13))));
    public static final DeferredItem<Item> FLAME_BOOTS = ITEMS.register("flame_boots", () -> new ArmorItem(ModArmorMaterials.FLAME, ArmorItem.Type.BOOTS,
            new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(13))));

    public static final DeferredItem<Item> REDSTONE_SWORD = ITEMS.register("redstone_sword", () -> new SwordItem(ModToolTiers.REDSTONE, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.REDSTONE, 3, -2.4F))));
    public static final DeferredItem<Item> REDSTONE_SHOVEL = ITEMS.register("redstone_shovel", () -> new ShovelItem(ModToolTiers.REDSTONE, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.REDSTONE, 1.5F, -3.0F))));
    public static final DeferredItem<Item> REDSTONE_PICKAXE = ITEMS.register("redstone_pickaxe", () -> new PickaxeItem(ModToolTiers.REDSTONE, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.REDSTONE, 1, -2.8F))));
    public static final DeferredItem<Item> REDSTONE_AXE = ITEMS.register("redstone_axe", () -> new AxeItem(ModToolTiers.REDSTONE, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.REDSTONE, 6.0F, -3.2F))));
    public static final DeferredItem<Item> REDSTONE_HOE = ITEMS.register("redstone_hoe", () -> new HoeItem(ModToolTiers.REDSTONE, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.REDSTONE, 0, -3.0F))));
    public static final DeferredItem<Item> REDSTONE_HELMET = ITEMS.register("redstone_helmet", () -> new ArmorItem(ModArmorMaterials.REDSTONE, ArmorItem.Type.HELMET,
            new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))));
    public static final DeferredItem<Item> REDSTONE_CHESTPLATE = ITEMS.register("redstone_chestplate", () -> new ArmorItem(ModArmorMaterials.REDSTONE, ArmorItem.Type.CHESTPLATE,
            new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(15))));
    public static final DeferredItem<Item> REDSTONE_LEGGINGS = ITEMS.register("redstone_leggings", () -> new ArmorItem(ModArmorMaterials.REDSTONE, ArmorItem.Type.LEGGINGS,
            new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15))));
    public static final DeferredItem<Item> REDSTONE_BOOTS = ITEMS.register("redstone_boots", () -> new ArmorItem(ModArmorMaterials.REDSTONE, ArmorItem.Type.BOOTS,
            new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(15))));

    public static final DeferredItem<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new SwordItem(ModToolTiers.EMERALD, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.EMERALD, 3, -2.4F))));
    public static final DeferredItem<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () -> new ShovelItem(ModToolTiers.EMERALD, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.EMERALD, 1.5F, -3.0F))));
    public static final DeferredItem<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () -> new PickaxeItem(ModToolTiers.EMERALD, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.EMERALD, 1, -2.8F))));
    public static final DeferredItem<Item> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new AxeItem(ModToolTiers.EMERALD, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.EMERALD, 6.0F, -3.2F))));
    public static final DeferredItem<Item> EMERALD_HOE = ITEMS.register("emerald_hoe", () -> new HoeItem(ModToolTiers.EMERALD, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.EMERALD, 0, -3.0F))));
    public static final DeferredItem<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet", () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET,
            new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(28))));
    public static final DeferredItem<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE,
            new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(28))));
    public static final DeferredItem<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS,
            new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(28))));
    public static final DeferredItem<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots", () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS,
            new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(28))));

    public static final DeferredItem<Item> HONEY_SWORD = ITEMS.register("honey_sword", () -> new SwordItem(ModToolTiers.HONEY, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.HONEY, 3, -2.4F))));
    public static final DeferredItem<Item> HONEY_SHOVEL = ITEMS.register("honey_shovel", () -> new ShovelItem(ModToolTiers.HONEY, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.HONEY, 1.5F, -3.0F))));
    public static final DeferredItem<Item> HONEY_PICKAXE = ITEMS.register("honey_pickaxe", () -> new PickaxeItem(ModToolTiers.HONEY, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.HONEY, 1, -2.8F))));
    public static final DeferredItem<Item> HONEY_AXE = ITEMS.register("honey_axe", () -> new AxeItem(ModToolTiers.HONEY, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.HONEY, 6.0F, -3.2F))));
    public static final DeferredItem<Item> HONEY_HOE = ITEMS.register("honey_hoe", () -> new HoeItem(ModToolTiers.HONEY, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.HONEY, 0, -3.0F))));
    public static final DeferredItem<Item> HONEY_HELMET = ITEMS.register("honey_helmet", () -> new HoneyArmorItem(ModArmorMaterials.HONEY, ArmorItem.Type.HELMET,
            new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(20))));
    public static final DeferredItem<Item> HONEY_CHESTPLATE = ITEMS.register("honey_chestplate", () -> new ArmorItem(ModArmorMaterials.HONEY, ArmorItem.Type.CHESTPLATE,
            new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(20))));
    public static final DeferredItem<Item> HONEY_LEGGINGS = ITEMS.register("honey_leggings", () -> new ArmorItem(ModArmorMaterials.HONEY, ArmorItem.Type.LEGGINGS,
            new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(20))));
    public static final DeferredItem<Item> HONEY_BOOTS = ITEMS.register("honey_boots", () -> new ArmorItem(ModArmorMaterials.HONEY, ArmorItem.Type.BOOTS,
            new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(20))));

    public static final DeferredItem<Item> WHITE_DWARF_STAR_HELMET = ITEMS.register("white_dwarf_star_helmet", () -> new WhiteDwarfStarArmorItem(ModArmorMaterials.WHITE_DWARF_STAR, ArmorItem.Type.HELMET,
            new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(12))));
    public static final DeferredItem<Item> WHITE_DWARF_STAR_CHESTPLATE = ITEMS.register("white_dwarf_star_chestplate", () -> new ArmorItem(ModArmorMaterials.WHITE_DWARF_STAR, ArmorItem.Type.CHESTPLATE,
            new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(12))));
    public static final DeferredItem<Item> WHITE_DWARF_STAR_LEGGINGS = ITEMS.register("white_dwarf_star_leggings", () -> new ArmorItem(ModArmorMaterials.WHITE_DWARF_STAR, ArmorItem.Type.LEGGINGS,
            new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(12))));
    public static final DeferredItem<Item> WHITE_DWARF_STAR_BOOTS = ITEMS.register("white_dwarf_star_boots", () -> new ArmorItem(ModArmorMaterials.WHITE_DWARF_STAR, ArmorItem.Type.BOOTS,
            new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(12))));

    // FOOD
    public static final DeferredItem<Item> BLACK_CANDY_CANE = ITEMS.register("black_candy_cane", () -> new ModFoodItem(ModFoodProperties.BLACK_CANDY_CANE));
    public static final DeferredItem<Item> BLUE_CANDY_CANE = ITEMS.register("blue_candy_cane", () -> new ModFoodItem(ModFoodProperties.BLUE_CANDY_CANE));
    public static final DeferredItem<Item> BROWN_CANDY_CANE = ITEMS.register("brown_candy_cane", () -> new ModFoodItem(ModFoodProperties.BROWN_CANDY_CANE));
    public static final DeferredItem<Item> CYAN_CANDY_CANE = ITEMS.register("cyan_candy_cane", () -> new ModFoodItem(ModFoodProperties.CYAN_CANDY_CANE));
    public static final DeferredItem<Item> GRAY_CANDY_CANE = ITEMS.register("gray_candy_cane", () -> new ModFoodItem(ModFoodProperties.GRAY_CANDY_CANE));
    public static final DeferredItem<Item> GREEN_CANDY_CANE = ITEMS.register("green_candy_cane", () -> new ModFoodItem(ModFoodProperties.GREEN_CANDY_CANE));
    public static final DeferredItem<Item> LIGHT_BLUE_CANDY_CANE = ITEMS.register("light_blue_candy_cane", () -> new ModFoodItem(ModFoodProperties.LIGHT_BLUE_CANDY_CANE));
    public static final DeferredItem<Item> LIGHT_GRAY_CANDY_CANE = ITEMS.register("light_gray_candy_cane", () -> new ModFoodItem(ModFoodProperties.LIGHT_GRAY_CANDY_CANE));
    public static final DeferredItem<Item> LIME_CANDY_CANE = ITEMS.register("lime_candy_cane", () -> new ModFoodItem(ModFoodProperties.LIME_CANDY_CANE));
    public static final DeferredItem<Item> MAGENTA_CANDY_CANE = ITEMS.register("magenta_candy_cane", () -> new ModFoodItem(ModFoodProperties.MAGENTA_CANDY_CANE));
    public static final DeferredItem<Item> ORANGE_CANDY_CANE = ITEMS.register("orange_candy_cane", () -> new ModFoodItem(ModFoodProperties.ORANGE_CANDY_CANE));
    public static final DeferredItem<Item> PINK_CANDY_CANE = ITEMS.register("pink_candy_cane", () -> new ModFoodItem(ModFoodProperties.PINK_CANDY_CANE));
    public static final DeferredItem<Item> PURPLE_CANDY_CANE = ITEMS.register("purple_candy_cane", () -> new ModFoodItem(ModFoodProperties.PURPLE_CANDY_CANE));
    public static final DeferredItem<Item> RED_CANDY_CANE = ITEMS.register("red_candy_cane", () -> new ModFoodItem(ModFoodProperties.RED_CANDY_CANE));
    public static final DeferredItem<Item> WHITE_CANDY_CANE = ITEMS.register("white_candy_cane", () -> new ModFoodItem(ModFoodProperties.WHITE_CANDY_CANE));
    public static final DeferredItem<Item> YELLOW_CANDY_CANE = ITEMS.register("yellow_candy_cane", () -> new ModFoodItem(ModFoodProperties.YELLOW_CANDY_CANE));
    public static final DeferredItem<Item> COOKED_CARROT = ITEMS.register("cooked_carrot", () -> new ModFoodItem(ModFoodProperties.COOKED_CARROT));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
