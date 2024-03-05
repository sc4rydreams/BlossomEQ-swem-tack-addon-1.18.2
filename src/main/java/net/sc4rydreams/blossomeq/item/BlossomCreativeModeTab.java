package net.sc4rydreams.blossomeq.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class BlossomCreativeModeTab {
    public static final CreativeModeTab BLOSSOM_EQ_TAB = new CreativeModeTab("blossom_eq_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Blossomitems.CHERRY_BLOSSOM_8.get());


        }
    };
        public static final CreativeModeTab BLOSSOM_EQ_TAB_BLOCKS = new CreativeModeTab("blossom_eq_tab_blocks") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(Blossomitems.CHERRY_BLOSSOM_7.get());


            }
        };

    public static final CreativeModeTab BLOSSOM_EQ_TAB_SADDLEPADS = new CreativeModeTab("blossom_eq_tab_saddlepads") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Blossomitems.CHERRY_BLOSSOM_6.get());


        }
    };
    public static final CreativeModeTab BLOSSOM_EQ_TAB_PBLANKETS = new CreativeModeTab("blossom_eq_tab_pastureblankets") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Blossomitems.CHERRY_BLOSSOM_5.get());


        }
    };
    public static final CreativeModeTab BLOSSOM_EQ_TAB_WBLANKETS = new CreativeModeTab("blossom_eq_tab_winterblankets") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Blossomitems.CHERRY_BLOSSOM_4.get());


        }
    };
    public static final CreativeModeTab BLOSSOM_EQ_TAB_LEGWRAPS = new CreativeModeTab("blossom_eq_tab_legwraps") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Blossomitems.CHERRY_BLOSSOM_3.get());


        }
    };
}
