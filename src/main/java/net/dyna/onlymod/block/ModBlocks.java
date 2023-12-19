package net.dyna.onlymod.block;

import net.dyna.onlymod.block.custom.IcicleBlock;
import net.dyna.onlymod.block.custom.PepperCropBlock;
import net.dyna.onlymod.block.torch.ExtinguishedTorchBlock;
import net.dyna.onlymod.block.torch.ExtinguishedWallTorchBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.dyna.onlymod.TheOnlyModYouWillEverNeed;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block DIRT_SLAB = registerBlock("dirt_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block PINK_DYED_OAK_PLANKS = registerBlock("pink_dyed_oak_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PURPLE_DYED_OAK_PLANKS = registerBlock("purple_dyed_oak_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LIME_DYED_OAK_PLANKS = registerBlock("lime_dyed_oak_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLUE_DYED_OAK_PLANKS = registerBlock("blue_dyed_oak_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GRAY_DYED_OAK_PLANKS = registerBlock("gray_dyed_oak_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BARELY_COMPRESSED_DIRT = registerBlock("barely_compressed_dirt", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block SLIGHTLY_COMPRESSED_DIRT = registerBlock("slightly_compressed_dirt", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block SOMEWHAT_COMPRESSED_DIRT = registerBlock("somewhat_compressed_dirt", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block BARELY_COMPRESSED_SAND = registerBlock("barely_compressed_sand", new Block(FabricBlockSettings.copyOf(Blocks.SAND)));
    public static final Block SLIGHTLY_COMPRESSED_SAND = registerBlock("slightly_compressed_sand", new Block(FabricBlockSettings.copyOf(Blocks.SAND)));
    public static final Block SOMEWHAT_COMPRESSED_SAND = registerBlock("somewhat_compressed_sand", new Block(FabricBlockSettings.copyOf(Blocks.SAND)));
    public static final Block BARELY_COMPRESSED_DIORITE = registerBlock("barely_compressed_diorite", new Block(FabricBlockSettings.copyOf(Blocks.DIORITE)));
    public static final Block SLIGHTLY_COMPRESSED_DIORITE = registerBlock("slightly_compressed_diorite", new Block(FabricBlockSettings.copyOf(Blocks.DIORITE)));
    public static final Block SOMEWHAT_COMPRESSED_DIORITE = registerBlock("somewhat_compressed_diorite", new Block(FabricBlockSettings.copyOf(Blocks.DIORITE)));
    public static final Block BARELY_COMPRESSED_COBBLESTONE = registerBlock("barely_compressed_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block SLIGHTLY_COMPRESSED_COBBLESTONE = registerBlock("slightly_compressed_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block SOMEWHAT_COMPRESSED_COBBLESTONE = registerBlock("somewhat_compressed_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BARELY_COMPRESSED_ANDESITE = registerBlock("barely_compressed_andesite", new Block(FabricBlockSettings.copyOf(Blocks.ANDESITE)));
    public static final Block SLIGHTLY_COMPRESSED_ANDESITE = registerBlock("slightly_compressed_andesite", new Block(FabricBlockSettings.copyOf(Blocks.ANDESITE)));
    public static final Block SOMEWHAT_COMPRESSED_ANDESITE = registerBlock("somewhat_compressed_andesite", new Block(FabricBlockSettings.copyOf(Blocks.ANDESITE)));
    public static final Block PEPPER_CROP = Registry.register(Registries.BLOCK, new Identifier(TheOnlyModYouWillEverNeed.MOD_ID, "pepper_crop"), new PepperCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT).nonOpaque()));
    public static final Block CHEESE_BLOCK = registerBlock("cheese_block", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.SLIME).mapColor(MapColor.YELLOW).breakInstantly()));
    public static final Block CUT_OBSIDIAN = registerBlock("cut_obsidian", new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).requiresTool()));
    public static final Block BLUE_SLIME_BLOCK = registerBlock("blue_slime_block", new SlimeBlock(AbstractBlock.Settings.create().mapColor(MapColor.BLUE).slipperiness(1.0F).sounds(BlockSoundGroup.SLIME).nonOpaque()));
    public static final Block RED_SLIME_BLOCK = registerBlock("red_slime_block", new SlimeBlock(AbstractBlock.Settings.create().mapColor(MapColor.RED).slipperiness(1.2F).sounds(BlockSoundGroup.SLIME).nonOpaque()));
    public static final Block PURPLE_SLIME_BLOCK = registerBlock("purple_slime_block", new SlimeBlock(AbstractBlock.Settings.create().mapColor(MapColor.PALE_PURPLE).slipperiness(1.4F).sounds(BlockSoundGroup.SLIME).nonOpaque()));
    public static final Block YELLOW_SLIME_BLOCK = registerBlock("yellow_slime_block", new SlimeBlock(AbstractBlock.Settings.create().mapColor(MapColor.PALE_YELLOW).slipperiness(1.6F).sounds(BlockSoundGroup.SLIME).nonOpaque()));
    public static final Block BAOBAB_LOG = registerBlock("baobab_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block BAOBAB_WOOD = registerBlock("baobab_wood", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_BAOBAB_LOG = registerBlock("stripped_baobab_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_BAOBAB_WOOD = registerBlock("stripped_baobab_wood", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block BAOBAB_PLANKS = registerBlock("baobab_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BAOBAB_LEAVES = registerBlock("baobab_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block RUBBLE = registerBlock("rubble", new Block(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block ICICLE = registerBlock("icicle", new IcicleBlock(FabricBlockSettings.copyOf(Blocks.ICE).nonOpaque()));
    public static final Block DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.DARK_PRISMARINE)));
    public static final Block OBSIDIAN_GLASS = registerBlock("obsidian_glass", new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).nonOpaque().sounds(BlockSoundGroup.GLASS).requiresTool()));
    public static final Block EXTINGUISHED_TORCH = registerBlock("extinguished_torch", new ExtinguishedTorchBlock(FabricBlockSettings.create().noCollision().breakInstantly().sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).nonOpaque()));
    public static final Block EXTINGUISHED_WALL_TORCH = registerBlock("extinguished_wall_torch", new ExtinguishedWallTorchBlock(FabricBlockSettings.create().noCollision().breakInstantly().sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).nonOpaque()));
    public static final Block CITRINE_BLOCK = registerBlock("citrine_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()));
    public static final Block CITRINE_ORE = registerBlock("citrine_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool(), UniformIntProvider.create(3, 8)));
    public static final Block DEEPSLATE_CITRINE_ORE = registerBlock("deepslate_citrine_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).requiresTool(), UniformIntProvider.create(3, 8)));
    public static final Block ENDERITE_ORE = registerBlock("enderite_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).requiresTool(), UniformIntProvider.create(5, 10)));
    public static final Block RUBY_ORE = registerBlock("ruby_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).requiresTool(), UniformIntProvider.create(4, 9)));
    public static final Block HEAVY_IRON_BLOCK = registerBlock("heavy_iron_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()));
    public static final Block KUNZITE_ORE = registerBlock("kunzite_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool(), UniformIntProvider.create(2, 5)));
    public static final Block MARBLE_BLOCK = registerBlock("marble_block", new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.WHITE).requiresTool()));
    public static final Block POLISHED_MARBLE = registerBlock("polished_marble", new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.WHITE).requiresTool()));
    public static final Block MOON_ROCK = registerBlock("moon_rock", new Block(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool()));

    private static void addBlocksToBuildingBlocksTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(DIRT_SLAB);
        entries.add(PINK_DYED_OAK_PLANKS);
        entries.add(GRAY_DYED_OAK_PLANKS);
        entries.add(BLUE_DYED_OAK_PLANKS);
        entries.add(LIME_DYED_OAK_PLANKS);
        entries.add(PURPLE_DYED_OAK_PLANKS);
        entries.add(BARELY_COMPRESSED_DIRT);
        entries.add(SLIGHTLY_COMPRESSED_DIRT);
        entries.add(SOMEWHAT_COMPRESSED_DIRT);
        entries.add(BARELY_COMPRESSED_SAND);
        entries.add(SLIGHTLY_COMPRESSED_SAND);
        entries.add(SOMEWHAT_COMPRESSED_SAND);
        entries.add(BARELY_COMPRESSED_DIORITE);
        entries.add(SLIGHTLY_COMPRESSED_DIORITE);
        entries.add(SOMEWHAT_COMPRESSED_DIORITE);
        entries.add(BARELY_COMPRESSED_COBBLESTONE);
        entries.add(SLIGHTLY_COMPRESSED_COBBLESTONE);
        entries.add(SOMEWHAT_COMPRESSED_COBBLESTONE);
        entries.add(BARELY_COMPRESSED_ANDESITE);
        entries.add(SLIGHTLY_COMPRESSED_ANDESITE);
        entries.add(SOMEWHAT_COMPRESSED_ANDESITE);
        entries.add(CHEESE_BLOCK);
        entries.add(CUT_OBSIDIAN);
    }

    private static void addBlocksToColoredBlocksTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(BLUE_SLIME_BLOCK);
        entries.add(RED_SLIME_BLOCK);
        entries.add(PURPLE_SLIME_BLOCK);
        entries.add(YELLOW_SLIME_BLOCK);
        entries.add(LIME_DYED_OAK_PLANKS);
        entries.add(PURPLE_DYED_OAK_PLANKS);
        entries.add(PINK_DYED_OAK_PLANKS);
        entries.add(BLUE_DYED_OAK_PLANKS);
        entries.add(GRAY_DYED_OAK_PLANKS);
        entries.add(LIME_DYED_OAK_PLANKS);
    }

    private static void addBlocksToNaturalTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(CITRINE_ORE);
        entries.add(KUNZITE_ORE);
        entries.add(RUBY_ORE);
        entries.add(ENDERITE_ORE);
        entries.add(MARBLE_BLOCK);
        entries.add(MOON_ROCK);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TheOnlyModYouWillEverNeed.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TheOnlyModYouWillEverNeed.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        TheOnlyModYouWillEverNeed.LOGGER.info("Registering Mod Blocks for " + TheOnlyModYouWillEverNeed.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModBlocks::addBlocksToBuildingBlocksTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(ModBlocks::addBlocksToColoredBlocksTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModBlocks::addBlocksToNaturalTabItemGroup);
    }
}