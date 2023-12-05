package net.dyna.onlymod.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent PINEAPPLE = new FoodComponent.Builder().hunger(6).saturationModifier(4f).build();
    public static final FoodComponent PEPPER = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build();
    public static final FoodComponent CHEESE = new FoodComponent.Builder().hunger(12).saturationModifier(0.5f).build();
}
