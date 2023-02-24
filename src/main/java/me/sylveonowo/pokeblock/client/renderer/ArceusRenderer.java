
package me.sylveonowo.pokeblock.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import me.sylveonowo.pokeblock.entity.ArceusEntity;
import me.sylveonowo.pokeblock.client.model.Modelarceus;

public class ArceusRenderer extends MobRenderer<ArceusEntity, Modelarceus<ArceusEntity>> {
	public ArceusRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelarceus(context.bakeLayer(Modelarceus.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ArceusEntity entity) {
		return new ResourceLocation("pokeblock:textures/entities/arceus.png");
	}
}
