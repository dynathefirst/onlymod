package net.dyna.onlymod.client.renderer;

import net.dyna.onlymod.TheOnlyModYouWillEverNeed;
import net.dyna.onlymod.TheOnlyModYouWillEverNeedClient;
import net.dyna.onlymod.client.model.GhoulEntityModel;
import net.dyna.onlymod.entity.GhoulEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class GhoulEntityRenderer extends MobEntityRenderer<GhoulEntity, GhoulEntityModel> {

    public GhoulEntityRenderer(EntityRendererFactory.Context context, GhoulEntityModel entityModel, float f) {
        super(context, new GhoulEntityModel(context.getPart(TheOnlyModYouWillEverNeedClient.MODEL_GHOUL_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(GhoulEntity entity) {
        return new Identifier(TheOnlyModYouWillEverNeed.MOD_ID, "textures/entity/ghoul/ghoul.png");
    }
}
