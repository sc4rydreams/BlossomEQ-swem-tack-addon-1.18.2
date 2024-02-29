package net.blossomeq.block;

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

    public static final RegistryObject<Block> SAND_PALE_BLOCK = registerBlock("sand_pale_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> SANDSTONE_PALE_BLOCK = registerBlock("sandstone_pale_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> SANDSTONE_ASH_BLOCK = registerBlock("sandstone_ash_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> SAND_ASH_BLOCK = registerBlock("sand_ash_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), CreativeModeTab.TAB_MISC);


    public static final RegistryObject<Block> SANDSTONE_TOFFEE_BLOCK = registerBlock("sandstone_toffee_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> SAND_TOFFEE_BLOCK = registerBlock("sand_toffee_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> SANDSTONE_COFFEE_BLOCK = registerBlock("sandstone_coffee_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> SAND_COFFEE_BLOCK = registerBlock("sand_coffee_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), CreativeModeTab.TAB_MISC);


    public static final RegistryObject<Block> SANDSTONE_WENGE_BLOCK = registerBlock("sandstone_wenge_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> SAND_WENGE_BLOCK = registerBlock("sand_wenge_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> SANDSTONE_TAN_BLOCK = registerBlock("sandstone_tan_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> SAND_TAN_BLOCK = registerBlock("sand_tan_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), CreativeModeTab.TAB_MISC);


    public static final RegistryObject<Block> SANDSTONE_BISCUIT_BLOCK = registerBlock("sandstone_biscuit_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> SAND_BISCUIT_BLOCK = registerBlock("sand_biscuit_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> SANDSTONE_BLACK_BLOCK = registerBlock("sandstone_black_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> SAND_BLACK_BLOCK = registerBlock("sand_black_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> SANDSTONE_GRAY_BLOCK = registerBlock("sandstone_gray_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> SAND_GRAY_BLOCK = registerBlock("sand_gray_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), CreativeModeTab.TAB_MISC);


    public static final RegistryObject<Block> SANDSTONE_TAUPE_BLOCK = registerBlock("sandstone_taupe_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> SAND_TAUPE_BLOCK = registerBlock("sand_taupe_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), CreativeModeTab.TAB_MISC);


    public static final RegistryObject<Block> SANDSTONE_CHESTNUT_BLOCK = registerBlock("sandstone_chestnut_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> SAND_CHESTNUT_BLOCK = registerBlock("sand_chestnut_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> SANDSTONE_UMBER_BLOCK = registerBlock("sandstone_umber_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> SAND_UMBER_BLOCK = registerBlock("sand_umber_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), CreativeModeTab.TAB_MISC);


    public static final RegistryObject<Block> SANDSTONE_ORANGE_BLOCK = registerBlock("sandstone_orange_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> SAND_ORANGE_BLOCK = registerBlock("sand_orange_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), CreativeModeTab.TAB_MISC);


    public static final RegistryObject<Block> SANDSTONE_MOCHA_BLOCK = registerBlock("sandstone_mocha_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> SAND_MOCHA_BLOCK = registerBlock("sand_mocha_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> SANDSTONE_BROWN_BLOCK = registerBlock("sandstone_brown_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> SAND_BROWN_BLOCK = registerBlock("sand_brown_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength
                    (8f)), CreativeModeTab.TAB_MISC);




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
