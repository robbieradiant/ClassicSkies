
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.sonicsnap.classicskies.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import me.sonicsnap.classicskies.item.StuddedItem;
import me.sonicsnap.classicskies.item.SteelIngotItem;
import me.sonicsnap.classicskies.item.SkyDimensionItem;
import me.sonicsnap.classicskies.item.SkyAppleItem;
import me.sonicsnap.classicskies.item.RubyItem;
import me.sonicsnap.classicskies.item.PlateSwordItem;
import me.sonicsnap.classicskies.item.PlateArmorItem;
import me.sonicsnap.classicskies.ClassicskiesMod;

public class ClassicskiesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ClassicskiesMod.MODID);
	public static final RegistryObject<Item> SKY_DIMENSION = REGISTRY.register("sky_dimension", () -> new SkyDimensionItem());
	public static final RegistryObject<Item> CLASSIC_GRASS = block(ClassicskiesModBlocks.CLASSIC_GRASS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CLASSIC_STONE = block(ClassicskiesModBlocks.CLASSIC_STONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> OLDSTONE = block(ClassicskiesModBlocks.OLDSTONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PIGMAN = REGISTRY.register("pigman_spawn_egg",
			() -> new ForgeSpawnEggItem(ClassicskiesModEntities.PIGMAN, -1337449, -2596257, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PLATE_ARMOR_HELMET = REGISTRY.register("plate_armor_helmet", () -> new PlateArmorItem.Helmet());
	public static final RegistryObject<Item> PLATE_ARMOR_CHESTPLATE = REGISTRY.register("plate_armor_chestplate",
			() -> new PlateArmorItem.Chestplate());
	public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
	public static final RegistryObject<Item> PAEONIA = block(ClassicskiesModBlocks.PAEONIA, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> STUDDED_HELMET = REGISTRY.register("studded_helmet", () -> new StuddedItem.Helmet());
	public static final RegistryObject<Item> STUDDED_CHESTPLATE = REGISTRY.register("studded_chestplate", () -> new StuddedItem.Chestplate());
	public static final RegistryObject<Item> STUDDED_LEGGINGS = REGISTRY.register("studded_leggings", () -> new StuddedItem.Leggings());
	public static final RegistryObject<Item> STUDDED_BOOTS = REGISTRY.register("studded_boots", () -> new StuddedItem.Boots());
	public static final RegistryObject<Item> CAVE_GRASS = block(ClassicskiesModBlocks.CAVE_GRASS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> RUBY_ORE = block(ClassicskiesModBlocks.RUBY_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SKY_PLANKS = block(ClassicskiesModBlocks.SKY_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> WOOD = block(ClassicskiesModBlocks.WOOD, null);
	public static final RegistryObject<Item> SKY_LEAVES = block(ClassicskiesModBlocks.SKY_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> DIRT = block(ClassicskiesModBlocks.DIRT, null);
	public static final RegistryObject<Item> SKY_SAPLING = block(ClassicskiesModBlocks.SKY_SAPLING, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> ROSE = block(ClassicskiesModBlocks.ROSE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SKY_CHEST = block(ClassicskiesModBlocks.SKY_CHEST, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> STEVE_CO_SUPPLY_CRATE = block(ClassicskiesModBlocks.STEVE_CO_SUPPLY_CRATE,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SKY_APPLE = REGISTRY.register("sky_apple", () -> new SkyAppleItem());
	public static final RegistryObject<Item> PLATE_SWORD = REGISTRY.register("plate_sword", () -> new PlateSwordItem());
	public static final RegistryObject<Item> STONE = block(ClassicskiesModBlocks.STONE, null);
	public static final RegistryObject<Item> HUMAN = REGISTRY.register("human_spawn_egg",
			() -> new ForgeSpawnEggItem(ClassicskiesModEntities.HUMAN, -16734040, -5014686, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> DIRT_SLAB = block(ClassicskiesModBlocks.DIRT_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PC_GAMER_COW = REGISTRY.register("pc_gamer_cow_spawn_egg",
			() -> new ForgeSpawnEggItem(ClassicskiesModEntities.PC_GAMER_COW, -12636124, -16777216,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SKY_BRICKS = block(ClassicskiesModBlocks.SKY_BRICKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SKY_GRAVEL = block(ClassicskiesModBlocks.SKY_GRAVEL, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PLANKS = block(ClassicskiesModBlocks.PLANKS, null);
	public static final RegistryObject<Item> MOSSY_SKYSTONE = block(ClassicskiesModBlocks.MOSSY_SKYSTONE, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
