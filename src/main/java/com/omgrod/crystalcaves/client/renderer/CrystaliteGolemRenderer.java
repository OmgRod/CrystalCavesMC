
package com.omgrod.crystalcaves.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.omgrod.crystalcaves.entity.CrystaliteGolemEntity;
import com.omgrod.crystalcaves.client.model.ModelCrystaliteGolem;

public class CrystaliteGolemRenderer extends MobRenderer<CrystaliteGolemEntity, ModelCrystaliteGolem<CrystaliteGolemEntity>> {
	public CrystaliteGolemRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCrystaliteGolem(context.bakeLayer(ModelCrystaliteGolem.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrystaliteGolemEntity entity) {
		return new ResourceLocation("crystalcaves:textures/entities/texture.png");
	}
}
