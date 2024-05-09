package net.barcadegunoi7.first_mod.datagen;

import net.barcadegunoi7.first_mod.block.ModBlocks;
import net.barcadegunoi7.first_mod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> Ruby_Smeltables = List.of(ModItems.Raw_Ruby,
            ModBlocks.Ruby_Ore, ModBlocks.Deepslate_Ruby_Ore, ModBlocks.Nether_Ruby_Ore, ModBlocks.End_stone_Ruby_Ore);

    private static final List<ItemConvertible> Planks = List.of(Items.OAK_PLANKS, Items.SPRUCE_PLANKS, Items.ACACIA_PLANKS,
            Items.SPRUCE_PLANKS, Items.DARK_OAK_PLANKS, Items.JUNGLE_PLANKS, Items.CHERRY_PLANKS, Items.BAMBOO_PLANKS,
            Items.CRIMSON_PLANKS, Items.WARPED_PLANKS);
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, Ruby_Smeltables, RecipeCategory.MISC, ModItems.Ruby,
                0.7f, 200, "ruby");
        offerBlasting(exporter, Ruby_Smeltables, RecipeCategory.MISC, ModItems.Ruby,
                0.7f, 100, "ruby");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.Ruby, RecipeCategory.DECORATIONS, ModBlocks.Ruby_Block);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.Sound_Block, 1)
                .pattern("SSS")
                .pattern("SRS")
                .pattern("SSS")
                .input('S', Planks)
                .input('R', ModItems.Ruby)
                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                .criterion(hasItem(ModItems.Ruby), conditionsFromItem(ModItems.Ruby))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.Raw_Ruby)));
    }
}
