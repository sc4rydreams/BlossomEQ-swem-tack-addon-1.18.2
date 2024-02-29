package net.blossomeq.item;

import net.blossomeq.mod.blossomeq;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
        public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, blossomeq.MOD_ID);


        public static  final RegistryObject<Item> CHERRY_BLOSSOM = ITEMS.register("cherry_blossom",
            () -> new Item(new Item.Properties() .tab(CreativeModeTab.TAB_MISC)));



        public static void  register(IEventBus eventBus) {
            ITEMS.register(eventBus);
        }


}
