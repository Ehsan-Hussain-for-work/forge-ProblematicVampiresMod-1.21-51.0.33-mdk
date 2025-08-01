package net.nashe.problematicvampiresmod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nashe.problematicvampiresmod.ProblematicVampiresMod;
import net.nashe.problematicvampiresmod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ProblematicVampiresMod.MOD_ID);

    public static final RegistryObject<Block> SUNSTONE_BLOCK = registerBlock("sunstone_block",
            () -> new Block(
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.COPPER_BULB)
            )
    );

    public static final RegistryObject<Block> PURE_BLOODSTONE_BLOCK = registerBlock("pure_bloodstone_block",
            () -> new Block(
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()
            )
    );

    public static final RegistryObject<Block> IMPURE_BLOODSTONE_BLOCK = registerBlock("impure_bloodstone_block",
            () -> new Block(
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.SOUL_SOIL)
            )
    );


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItems(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItems(String name, RegistryObject<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
