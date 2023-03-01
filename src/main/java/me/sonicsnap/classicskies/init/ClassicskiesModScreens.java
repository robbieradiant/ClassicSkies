
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.sonicsnap.classicskies.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import me.sonicsnap.classicskies.client.gui.TradeRubyFlowerScreen;
import me.sonicsnap.classicskies.client.gui.SteveGUIScreen;
import me.sonicsnap.classicskies.client.gui.ChestGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClassicskiesModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ClassicskiesModMenus.CHEST_GUI, ChestGUIScreen::new);
			MenuScreens.register(ClassicskiesModMenus.STEVE_GUI, SteveGUIScreen::new);
			MenuScreens.register(ClassicskiesModMenus.TRADE_RUBY_FLOWER, TradeRubyFlowerScreen::new);
		});
	}
}
