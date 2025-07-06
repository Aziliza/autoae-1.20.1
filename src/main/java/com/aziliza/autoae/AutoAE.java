/*
 * @Author: qianyu
 * @Date: 2025-07-05 11:54:44
 * @LastEditTime: 2025-07-06 15:10:49
 */
package com.aziliza.autoae;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aziliza.autoae.item.ModItemGroups;
import com.aziliza.autoae.item.ModItems;

public class AutoAE implements ModInitializer {
	public static final String MOD_ID = "autoae";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();
		ModItemGroups.registerModItemGroups();
		LOGGER.info("Hello Fabric world!");
	}
}