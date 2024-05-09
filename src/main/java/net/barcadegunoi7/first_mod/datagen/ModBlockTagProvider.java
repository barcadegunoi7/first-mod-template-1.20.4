package net.barcadegunoi7.first_mod.datagen;

import net.barcadegunoi7.first_mod.block.ModBlocks;
import net.barcadegunoi7.first_mod.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.Metal_Detector_Detectable_Blocks)
                .add(ModBlocks.Ruby_Ore)
                .forceAddTag(BlockTags.COAL_ORES)
                .forceAddTag(BlockTags.COPPER_ORES)
                .forceAddTag(BlockTags.IRON_ORES)
                .forceAddTag(BlockTags.GOLD_ORES)
                .forceAddTag(BlockTags.LAPIS_ORES)
                .forceAddTag(BlockTags.REDSTONE_ORES)
                .forceAddTag(BlockTags.DIAMOND_ORES)
                .forceAddTag(BlockTags.EMERALD_ORES);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.Raw_Ruby_Block)
                .add(ModBlocks.Ruby_Ore)
                .add(ModBlocks.Ruby_Block)
                .add(ModBlocks.Nether_Ruby_Ore)
                .add(ModBlocks.Deepslate_Ruby_Ore)
                .add(ModBlocks.End_stone_Ruby_Ore)
                .add(ModBlocks.Sound_Block)
                .add(ModBlocks.Virus_Ore)
                .add(ModBlocks.Deepslate_Virus_Ore);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.Ruby_Ore)
                .add(ModBlocks.Deepslate_Ruby_Ore)
                .add(ModBlocks.Ruby_Block)
                .add(ModBlocks.Raw_Ruby_Block)
                .add(ModBlocks.Sound_Block)
                .add(ModBlocks.Virus_Ore)
                .add(ModBlocks.Deepslate_Virus_Ore);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.Nether_Ruby_Ore);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
                .add(ModBlocks.End_stone_Ruby_Ore);
    }
}
