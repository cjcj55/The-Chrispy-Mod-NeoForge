package com.cjcj55.chrispymod.item.custom;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class LightningSwordItem extends SwordItem {
    public LightningSwordItem(Tier tier, Properties properties) {
        super(tier, properties);
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        if (!player.level().isClientSide() && entity instanceof LivingEntity livingEntity) {
            ServerLevel world = ((ServerLevel) player.level());
            EntityType.LIGHTNING_BOLT.spawn(world, null, player, livingEntity.blockPosition(), MobSpawnType.TRIGGERED, true, true);
        }
        return false;
    }
}
