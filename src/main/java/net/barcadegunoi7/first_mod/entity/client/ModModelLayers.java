package net.barcadegunoi7.first_mod.entity.client;

import net.barcadegunoi7.first_mod.FirstMod;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer PORCUPINE =
            new EntityModelLayer(new Identifier(FirstMod.MOD_ID, "porcupine"), "main");
}