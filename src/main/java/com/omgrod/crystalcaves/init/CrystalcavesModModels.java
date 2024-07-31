
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.omgrod.crystalcaves.init;

import com.omgrod.crystalcaves.client.model.ModelCrystaliteGolem;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CrystalcavesModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelCrystaliteGolem.LAYER_LOCATION, ModelCrystaliteGolem::createBodyLayer);
	}
}
