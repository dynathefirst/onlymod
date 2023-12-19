package net.dyna.onlymod;

import net.dyna.onlymod.block.ModBlocks;
import net.dyna.onlymod.enchantment.PetrificationEnchantment;
import net.dyna.onlymod.entity.custom.GhoulEntity;
import net.dyna.onlymod.item.ModItemGroups;
import net.dyna.onlymod.item.ModItems;
import net.dyna.onlymod.sound.ModSounds;
import net.dyna.onlymod.util.ModCustomTrades;
import net.dyna.onlymod.villager.ModVillagers;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.dyna.onlymod.entity.ModEntities.GHOUL;

public class TheOnlyModYouWillEverNeed implements ModInitializer {
	public static final String MOD_ID = "onlymod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final Enchantment PETRIFICATION = new PetrificationEnchantment();

	public static final RegistryKey<PlacedFeature> CITRINE_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("onlymod","ore_citrine"));
	public static final RegistryKey<PlacedFeature> KUNZITE_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("onlymod","ore_kunzite"));
	public static final RegistryKey<PlacedFeature> ENDERITE_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("onlymod","ore_end_enderite"));
	public static final RegistryKey<PlacedFeature> RUBY_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("onlymod","ore_nether_ruby"));

	public static final RegistryKey<DimensionOptions> MOON_KEY = RegistryKey.of(RegistryKeys.DIMENSION, new Identifier("onlymod", "moon"));
	public static final RegistryKey<World> MOON_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD, new Identifier("onlymod", "moon"));
	public static final RegistryKey<DimensionType> MOON_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE, new Identifier("onlymod", "moon_type"));

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModSounds.registerSounds();
		ModVillagers.registerVillagers();
		ModCustomTrades.registerCustomTrades();

		Registry.register(Registries.ENCHANTMENT, new Identifier("onlymod", "petrification"), PETRIFICATION);

		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, CITRINE_ORE_PLACED_KEY);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, KUNZITE_ORE_PLACED_KEY);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, ENDERITE_ORE_PLACED_KEY);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, RUBY_ORE_PLACED_KEY);

		StrippableBlockRegistry.register(ModBlocks.BAOBAB_LOG, ModBlocks.STRIPPED_BAOBAB_LOG);
		StrippableBlockRegistry.register(ModBlocks.BAOBAB_WOOD, ModBlocks.STRIPPED_BAOBAB_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAOBAB_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAOBAB_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_BAOBAB_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_BAOBAB_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAOBAB_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAOBAB_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLUE_DYED_OAK_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GRAY_DYED_OAK_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIME_DYED_OAK_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PURPLE_DYED_OAK_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINK_DYED_OAK_PLANKS, 5, 20);

		CustomPortalBuilder.beginPortal()
				.frameBlock(ModBlocks.CHEESE_BLOCK)
				.lightWithItem(Items.FLINT_AND_STEEL)
				.destDimID(new Identifier(TheOnlyModYouWillEverNeed.MOD_ID, "moon"))
				.tintColor(164, 164, 164)
				.registerPortal();

		FabricDefaultAttributeRegistry.register(GHOUL, GhoulEntity.createGhoulAttributes());
	}
}