package net.nashe.problematicvampiresmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nashe.problematicvampiresmod.ProblematicVampiresMod;
import net.nashe.problematicvampiresmod.item.custom.PurificationSaltItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ProblematicVampiresMod.MOD_ID);

    public static final RegistryObject<Item> SUNSTONE = ITEMS.register("sunstone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SUNSTONE_DUST = ITEMS.register("sunstone_dust",
            () -> new Item(new Item.Properties()));



    public static final RegistryObject<Item> BLOODSTONE = ITEMS.register("bloodstone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLOODSTONE_NUGGET = ITEMS.register("bloodstone_nugget",
            () -> new Item(new Item.Properties()));



    public static final RegistryObject<Item> PURIFICATION_SALT = ITEMS.register("purification_salt",
            () -> new PurificationSaltItem(new Item.Properties().durability(32)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
