package com.example.examplemod.registry;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.effects.MyEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PotionRegistry {
    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTIONS, ExampleMod.MOD_ID);

    public static final RegistryObject<Potion> MY_POTION = POTIONS.register("dragon_breath", () -> new Potion(new MobEffectInstance(EffectsRegistry.MY_EFFECTS.get(), 30*20)));
}
