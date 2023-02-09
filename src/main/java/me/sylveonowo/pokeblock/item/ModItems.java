package me.sylveonowo.pokeblock.item;

import me.sylveonowo.pokeblock.PokeBlock;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PokeBlock.MOD_ID);


    public static final RegistryObject<Item> PokeBall = ITEMS.register("pokeball",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GreatBall = ITEMS.register("greatball",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> UltraBall = ITEMS.register("ultraball",
                    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DuskBall = ITEMS.register("duskball",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CherishBall = ITEMS.register("cherishball",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }



}
