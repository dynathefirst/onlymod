package net.dyna.onlymod.item.custom;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class LuckyCloverItem extends Item {

    public LuckyCloverItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 20 * 120, 1));
        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }
}
