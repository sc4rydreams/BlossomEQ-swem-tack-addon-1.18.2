package net.blossomeq.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab BLOSSOM_EQ_TAB = new CreativeModeTab("blossom_eq_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Moditems.CHERRY_BLOSSOM.get());


        }
    };
        public static final CreativeModeTab BLOSSOM_EQ_TAB_2 = new CreativeModeTab("blossom_eq_tab2") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(Moditems.CHERRY_BLOSSOM_2.get());


            }
        };
}
