package net.dyna.onlymod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class GhoulEntity extends PathAwareEntity {

    protected GhoulEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }
}
