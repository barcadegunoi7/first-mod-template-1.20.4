package net.barcadegunoi7.first_mod.util;

import net.barcadegunoi7.first_mod.item.ModItems;
import net.barcadegunoi7.first_mod.villager.ModVillagers;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModCustomTrades {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(ModItems.TOMATO, 7),
                            6, 5, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(ModItems.TOMATO_SEEDS, 2),
                            2, 10, 0.075f));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 2),
                            new ItemStack(ModItems.TOMATO, 2),
                            new ItemStack(ModItems.CORN, 7),
                            6, 5, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 5),
                            new ItemStack(ModItems.TOMATO_SEEDS, 5),
                            new ItemStack(ModItems.CORN_SEEDS, 2),
                            2, 10, 0.075f));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.RUBY, 32),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.MENDING, 1)),
                            2, 30, 0.05f));
        });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.RUBY, 16),
                            new ItemStack(Items.MUSIC_DISC_OTHERSIDE, 2),
                            2, 10, 0.075f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.RUBY, 16),
                            new ItemStack(Items.MUSIC_DISC_13, 13),
                            2, 10, 0.075f));
        });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.RUBY, 16),
                            new ItemStack(Items.MUSIC_DISC_PIGSTEP, 2),
                            5, 2, 0.05f));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.RAW_RUBY, 16),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.PROTECTION, 10)),
                            2, 30, 0.05f));
        });

        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.RAW_RUBY, 32),
                            new ItemStack(ModItems.METAL_DETECTOR, 1),
                            2, 15, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.RAW_RUBY, 16),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.PROTECTION, 10)),
                            2, 30, 0.05f));
        });
    }
}
