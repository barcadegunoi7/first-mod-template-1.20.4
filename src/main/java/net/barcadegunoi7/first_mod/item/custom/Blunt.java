package net.barcadegunoi7.first_mod.item.custom;

import net.barcadegunoi7.first_mod.sound.ModSounds;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Blunt extends Item {
    public Blunt(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (this.isFood()) {
            BlockPos pos = user.getBlockPos();
            world.playSound(user, pos, ModSounds.Blunt_Smoked, SoundCategory.PLAYERS, 1.0F, 1.0F);
        }
        return stack;
    }
}

