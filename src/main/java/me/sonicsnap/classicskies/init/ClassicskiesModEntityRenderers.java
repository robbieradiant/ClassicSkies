
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.sonicsnap.classicskies.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import me.sonicsnap.classicskies.client.renderer.PigmanRenderer;
import me.sonicsnap.classicskies.client.renderer.PCGamerCowRenderer;
import me.sonicsnap.classicskies.client.renderer.HumanRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClassicskiesModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ClassicskiesModEntities.PIGMAN.get(), PigmanRenderer::new);
		event.registerEntityRenderer(ClassicskiesModEntities.HUMAN.get(), HumanRenderer::new);
		event.registerEntityRenderer(ClassicskiesModEntities.PC_GAMER_COW.get(), PCGamerCowRenderer::new);
	}
}
