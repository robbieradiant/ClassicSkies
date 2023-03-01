
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.sonicsnap.classicskies.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import me.sonicsnap.classicskies.ClassicskiesMod;

public class ClassicskiesModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, ClassicskiesMod.MODID);
	public static final RegistryObject<ParticleType<?>> NO_PARTICLE = REGISTRY.register("no_particle", () -> new SimpleParticleType(false));
}
