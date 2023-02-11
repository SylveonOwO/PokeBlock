
package me.sylveonowo.pokeblock.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import me.sylveonowo.pokeblock.entity.CharmanderEntity;
import me.sylveonowo.pokeblock.client.model.Modelcharmander;

public class CharmanderRenderer extends MobRenderer<CharmanderEntity, Modelcharmander<CharmanderEntity>> {
	public CharmanderRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcharmander(context.bakeLayer(Modelcharmander.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CharmanderEntity entity) {
		return new ResourceLocation("pokeblock:textures/entities/charmander.png");
	}
}
