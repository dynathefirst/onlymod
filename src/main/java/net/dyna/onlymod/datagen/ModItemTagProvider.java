package net.dyna.onlymod.datagen;


import net.dyna.onlymod.block.ModBlocks;
import net.dyna.onlymod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.RUBY_AXE)
                .add(ModItems.HEAVY_IRON_AXE);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.HEAVY_IRON_HOE)
                .add(ModItems.RUBY_HOE);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.HEAVY_IRON_PICKAXE)
                .add(ModItems.RUBY_PICKAXE);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.HEAVY_IRON_SHOVEL)
                .add(ModItems.RUBY_SHOVEL);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.HEAVY_IRON_SWORD)
                .add(ModItems.RUBY_SWORD);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.HEAVY_IRON_HELMET)
                .add(ModItems.HEAVY_IRON_CHESTPLATE)
                .add(ModItems.HEAVY_IRON_LEGGINGS)
                .add(ModItems.HEAVY_IRON_BOOTS);

        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(ModItems.DOG);

        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ModItems.DOG);
    }
}
