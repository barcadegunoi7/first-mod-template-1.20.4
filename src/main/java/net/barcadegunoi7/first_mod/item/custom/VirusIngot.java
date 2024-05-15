package net.barcadegunoi7.first_mod.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class VirusIngot extends Item {
    public VirusIngot(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.first_mod.virus_ingot"));
        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!entity.getWorld().isClient && entity instanceof PlayerEntity player) {
            boolean hasproPlayerEffect = player.hasStatusEffect(StatusEffects.POISON);
            boolean hasconPlayerEffect = player.hasStatusEffect(StatusEffects.RESISTANCE);
            if (!hasproPlayerEffect && !hasconPlayerEffect) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 40, 0, false, false, false));
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}
