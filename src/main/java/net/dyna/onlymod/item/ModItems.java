package net.dyna.onlymod.item;

import net.dyna.onlymod.TheOnlyModYouWillEverNeed;
import net.dyna.onlymod.block.ModBlocks;
import net.dyna.onlymod.item.custom.CaveDetectorItem;
import net.dyna.onlymod.item.custom.LuckyCloverItem;
import net.dyna.onlymod.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item TOPAZ = registerItem("topaz", new Item(new FabricItemSettings()));
    public static final Item COPPER_NUGGET = registerItem("copper_nugget", new Item(new FabricItemSettings()));
    public static final Item PINEAPPLE = registerItem("pineapple", new Item(new FabricItemSettings().food(ModFoodComponents.PINEAPPLE)));
    public static final Item STONE_CHUNK = registerItem("stone_chunk", new Item(new FabricItemSettings()));
    public static final Item CAVE_DETECTOR = registerItem("cave_detector", new CaveDetectorItem(new FabricItemSettings().maxCount(1).maxDamage(256)));
    public static final Item LUCKY_CLOVER = registerItem("lucky_clover", new LuckyCloverItem(new FabricItemSettings().maxCount(1)));
    public static final Item CREEPER_ESSENCE = registerItem("creeper_essence", new Item(new FabricItemSettings()));
    public static final Item DOG = registerItem("dog", new MusicDiscItem(7, ModSounds.DOG, new FabricItemSettings().maxCount(1), 140));
    public static final Item PEPPER = registerItem("pepper", new AliasedBlockItem(ModBlocks.PEPPER_CROP, new FabricItemSettings().food(ModFoodComponents.PEPPER).fireproof()));
    public static final Item CHEESE = registerItem("cheese", new Item(new FabricItemSettings().food(ModFoodComponents.CHEESE).maxCount(16)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TheOnlyModYouWillEverNeed.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TheOnlyModYouWillEverNeed.LOGGER.info("Registering ModItems for " + TheOnlyModYouWillEverNeed.MOD_ID);
    }
}