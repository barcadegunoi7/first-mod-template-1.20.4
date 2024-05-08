package net.barcadegunoi7.first_mod.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class VirusIngot extends Item {
    public VirusIngot(Settings settings) {
        super(settings);
    }
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        new StatusEffectInstance(StatusEffects.POISON, 3, 1);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.first_mod.virus_ingot"));
        super.appendTooltip(stack, world, tooltip, context);
    }
}