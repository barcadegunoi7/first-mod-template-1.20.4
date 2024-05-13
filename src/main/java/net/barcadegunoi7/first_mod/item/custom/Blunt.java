package net.barcadegunoi7.first_mod.item.custom;

import net.barcadegunoi7.first_mod.sound.ModSounds;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class Blunt extends Item {
    private static final Random random = new Random();
    public Blunt(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (!user.getWorld().isClient) {
            BlockPos pos = user.getBlockPos();

                int chance = random.nextInt(100);
                if(chance < 70)
                {
                    user.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 60, 1));
                    user.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 140, 0));
                    world.playSound(null, pos, ModSounds.BLUNT_SMOKED, SoundCategory.PLAYERS, 1.0F, 1.0F);
                }
        }
        return super.finishUsing(stack, world, user);
    }
}