package com.kraggle09.dungeonified.datagen;

import com.kraggle09.dungeonified.blocks.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.TexturedModel;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // Runestone
        BlockStateModelGenerator.BlockTexturePool runestonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUNESTONE);
        runestonePool.slab(ModBlocks.RUNESTONE_SLAB);
        runestonePool.stairs(ModBlocks.RUNESTONE_STAIRS);
        // Runestone Bricks
        BlockStateModelGenerator.BlockTexturePool runestoneBrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUNESTONE_BRICKS);
        runestoneBrickPool.slab(ModBlocks.RUNESTONE_BRICK_SLAB);
        runestoneBrickPool.stairs(ModBlocks.RUNESTONE_BRICK_STAIRS);
        // Squared Runestone bricks
        BlockStateModelGenerator.BlockTexturePool squaredRunestoneBrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SQUARED_RUNESTONE_BRICKS);
        squaredRunestoneBrickPool.slab(ModBlocks.SQUARED_RUNESTONE_BRICK_SLAB);
        squaredRunestoneBrickPool.stairs(ModBlocks.SQUARED_RUNESTONE_BRICK_STAIRS);
        // Polished Runestone
        BlockStateModelGenerator.BlockTexturePool polishedRunestonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_RUNESTONE);
        polishedRunestonePool.slab(ModBlocks.POLISHED_RUNESTONE_SLAB);
        polishedRunestonePool.stairs(ModBlocks.POLISHED_RUNESTONE_STAIRS);
        // Patterned Runestone
        BlockStateModelGenerator.BlockTexturePool patternedRunestonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PATTERNED_RUNESTONE);
        patternedRunestonePool.slab(ModBlocks.PATTERNED_RUNESTONE_SLAB);
        patternedRunestonePool.stairs(ModBlocks.PATTERNED_RUNESTONE_STAIRS);
        // Other Runestone Blocks
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_RUNESTONE, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_RUNESTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MORTISED_RUNESTONE_BRICKS);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.RUNESTONE_PILLAR, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);

        // Polished Dripstone
        BlockStateModelGenerator.BlockTexturePool polishedDripstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_DRIPSTONE);
        polishedDripstonePool.slab(ModBlocks.POLISHED_DRIPSTONE_SLAB);
        polishedDripstonePool.stairs(ModBlocks.POLISHED_DRIPSTONE_STAIRS);
        // Dripstone Bricks
        BlockStateModelGenerator.BlockTexturePool dripstoneBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DRIPSTONE_BRICKS);
        dripstoneBricksPool.slab(ModBlocks.DRIPSTONE_BRICK_SLAB);
        dripstoneBricksPool.stairs(ModBlocks.DRIPSTONE_BRICK_STAIRS);
        // Other Dripstone Blocks
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_DRIPSTONE);

        // Stone Quartz
        BlockStateModelGenerator.BlockTexturePool stoneQuartzPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STONE_QUARTZ);
        stoneQuartzPool.slab(ModBlocks.STONE_QUARTZ_SLAB);
        stoneQuartzPool.stairs(ModBlocks.STONE_QUARTZ_STAIRS);
        // Stone Quartz Bricks
        BlockStateModelGenerator.BlockTexturePool stoneQuartzBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STONE_QUARTZ_BRICKS);
        stoneQuartzBricksPool.slab(ModBlocks.STONE_QUARTZ_BRICK_SLAB);
        stoneQuartzBricksPool.stairs(ModBlocks.STONE_QUARTZ_BRICK_STAIRS);
        // Other Stone Quartz Blocks
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_STONE_QUARTZ, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_STONE_QUARTZ_BRICKS);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.STONE_QUARTZ_PILLAR, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);

        // Burnt Pumpkin
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BURNT_PUMPKIN);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
