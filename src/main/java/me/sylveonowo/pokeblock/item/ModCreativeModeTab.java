package me.sylveonowo.pokeblock.item;

import me.sylveonowo.pokeblock.PokeBlock;
import me.sylveonowo.pokeblock.block.ModBlocks;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PokeBlock.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTab {
  public static CreativeModeTab POKEBALLS_TAB;
    public static CreativeModeTab POKEBLOCKS_TAB;

  @SubscribeEvent
  public static void registerCreativeTabs(CreativeModeTabEvent.Register event) {
      POKEBALLS_TAB = event.registerCreativeModeTab(new ResourceLocation(PokeBlock.MOD_ID, "pokeballs_tab"),
              builder -> builder.icon(() -> new ItemStack(ModItems.PokeBall.get()))
                      .title(Component.translatable("creativemodetab.pokeballs_tab")));
      POKEBLOCKS_TAB = event.registerCreativeModeTab(new ResourceLocation(PokeBlock.MOD_ID, "pokeblocks_tab"),
              builder -> builder.icon(() -> new ItemStack(ModBlocks.PixelGrass.get()))
                      .title(Component.translatable("creativemodetab.pokeblocks_tab")));

  }
}
