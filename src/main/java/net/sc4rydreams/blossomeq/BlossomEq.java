package net.sc4rydreams.blossomeq;

import com.mojang.logging.LogUtils;
import net.sc4rydreams.blossomeq.block.BlossomBlocks;
import net.sc4rydreams.blossomeq.item.Blossomitems;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.sc4rydreams.blossomeq.registry.BlossomTackItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(BlossomEq.MOD_ID)
public class BlossomEq {
    public static final String MOD_ID = "blossomeq";

    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public BlossomEq() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        Blossomitems.register(eventBus);
        BlossomBlocks.register(eventBus);

        BlossomTackItems.init(eventBus);// registers the deferred items in ModItems


        eventBus.addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("HELLO FROM BLOSSOMEQ"); // This code is what logs when the game starts up in the log
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName()); // Its completely optional
    }
}
