package net.dyna.onlymod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent PINEAPPLE = new FoodComponent.Builder().hunger(6).saturationModifier(4f).build();
    public static final FoodComponent PEPPER = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build();
    public static final FoodComponent CHEESE = new FoodComponent.Builder().hunger(12).saturationModifier(0.5f).build();
    public static final FoodComponent CRYSTALLIZED_HONEY = new FoodComponent.Builder().hunger(3).saturationModifier(1f).build();
    public static final FoodComponent BAGEL = new FoodComponent.Builder().hunger(4).saturationModifier(0.8F).build();
    public static final FoodComponent GOLDEN_BAGEL = new FoodComponent.Builder().hunger(4).saturationModifier(0.8F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 250, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2500, 0), 1.0F).alwaysEdible().build();
    public static final FoodComponent EXOTIC_BUTTER = new FoodComponent.Builder().hunger(5).saturationModifier(0.3F).snack().build();
    public static final FoodComponent BASKET_OF_EXOTIC_BUTTERS = new FoodComponent.Builder().hunger(8).saturationModifier(1.5F).build();
    public static final FoodComponent BAT_WING = new FoodComponent.Builder().hunger(1).saturationModifier(1.0F).statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 60, 4), 0.2F).build();
    public static final FoodComponent WOLF_MEAT = new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).meat().build();
    public static final FoodComponent COOKED_WOLF_MEAT = new FoodComponent.Builder().hunger(7).saturationModifier(0.8f).meat().build();
    public static final FoodComponent FLOUR = new FoodComponent.Builder().hunger(-6).saturationModifier(-4.8f).alwaysEdible().snack().statusEffect(new StatusEffectInstance(StatusEffects.POISON, 250, 5), 1.0F).build();
    public static final FoodComponent DONUT = new FoodComponent.Builder().hunger(1).saturationModifier(0.8f).alwaysEdible().snack().statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 250, 5), 1.0F).build();
}
