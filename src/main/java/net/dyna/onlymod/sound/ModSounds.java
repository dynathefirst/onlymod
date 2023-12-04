package net.dyna.onlymod.sound;

import net.dyna.onlymod.TheOnlyModYouWillEverNeed;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent DOG = registerSoundEvent("dog");

    public static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(TheOnlyModYouWillEverNeed.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        TheOnlyModYouWillEverNeed.LOGGER.info("Registering Sounds For " + TheOnlyModYouWillEverNeed.MOD_ID);
    }
}
