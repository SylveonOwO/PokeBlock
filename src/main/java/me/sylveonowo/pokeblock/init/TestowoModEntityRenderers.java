
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.sylveonowo.pokeblock.init;

import me.sylveonowo.pokeblock.client.renderer.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TestowoModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TestowoModEntities.CHARMANDER.get(), CharmanderRenderer::new);
		event.registerEntityRenderer(TestowoModEntities.BULBASAUR.get(), BulbasaurRenderer::new);
		event.registerEntityRenderer(TestowoModEntities.ARCEUS.get(), ArceusRenderer::new);
		event.registerEntityRenderer(TestowoModEntities.EEVEE.get(), EeveeRenderer::new);
		event.registerEntityRenderer(TestowoModEntities.PIKACHU.get(), PikachuRenderer::new);
	}
}
