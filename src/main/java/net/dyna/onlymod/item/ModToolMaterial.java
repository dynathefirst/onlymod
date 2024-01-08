package net.dyna.onlymod.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.ItemTags;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    ICICLE(MiningLevels.HAND, 45, 3.5f, 4f, -1, () -> Ingredient.ofItems(Items.ICE)),
    MACE(ICICLE.miningLevel, 1060, 1.0f, 7.7f, 1, () -> Ingredient.ofItems(Items.IRON_INGOT)),
    RUBY(3, 2061, 2.5F, 4.5F, 15, () -> Ingredient.ofItems(ModItems.RUBY)),
    HEAVY_IRON(5, 1500, 8.0F, 3.0F, 10, () -> Ingredient.ofItems(ModItems.HEAVY_IRON)),
    OBSIDIAN(10, 80, 2.7f, 3f, 1000, () -> Ingredient.ofItems(Items.OBSIDIAN)),
    COPPER(2, 184, 6F, 7f, 22, () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    LEVITATION(2, 650, 3.0F, 5.0f, 30, () -> Ingredient.ofItems(Items.PHANTOM_MEMBRANE)),
    HEALTH(2, 650, 3.0F, 5.0f, 30, () -> Ingredient.ofItems(Items.GOLDEN_APPLE)),
    SANDSTONE(MiningLevels.WOOD, 359, 2.0f, 0.0f, 15, () -> Ingredient.ofItems(Items.SANDSTONE)),
    STONE_CLUB(MiningLevels.STONE, 91, 4.0f, 0.8f, 5, () -> Ingredient.ofItems(ModItems.STONE_CHUNK)),
    MAKESHIFT_STONE(MiningLevels.STONE, 13, 4.0f, 1.0f, 5, () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
