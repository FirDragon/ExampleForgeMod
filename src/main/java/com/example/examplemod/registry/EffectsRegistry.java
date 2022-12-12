package com.example.examplemod.registry;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.effects.MyEffect;
import com.mojang.blaze3d.shaders.Effect;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EffectsRegistry {
    public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ExampleMod.MOD_ID);

    public static final RegistryObject<MobEffect> MY_EFFECTS = EFFECTS.register("my_effect", ()-> new MyEffect(MobEffectCategory.HARMFUL, 0x660033).addAttributeModifier(Attributes.ARMOR, "52de9724-ff1f-cf0c-96f9-6c94d9815a7d", -0.20F, AttributeModifier.Operation.MULTIPLY_TOTAL));
}
