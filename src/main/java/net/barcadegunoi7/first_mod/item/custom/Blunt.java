package net.barcadegunoi7.first_mod.item.custom;

import net.barcadegunoi7.first_mod.sound.ModSounds;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class Blunt extends Item {
    public Blunt(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (this.isFood()) {
            user.playSound(ModSounds.Metal_Detector_Found_Ore, 1f, 1f);
        }
        return stack;
    }
}

