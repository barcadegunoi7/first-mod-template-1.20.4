package net.barcadegunoi7.first_mod.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

public class VirusIngot extends Item {
    public VirusIngot(Settings settings) {
        super(settings);
    }
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        new StatusEffectInstance(StatusEffects.POISON, 3, 1);
    }

}
