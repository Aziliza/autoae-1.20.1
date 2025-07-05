/*
 * @Author: qianyu
 * @Date: 2025-07-05 20:05:08
 * @LastEditTime: 2025-07-05 20:09:09
 */
package com.aziliza.autoae.item;

import com.aziliza.autoae.AutoAE;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item EXAMPLE_ITEM = registerItem("example_item", new Item(new Item.Settings()));
    private static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AutoAE.MOD_ID, id), item);
    }
    public static void registerModItems() {
        AutoAE.LOGGER.info("Registering Mod Items for " + AutoAE.MOD_ID);
    }
}
