package net.barcadegunoi7.first_mod.datagen;

import net.barcadegunoi7.first_mod.block.ModBlocks;
import net.barcadegunoi7.first_mod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.Ruby_Block);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.Raw_Ruby_Block);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.Ruby_Ore);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.Deepslate_Ruby_Ore);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.Nether_Ruby_Ore);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.End_stone_Ruby_Ore);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.Virus_Ore);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.Deepslate_Virus_Ore);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.Ruby, Models.GENERATED);
        itemModelGenerator.register(ModItems.Raw_Ruby, Models.GENERATED);

        itemModelGenerator.register(ModItems.Tomato, Models.GENERATED);
        itemModelGenerator.register(ModItems.Coal_Briquette, Models.GENERATED);
        itemModelGenerator.register(ModItems.Metal_Detector, Models.GENERATED);

        itemModelGenerator.register(ModItems.Virus_Ingot, Models.GENERATED);
        itemModelGenerator.register(ModItems.Raw_Virus, Models.GENERATED);

        itemModelGenerator.register(ModItems.Lean_Bucket, Models.GENERATED);
        itemModelGenerator.register(ModItems.Blunt, Models.GENERATED);
    }
}
