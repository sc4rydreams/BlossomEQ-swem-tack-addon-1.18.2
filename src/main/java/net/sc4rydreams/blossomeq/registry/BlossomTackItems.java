package net.sc4rydreams.blossomeq.registry;

import java.util.ArrayList;
import java.util.List;

import com.alaharranhonor.swem.forge.blocks.SaddleRackBlock;
import com.alaharranhonor.swem.forge.items.SWEMHorseArmorItem;
import com.alaharranhonor.swem.forge.items.tack.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries.Keys;
import net.sc4rydreams.blossomeq.item.BlossomCreativeModeTab;


public class BlossomTackItems {
    public static  final DeferredRegister<Item> ITEMS;

    // ONE OFF TACK ITEMS - This is where we are basically having the game set these aside for us to call later.
    public static final RegistryObject<PastureBlanketItem> PASTURE_BLANKET_QUILTED_WHITE;
    public static final RegistryObject<PastureBlanketItem> PASTURE_BLANKET_QUILTED_BLACK;
    public static final RegistryObject<PastureBlanketItem> PASTURE_BLANKET_QUILTED_BROWN;



    // TACK FOR LOOPS - These are looping ones

    public static final List<RegistryObject<WesternBreastCollarItem>> ENGLISH_SHEEPSKIN_BLOSSOM;
    public static final List<RegistryObject<PastureBlanketItem>> PASTURE_BLANKETS_NEON;
    public static final List<RegistryObject<AdventureLegWraps>> BLOSSOM_TRANSPORT_BOOTS;
    public static final List<RegistryObject<WesternBreastCollarItem>> WESTERN_SHEEPSKIN_BLOSSOM;
    public static final List<RegistryObject<EnglishSaddleItem>> ENGLISH_SADDLE_BLOSSOM;
    public static final List<RegistryObject<WesternSaddleItem>> WESTERN_SADDLE_BLOSSOM;
    public static final List<RegistryObject<AdventureSaddleItem>> ADVENTURE_SADDLE_BLOSSOM;
    public static final List<RegistryObject<AdventureLegWraps>> PROTECTION_BOOTS_BLOSSOM;
    public static final List<RegistryObject<WesternGirthStrapItem>> WESTERN_GIRTH_BLOSSOM;
    public static final List<RegistryObject<WesternBridleItem>> WESTERN_BRIDLE_BLOSSOM;
    public static final List<RegistryObject<EnglishBridleItem>> ENGLISH_BRIDLE_BLOSSOM;
    public static final List<RegistryObject<WesternBlanketItem>> SADDLE_PAD_NEON;


    public BlossomTackItems(){
    }

    //Actually calling the game to register our items
    public static void init(IEventBus eventBus) {ITEMS.register(eventBus);}

    static {
        ITEMS = DeferredRegister.create(Keys.ITEMS, "blossomeq");
        // Telling the game they belong to this mod


        // ONE OFF TACK - We are registering them in a similar fashion to your other items :)

        PASTURE_BLANKET_QUILTED_WHITE = ITEMS.register("pasture_blanket_quilted_white",
                () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                        "pasture_blanket_quilted_white", new Item.Properties()
                        .tab(BlossomCreativeModeTab.BLOSSOM_EQ_TAB_PBLANKETS).stacksTo(16)));

        PASTURE_BLANKET_QUILTED_BLACK = ITEMS.register("pasture_blanket_quilted_black",
                () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                        "pasture_blanket_quilted_black", new Item.Properties()
                        .tab(BlossomCreativeModeTab.BLOSSOM_EQ_TAB_PBLANKETS).stacksTo(16)));

        PASTURE_BLANKET_QUILTED_BROWN = ITEMS.register("pasture_blanket_quilted_brown",
                () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                        "pasture_blanket_quilted_brown", new Item.Properties()
                        .tab(BlossomCreativeModeTab.BLOSSOM_EQ_TAB_PBLANKETS).stacksTo(16)));





