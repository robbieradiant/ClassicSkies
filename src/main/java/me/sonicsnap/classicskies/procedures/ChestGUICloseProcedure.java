package me.sonicsnap.classicskies.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import java.util.Random;

public class ChestGUICloseProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("classicskies:chest_close")),
						SoundSource.NEUTRAL, 1, (float) Mth.nextDouble(new Random(), 0.7, 1));
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("classicskies:chest_close")),
						SoundSource.NEUTRAL, 1, (float) Mth.nextDouble(new Random(), 0.7, 1), false);
			}
		}
	}
}
