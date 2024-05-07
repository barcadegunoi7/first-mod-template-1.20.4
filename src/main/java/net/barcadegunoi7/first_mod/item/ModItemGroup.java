package net.barcadegunoi7.first_mod.item;

import net.barcadegunoi7.first_mod.FirstMod;
import net.barcadegunoi7.first_mod.block.ModBlocks;
import net.barcadegunoi7.first_mod.item.custom.MetalDetectorItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup Ruby_Group = Registry.register(Registries.ITEM_GROUP, new Identifier(FirstMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.Ruby)).entries((displayContext, entries) -> {
                        entries.add(ModItems.Ruby);
                        entries.add(ModItems.Raw_Ruby);
                        entries.add(ModBlocks.Ruby_Block);
                        entries.add(ModBlocks.Raw_Ruby_Block);
                        entries.add(ModBlocks.Ruby_Ore);
                        entries.add(ModBlocks.Deepslate_Ruby_Ore);
                        entries.add(ModBlocks.End_stone_Ruby_Ore);
                        entries.add(ModBlocks.Nether_Ruby_Ore);
                        entries.add(ModItems.Metal_Detector);
                        entries.add(ModBlocks.Sound_Block);
                    }).build());

    public static final ItemGroup Virus_Group = Registry.register(Registries.ITEM_GROUP, new Identifier(FirstMod.MOD_ID, "virus"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.virus"))
                    .icon(() -> new ItemStack(ModItems.Virus_Ingot)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.Virus_Ore);
                        entries.add(ModBlocks.Deepslate_Virus_Ore);
                        entries.add(ModItems.Virus_Ingot);
                        entries.add(ModItems.Raw_Virus);
                    }).build());

    public static void registerItemGroups() {
        FirstMod.LOGGER.info("Registering Item Groups" +FirstMod.MOD_ID);
    }
}