// Looping tack items

        BLOSSOM_TRANSPORT_BOOTS = new ArrayList<>(); // 25 transport boots
        for(int var1 = 0; var1 < 25; ++var1) {
            int counter = var1 + 1;
            BLOSSOM_TRANSPORT_BOOTS.add(ITEMS.register("transport_boots_" + counter,
                    () -> new AdventureLegWraps("transport_boots_" + counter, (new Item.Properties())
                            .tab(BlossomCreativeModeTab.BLOSSOM_EQ_TAB).stacksTo(16))
            ));
        }
        SADDLE_PAD_NEON = new ArrayList<>(); // 25 transport boots
        for(int var1 = 0; var1 < 49; ++var1) {
            int counter = var1 + 1;
            SADDLE_PAD_NEON.add(ITEMS.register("saddle_pad_neon_" + counter,
                    () -> new WesternBlanketItem("saddle_pad_neon_" + counter, (new Item.Properties())
                            .tab(BlossomCreativeModeTab.BLOSSOM_EQ_TAB_SADDLEPADS).stacksTo(16))
            ));
        }

        ENGLISH_BRIDLE_BLOSSOM = new ArrayList<>(); // 25 transport boots
        for(int var1 = 0; var1 < 2; ++var1) {
            int counter = var1 + 1;
        ENGLISH_BRIDLE_BLOSSOM.add(ITEMS.register("english_bridle_blossom_" + counter,
                    () -> new EnglishBridleItem("english_bridle_blossom_" + counter, (new Item.Properties())
                            .tab(BlossomCreativeModeTab.BLOSSOM_EQ_TAB).stacksTo(16))
            ));
        }

        WESTERN_BRIDLE_BLOSSOM = new ArrayList<>(); // 25 transport boots
        for(int var1 = 0; var1 < 11; ++var1) {
            int counter = var1 + 1;
        WESTERN_BRIDLE_BLOSSOM.add(ITEMS.register("western_bridle_blossom_" + counter,
                    () -> new WesternBridleItem("western_bridle_blossom_" + counter, (new Item.Properties())
                            .tab(BlossomCreativeModeTab.BLOSSOM_EQ_TAB).stacksTo(16))
            ));
        }

        WESTERN_GIRTH_BLOSSOM = new ArrayList<>(); // 25 transport boots
        for(int var1 = 0; var1 < 15; ++var1) {
            int counter = var1 + 1;
        WESTERN_GIRTH_BLOSSOM    .add(ITEMS.register("western_girth_blossom_" + counter,
                    () -> new WesternGirthStrapItem("western_girth_blossom_" + counter, (new Item.Properties())
                            .tab(BlossomCreativeModeTab.BLOSSOM_EQ_TAB).stacksTo(16))
            ));
        }


        PROTECTION_BOOTS_BLOSSOM = new ArrayList<>(); // 25 transport boots
        for(int var1 = 0; var1 < 8; ++var1) {
            int counter = var1 + 1;
            PROTECTION_BOOTS_BLOSSOM.add(ITEMS.register("protection_boots_blossom_" + counter,
                    () -> new AdventureLegWraps("protection_boots_blossom_" + counter, (new Item.Properties())
                            .tab(BlossomCreativeModeTab.BLOSSOM_EQ_TAB).stacksTo(16))
            ));
        }

        WESTERN_SADDLE_BLOSSOM = new ArrayList<>();
        for(int var1 = 0; var1 < 5; ++var1) {
            int counter = var1 + 1;
            WESTERN_SADDLE_BLOSSOM.add(ITEMS.register("western_saddle_blossom_" + counter,
                    () -> new WesternSaddleItem("western_saddle_blossom_" + counter, (new Item.Properties())
                            .tab(BlossomCreativeModeTab.BLOSSOM_EQ_TAB).stacksTo(16))
            ));
        }

        ADVENTURE_SADDLE_BLOSSOM = new ArrayList<>();
        for(int var1 = 0; var1 < 4; ++var1) {
            int counter = var1 + 1;
            ADVENTURE_SADDLE_BLOSSOM.add(ITEMS.register("adventure_saddle_blossom_" + counter,
                    () -> new AdventureSaddleItem("adventure_saddle_blossom_" + counter, (new Item.Properties())
                            .tab(BlossomCreativeModeTab.BLOSSOM_EQ_TAB).stacksTo(16))
            ));
        }

        ENGLISH_SADDLE_BLOSSOM = new ArrayList<>();
        for(int var1 = 0; var1 < 2; ++var1) {
            int counter = var1 + 1;
            ENGLISH_SADDLE_BLOSSOM.add(ITEMS.register("english_saddle_blossom_" + counter,
                    () -> new EnglishSaddleItem("english_saddle_blossom_" + counter, (new Item.Properties())
                            .tab(BlossomCreativeModeTab.BLOSSOM_EQ_TAB).stacksTo(16))
                    ));
        }

        PASTURE_BLANKETS_NEON = new ArrayList<>(); // 49 pasture blankets
        for(int var1 = 0; var1 < 49; ++var1) {
            int counter = var1 + 1;
            PASTURE_BLANKETS_NEON.add(ITEMS.register("pasture_blanket_neon_" + counter,
                    () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                            "pasture_blanket_neon_" + counter, (new Item.Properties())
                            .tab(BlossomCreativeModeTab.BLOSSOM_EQ_TAB_PBLANKETS).stacksTo(16))
            ));
        }

        ENGLISH_SHEEPSKIN_BLOSSOM = new ArrayList<>(); // 5 western sheepskins
        for(int var1 = 0; var1 < 5; ++var1) {
            int counter = var1 + 1;
            ENGLISH_SHEEPSKIN_BLOSSOM.add(ITEMS.register("english_sheepskin_blossom_" + counter,
                    () -> new WesternBreastCollarItem("english_sheepskin_blossom_" + counter,
                            new Item.Properties().tab(BlossomCreativeModeTab.BLOSSOM_EQ_TAB).stacksTo(16))
            ));
        }

        WESTERN_SHEEPSKIN_BLOSSOM = new ArrayList<>(); // 5 english sheepskins
        for(int var1 = 0; var1 < 5; ++var1) {
            int counter = var1 + 1;
            WESTERN_SHEEPSKIN_BLOSSOM.add(ITEMS.register("western_sheepskin_blossom_" + counter,
                    () -> new WesternBreastCollarItem("western_sheepskin_blossom_" + counter,
                            new Item.Properties().tab(BlossomCreativeModeTab.BLOSSOM_EQ_TAB).stacksTo(16))
            ));
        }
    }


}
