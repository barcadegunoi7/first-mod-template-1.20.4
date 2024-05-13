package net.barcadegunoi7.first_mod.item;

import net.barcadegunoi7.first_mod.FirstMod;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModFuelComponents {

    public static void registerFuelComponents() {
        FirstMod.LOGGER.info("Registering Fuel Items Components" +FirstMod.MOD_ID);

        FuelRegistry.INSTANCE.add(ModItems.COAL_BRIQUETTE, 200);

    }
}
