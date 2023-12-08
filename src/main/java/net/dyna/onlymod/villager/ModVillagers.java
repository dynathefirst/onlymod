package net.dyna.onlymod.villager;

import com.google.common.collect.ImmutableSet;
import net.dyna.onlymod.TheOnlyModYouWillEverNeed;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {
    public static final RegistryKey<PointOfInterestType> BOOM_POI_KEY = poiKey("boompoi");
    public static final PointOfInterestType BOOM_POI = registerPoi("boompoi", Blocks.TNT);

    public static final VillagerProfession DEMOLITIONER = registerProffesion("demolitioner", BOOM_POI_KEY);



    private static VillagerProfession registerProffesion(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(TheOnlyModYouWillEverNeed.MOD_ID, name),
                new VillagerProfession(name, entry -> entry.matchesKey(type), entry -> entry.matchesKey(type),
                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_CLERIC));
    }

    private static PointOfInterestType registerPoi(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(TheOnlyModYouWillEverNeed.MOD_ID, name), 1, 1, block);
    }

    private static RegistryKey<PointOfInterestType> poiKey(String name) {
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, new Identifier(TheOnlyModYouWillEverNeed.MOD_ID, name));
    }

    public static void registerVillagers() {
        TheOnlyModYouWillEverNeed.LOGGER.info("Registering Villagers For " + TheOnlyModYouWillEverNeed.MOD_ID);
    }
}
