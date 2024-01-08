package net.dyna.onlymod.screen;

import net.dyna.onlymod.TheOnlyModYouWillEverNeed;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<FreezerScreenHandler> FREEZER_SCREEN_HANDLER =
        Registry.register(Registries.SCREEN_HANDLER, new Identifier(TheOnlyModYouWillEverNeed.MOD_ID, "gem_polishing"),
                new ExtendedScreenHandlerType<>(FreezerScreenHandler::new));

    public static void registerScreenHandlers() {
        TheOnlyModYouWillEverNeed.LOGGER.info("Registering Screen Handlers for " + TheOnlyModYouWillEverNeed.MOD_ID);
    }
}
