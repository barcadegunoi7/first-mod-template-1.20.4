package net.barcadegunoi7.first_mod.sound;

import net.barcadegunoi7.first_mod.FirstMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent Metal_Detector_Found_Ore = registerSoundEvent("metal_detector_found_ore");

    public static final SoundEvent Sound_Block_Break = registerSoundEvent("sound_block_break");
    public static final SoundEvent Sound_Block_Place = registerSoundEvent("sound_block_place");
    public static final SoundEvent Sound_Block_Hit = registerSoundEvent("sound_block_hit");
    public static final SoundEvent Sound_Block_Fall = registerSoundEvent("sound_block_fall");
    public static final SoundEvent Sound_Block_Step = registerSoundEvent("sound_block_step");

    public static final BlockSoundGroup Sound_Block_Sounds = new BlockSoundGroup(1f, 4f,
            ModSounds.Sound_Block_Break, ModSounds.Sound_Block_Step, ModSounds.Sound_Block_Place,
            ModSounds.Sound_Block_Hit, ModSounds.Sound_Block_Fall);

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(FirstMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        FirstMod.LOGGER.info("Registering Sounds for" +FirstMod.MOD_ID);
    }
}
