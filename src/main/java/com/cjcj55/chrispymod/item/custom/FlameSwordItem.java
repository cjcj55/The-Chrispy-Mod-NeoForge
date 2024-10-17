package com.cjcj55.chrispymod.item.custom;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class FlameSwordItem extends SwordItem {
    public FlameSwordItem(Tier tier, Properties properties) {
        super(tier, properties);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.setRemainingFireTicks(60);
        return super.hurtEnemy(stack, target, attacker);
    }
}
