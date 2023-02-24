
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.sylveonowo.pokeblock.init;

import me.sylveonowo.pokeblock.client.model.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import me.sylveonowo.pokeblock.client.model.Modelarceus;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TestowoModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelcharmander.LAYER_LOCATION, Modelcharmander::createBodyLayer);
		event.registerLayerDefinition(Modelbulbasour.LAYER_LOCATION, Modelbulbasour::createBodyLayer);
		event.registerLayerDefinition(Modelarceus.LAYER_LOCATION, Modelarceus::createBodyLayer);
		event.registerLayerDefinition(Modelpikachu.LAYER_LOCATION, Modelpikachu::createBodyLayer);
		event.registerLayerDefinition(Modeleevee.LAYER_LOCATION, Modeleevee::createBodyLayer);

	}
}
