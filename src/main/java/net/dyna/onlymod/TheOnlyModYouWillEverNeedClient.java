package net.dyna.onlymod;

import net.dyna.onlymod.block.ModBlocks;
import net.dyna.onlymod.entity.ModEntities;
import net.dyna.onlymod.entity.client.GhoulModel;
import net.dyna.onlymod.entity.client.GhoulRenderer;
import net.dyna.onlymod.entity.client.ModModelLayers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class TheOnlyModYouWillEverNeedClient implements ClientModInitializer {

    public static final EntityModelLayer MODEL_GHOUL_LAYER = new EntityModelLayer(new Identifier(TheOnlyModYouWillEverNeed.MOD_ID, "ghoul"), "main");

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BAOBAB_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PEPPER_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OBSIDIAN_GLASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EXTINGUISHED_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EXTINGUISHED_WALL_TORCH, RenderLayer.getCutout());

        //EntityRendererRegistry.register(ModEntities.STONE_CHUNK_PROJECTILE, FlyingItemEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.DYNAMITE, FlyingItemEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.NO_BOOM_DYNAMITE, FlyingItemEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.STONY_SNOWBALL, FlyingItemEntityRenderer::new);

        EntityRendererRegistry.register(ModEntities.GHOUL, GhoulRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.GHOUL, GhoulModel::getTexturedModelData);
    }
}
