package net.dyna.onlymod.entity.client;

import net.dyna.onlymod.TheOnlyModYouWillEverNeed;
import net.dyna.onlymod.entity.custom.GhoulEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class GhoulRenderer extends MobEntityRenderer<GhoulEntity, GhoulModel<GhoulEntity>> {
    private static final Identifier TEXTURE = new Identifier(TheOnlyModYouWillEverNeed.MOD_ID, "textures/entity/ghoul/ghoul.png");

    public GhoulRenderer(EntityRendererFactory.Context context) {
        super(context, new GhoulModel<>(context.getPart(ModModelLayers.GHOUL)), 0.8f);
    }

    @Override
    public Identifier getTexture(GhoulEntity entity) {
        return TEXTURE;
    }
}
