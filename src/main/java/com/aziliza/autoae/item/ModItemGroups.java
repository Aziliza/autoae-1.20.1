package com.aziliza.autoae.item;

import com.aziliza.autoae.AutoAE;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup EXAMPLE_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,Identifier.of(AutoAE.MOD_ID, "example_group"),
        ItemGroup.create(null,-1)
            .displayName(Text.translatable("itemGroup.example_group"))
            .icon(() -> new ItemStack(ModItems.EXAMPLE_ITEM))
            .entries((displayContext, entries) -> {
                // 添加物品到新分组
                entries.add(ModItems.EXAMPLE_ITEM);
                entries.add(Blocks.BRICKS);
                entries.add(Items.DIAMOND);
            }).build());
    public static void registerModItemGroups() {
        AutoAE.LOGGER.info("Registering Mod Item Groups for " + AutoAE.MOD_ID);
    }
}
