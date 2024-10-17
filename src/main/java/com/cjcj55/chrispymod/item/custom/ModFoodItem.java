package com.cjcj55.chrispymod.item.custom;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class ModFoodItem extends Item {
    public ModFoodItem(FoodProperties foodProperties) {
        super(new Item.Properties().food(foodProperties));
    }
}
