package net.sc4rydreams.blossomeq.registry;

import java.util.ArrayList;
import java.util.List;

import com.alaharranhonor.swem.forge.items.SWEMHorseArmorItem;
import com.alaharranhonor.swem.forge.items.tack.AdventureLegWraps;
import com.alaharranhonor.swem.forge.items.tack.PastureBlanketItem;
import com.alaharranhonor.swem.forge.items.tack.WesternBlanketItem;
import com.alaharranhonor.swem.forge.items.tack.WesternBreastCollarItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries.Keys;
import net.sc4rydreams.blossomeq.item.ModCreativeModeTab;


public class BlossomTackItems {
    public static  final DeferredRegister<Item> ITEMS;

    // ONE OFF TACK ITEMS - This is where we are basically having the game set these aside for us to call later.
    public static final RegistryObject<PastureBlanketItem> PASTURE_BLANKET_QUILTED_WHITE;
    public static final RegistryObject<PastureBlanketItem> PASTURE_BLANKET_QUILTED_BLACK;
    public static final RegistryObject<WesternBreastCollarItem> SHEEPSKIN;


    // TACK FOR LOOPS - These are looping ones

    public static final List<RegistryObject<PastureBlanketItem>> PASTURE_BLANKETS_NEON;
    public static final List<RegistryObject<AdventureLegWraps>> TRANSPORT_BOOTS;

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
                        .tab(ModCreativeModeTab.BLOSSOM_EQ_TAB).stacksTo(16)));

        PASTURE_BLANKET_QUILTED_BLACK = ITEMS.register("pasture_blanket_quilted_black",
                () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                        "pasture_blanket_quilted_black", new Item.Properties()
                        .tab(ModCreativeModeTab.BLOSSOM_EQ_TAB).stacksTo(16)));

        SHEEPSKIN = ITEMS.register("sheepskin",
                () -> new WesternBreastCollarItem("sheepskin",
                        new Item.Properties().tab(ModCreativeModeTab.BLOSSOM_EQ_TAB).stacksTo(16)));

// Looping tack items

        TRANSPORT_BOOTS = new ArrayList<>(); // 25 transport boots
        for(int var1 = 0; var1 < 25; ++var1) {
            int counter = var1 + 1;
            TRANSPORT_BOOTS.add(ITEMS.register("transport_boots_" + counter,
                    () -> new AdventureLegWraps("transport_boots_" + counter, (new Item.Properties())
                            .tab(ModCreativeModeTab.BLOSSOM_EQ_TAB).stacksTo(16))
            ));
        }


        PASTURE_BLANKETS_NEON = new ArrayList<>(); // 49 transport boots
        for(int var1 = 0; var1 < 49; ++var1) {
            int counter = var1 + 1;
            PASTURE_BLANKETS_NEON.add(ITEMS.register("pasture_blanket_neon_" + counter,
                    () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                            "pasture_blanket_neon_" + counter, (new Item.Properties())
                            .tab(ModCreativeModeTab.BLOSSOM_EQ_TAB).stacksTo(16))
            ));
        }
    }
}
