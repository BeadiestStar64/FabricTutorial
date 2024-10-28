package com.github.BeadiestStart64.Minecraft.Plugins.fabrictutorial;

import com.github.BeadiestStart64.Minecraft.Plugins.fabrictutorial.block.ModBlocks;
import com.github.BeadiestStart64.Minecraft.Plugins.fabrictutorial.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FabricTutorial implements ModInitializer {

    public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}
