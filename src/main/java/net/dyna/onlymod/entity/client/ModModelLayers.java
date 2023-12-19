package net.dyna.onlymod.entity.client;

import net.dyna.onlymod.TheOnlyModYouWillEverNeed;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer GHOUL =
            new EntityModelLayer(new Identifier(TheOnlyModYouWillEverNeed.MOD_ID, "ghoul"), "main");
}
