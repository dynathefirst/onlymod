package net.dyna.onlymod;

import net.dyna.onlymod.block.ModBlocks;
import net.dyna.onlymod.enchantment.PetrificationEnchantment;
import net.dyna.onlymod.item.ModItemGroups;
import net.dyna.onlymod.item.ModItems;
import net.dyna.onlymod.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheOnlyModYouWillEverNeed implements ModInitializer {
	public static final String MOD_ID = "onlymod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final Enchantment PETRIFICATION = new PetrificationEnchantment();

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModSounds.registerSounds();

		Registry.register(Registries.ENCHANTMENT, new Identifier("onlymod", "petrification"), PETRIFICATION);

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
	}
}