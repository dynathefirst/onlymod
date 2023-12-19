package net.dyna.onlymod.datagen;

import net.dyna.onlymod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.DARK_PRISMARINE_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.CITRINE_ORE)
                .add(ModBlocks.CITRINE_BLOCK)
                .add(ModBlocks.DEEPSLATE_CITRINE_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.CUT_OBSIDIAN)
                .add(ModBlocks.OBSIDIAN_GLASS)
                .add(Blocks.REINFORCED_DEEPSLATE);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.BAOBAB_LOG)
                .add(ModBlocks.BAOBAB_WOOD)
                .add(ModBlocks.STRIPPED_BAOBAB_LOG)
                .add(ModBlocks.STRIPPED_BAOBAB_WOOD);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.BLUE_DYED_OAK_PLANKS)
                .add(ModBlocks.GRAY_DYED_OAK_PLANKS)
                .add(ModBlocks.LIME_DYED_OAK_PLANKS)
                .add(ModBlocks.PURPLE_DYED_OAK_PLANKS)
                .add(ModBlocks.PINK_DYED_OAK_PLANKS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CUT_OBSIDIAN)
                .add(ModBlocks.BARELY_COMPRESSED_DIORITE)
                .add(ModBlocks.SLIGHTLY_COMPRESSED_DIORITE)
                .add(ModBlocks.SOMEWHAT_COMPRESSED_DIORITE)
                .add(ModBlocks.BARELY_COMPRESSED_COBBLESTONE)
                .add(ModBlocks.SLIGHTLY_COMPRESSED_COBBLESTONE)
                .add(ModBlocks.SOMEWHAT_COMPRESSED_COBBLESTONE)
                .add(ModBlocks.OBSIDIAN_GLASS)
                .add(ModBlocks.CITRINE_ORE)
                .add(ModBlocks.DEEPSLATE_CITRINE_ORE)
                .add(ModBlocks.CITRINE_BLOCK)
                .add(Blocks.REINFORCED_DEEPSLATE);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.DIRT_SLAB)
                .add(ModBlocks.BARELY_COMPRESSED_DIRT)
                .add(ModBlocks.SLIGHTLY_COMPRESSED_DIRT)
                .add(ModBlocks.SOMEWHAT_COMPRESSED_DIRT)
                .add(ModBlocks.BARELY_COMPRESSED_SAND)
                .add(ModBlocks.SLIGHTLY_COMPRESSED_SAND)
                .add(ModBlocks.SOMEWHAT_COMPRESSED_SAND);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("onlymod", "compressed")))
                .add(ModBlocks.BARELY_COMPRESSED_DIRT)
                .add(ModBlocks.SOMEWHAT_COMPRESSED_DIRT)
                .add(ModBlocks.SLIGHTLY_COMPRESSED_DIRT)
                .add(ModBlocks.BARELY_COMPRESSED_SAND)
                .add(ModBlocks.SOMEWHAT_COMPRESSED_SAND)
                .add(ModBlocks.SLIGHTLY_COMPRESSED_SAND)
                .add(ModBlocks.BARELY_COMPRESSED_DIORITE)
                .add(ModBlocks.SOMEWHAT_COMPRESSED_DIORITE)
                .add(ModBlocks.SLIGHTLY_COMPRESSED_DIORITE)
                .add(ModBlocks.BARELY_COMPRESSED_COBBLESTONE)
                .add(ModBlocks.SOMEWHAT_COMPRESSED_COBBLESTONE)
                .add(ModBlocks.SLIGHTLY_COMPRESSED_COBBLESTONE)
                .add(ModBlocks.BARELY_COMPRESSED_ANDESITE)
                .add(ModBlocks.SOMEWHAT_COMPRESSED_ANDESITE)
                .add(ModBlocks.SLIGHTLY_COMPRESSED_ANDESITE);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("onlymod", "dyed_planks")))
                .add(ModBlocks.PINK_DYED_OAK_PLANKS)
                .add(ModBlocks.PURPLE_DYED_OAK_PLANKS)
                .add(ModBlocks.LIME_DYED_OAK_PLANKS)
                .add(ModBlocks.BLUE_DYED_OAK_PLANKS)
                .add(ModBlocks.GRAY_DYED_OAK_PLANKS);
    }
}
