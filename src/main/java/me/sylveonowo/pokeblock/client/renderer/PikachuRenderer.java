
package me.sylveonowo.pokeblock.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import me.sylveonowo.pokeblock.entity.PikachuEntity;
import me.sylveonowo.pokeblock.client.model.Modelpikachu;

public class PikachuRenderer extends MobRenderer<PikachuEntity, Modelpikachu<PikachuEntity>> {
	public PikachuRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpikachu(context.bakeLayer(Modelpikachu.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PikachuEntity entity) {
		return new ResourceLocation("pokeblock:textures/entities/pikachu.png");
	}
}
