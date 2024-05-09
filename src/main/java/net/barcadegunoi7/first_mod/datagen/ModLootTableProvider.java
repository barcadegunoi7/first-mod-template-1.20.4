package net.barcadegunoi7.first_mod.datagen;

import net.barcadegunoi7.first_mod.block.ModBlocks;
import net.barcadegunoi7.first_mod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.Ruby_Block);
        addDrop(ModBlocks.Raw_Ruby_Block);
        addDrop(ModBlocks.Sound_Block);

        addDrop(ModBlocks.Ruby_Ore, copperLikeOreDrops(ModBlocks.Ruby_Ore, ModItems.Raw_Ruby));
        addDrop(ModBlocks.Deepslate_Ruby_Ore, copperLikeOreDrops(ModBlocks.Deepslate_Ruby_Ore, ModItems.Raw_Ruby));
        addDrop(ModBlocks.Nether_Ruby_Ore, copperLikeOreDrops(ModBlocks.Nether_Ruby_Ore, ModItems.Raw_Ruby));
        addDrop(ModBlocks.End_stone_Ruby_Ore, copperLikeOreDrops(ModBlocks.End_stone_Ruby_Ore, ModItems.Raw_Ruby));

        addDrop(ModBlocks.Virus_Ore, oreDrops(ModBlocks.Virus_Ore, ModItems.Raw_Virus));
        addDrop(ModBlocks.Deepslate_Virus_Ore, oreDrops(ModBlocks.Deepslate_Virus_Ore, ModItems.Raw_Virus));


    }

    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop, ((LeafEntry.Builder) ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 5.0f)))).apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
