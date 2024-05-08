package net.barcadegunoi7.first_mod.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent Tomato = new FoodComponent.Builder().hunger(4).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 100, 5), 0.25f).build();

    public static final FoodComponent Lean_bucket = new FoodComponent.Builder().hunger(-8).saturationModifier(0.50f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200, 1), 0.50f).alwaysEdible().build();

    public static final FoodComponent Blunt = new FoodComponent.Builder().hunger(1).saturationModifier(0.50f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 100, 2), 0.70f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100, 1), 0.70f).alwaysEdible().build();
}
