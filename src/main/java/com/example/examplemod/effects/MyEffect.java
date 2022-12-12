package com.example.examplemod.effects;

import com.example.examplemod.ExampleMod;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ArmorItem;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class MyEffect extends MobEffect {
    public MyEffect(MobEffectCategory mobEffectCategory, int color) {
        super(mobEffectCategory, color);
    }
    @Override
    public boolean isBeneficial() {
        return false;
    }

    @Override
    public boolean isInstantenous() {
        return false;
    }

    @Override
    public boolean isDurationEffectTick(int remainingTicks, int level) {
        return true;
    }

    @Override
    public @NotNull Component getDisplayName() {
        return new TranslatableComponent(ExampleMod.MOD_ID + ".effect.dragon_breath");
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int level) {

    }
}
