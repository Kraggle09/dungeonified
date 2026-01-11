package com.kraggle09.dungeonified.datagen;

import com.kraggle09.dungeonified.blocks.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.RUNESTONE_WALL)
                .add(ModBlocks.RUNESTONE_BRICK_WALL)
                .add(ModBlocks.SQUARED_RUNESTONE_BRICK_WALL)
                .add(ModBlocks.POLISHED_RUNESTONE_WALL)
                .add(ModBlocks.PATTERNED_RUNESTONE_WALL)
                .add(ModBlocks.POLISHED_DRIPSTONE_WALL)
                .add(ModBlocks.DRIPSTONE_BRICK_WALL)
                .add(ModBlocks.STONE_QUARTZ_WALL)
                .add(ModBlocks.STONE_QUARTZ_BRICK_WALL);
    }
}
