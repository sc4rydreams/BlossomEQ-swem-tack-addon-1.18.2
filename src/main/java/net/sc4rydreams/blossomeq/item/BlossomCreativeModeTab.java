package net.sc4rydreams.blossomeq.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class BlossomCreativeModeTab {
    public static final CreativeModeTab BLOSSOM_EQ_TAB = new CreativeModeTab("blossom_eq_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Blossomitems.CHERRY_BLOSSOM.get());


        }
    };
        public static final CreativeModeTab BLOSSOM_EQ_TAB_BLOCKS = new CreativeModeTab("blossom_eq_tab_blocks") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(Blossomitems.CHERRY_BLOSSOM_2.get());


            }
        };
}
