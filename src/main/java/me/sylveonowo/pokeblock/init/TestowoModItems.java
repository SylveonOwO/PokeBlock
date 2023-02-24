
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.sylveonowo.pokeblock.init;

import me.sylveonowo.pokeblock.PokeBlock;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import me.sylveonowo.pokeblock.PokeBlock;

public class TestowoModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PokeBlock.MOD_ID);
	public static final RegistryObject<Item> CHARMANDER = REGISTRY.register("charmander_spawn_egg",
			() -> new ForgeSpawnEggItem(TestowoModEntities.CHARMANDER, -3394816, -3407872, new Item.Properties()));

	public static final RegistryObject<Item> BULBASAUR = REGISTRY.register("bulbasaur_spawn_egg",
			() -> new ForgeSpawnEggItem(TestowoModEntities.BULBASAUR, -16711783, -16751104, new Item.Properties()));

	public static final RegistryObject<Item> ARCEUS = REGISTRY.register("arceus_spawn_egg",
			() -> new ForgeSpawnEggItem(TestowoModEntities.ARCEUS, -1, -10066330, new Item.Properties()));

	public static final RegistryObject<Item> PIKACHU = REGISTRY.register("pikachu_spawn_egg",
			() -> new ForgeSpawnEggItem(TestowoModEntities.PIKACHU, -256, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> EEVEE = REGISTRY.register("eevee_spawn_egg",
			() -> new ForgeSpawnEggItem(TestowoModEntities.EEVEE, -6737152, -6724096, new Item.Properties()));

}

