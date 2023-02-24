
package me.sylveonowo.pokeblock.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import me.sylveonowo.pokeblock.entity.BulbasaurEntity;
import me.sylveonowo.pokeblock.client.model.Modelbulbasour;

public class BulbasaurRenderer extends MobRenderer<BulbasaurEntity, Modelbulbasour<BulbasaurEntity>> {
	public BulbasaurRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbulbasour(context.bakeLayer(Modelbulbasour.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BulbasaurEntity entity) {
		return new ResourceLocation("pokeblock:textures/entities/bulbasour.png");
	}
}
