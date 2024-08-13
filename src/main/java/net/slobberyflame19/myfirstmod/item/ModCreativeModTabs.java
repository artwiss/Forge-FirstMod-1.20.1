package net.slobberyflame19.myfirstmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.slobberyflame19.myfirstmod.MyFirstMod;
import net.slobberyflame19.myfirstmod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MyFirstMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MODDED_TAB = CREATIVE_MODE_TABS.register("modded_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.ENDER_EYE))
                    .title(Component.translatable("creativetab.modded_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.TREEBARK.get());
                        output.accept(ModItems.BURNT_TREEBARK.get());
                        output.accept(ModItems.CARVED_NETHERITE_INGOT.get());
                        output.accept(ModBlocks.CARVED_NETHERITE_BLOCK.get());
                        output.accept(ModBlocks.GUNPOWDER_BLOCK.get());
                        output.accept(ModItems.MONKEY_PAW.get());
                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> CHESS_TAB = CREATIVE_MODE_TABS.register("chess_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CHESS_WHITE_KING.get()))
                    .title(Component.translatable("creativetab.chess_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CHESS_WHITE_PAWN.get());
                        output.accept(ModItems.CHESS_BLACK_PAWN.get());
                        output.accept(ModItems.CHESS_WHITE_KING.get());
                        output.accept(ModItems.CHESS_BLACK_KING.get());
                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> TAROT_TAB = CREATIVE_MODE_TABS.register("tarot_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.THE_FOOL_TAROT.get()))
                    .title(Component.translatable("creativetab.tarot_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.THE_FOOL_TAROT.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
