package net.dyna.onlymod.datagen;

import net.dyna.onlymod.block.ModBlocks;
import net.dyna.onlymod.block.custom.PepperCropBlock;
import net.dyna.onlymod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.BAOBAB_LOG);
        addDrop(ModBlocks.BAOBAB_PLANKS);
        addDrop(ModBlocks.BAOBAB_WOOD);
        addDrop(ModBlocks.BARELY_COMPRESSED_ANDESITE);
        addDrop(ModBlocks.BARELY_COMPRESSED_COBBLESTONE);
        addDrop(ModBlocks.BARELY_COMPRESSED_DIORITE);
        addDrop(ModBlocks.BARELY_COMPRESSED_DIRT);
        addDrop(ModBlocks.BARELY_COMPRESSED_SAND);
        addDrop(ModBlocks.BLUE_DYED_OAK_PLANKS);
        addDrop(ModBlocks.BLUE_SLIME_BLOCK);
        addDrop(ModBlocks.CHEESE_BLOCK);
        addDrop(ModBlocks.CITRINE_BLOCK);
        addDrop(ModBlocks.CUT_OBSIDIAN);
        addDrop(ModBlocks.DIRT_SLAB);
        addDrop(ModBlocks.EXTINGUISHED_TORCH);
        addDrop(ModBlocks.EXTINGUISHED_WALL_TORCH);
        addDrop(ModBlocks.GRAY_DYED_OAK_PLANKS);
        addDrop(ModBlocks.LIME_DYED_OAK_PLANKS);
        addDrop(ModBlocks.OBSIDIAN_GLASS);
        addDrop(ModBlocks.PINK_DYED_OAK_PLANKS);
        addDrop(ModBlocks.PURPLE_DYED_OAK_PLANKS);
        addDrop(ModBlocks.PURPLE_SLIME_BLOCK);
        addDrop(ModBlocks.RED_SLIME_BLOCK);
        addDrop(ModBlocks.RUBBLE);
        addDrop(ModBlocks.SLIGHTLY_COMPRESSED_ANDESITE);
        addDrop(ModBlocks.SLIGHTLY_COMPRESSED_COBBLESTONE);
        addDrop(ModBlocks.SLIGHTLY_COMPRESSED_DIORITE);
        addDrop(ModBlocks.SLIGHTLY_COMPRESSED_DIRT);
        addDrop(ModBlocks.SLIGHTLY_COMPRESSED_SAND);
        addDrop(ModBlocks.SOMEWHAT_COMPRESSED_ANDESITE);
        addDrop(ModBlocks.SOMEWHAT_COMPRESSED_COBBLESTONE);
        addDrop(ModBlocks.SOMEWHAT_COMPRESSED_DIORITE);
        addDrop(ModBlocks.SOMEWHAT_COMPRESSED_DIRT);
        addDrop(ModBlocks.SOMEWHAT_COMPRESSED_SAND);
        addDrop(ModBlocks.STRIPPED_BAOBAB_LOG);
        addDrop(ModBlocks.STRIPPED_BAOBAB_WOOD);
        addDrop(ModBlocks.YELLOW_SLIME_BLOCK);
        addDrop(ModBlocks.CITRINE_ORE, oreDrops(ModBlocks.CITRINE_ORE, ModItems.RAW_CITRINE));
        addDrop(ModBlocks.DEEPSLATE_CITRINE_ORE, oreDrops(ModBlocks.DEEPSLATE_CITRINE_ORE, ModItems.RAW_CITRINE));
        addDrop(ModBlocks.ICICLE, drops(ModItems.ICICLE_SHARD));
        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.PEPPER_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(PepperCropBlock.AGE, 4));
        addDrop(ModBlocks.PEPPER_CROP, cropDrops(ModBlocks.PEPPER_CROP, ModItems.PEPPER, ModItems.PEPPER, builder));
        addDrop(Blocks.REINFORCED_DEEPSLATE);
    }
}
