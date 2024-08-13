package net.slobberyflame19.myfirstmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.slobberyflame19.myfirstmod.MyFirstMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MyFirstMod.MOD_ID);

    public static final RegistryObject<Item> TREEBARK = ITEMS.register("treebark",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BURNT_TREEBARK = ITEMS.register("burnt_treebark",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CARVED_NETHERITE_INGOT = ITEMS.register("carved_netherite_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MONKEY_PAW = ITEMS.register("monkey_paw",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHESS_WHITE_PAWN = ITEMS.register("chess_white_pawn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHESS_BLACK_PAWN = ITEMS.register("chess_black_pawn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHESS_WHITE_KING = ITEMS.register("chess_white_king",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHESS_BLACK_KING = ITEMS.register("chess_black_king",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> THE_FOOL_TAROT = ITEMS.register("the_fool_tarot",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
