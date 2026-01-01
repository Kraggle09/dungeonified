package com.kraggle09.dungeonified;

import com.kraggle09.dungeonified.blocks.ModBlocks;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dungeonified implements ModInitializer {
	public static final String MOD_ID = "dungeonified";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("[DUNGEONIFIED] Loading...");

		ModItemGroups.registerItemsGroups();

		ModBlocks.registerModBlocks();
	}
}