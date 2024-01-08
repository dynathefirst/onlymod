package net.dyna.onlymod.item;

import net.dyna.onlymod.TheOnlyModYouWillEverNeed;
import net.dyna.onlymod.block.ModBlocks;
import net.dyna.onlymod.entity.ModEntities;
import net.dyna.onlymod.item.custom.*;
import net.dyna.onlymod.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
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
    public static final Item PEBBLE = registerItem("pebble", new StoneChunkItem(new FabricItemSettings()));
    public static final Item CAVE_DETECTOR = registerItem("cave_detector", new CaveDetectorItem(new FabricItemSettings().maxCount(1).maxDamage(256)));
    public static final Item LUCKY_CLOVER = registerItem("lucky_clover", new LuckyCloverItem(new FabricItemSettings().maxCount(1)));
    public static final Item CREEPER_ESSENCE = registerItem("creeper_essence", new Item(new FabricItemSettings()));
    public static final Item DOG = registerItem("dog", new MusicDiscItem(7, ModSounds.DOG, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), 140));
    public static final Item PEPPER = registerItem("pepper", new AliasedBlockItem(ModBlocks.PEPPER_CROP, new FabricItemSettings().food(ModFoodComponents.PEPPER).fireproof()));
    public static final Item CHEESE = registerItem("cheese", new Item(new FabricItemSettings().food(ModFoodComponents.CHEESE).maxCount(16)));
    public static final Item ICICLE_SHARD = registerItem("icicle_shard", new SwordItem(ModToolMaterial.ICICLE, 5, 7f, new FabricItemSettings()));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe", new PickaxeItem(ModToolMaterial.RUBY, 2, 2f, new FabricItemSettings()));
    public static final Item RUBY_AXE = registerItem("ruby_axe", new AxeItem(ModToolMaterial.RUBY, 6, 1f, new FabricItemSettings()));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel", new ShovelItem(ModToolMaterial.RUBY, 0, 0f, new FabricItemSettings()));
    public static final Item RUBY_SWORD = registerItem("ruby_sword", new SwordItem(ModToolMaterial.RUBY, 5, 3f, new FabricItemSettings()));
    public static final Item RUBY_HOE = registerItem("ruby_hoe", new HoeItem(ModToolMaterial.RUBY, 0, 0f, new FabricItemSettings()));
    public static final Item DYNAMITE = registerItem("dynamite", new DynamiteItem(new FabricItemSettings()));
    public static final Item NO_BOOM_DYNAMITE = registerItem("no_boom_dynamite", new NoBoomDynamiteItem(new FabricItemSettings()));
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
    public static final Item STONY_SNOWBALL = registerItem("stony_snowball", new StonySnowballItem(new FabricItemSettings().maxCount(16)));
    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new FabricItemSettings()));
    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot", new Item(new FabricItemSettings()));
    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(new FabricItemSettings()));
    public static final Item AMETHYST_DUST = registerItem("amethyst_dust", new Item(new FabricItemSettings()));
    public static final Item NETHERITE_NUGGET = registerItem("netherite_nugget", new Item(new FabricItemSettings()));
    public static final Item NETHERITE_MELON_SLICE = registerItem("netherite_melon_slice", new Item(new FabricItemSettings()));
    public static final Item OBSIDIAN_HELMET = registerItem("obsidian_helmet", new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item OBSIDIAN_CHESTPLATE = registerItem("obsidian_chestplate", new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item OBSIDIAN_LEGGINGS = registerItem("obsidian_leggings", new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item OBSIDIAN_BOOTS = registerItem("obsidian_boots", new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item CRYSTALLIZED_HONEY = registerItem("crystallized_honey", new Item(new FabricItemSettings().food(ModFoodComponents.CRYSTALLIZED_HONEY)));
    public static final Item CITRINE = registerItem("citrine", new Item(new FabricItemSettings()));
    public static final Item RAW_CITRINE = registerItem("raw_citrine", new Item(new FabricItemSettings()));
    public static final Item OBSIDIAN_SWORD = registerItem("obsidian_sword", new SwordItem(ModToolMaterial.OBSIDIAN, 4, -3.4F, new FabricItemSettings()));
    public static final Item OBSIDIAN_SHOVEL = registerItem("obsidian_shovel", new ShovelItem(ModToolMaterial.OBSIDIAN, 2.5F, -4.0F, new FabricItemSettings()));
    public static final Item OBSIDIAN_PICKAXE = registerItem("obsidian_pickaxe", new PickaxeItem(ModToolMaterial.OBSIDIAN, 2, -3.8F, new FabricItemSettings()));
    public static final Item OBSIDIAN_AXE = registerItem("obsidian_axe", new AxeItem(ModToolMaterial.OBSIDIAN, 6.0F, -4.0F, new FabricItemSettings()));
    public static final Item OBSIDIAN_HOE = registerItem("obsidian_hoe", new HoeItem(ModToolMaterial.OBSIDIAN, -3, -0.0F, new FabricItemSettings()));
    public static final Item ENDERITE_INGOT = registerItem("enderite_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_ENDERITE = registerItem("raw_enderite", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_KUNZITE = registerItem("raw_kunzite", new Item(new FabricItemSettings()));
    public static final Item KUNZITE_INGOT = registerItem("kunzite_ingot", new Item(new FabricItemSettings()));
    public static final Item GHOUL_SPAWN_EGG = registerItem("ghoul_spawn_egg", new SpawnEggItem(ModEntities.GHOUL, 0x959595, 0x979797, new FabricItemSettings()));
    /* TODO */ public static final Item COPPER_SWORD = registerItem("copper_sword", new SwordItem(ModToolMaterial.COPPER, 4, -3.4F, new FabricItemSettings()));
    /* TODO */public static final Item COPPER_SHOVEL = registerItem("copper_shovel", new ShovelItem(ModToolMaterial.COPPER, 2.5F, -4.0F, new FabricItemSettings()));
    /* TODO */ public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe", new PickaxeItem(ModToolMaterial.COPPER, 2, -3.8F, new FabricItemSettings()));
    public static final Item COPPER_AXE = registerItem("copper_axe", new AxeItem(ModToolMaterial.COPPER, 6.0F,  1.0F, new FabricItemSettings()));
    public static final Item COPPER_HOE = registerItem("copper_hoe", new HoeItem(ModToolMaterial.COPPER, -7, 1.0F, new FabricItemSettings()));
    public static final Item LEVITATION_SWORD = registerItem("levitation_sword", new LevitationSword(ModToolMaterial.LEVITATION, 3, 1.0f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item HEALTH_SWORD = registerItem("health_sword", new HealthSword(ModToolMaterial.HEALTH, 3, 1.0f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item ARMARLA_HELMET = registerItem("armarla_helmet", new ArmorItem(ModArmorMaterials.ARMARLA, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ARMARLA_CHESTPLATE = registerItem("armarla_chestplate", new ArmorItem(ModArmorMaterials.ARMARLA, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item ARMARLA_LEGGINGS = registerItem("armarla_leggings", new ArmorItem(ModArmorMaterials.ARMARLA, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item ARMARLA_BOOTS = registerItem("armarla_boots", new ArmorItem(ModArmorMaterials.ARMARLA, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item BAGEL = registerItem("bagel", new Item(new FabricItemSettings().food(ModFoodComponents.BAGEL)));
    public static final Item GOLDEN_BAGEL = registerItem("golden_bagel", new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_BAGEL)));
    public static final Item BASKET = registerItem("basket", new Item(new FabricItemSettings().maxCount(16)));
    public static final Item EXOTIC_BUTTER = registerItem("exotic_butter", new Item(new FabricItemSettings().food(ModFoodComponents.EXOTIC_BUTTER)));
    public static final Item BASKET_OF_EXOTIC_BUTTERS = registerItem("basket_of_exotic_butters", new Item(new FabricItemSettings().food(ModFoodComponents.BASKET_OF_EXOTIC_BUTTERS).maxCount(1)));
    public static final Item SANDSTONE_HOE = registerItem("sandstone_hoe", new SandstoneHoe(ModToolMaterial.SANDSTONE, 0, -3.0f, new FabricItemSettings()));
    public static final Item BAT_WING = registerItem("bat_wing", new Item(new FabricItemSettings().food(ModFoodComponents.BAT_WING)));
    public static final Item WOLF_MEAT = registerItem("wolf_meat", new Item(new FabricItemSettings().food(ModFoodComponents.WOLF_MEAT)));
    public static final Item COOKED_WOLF_MEAT = registerItem("cooked_wolf_meat", new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_WOLF_MEAT)));
    public static final Item FLOUR = registerItem("flour", new Item(new FabricItemSettings().food(ModFoodComponents.FLOUR)));
    public static final Item DONUT = registerItem("donut", new Item(new FabricItemSettings().food(ModFoodComponents.DONUT)));
    public static final Item ROPE = registerItem("rope", new Item(new FabricItemSettings()));
    public static final Item STONE_CHUNK = registerItem("stone_chunk", new Item(new FabricItemSettings()));
    public static final Item STONE_CLUB = registerItem("stone_club", new SwordItem(ModToolMaterial.STONE_CLUB, 2, -2.4f, new FabricItemSettings()));
    public static final Item MAKESHIFT_STONE_AXE = registerItem("makeshift_stone_axe", new AxeItem(ModToolMaterial.MAKESHIFT_STONE, 2.7f, -2.2f, new FabricItemSettings()));

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
        TheOnlyModYouWillEverNeed.LOGGER.info("Registering Mod Items for " + TheOnlyModYouWillEverNeed.MOD_ID);
    }
}