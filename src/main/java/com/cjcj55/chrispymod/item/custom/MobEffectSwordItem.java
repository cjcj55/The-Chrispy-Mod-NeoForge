package com.cjcj55.chrispymod.item.custom;

import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class MobEffectSwordItem extends SwordItem {
    private final Holder<MobEffect> effect;
    private final int durationTicks;

    public MobEffectSwordItem(Tier tier, Properties properties, Holder<MobEffect> effect, int durationTicks) {
        super(tier, properties);
        this.effect = effect;
        this.durationTicks = durationTicks;
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        if (entity instanceof LivingEntity livingEntity) {
            livingEntity.addEffect(new MobEffectInstance(effect, durationTicks), player);
        }

        return super.onLeftClickEntity(stack, player, entity);
    }
}
