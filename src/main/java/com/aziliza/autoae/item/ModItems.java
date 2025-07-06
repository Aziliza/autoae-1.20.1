/*
 * @Author: qianyu
 * @Date: 2025-07-05 20:05:08
 * @LastEditTime: 2025-07-06 15:16:16
 */
package com.aziliza.autoae.item;

import com.aziliza.autoae.AutoAE;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item EXAMPLE_ITEM = registerItem("example_item", new Item(new Item.Settings()));
    // 注册物品
    private static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AutoAE.MOD_ID, id), item);
    }
    // 用farbic接口添加物品到原版item组
    private static void addItemToIG(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(EXAMPLE_ITEM);
    }
    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIG);
        AutoAE.LOGGER.info("Registering Mod Items for " + AutoAE.MOD_ID);
    }
}
