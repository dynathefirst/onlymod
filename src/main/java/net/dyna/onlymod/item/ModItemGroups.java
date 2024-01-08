package net.dyna.onlymod.item;

import net.dyna.onlymod.TheOnlyModYouWillEverNeed;
import net.dyna.onlymod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ONLYMOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TheOnlyModYouWillEverNeed.MOD_ID, "onlymod"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.onlymod"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RUBY_SWORD);
                        entries.add(ModItems.RUBY_SHOVEL);
                        entries.add(ModItems.RUBY_PICKAXE);
                        entries.add(ModItems.RUBY_AXE);
                        entries.add(ModItems.RUBY_HOE);
                        entries.add(ModItems.HEAVY_IRON);
                        entries.add(ModBlocks.HEAVY_IRON_BLOCK);
                        entries.add(ModItems.HEAVY_IRON_SWORD);
                        entries.add(ModItems.HEAVY_IRON_SHOVEL);
                        entries.add(ModItems.HEAVY_IRON_PICKAXE);
                        entries.add(ModItems.HEAVY_IRON_AXE);
                        entries.add(ModItems.HEAVY_IRON_HOE);
                        entries.add(ModItems.HEAVY_IRON_HELMET);
                        entries.add(ModItems.HEAVY_IRON_CHESTPLATE);
                        entries.add(ModItems.HEAVY_IRON_LEGGINGS);
                        entries.add(ModItems.HEAVY_IRON_BOOTS);
                        entries.add(ModItems.TOPAZ);
                        entries.add(ModBlocks.ENDERITE_ORE);
                        entries.add(ModItems.RAW_ENDERITE);
                        entries.add(ModItems.ENDERITE_INGOT);
                        entries.add(ModItems.OBSIDIAN_SWORD);
                        entries.add(ModItems.OBSIDIAN_SHOVEL);
                        entries.add(ModItems.OBSIDIAN_PICKAXE);
                        entries.add(ModItems.OBSIDIAN_AXE);
                        entries.add(ModItems.OBSIDIAN_HOE);
                        entries.add(ModItems.OBSIDIAN_HELMET);
                        entries.add(ModItems.OBSIDIAN_CHESTPLATE);
                        entries.add(ModItems.OBSIDIAN_LEGGINGS);
                        entries.add(ModItems.OBSIDIAN_BOOTS);
                        entries.add(ModBlocks.CITRINE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_CITRINE_ORE);
                        entries.add(ModItems.RAW_CITRINE);
                        entries.add(ModItems.CITRINE);
                        entries.add(ModBlocks.CITRINE_BLOCK);
                        entries.add(ModItems.TIN_INGOT);
                        entries.add(ModItems.PLATINUM_INGOT);
                        entries.add(ModItems.BRONZE_INGOT);
                        entries.add(ModBlocks.KUNZITE_ORE);
                        entries.add(ModItems.RAW_KUNZITE);
                        entries.add(ModItems.KUNZITE_INGOT);
                        entries.add(ModItems.COPPER_SWORD);
                        entries.add(ModItems.COPPER_SHOVEL);
                        entries.add(ModItems.COPPER_PICKAXE);
                        entries.add(ModItems.COPPER_AXE);
                        entries.add(ModItems.COPPER_HOE);
                        /*
                        entries.add(ModItems.COPPER_HELMET);
                        entries.add(ModItems.COPPER_CHESTPLATE);
                        entries.add(ModItems.COPPER_LEGGINGS);
                        entries.add(ModItems.COPPER_BOOTS);
                        */
                        entries.add(ModBlocks.NETHER_COAL_ORE);
                        entries.add(ModItems.LEVITATION_SWORD);
                        entries.add(ModItems.HEALTH_SWORD);
                        entries.add(ModItems.STONE_CLUB);
                        entries.add(ModItems.MAKESHIFT_STONE_AXE);

                        entries.add(ModItems.ARMARLA_HELMET);
                        entries.add(ModItems.ARMARLA_CHESTPLATE);
                        entries.add(ModItems.ARMARLA_LEGGINGS);
                        entries.add(ModItems.ARMARLA_BOOTS);

                        entries.add(ModItems.SANDSTONE_HOE);

                        entries.add(ModItems.COPPER_NUGGET);

                        entries.add(ModBlocks.DIRT_SLAB);
                        entries.add(ModBlocks.DARK_PRISMARINE_WALL);

                        entries.add(ModItems.PINEAPPLE);
                        entries.add(ModItems.PEPPER);
                        entries.add(ModItems.CHEESE);
                        entries.add(ModBlocks.CHEESE_BLOCK);
                        entries.add(ModItems.CRYSTALLIZED_HONEY);
                        entries.add(ModItems.BAGEL);
                        entries.add(ModItems.GOLDEN_BAGEL);
                        entries.add(ModItems.EXOTIC_BUTTER);
                        entries.add(ModItems.BAT_WING);
                        entries.add(ModItems.WOLF_MEAT);
                        entries.add(ModItems.COOKED_WOLF_MEAT);
                        entries.add(ModItems.FLOUR);
                        entries.add(ModItems.DONUT);

                        entries.add(ModItems.PEBBLE);
                        entries.add(ModItems.STONE_CHUNK);
                        entries.add(ModItems.STONY_SNOWBALL);
                        entries.add(ModItems.CAVE_DETECTOR);
                        entries.add(ModItems.LUCKY_CLOVER);

                        entries.add(ModItems.DYNAMITE);
                        entries.add(ModItems.NO_BOOM_DYNAMITE);

                        entries.add(ModItems.CREEPER_ESSENCE);
                        entries.add(ModItems.AMETHYST_DUST);
                        entries.add(ModItems.NETHERITE_NUGGET);
                        entries.add(ModItems.NETHERITE_MELON_SLICE);

                        entries.add(ModItems.BASKET);
                        entries.add(ModItems.BASKET_OF_EXOTIC_BUTTERS);
                        entries.add(ModItems.ROPE);

                        entries.add(ModBlocks.EXTINGUISHED_TORCH);
                        entries.add(ModBlocks.EXTINGUISHED_WALL_TORCH);

                        entries.add(ModBlocks.PINK_DYED_OAK_PLANKS);
                        entries.add(ModBlocks.PURPLE_DYED_OAK_PLANKS);
                        entries.add(ModBlocks.LIME_DYED_OAK_PLANKS);
                        entries.add(ModBlocks.BLUE_DYED_OAK_PLANKS);
                        entries.add(ModBlocks.GRAY_DYED_OAK_PLANKS);

                        entries.add(ModBlocks.BARELY_COMPRESSED_DIRT);
                        entries.add(ModBlocks.SLIGHTLY_COMPRESSED_DIRT);
                        entries.add(ModBlocks.SOMEWHAT_COMPRESSED_DIRT);
                        entries.add(ModBlocks.BARELY_COMPRESSED_SAND);
                        entries.add(ModBlocks.SLIGHTLY_COMPRESSED_SAND);
                        entries.add(ModBlocks.SOMEWHAT_COMPRESSED_SAND);
                        entries.add(ModBlocks.BARELY_COMPRESSED_DIORITE);
                        entries.add(ModBlocks.SLIGHTLY_COMPRESSED_DIORITE);
                        entries.add(ModBlocks.SOMEWHAT_COMPRESSED_DIORITE);
                        entries.add(ModBlocks.BARELY_COMPRESSED_COBBLESTONE);
                        entries.add(ModBlocks.SLIGHTLY_COMPRESSED_COBBLESTONE);
                        entries.add(ModBlocks.SOMEWHAT_COMPRESSED_COBBLESTONE);
                        entries.add(ModBlocks.BARELY_COMPRESSED_ANDESITE);
                        entries.add(ModBlocks.SLIGHTLY_COMPRESSED_ANDESITE);
                        entries.add(ModBlocks.SOMEWHAT_COMPRESSED_ANDESITE);

                        entries.add(ModBlocks.CUT_OBSIDIAN);

                        entries.add(ModBlocks.BLUE_SLIME_BLOCK);
                        entries.add(ModBlocks.RED_SLIME_BLOCK);
                        entries.add(ModBlocks.PURPLE_SLIME_BLOCK);
                        entries.add(ModBlocks.YELLOW_SLIME_BLOCK);

                        entries.add(ModBlocks.OBSIDIAN_GLASS);
                        entries.add(ModBlocks.RUBBLE);
                        entries.add(ModBlocks.MARBLE_BLOCK);
                        entries.add(ModBlocks.POLISHED_MARBLE);
                        entries.add(ModBlocks.CEMENT);

                        entries.add(ModBlocks.STONE_SPONGE);

                        entries.add(ModBlocks.FREEZER);

                        entries.add(ModBlocks.MOON_ROCK);

                        entries.add(ModBlocks.COMPANION_CUBE);

                        entries.add(ModBlocks.BAOBAB_LOG);
                        entries.add(ModBlocks.BAOBAB_WOOD);
                        entries.add(ModBlocks.STRIPPED_BAOBAB_LOG);
                        entries.add(ModBlocks.STRIPPED_BAOBAB_WOOD);
                        entries.add(ModBlocks.BAOBAB_PLANKS);
                        entries.add(ModBlocks.BAOBAB_LEAVES);

                        entries.add(ModBlocks.ICICLE);
                        entries.add(ModItems.ICICLE_SHARD);

                        entries.add(ModItems.DOG);

                        entries.add(ModItems.GHOUL_SPAWN_EGG);
                    }).build());

    public static void registerItemGroups() {
        TheOnlyModYouWillEverNeed.LOGGER.info("Registering Item Groups for " + TheOnlyModYouWillEverNeed.MOD_ID);
    }
}
