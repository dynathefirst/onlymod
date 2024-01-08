package net.dyna.onlymod.block.entity;

import net.dyna.onlymod.TheOnlyModYouWillEverNeed;
import net.dyna.onlymod.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<FreezerBlockEntity> FREEZER_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(TheOnlyModYouWillEverNeed.MOD_ID, "freezer_be"),
                    FabricBlockEntityTypeBuilder.create(FreezerBlockEntity::new,
                            ModBlocks.FREEZER).build());

    public static void registerBlockEntities() {
        TheOnlyModYouWillEverNeed.LOGGER.info("Registering Block Entities for " + TheOnlyModYouWillEverNeed.MOD_ID);
    }
}
