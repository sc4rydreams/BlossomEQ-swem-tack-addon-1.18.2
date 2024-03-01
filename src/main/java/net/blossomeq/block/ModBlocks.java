package net.blossomeq.block;

import net.blossomeq.item.ModCreativeModeTab;
import net.blossomeq.item.Moditems;
import net.blossomeq.mod.blossomeq;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.lwjgl.system.CallbackI;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, blossomeq.MOD_ID);


    public static final RegistryObject<Block> SANDSTONE_PALE_BLOCK = registerBlock("sandstone_pale_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SAND_PALE_BLOCK = registerBlock("sand_pale_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SANDSTONE_ASH_BLOCK = registerBlock("sandstone_ash_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SAND_ASH_BLOCK = registerBlock("sand_ash_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);


    public static final RegistryObject<Block> SANDSTONE_TOFFEE_BLOCK = registerBlock("sandstone_toffee_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SAND_TOFFEE_BLOCK = registerBlock("sand_toffee_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SANDSTONE_COFFEE_BLOCK = registerBlock("sandstone_coffee_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SAND_COFFEE_BLOCK = registerBlock("sand_coffee_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);


    public static final RegistryObject<Block> SANDSTONE_WENGE_BLOCK = registerBlock("sandstone_wenge_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SAND_WENGE_BLOCK = registerBlock("sand_wenge_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SANDSTONE_TAN_BLOCK = registerBlock("sandstone_tan_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SAND_TAN_BLOCK = registerBlock("sand_tan_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);


    public static final RegistryObject<Block> SANDSTONE_BISCUIT_BLOCK = registerBlock("sandstone_biscuit_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SAND_BISCUIT_BLOCK = registerBlock("sand_biscuit_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);
    public static final RegistryObject<Block> SANDSTONE_BLACK_BLOCK = registerBlock("sandstone_black_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SAND_BLACK_BLOCK = registerBlock("sand_black_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SANDSTONE_GRAY_BLOCK = registerBlock("sandstone_gray_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SAND_GRAY_BLOCK = registerBlock("sand_gray_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);


    public static final RegistryObject<Block> SANDSTONE_TAUPE_BLOCK = registerBlock("sandstone_taupe_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SAND_TAUPE_BLOCK = registerBlock("sand_taupe_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);


    public static final RegistryObject<Block> SANDSTONE_CHESTNUT_BLOCK = registerBlock("sandstone_chestnut_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SAND_CHESTNUT_BLOCK = registerBlock("sand_chestnut_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SANDSTONE_UMBER_BLOCK = registerBlock("sandstone_umber_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SAND_UMBER_BLOCK = registerBlock("sand_umber_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);


    public static final RegistryObject<Block> SANDSTONE_ORANGE_BLOCK = registerBlock("sandstone_orange_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SAND_ORANGE_BLOCK = registerBlock("sand_orange_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);


    public static final RegistryObject<Block> SANDSTONE_MOCHA_BLOCK = registerBlock("sandstone_mocha_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SAND_MOCHA_BLOCK = registerBlock("sand_mocha_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SANDSTONE_BROWN_BLOCK = registerBlock("sandstone_brown_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SAND_BROWN_BLOCK = registerBlock("sand_brown_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);


    public static final RegistryObject<Block> SANDSTONE_BUFF_BLOCK = registerBlock("sandstone_buff_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SAND_BUFF_BLOCK = registerBlock("sand_buff_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);


    public static final RegistryObject<Block> SANDSTONE_CACAO_BLOCK = registerBlock("sandstone_cacao_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SAND_CACAO_BLOCK = registerBlock("sand_cacao_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);


    public static final RegistryObject<Block> SANDSTONE_CARAMEL_BLOCK = registerBlock("sandstone_caramel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SAND_CARAMEL_BLOCK = registerBlock("sand_caramel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);


    public static final RegistryObject<Block> SANDSTONE_CEDAR_BLOCK = registerBlock("sandstone_cedar_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SAND_CEDAR_BLOCK = registerBlock("sand_cedar_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);


    public static final RegistryObject<Block> SANDSTONE_CHERRY_BLOCK = registerBlock("sandstone_cherry_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SAND_CHERRY_BLOCK = registerBlock("sand_cherry_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);


    public static final RegistryObject<Block> SANDSTONE_CLAY_BLOCK = registerBlock("sandstone_clay_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SAND_CLAY_BLOCK = registerBlock("sand_clay_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);


    public static final RegistryObject<Block> SANDSTONE_COPPER_BLOCK = registerBlock("sandstone_copper_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SAND_COPPER_BLOCK = registerBlock("sand_copper_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);


    public static final RegistryObject<Block> SANDSTONE_CRAY_BLOCK = registerBlock("sandstone_cray_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SAND_CRAY_BLOCK = registerBlock("sand_cray_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);



    public static final RegistryObject<Block> SANDSTONE_IVORY_BLOCK = registerBlock("sandstone_ivory_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SAND_IVORY_BLOCK = registerBlock("sand_ivory_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);



    public static final RegistryObject<Block> SANDSTONE_OAT_BLOCK = registerBlock("sandstone_oat_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SAND_OAT_BLOCK = registerBlock("sand_oat_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);



    public static final RegistryObject<Block> SANDSTONE_LATTE_BLOCK = registerBlock("sandstone_latte_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SAND_LATTE_BLOCK = registerBlock("sand_latte_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);



    public static final RegistryObject<Block> SANDSTONE_PEANUT_BLOCK = registerBlock("sandstone_peanut_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SAND_PEANUT_BLOCK = registerBlock("sand_peanut_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);


    public static final RegistryObject<Block> SANDSTONE_WOOD_BLOCK = registerBlock("sandstone_wood_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SAND_WOOD_BLOCK = registerBlock("sand_wood_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SANDSTONE_PENNY_BLOCK = registerBlock("sandstone_penny_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SAND_PENNY_BLOCK = registerBlock("sand_penny_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);

    public static final RegistryObject<Block> SANDSTONE_PINE_BLOCK = registerBlock("sandstone_pine_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);
    public static final RegistryObject<Block> SAND_PINE_BLOCK = registerBlock("sand_pine_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);


    public static final RegistryObject<Block> SANDSTONE_RUSSEL_BLOCK = registerBlock("sandstone_russel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);
    public static final RegistryObject<Block> SAND_RUSSEL_BLOCK = registerBlock("sand_russel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);



    public static final RegistryObject<Block> SANDSTONE_RUSSET_BLOCK = registerBlock("sandstone_russet_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);
    public static final RegistryObject<Block> SAND_RUSSET_BLOCK = registerBlock("sand_russet_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);


    public static final RegistryObject<Block> SANDSTONE_SADDLE_BLOCK = registerBlock("sandstone_saddle_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);
    public static final RegistryObject<Block> SAND_SADDLE_BLOCK = registerBlock("sand_saddle_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);


    public static final RegistryObject<Block> SANDSTONE_SEPIA_BLOCK = registerBlock("sandstone_sepia_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);
    public static final RegistryObject<Block> SAND_SEPIA_BLOCK = registerBlock("sand_sepia_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);


    public static final RegistryObject<Block> SANDSTONE_SUGAR_BLOCK = registerBlock("sandstone_sugar_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);
    public static final RegistryObject<Block> SAND_SUGAR_BLOCK = registerBlock("sand_sugar_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);


    public static final RegistryObject<Block> SANDSTONE_SYRUP_BLOCK = registerBlock("sandstone_syrup_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);
    public static final RegistryObject<Block> SAND_SYRUP_BLOCK = registerBlock("sand_syrup_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);


    public static final RegistryObject<Block> SANDSTONE_TANNY_BLOCK = registerBlock("sandstone_tanny_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);
    public static final RegistryObject<Block> SAND_TANNY_BLOCK = registerBlock("sand_tanny_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);


    public static final RegistryObject<Block> SANDSTONE_TAWNY_BLOCK = registerBlock("sandstone_tawny_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);
    public static final RegistryObject<Block> SAND_TAWNY_BLOCK = registerBlock("sand_tawny_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);


    public static final RegistryObject<Block> SANDSTONE_WALNUT_BLOCK = registerBlock("sandstone_walnut_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);
    public static final RegistryObject<Block> SAND_WALNUT_BLOCK = registerBlock("sand_walnut_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);



    public static final RegistryObject<Block> SANDSTONE_TERRACOTTA_BLOCK = registerBlock("sandstone_terracotta_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);
    public static final RegistryObject<Block> SAND_TERRACOTTA_BLOCK = registerBlock("sand_terracotta_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);




    public static final RegistryObject<Block> SANDSTONE_BEACH_BLOCK = registerBlock("sandstone_beach_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);
    public static final RegistryObject<Block> SAND_BEACH_BLOCK = registerBlock("sand_beach_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);



    public static final RegistryObject<Block> SANDSTONE_AQUA_BLOCK = registerBlock("sandstone_aqua_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);
    public static final RegistryObject<Block> SAND_AQUA_BLOCK = registerBlock("sand_aqua_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);



    public static final RegistryObject<Block> SANDSTONE_OCEAN_BLOCK = registerBlock("sandstone_ocean_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);
    public static final RegistryObject<Block> SAND_OCEAN_BLOCK = registerBlock("sand_ocean_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);


    public static final RegistryObject<Block> SANDSTONE_LILAC_BLOCK = registerBlock("sandstone_lilac_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);
    public static final RegistryObject<Block> SAND_LILAC_BLOCK = registerBlock("sand_lilac_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);


    public static final RegistryObject<Block> SANDSTONE_GRAYGE_BLOCK = registerBlock("sandstone_grayge_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);
    public static final RegistryObject<Block> SAND_GRAYGE_BLOCK = registerBlock("sand_grayge_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), ModCreativeModeTab.BLOSSOM_EQ_TAB_2);




    private static <T extends  Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
                registerBlockItem(name, toReturn, tab);
                return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){

        return Moditems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
