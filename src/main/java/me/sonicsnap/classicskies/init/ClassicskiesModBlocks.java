
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.sonicsnap.classicskies.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import me.sonicsnap.classicskies.block.WoodBlock;
import me.sonicsnap.classicskies.block.StoneBlock;
import me.sonicsnap.classicskies.block.SteveCoSupplyCrateBlock;
import me.sonicsnap.classicskies.block.SkySaplingBlock;
import me.sonicsnap.classicskies.block.SkyPlanksBlock;
import me.sonicsnap.classicskies.block.SkyLeavesBlock;
import me.sonicsnap.classicskies.block.SkyGravelBlock;
import me.sonicsnap.classicskies.block.SkyDimensionPortalBlock;
import me.sonicsnap.classicskies.block.SkyChestBlock;
import me.sonicsnap.classicskies.block.SkyBricksBlock;
import me.sonicsnap.classicskies.block.RubyOreBlock;
import me.sonicsnap.classicskies.block.RoseBlock;
import me.sonicsnap.classicskies.block.PlanksBlock;
import me.sonicsnap.classicskies.block.PaeoniaBlock;
import me.sonicsnap.classicskies.block.OldstoneBlock;
import me.sonicsnap.classicskies.block.MossySkystoneBlock;
import me.sonicsnap.classicskies.block.DirtSlabBlock;
import me.sonicsnap.classicskies.block.DirtBlock;
import me.sonicsnap.classicskies.block.ClassicStoneBlock;
import me.sonicsnap.classicskies.block.ClassicGrassBlock;
import me.sonicsnap.classicskies.block.CaveGrassBlock;
import me.sonicsnap.classicskies.ClassicskiesMod;

public class ClassicskiesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ClassicskiesMod.MODID);
	public static final RegistryObject<Block> SKY_DIMENSION_PORTAL = REGISTRY.register("sky_dimension_portal", () -> new SkyDimensionPortalBlock());
	public static final RegistryObject<Block> CLASSIC_GRASS = REGISTRY.register("classic_grass", () -> new ClassicGrassBlock());
	public static final RegistryObject<Block> CLASSIC_STONE = REGISTRY.register("classic_stone", () -> new ClassicStoneBlock());
	public static final RegistryObject<Block> OLDSTONE = REGISTRY.register("oldstone", () -> new OldstoneBlock());
	public static final RegistryObject<Block> PAEONIA = REGISTRY.register("paeonia", () -> new PaeoniaBlock());
	public static final RegistryObject<Block> CAVE_GRASS = REGISTRY.register("cave_grass", () -> new CaveGrassBlock());
	public static final RegistryObject<Block> RUBY_ORE = REGISTRY.register("ruby_ore", () -> new RubyOreBlock());
	public static final RegistryObject<Block> SKY_PLANKS = REGISTRY.register("sky_planks", () -> new SkyPlanksBlock());
	public static final RegistryObject<Block> WOOD = REGISTRY.register("wood", () -> new WoodBlock());
	public static final RegistryObject<Block> SKY_LEAVES = REGISTRY.register("sky_leaves", () -> new SkyLeavesBlock());
	public static final RegistryObject<Block> DIRT = REGISTRY.register("dirt", () -> new DirtBlock());
	public static final RegistryObject<Block> SKY_SAPLING = REGISTRY.register("sky_sapling", () -> new SkySaplingBlock());
	public static final RegistryObject<Block> ROSE = REGISTRY.register("rose", () -> new RoseBlock());
	public static final RegistryObject<Block> SKY_CHEST = REGISTRY.register("sky_chest", () -> new SkyChestBlock());
	public static final RegistryObject<Block> STEVE_CO_SUPPLY_CRATE = REGISTRY.register("steve_co_supply_crate", () -> new SteveCoSupplyCrateBlock());
	public static final RegistryObject<Block> STONE = REGISTRY.register("stone", () -> new StoneBlock());
	public static final RegistryObject<Block> DIRT_SLAB = REGISTRY.register("dirt_slab", () -> new DirtSlabBlock());
	public static final RegistryObject<Block> SKY_BRICKS = REGISTRY.register("sky_bricks", () -> new SkyBricksBlock());
	public static final RegistryObject<Block> SKY_GRAVEL = REGISTRY.register("sky_gravel", () -> new SkyGravelBlock());
	public static final RegistryObject<Block> PLANKS = REGISTRY.register("planks", () -> new PlanksBlock());
	public static final RegistryObject<Block> MOSSY_SKYSTONE = REGISTRY.register("mossy_skystone", () -> new MossySkystoneBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			SkyDimensionPortalBlock.registerRenderLayer();
			PaeoniaBlock.registerRenderLayer();
			SkySaplingBlock.registerRenderLayer();
			RoseBlock.registerRenderLayer();
		}
	}
}
