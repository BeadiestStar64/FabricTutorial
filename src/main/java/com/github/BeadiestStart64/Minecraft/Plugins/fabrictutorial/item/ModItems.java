package com.github.BeadiestStart64.Minecraft.Plugins.fabrictutorial.item;

import com.github.BeadiestStart64.Minecraft.Plugins.fabrictutorial.FabricTutorial;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // ピンクガーネット
    // MODIDと同じ制約がある
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));

    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));

    // アイテムを登録する
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FabricTutorial.MOD_ID, name), item);
    }

    public static void registerModItems() {
        // ログに残す
        FabricTutorial.LOGGER.info("Registering Mod Items for " + FabricTutorial.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET);
            entries.add(RAW_PINK_GARNET);
        });
    }
}
