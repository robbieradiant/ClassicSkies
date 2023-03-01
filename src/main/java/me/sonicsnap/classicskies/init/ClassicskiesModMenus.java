
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.sonicsnap.classicskies.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import me.sonicsnap.classicskies.world.inventory.TradeRubyFlowerMenu;
import me.sonicsnap.classicskies.world.inventory.SteveGUIMenu;
import me.sonicsnap.classicskies.world.inventory.ChestGUIMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClassicskiesModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<ChestGUIMenu> CHEST_GUI = register("chest_gui", (id, inv, extraData) -> new ChestGUIMenu(id, inv, extraData));
	public static final MenuType<SteveGUIMenu> STEVE_GUI = register("steve_gui", (id, inv, extraData) -> new SteveGUIMenu(id, inv, extraData));
	public static final MenuType<TradeRubyFlowerMenu> TRADE_RUBY_FLOWER = register("trade_ruby_flower",
			(id, inv, extraData) -> new TradeRubyFlowerMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
