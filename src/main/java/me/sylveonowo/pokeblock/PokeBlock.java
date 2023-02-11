package me.sylveonowo.pokeblock;

import com.mojang.logging.LogUtils;
import me.sylveonowo.pokeblock.block.ModBlocks;
import me.sylveonowo.pokeblock.item.ModCreativeModeTab;
import me.sylveonowo.pokeblock.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import me.sylveonowo.pokeblock.init.TestowoModEntities;
import me.sylveonowo.pokeblock.init.TestowoModItems;
import me.sylveonowo.pokeblock.init.TestowoModSounds;

import static net.minecraftforge.registries.ForgeRegistries.ITEMS;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(PokeBlock.MOD_ID)
public class PokeBlock
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "pokeblock";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public PokeBlock() {
        IEventBus modEventBus = null;



        modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        TestowoModItems.REGISTRY.register(modEventBus);
        TestowoModEntities.REGISTRY.register(modEventBus);
        TestowoModSounds.REGISTRY.register(modEventBus);




        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        if (event.getTab() == ModCreativeModeTab.POKEBALLS_TAB) {
            event.accept(ModItems.PokeBall);
            event.accept(ModItems.GreatBall);
            event.accept(ModItems.UltraBall);
            event.accept(ModItems.DuskBall);
             event.accept(ModItems.CherishBall);
            event.accept(ModItems.PremierBall);
            event.accept(ModItems.FriendBall);

        }

        if (event.getTab() == ModCreativeModeTab.POKEBLOCKS_TAB) {
            event.accept(ModBlocks.PixelGrass);
        }

        if (event.getTab() == ModCreativeModeTab.POKEBLOCKMOB_TAB) {
            event.accept(TestowoModItems.CHARMANDER);
        }
    }



    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }


    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
