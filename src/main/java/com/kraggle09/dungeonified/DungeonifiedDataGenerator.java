package com.kraggle09.dungeonified;

import com.kraggle09.dungeonified.datagen.ModBlockTagProvider;
import com.kraggle09.dungeonified.datagen.ModLootTableProvider;
import com.kraggle09.dungeonified.datagen.ModModelProvider;
import com.kraggle09.dungeonified.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DungeonifiedDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModBlockTagProvider::new);
	}
}
