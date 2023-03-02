
package me.sonicsnap.classicskies.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CowModel;

import me.sonicsnap.classicskies.entity.PCGamerCowEntity;

public class PCGamerCowRenderer extends MobRenderer<PCGamerCowEntity, CowModel<PCGamerCowEntity>> {
	public PCGamerCowRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PCGamerCowEntity entity) {
		return new ResourceLocation("classicskies:textures/entities/pcgcow.png");
	}
}
