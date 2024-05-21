package net.barcadegunoi7.first_mod;

import net.barcadegunoi7.first_mod.block.ModBlocks;
import net.barcadegunoi7.first_mod.block.entity.ModBlockEntities;
import net.barcadegunoi7.first_mod.entity.ModEntities;
import net.barcadegunoi7.first_mod.entity.custom.PorcupineEntity;
import net.barcadegunoi7.first_mod.item.ModFuelComponents;
import net.barcadegunoi7.first_mod.item.ModItemGroup;
import net.barcadegunoi7.first_mod.item.ModItems;
import net.barcadegunoi7.first_mod.screen.ModScreenHandlers;
import net.barcadegunoi7.first_mod.sound.ModSounds;
import net.barcadegunoi7.first_mod.util.ModCustomTrades;
import net.barcadegunoi7.first_mod.util.ModLootTableModifier;
import net.barcadegunoi7.first_mod.villager.ModVillagers;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstMod implements ModInitializer {
	public static final String MOD_ID = "first_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModItemGroup.registerItemGroups();
		ModBlocks.registerModBlocks();

		ModFuelComponents.registerFuelComponents();

		ModSounds.registerSounds();

		ModCustomTrades.registerCustomTrades();
		ModVillagers.registerVillager();

		ModLootTableModifier.modifyLootTables();
		ModEntities.registerModEntities();

		ModBlockEntities.registerBlockEntites();
		ModScreenHandlers.registerScreenHandlers();

		FabricDefaultAttributeRegistry.register(ModEntities.PORCUPINE, PorcupineEntity.createPorcupineAttributes());
	}
}