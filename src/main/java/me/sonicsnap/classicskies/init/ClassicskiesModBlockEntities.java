
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.sonicsnap.classicskies.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import me.sonicsnap.classicskies.block.entity.SteveCoSupplyCrateBlockEntity;
import me.sonicsnap.classicskies.block.entity.SkyChestBlockEntity;
import me.sonicsnap.classicskies.ClassicskiesMod;

public class ClassicskiesModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			ClassicskiesMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> SKY_CHEST = register("sky_chest", ClassicskiesModBlocks.SKY_CHEST,
			SkyChestBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STEVE_CO_SUPPLY_CRATE = register("steve_co_supply_crate",
			ClassicskiesModBlocks.STEVE_CO_SUPPLY_CRATE, SteveCoSupplyCrateBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
