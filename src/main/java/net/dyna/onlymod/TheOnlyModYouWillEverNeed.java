package net.dyna.onlymod;

import net.dyna.onlymod.block.ModBlocks;
import net.dyna.onlymod.enchantment.PetrificationEnchantment;
import net.dyna.onlymod.item.ModItemGroups;
import net.dyna.onlymod.item.ModItems;
import net.dyna.onlymod.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

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
	}
}