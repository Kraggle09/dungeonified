package com.kraggle09.dungeonified.datagen;

import com.kraggle09.dungeonified.blocks.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        // Runestone
        addDrop(ModBlocks.RUNESTONE);
        addDrop(ModBlocks.RUNESTONE_STAIRS);
        addDrop(ModBlocks.RUNESTONE_SLAB, this::slabDrops);
        // Runestone Bricks
        addDrop(ModBlocks.RUNESTONE_BRICKS);
        addDrop(ModBlocks.RUNESTONE_BRICK_STAIRS);
        addDrop(ModBlocks.RUNESTONE_BRICK_SLAB, this::slabDrops);
        // Squared Runestone Bricks
        addDrop(ModBlocks.SQUARED_RUNESTONE_BRICKS);
        addDrop(ModBlocks.SQUARED_RUNESTONE_BRICK_STAIRS);
        addDrop(ModBlocks.SQUARED_RUNESTONE_BRICK_SLAB, this::slabDrops);
        // Polished Runestone
        addDrop(ModBlocks.POLISHED_RUNESTONE);
        addDrop(ModBlocks.POLISHED_RUNESTONE_STAIRS);
        addDrop(ModBlocks.POLISHED_RUNESTONE_SLAB, this::slabDrops);
        // Patterned Runestone
        addDrop(ModBlocks.PATTERNED_RUNESTONE);
        addDrop(ModBlocks.PATTERNED_RUNESTONE_STAIRS);
        addDrop(ModBlocks.PATTERNED_RUNESTONE_SLAB, this::slabDrops);
        // Other Runestone Blocks
        addDrop(ModBlocks.CHISELED_RUNESTONE);
        addDrop(ModBlocks.CHISELED_RUNESTONE_BRICKS);
        addDrop(ModBlocks.MORTISED_RUNESTONE_BRICKS);
        addDrop(ModBlocks.RUNESTONE_PILLAR);

        // Polished Dripstone
        addDrop(ModBlocks.POLISHED_DRIPSTONE);
        addDrop(ModBlocks.POLISHED_DRIPSTONE_STAIRS);
        addDrop(ModBlocks.POLISHED_DRIPSTONE_SLAB, this::slabDrops);
        // Dripstone Bricks
        addDrop(ModBlocks.DRIPSTONE_BRICKS);
        addDrop(ModBlocks.DRIPSTONE_BRICK_STAIRS);
        addDrop(ModBlocks.DRIPSTONE_BRICK_SLAB, this::slabDrops);
        // Chiseled Dripstone Bricks
        addDrop(ModBlocks.CHISELED_RUNESTONE_BRICKS);

        // Stone Quartz
        addDrop(ModBlocks.STONE_QUARTZ);
        addDrop(ModBlocks.STONE_QUARTZ_STAIRS);
        addDrop(ModBlocks.STONE_QUARTZ_SLAB, this::slabDrops);
        // Stone Quartz Bricks
        addDrop(ModBlocks.STONE_QUARTZ_BRICKS);
        addDrop(ModBlocks.STONE_QUARTZ_BRICK_STAIRS);
        addDrop(ModBlocks.STONE_QUARTZ_BRICK_SLAB, this::slabDrops);
        // Other Stone Quartz Blocks
        addDrop(ModBlocks.CHISELED_STONE_QUARTZ);
        addDrop(ModBlocks.CHISELED_STONE_QUARTZ_BRICKS);
        addDrop(ModBlocks.STONE_QUARTZ_PILLAR);

        addDrop(ModBlocks.BURNT_PUMPKIN);
    }
}
