package net.barcadegunoi7.first_mod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent TOMATO = new FoodComponent.Builder().hunger(4).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 100, 5), 0.25f).build();

    public static final FoodComponent CORN = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).build();

    public static final FoodComponent LEAN_BUCKET = new FoodComponent.Builder().hunger(1).saturationModifier(0.50f).alwaysEdible().build();

    public static final FoodComponent BLUNT = new FoodComponent.Builder().hunger(1).saturationModifier(0.50f).alwaysEdible().build();

}
