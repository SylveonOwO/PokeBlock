
package me.sylveonowo.pokeblock.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import me.sylveonowo.pokeblock.entity.EeveeEntity;
import me.sylveonowo.pokeblock.client.model.Modeleevee;

public class EeveeRenderer extends MobRenderer<EeveeEntity, Modeleevee<EeveeEntity>> {
	public EeveeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeleevee(context.bakeLayer(Modeleevee.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EeveeEntity entity) {
		return new ResourceLocation("pokeblock:textures/entities/eevee.png");
	}
}
