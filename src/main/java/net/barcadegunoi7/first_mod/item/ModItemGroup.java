package net.barcadegunoi7.first_mod.item;

import net.barcadegunoi7.first_mod.FirstMod;
import net.barcadegunoi7.first_mod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup Ruby_Group = Registry.register(Registries.ITEM_GROUP, new Identifier(FirstMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);

                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);

                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.END_STONE_RUBY_ORE);
                        entries.add(ModBlocks.NETHER_RUBY_ORE);

                        entries.add(ModItems.METAL_DETECTOR);
                        entries.add(ModItems.RUBY_STAFF);
                        entries.add(ModBlocks.SOUND_BLOCK);
                        entries.add(ModItems.TOMATO_SEEDS);

                        entries.add(ModItems.RUBY_PICKAXE);
                        entries.add(ModItems.RUBY_AXE);
                        entries.add(ModItems.RUBY_SHOVEL);
                        entries.add(ModItems.RUBY_SWORD);
                        entries.add(ModItems.RUBY_HOE);

                        entries.add(ModItems.RUBY_HELMET);
                        entries.add(ModItems.RUBY_CHESTPLATE);
                        entries.add(ModItems.RUBY_LEGGINGS);
                        entries.add(ModItems.RUBY_BOOTS);

                        entries.add(ModItems.COAL_BRIQUETTE);

                        entries.add(ModBlocks.RUBY_STAIRS);
                        entries.add(ModBlocks.RUBY_SLAB);
                        entries.add(ModBlocks.RUBY_BUTTON);
                        entries.add(ModBlocks.RUBY_PRESSURE_PLATE);
                        entries.add(ModBlocks.RUBY_FENCE);
                        entries.add(ModBlocks.RUBY_FENCE_GATE);
                        entries.add(ModBlocks.RUBY_WALL);
                        entries.add(ModBlocks.RUBY_DOOR);
                        entries.add(ModBlocks.RUBY_TRAPDOOR);
                    }).build());

    public static final ItemGroup Virus_Group = Registry.register(Registries.ITEM_GROUP, new Identifier(FirstMod.MOD_ID, "virus"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.virus"))
                    .icon(() -> new ItemStack(ModItems.VIRUS_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.VIRUS_ORE);
                        entries.add(ModBlocks.DEEPSLATE_VIRUS_ORE);
                        entries.add(ModItems.VIRUS_INGOT);
                        entries.add(ModItems.RAW_VIRUS);
                    }).build());

    public static final ItemGroup Food_Group = Registry.register(Registries.ITEM_GROUP, new Identifier(FirstMod.MOD_ID, "tomato"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.food"))
                    .icon(() -> new ItemStack(ModItems.TOMATO)).entries((displayContext, entries) -> {
                        entries.add(ModItems.TOMATO);
                        entries.add(ModItems.LEAN_BUCKET);
                        entries.add(ModItems.BLUNT);
                    }).build());

    public static void registerItemGroups() {
        FirstMod.LOGGER.info("Registering Item Groups" +FirstMod.MOD_ID);
    }
}
