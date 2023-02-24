
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.sylveonowo.pokeblock.init;

import me.sylveonowo.pokeblock.entity.*;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import me.sylveonowo.pokeblock.PokeBlock;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TestowoModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PokeBlock.MOD_ID);
	public static final RegistryObject<EntityType<CharmanderEntity>> CHARMANDER = register("charmander",
			EntityType.Builder.<CharmanderEntity>of(CharmanderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CharmanderEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BulbasaurEntity>> BULBASAUR = register("bulbasaur",
			EntityType.Builder.<BulbasaurEntity>of(BulbasaurEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BulbasaurEntity::new)

					.sized(0.6f, 1.8f));

	public static final RegistryObject<EntityType<ArceusEntity>> ARCEUS = register("arceus",
			EntityType.Builder.<ArceusEntity>of(ArceusEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ArceusEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EeveeEntity>> EEVEE = register("eevee",
			EntityType.Builder.<EeveeEntity>of(EeveeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(EeveeEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PikachuEntity>> PIKACHU = register("pikachu",
			EntityType.Builder.<PikachuEntity>of(PikachuEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(PikachuEntity::new)

					.sized(0.6f, 1.8f));




	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));


	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CharmanderEntity.init();
			BulbasaurEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CHARMANDER.get(), CharmanderEntity.createAttributes().build());
		event.put(BULBASAUR.get(), BulbasaurEntity.createAttributes().build());
		event.put(ARCEUS.get(), ArceusEntity.createAttributes().build());
		event.put(EEVEE.get(), EeveeEntity.createAttributes().build());
		event.put(PIKACHU.get(), PikachuEntity.createAttributes().build());
	}
}
