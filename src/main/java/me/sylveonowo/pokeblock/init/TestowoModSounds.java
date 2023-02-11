
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.sylveonowo.pokeblock.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import me.sylveonowo.pokeblock.PokeBlock;

public class TestowoModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, PokeBlock.MOD_ID);
	public static final RegistryObject<SoundEvent> CHARMANDERFAINTS = REGISTRY.register("charmanderfaints",
			() -> SoundEvent.createVariableRangeEvent(new ResourceLocation("pokeblock", "charmanderfaints")));
	public static final RegistryObject<SoundEvent> CHARMANDERLIVING = REGISTRY.register("charmanderliving",
			() -> SoundEvent.createVariableRangeEvent(new ResourceLocation("pokeblock", "charmanderliving")));
}
