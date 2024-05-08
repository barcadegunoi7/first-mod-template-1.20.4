package net.barcadegunoi7.first_mod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent Tomato = new FoodComponent.Builder().hunger(4).saturationModifier(0.25f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 100, 5), 0.25f).build();
}
