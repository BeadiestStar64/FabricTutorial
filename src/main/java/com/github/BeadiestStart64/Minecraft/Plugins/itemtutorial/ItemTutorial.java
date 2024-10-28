package com.github.BeadiestStart64.Minecraft.Plugins.itemtutorial;

import com.github.BeadiestStart64.Minecraft.Plugins.itemtutorial.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ItemTutorial implements ModInitializer {

    public static final String MOD_ID = "item_tutorial";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
    }
}
