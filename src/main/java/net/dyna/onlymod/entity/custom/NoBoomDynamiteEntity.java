package net.dyna.onlymod.entity.custom;

import net.dyna.onlymod.entity.ModEntities;
import net.dyna.onlymod.item.ModItems;
import net.minecraft.entity.EntityStatuses;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ItemStackParticleEffect;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;

public class NoBoomDynamiteEntity extends ThrownItemEntity {

    public NoBoomDynamiteEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super((EntityType<? extends ThrownItemEntity>)entityType, world);
    }

    public NoBoomDynamiteEntity(World world, LivingEntity owner) {
        super((EntityType<? extends ThrownItemEntity>)ModEntities.NO_BOOM_DYNAMITE, owner, world);
    }

    public NoBoomDynamiteEntity(World world, double x, double y, double z) {
        super((EntityType<? extends ThrownItemEntity>) ModEntities.NO_BOOM_DYNAMITE, x, y, z, world);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.NO_BOOM_DYNAMITE;
    }

    private ParticleEffect getParticleParameters() {
        ItemStack itemStack = this.getItem();
        return itemStack.isEmpty() ? ParticleTypes.CLOUD : new ItemStackParticleEffect(ParticleTypes.ITEM, itemStack);
    }

    @Override
    public void handleStatus(byte status) {
        if (status == EntityStatuses.PLAY_DEATH_SOUND_OR_ADD_PROJECTILE_HIT_PARTICLES) {
            ParticleEffect particleEffect = this.getParticleParameters();
            for (int i = 0; i < 8; ++i) {
                this.getWorld().addParticle(particleEffect, this.getX(), this.getY(), this.getZ(), 0.0, 0.0, 0.0);
            }
        }
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        this.discard();
        float f = 4.0f;
        this.getWorld().createExplosion(this, this.getX(), this.getBodyY(0.0625), this.getZ(), 0.0f, World.ExplosionSourceType.TNT);
    }

    @Override
    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        this.discard();
        float f = 4.0f;
        this.getWorld().createExplosion(this, this.getX(), this.getBodyY(0.0625), this.getZ(), 0.0f, World.ExplosionSourceType.TNT);
    }
}
