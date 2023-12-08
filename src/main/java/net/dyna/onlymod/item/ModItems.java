package net.dyna.onlymod.item;

import net.dyna.onlymod.TheOnlyModYouWillEverNeed;
import net.dyna.onlymod.block.ModBlocks;
import net.dyna.onlymod.item.custom.*;
import net.dyna.onlymod.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item TOPAZ = registerItem("topaz", new Item(new FabricItemSettings()));
    public static final Item COPPER_NUGGET = registerItem("copper_nugget", new Item(new FabricItemSettings()));
    public static final Item PINEAPPLE = registerItem("pineapple", new Item(new FabricItemSettings().food(ModFoodComponents.PINEAPPLE)));
    public static final Item STONE_CHUNK = registerItem("stone_chunk", new StoneChunkItem(new FabricItemSettings()));
    public static final Item CAVE_DETECTOR = registerItem("cave_detector", new CaveDetectorItem(new FabricItemSettings().maxCount(1).maxDamage(256)));
    public static final Item LUCKY_CLOVER = registerItem("lucky_clover", new LuckyCloverItem(new FabricItemSettings().maxCount(1)));
    public static final Item CREEPER_ESSENCE = registerItem("creeper_essence", new Item(new FabricItemSettings()));
    public static final Item DOG = registerItem("dog", new MusicDiscItem(7, ModSounds.DOG, new FabricItemSettings().maxCount(1), 140));
    public static final Item PEPPER = registerItem("pepper", new AliasedBlockItem(ModBlocks.PEPPER_CROP, new FabricItemSettings().food(ModFoodComponents.PEPPER).fireproof()));
    public static final Item CHEESE = registerItem("cheese", new Item(new FabricItemSettings().food(ModFoodComponents.CHEESE).maxCount(16)));
    public static final Item ICICLE_SHARD = registerItem("icicle_shard", new SwordItem(ModToolMaterial.ICICLE, 5, 7f, new FabricItemSettings()));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe", new PickaxeItem(ModToolMaterial.RUBY, 2, 2f, new FabricItemSettings()));
    public static final Item RUBY_AXE = registerItem("ruby_axe", new AxeItem(ModToolMaterial.RUBY, 6, 1f, new FabricItemSettings()));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel", new ShovelItem(ModToolMaterial.RUBY, 0, 0f, new FabricItemSettings()));
    public static final Item RUBY_SWORD = registerItem("ruby_sword", new SwordItem(ModToolMaterial.RUBY, 5, 3f, new FabricItemSettings()));
    public static final Item RUBY_HOE = registerItem("ruby_hoe", new HoeItem(ModToolMaterial.RUBY, 0, 0f, new FabricItemSettings()));
    public static final Item DYNAMITE = registerItem("dynamite", new DynamiteItem(new FabricItemSettings()));
    public static final Item MACE = registerItem("mace", new SwordItem(ModToolMaterial.MACE, 5, 3.7f, new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item HEAVY_IRON = registerItem("heavy_iron", new Item(new FabricItemSettings()));
    public static final Item HEAVY_IRON_SWORD = registerItem("heavy_iron_sword", new SwordItem(ModToolMaterial.HEAVY_IRON, 3, -2.4F, new FabricItemSettings()));
    public static final Item HEAVY_IRON_PICKAXE = registerItem("heavy_iron_pickaxe", new PickaxeItem(ModToolMaterial.HEAVY_IRON, 1, -2.8f, new FabricItemSettings()));
    public static final Item HEAVY_IRON_AXE = registerItem("heavy_iron_axe", new AxeItem(ModToolMaterial.HEAVY_IRON, 6, -3.0f, new FabricItemSettings()));
    public static final Item HEAVY_IRON_SHOVEL = registerItem("heavy_iron_shovel", new ShovelItem(ModToolMaterial.HEAVY_IRON, 1.5F, -3.0F, new FabricItemSettings()));
    public static final Item HEAVY_IRON_HOE = registerItem("heavy_iron_hoe", new HoeItem(ModToolMaterial.HEAVY_IRON, -3, 0.0f, new FabricItemSettings()));
    public static final Item HEAVY_IRON_HELMET = registerItem("heavy_iron_helmet", new ArmorItem(ModArmorMaterials.HEAVY_IRON, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item HEAVY_IRON_CHESTPLATE = registerItem("heavy_iron_chestplate", new ArmorItem(ModArmorMaterials.HEAVY_IRON, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item HEAVY_IRON_LEGGINGS = registerItem("heavy_iron_leggings", new ArmorItem(ModArmorMaterials.HEAVY_IRON, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item HEAVY_IRON_BOOTS = registerItem("heavy_iron_boots", new ArmorItem(ModArmorMaterials.HEAVY_IRON, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    /* Rarity Levels:
    Common - White; Applies to most items.
    Uncommon - Yellow; Mostly common treasure items, as well as drops from minor bosses.
    Rare - Aqua; Items crafted from boss drops, as well as trickier to obtain treasures.
    Epic - Magenta; Mostly reserved for extremely difficult-to-obtain treasures. Certain Creative-exclusive blocks and items are also contained here,
    however, exceptions exist (such as player heads, which are Uncommon).
     */

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TheOnlyModYouWillEverNeed.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TheOnlyModYouWillEverNeed.LOGGER.info("Registering ModItems for " + TheOnlyModYouWillEverNeed.MOD_ID);
    }
}