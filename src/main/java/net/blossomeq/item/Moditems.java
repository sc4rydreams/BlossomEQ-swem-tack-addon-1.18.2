package net.blossomeq.item;

import net.blossomeq.mod.blossomeq;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
        public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, blossomeq.MOD_ID);


        public static  final RegistryObject<Item> CHERRY_BLOSSOM = ITEMS.register("cherry_blossom",
            () -> new Item(new Item.Properties() .tab(ModCreativeModeTab.BLOSSOM_EQ_TAB)));

    public static  final RegistryObject<Item> CHERRY_BLOSSOM_2 = ITEMS.register("cherry_blossom_2",
            () -> new Item(new Item.Properties() .tab(ModCreativeModeTab.BLOSSOM_EQ_TAB)));



        public static void  register(IEventBus eventBus) {
            ITEMS.register(eventBus);
        }


}
