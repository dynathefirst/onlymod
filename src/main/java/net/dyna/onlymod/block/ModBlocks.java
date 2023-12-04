package net.dyna.onlymod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.dyna.onlymod.TheOnlyModYouWillEverNeed;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

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
    public static final Block BARELY_COMPRESSED_SAND = registerBlock("barely_compressed_sand", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block SLIGHTLY_COMPRESSED_SAND = registerBlock("slightly_compressed_sand", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block SOMEWHAT_COMPRESSED_SAND = registerBlock("somewhat_compressed_sand", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block BARELY_COMPRESSED_DIORITE = registerBlock("barely_compressed_diorite", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block SLIGHTLY_COMPRESSED_DIORITE = registerBlock("slightly_compressed_diorite", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block SOMEWHAT_COMPRESSED_DIORITE = registerBlock("somewhat_compressed_diorite", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block BARELY_COMPRESSED_COBBLESTONE = registerBlock("barely_compressed_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block SLIGHTLY_COMPRESSED_COBBLESTONE = registerBlock("slightly_compressed_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block SOMEWHAT_COMPRESSED_COBBLESTONE = registerBlock("somewhat_compressed_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));

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
    }
}