
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.sonicsnap.classicskies.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import me.sonicsnap.classicskies.world.biome.InfdevBiome;
import me.sonicsnap.classicskies.world.biome.IndevBiome;
import me.sonicsnap.classicskies.world.biome.CavePlainsBiome;
import me.sonicsnap.classicskies.world.biome.CaveGameBiome;
import me.sonicsnap.classicskies.ClassicskiesMod;

public class ClassicskiesModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, ClassicskiesMod.MODID);
	public static final RegistryObject<Biome> CAVE_GAME = REGISTRY.register("cave_game", () -> CaveGameBiome.createBiome());
	public static final RegistryObject<Biome> INDEV = REGISTRY.register("indev", () -> IndevBiome.createBiome());
	public static final RegistryObject<Biome> INFDEV = REGISTRY.register("infdev", () -> InfdevBiome.createBiome());
	public static final RegistryObject<Biome> CAVE_PLAINS = REGISTRY.register("cave_plains", () -> CavePlainsBiome.createBiome());
}
