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
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
