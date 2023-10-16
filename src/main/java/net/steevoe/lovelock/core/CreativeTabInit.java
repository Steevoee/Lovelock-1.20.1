package net.steevoe.lovelock.core;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.steevoe.lovelock.Lovelock;
import net.steevoe.lovelock.item.ItemInit;

public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Lovelock.MOD_ID);

    public static final RegistryObject<CreativeModeTab> LOVELOCK_TAB = CREATIVE_MODE_TABS.register("lovelock_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ItemInit.PLATINUM_INGOT.get()))
                    .title(Component.translatable("creativetab.lovelock_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ItemInit.PLATINUM_INGOT.get());


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
