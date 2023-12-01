package net.dyna.onlymod.item;

import net.dyna.onlymod.TheOnlyModYouWillEverNeed;
import net.dyna.onlymod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ONLYMOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TheOnlyModYouWillEverNeed.MOD_ID, "onlymod"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.onlymod"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {

                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.TOPAZ);
                        entries.add(ModItems.COPPER_NUGGET);
                        entries.add(ModBlocks.DIRT_SLAB);
                        entries.add(ModItems.PINEAPPLE);
                        entries.add(ModItems.STONE_CHUNK);
                        entries.add(ModItems.CAVE_DETECTOR);
                        entries.add(ModItems.LUCKY_CLOVER);

                        entries.add(ModBlocks.PINK_DYED_OAK_PLANKS);
                        entries.add(ModBlocks.PURPLE_DYED_OAK_PLANKS);
                        entries.add(ModBlocks.LIME_DYED_OAK_PLANKS);
                        entries.add(ModBlocks.BLUE_DYED_OAK_PLANKS);
                        entries.add(ModBlocks.GRAY_DYED_OAK_PLANKS);
                    }).build());


    public static void registerItemGroups() {
        TheOnlyModYouWillEverNeed.LOGGER.info("Registering Item Groups for " +TheOnlyModYouWillEverNeed.MOD_ID);
    }
}
