package net.dyna.onlymod.entity;

import net.dyna.onlymod.TheOnlyModYouWillEverNeed;
import net.dyna.onlymod.entity.custom.DynamiteEntity;
import net.dyna.onlymod.entity.custom.NoBoomDynamiteEntity;
import net.dyna.onlymod.entity.custom.StonySnowballEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    /*public static final EntityType<StoneChunkProjectileEntity> STONE_CHUNK_PROJECTILE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(TheOnlyModYouWillEverNeed.MOD_ID, "stone_chunk_projectile"), FabricEntityTypeBuilder.<StoneChunkProjectileEntity>create
            (SpawnGroup.MISC, StoneChunkProjectileEntity::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
     */

    //Throwables
    public static final EntityType<DynamiteEntity> DYNAMITE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(TheOnlyModYouWillEverNeed.MOD_ID, "dynamite"), FabricEntityTypeBuilder.<DynamiteEntity>create
                            (SpawnGroup.MISC, DynamiteEntity::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());

    public static final EntityType<NoBoomDynamiteEntity> NO_BOOM_DYNAMITE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(TheOnlyModYouWillEverNeed.MOD_ID, "no_boom_dynamite"), FabricEntityTypeBuilder.<NoBoomDynamiteEntity>create
                    (SpawnGroup.MISC, NoBoomDynamiteEntity::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());

    public static final EntityType<StonySnowballEntity> STONY_SNOWBALL = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(TheOnlyModYouWillEverNeed.MOD_ID, "stony_snowball"), FabricEntityTypeBuilder.<StonySnowballEntity>create
                    (SpawnGroup.MISC, StonySnowballEntity::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());

    //Hostile Mobs
    public static final EntityType<GhoulEntity> GHOUL = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(TheOnlyModYouWillEverNeed.MOD_ID, "ghoul"), FabricEntityTypeBuilder.create
                    (SpawnGroup.MONSTER, GhoulEntity::new).dimensions(EntityDimensions.fixed(16f, 32f)).build());
}