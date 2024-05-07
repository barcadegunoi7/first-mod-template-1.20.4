package net.barcadegunoi7.first_mod.block;

import net.barcadegunoi7.first_mod.FirstMod;
import net.barcadegunoi7.first_mod.block.custom.SoundBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block Ruby_Block = registerBlock("ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.SLIME)));
    public static final Block Raw_Ruby_Block = registerBlock("raw_ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.SLIME)));

    public static final Block Sound_Block = registerBlock("sound_block",
            new SoundBlock(FabricBlockSettings.copyOf(Blocks.NOTE_BLOCK).sounds(BlockSoundGroup.SCULK_SENSOR)));

    public static final Block Virus_Ore = registerBlock("virus_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE).sounds(BlockSoundGroup.SCULK_SENSOR)));
    public static final Block Deepslate_Virus_Ore = registerBlock("deepslate_virus_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE).sounds(BlockSoundGroup.SCULK_SENSOR)));

    public static final Block Ruby_Ore = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), FabricBlockSettings.copyOf(Blocks.STONE).strength(2f)));
    public static final Block Deepslate_Ruby_Ore = registerBlock("deepslate_ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f)));
    public static final Block Nether_Ruby_Ore = registerBlock("nether_ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), FabricBlockSettings.copyOf(Blocks.NETHERRACK).strength(1.5f)));
    public static final Block End_stone_Ruby_Ore = registerBlock("end_stone_ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(5, 7), FabricBlockSettings.copyOf(Blocks.END_STONE).strength(3f)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(FirstMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(FirstMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }


    public static void registerModBlocks() {
        FirstMod.LOGGER.info("Registering ModBlocks for " +FirstMod.MOD_ID);
    }
}
