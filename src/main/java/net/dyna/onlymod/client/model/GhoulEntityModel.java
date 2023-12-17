package net.dyna.onlymod.client.model;

import com.google.common.collect.ImmutableList;
import net.dyna.onlymod.entity.GhoulEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class GhoulEntityModel extends EntityModel<GhoulEntity> {

    private final ModelPart base;

    public GhoulEntityModel() {
        base = null;
    }

    public TexturedModelData getTexturedModelData() {
        return TexturedModelData.of(modelData, 64, 64);
    }

    @Override
    public void setAngles(GhoulEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.base).forEach((modelRenderer) -> {
            modelRenderer.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        });
    }
}
