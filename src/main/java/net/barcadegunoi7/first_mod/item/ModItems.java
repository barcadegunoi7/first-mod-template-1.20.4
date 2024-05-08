package net.barcadegunoi7.first_mod.item;

import net.barcadegunoi7.first_mod.FirstMod;
import net.barcadegunoi7.first_mod.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item Ruby = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item Raw_Ruby = registerItem("raw_ruby", new Item(new FabricItemSettings()));

    public static final Item Virus_Ingot = registerItem("virus_ingot", new Item(new FabricItemSettings()));
    public static final Item Raw_Virus = registerItem("raw_virus", new RawVirus(new FabricItemSettings()));

    public static final Item Metal_Detector = registerItem("metal_detector", new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));

    public static final Item Tomato = registerItem("tomato", new Item(new FabricItemSettings().food(ModFoodComponents.Tomato)));

    public static final Item Coal_Briquette = registerItem("coal_briquette", new Item(new FabricItemSettings()));

    public static final Item Lean_Bucket = registerItem("lean_bucket", new LeanBucket(new FabricItemSettings().food(ModFoodComponents.Lean_bucket)));
    public static final Item Blunt = registerItem("blunt", new Blunt(new FabricItemSettings().food(ModFoodComponents.Blunt)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(Ruby);
        entries.add(Raw_Ruby);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FirstMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FirstMod.LOGGER.info("Registering Mod Items for " + FirstMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
