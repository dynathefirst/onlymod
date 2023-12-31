package net.dyna.onlymod.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class PetrificationEnchantment extends Enchantment {
    public PetrificationEnchantment() {
        super(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.BOW, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    }

    @Override
    public int getMinPower(int level) {
        return 25;
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(target instanceof LivingEntity) {
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 20 * 5 * level, 255));
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 20 * 5 * level, 255));
        }

        super.onTargetDamaged(user, target, level);
    }


}
