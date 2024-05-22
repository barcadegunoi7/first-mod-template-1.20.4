package net.barcadegunoi7.first_mod.compat;

import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.client.registry.screen.ScreenRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.barcadegunoi7.first_mod.block.ModBlocks;
import net.barcadegunoi7.first_mod.recipe.GemPolishingRecipe;
import net.barcadegunoi7.first_mod.screen.GemPolishingScreen;

public class FirstModREIClientPlugin implements REIClientPlugin {

    @Override
    public void registerCategories(CategoryRegistry registry) {
        registry.add(new GemPolishingCategory());

        registry.addWorkstations(GemPolishingCategory.GEM_POLISHING, EntryStacks.of(ModBlocks.GEM_POLISHING_STATION));
    }

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        registry.registerRecipeFiller(GemPolishingRecipe.class, GemPolishingRecipe.Type.INSTANCE, GemPolishingDisplay::new);
    }

    @Override
    public void registerScreens(ScreenRegistry registry) {
        registry.registerClickArea(screen -> new Rectangle(75, 30, 20, 30), GemPolishingScreen.class,
                GemPolishingCategory.GEM_POLISHING);
    }
}
