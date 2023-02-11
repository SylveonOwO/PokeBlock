
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.sylveonowo.pokeblock.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import me.sylveonowo.pokeblock.client.model.Modelcharmander;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TestowoModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelcharmander.LAYER_LOCATION, Modelcharmander::createBodyLayer);
	}
}
