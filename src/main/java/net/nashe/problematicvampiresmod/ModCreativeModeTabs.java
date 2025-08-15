package net.nashe.problematicvampiresmod;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.nashe.problematicvampiresmod.item.ModItems;
import net.nashe.problematicvampiresmod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABES =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ProblematicVampiresMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PROBLEMATIC_VAMPIRES_MOD_TAB = CREATIVE_MODE_TABES.register("problematic_vampires_mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BLOODSTONE.get()))
                    .title(Component.translatable("creativetab.problematicvampiresmod.problematic_vampires_mod"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BLOODSTONE_NUGGET.get());
                        output.accept(ModItems.BLOODSTONE.get());

                        output.accept(ModItems.SUNSTONE_DUST.get());
                        output.accept(ModItems.SUNSTONE.get());

                        output.accept(ModBlocks.BLOODSTONE_BLOCK.get());
                        output.accept(ModBlocks.SUNSTONE_BLOCK.get());

                        output.accept(ModBlocks.BLOODSTONE_ORE.get());
                        output.accept(ModBlocks.SUNSTONE_ORE.get());
                        output.accept(ModBlocks.SUNSTONE_TUFF_ORE.get());
                    }).build()
    );

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABES.register(eventBus);
    }
}

