package net.dyna.onlymod.util;

import net.dyna.onlymod.item.ModItems;
import net.dyna.onlymod.villager.ModVillagers;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModCustomTrades {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 2),
                    new ItemStack(ModItems.PEPPER, 8),
                    4, 5, 0.05f));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 2),
                    new ItemStack(ModItems.PINEAPPLE, 2),
                    2, 6, 0.05f));
        });


        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 8),
                    new ItemStack(ModItems.RUBY_HOE, 1),
                    2, 15, 0.2f));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 34),
                    new ItemStack(ModItems.RUBY_AXE, 1),
                    2, 15, 0.2f));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 20),
                    new ItemStack(ModItems.RUBY_SHOVEL, 1),
                    2, 15, 0.2f));

            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 36),
                    new ItemStack(ModItems.RUBY_PICKAXE, 1),
                    2, 30, 0.2f));
        });


        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 34),
                    new ItemStack(ModItems.RUBY_AXE, 1),
                    2, 15, 0.2f));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 26),
                    new ItemStack(ModItems.RUBY_SWORD, 1),
                    2, 30, 0.2f));
        });


        TradeOfferHelper.registerVillagerOffers(ModVillagers.DEMOLITIONER, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.DYNAMITE, 24),
                    new ItemStack(Items.EMERALD, 1),
                    16, 2, 0.05f));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 7),
                    new ItemStack(Items.TNT, 1),
                    12, 1, 0.05f));
        });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.DEMOLITIONER, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.DYNAMITE, 11),
                    new ItemStack(Items.EMERALD, 2),
                    16, 10, 0.05f));
        });
    }
}
