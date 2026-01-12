package com.kraggle09.dungeonified.datagen;

import com.kraggle09.dungeonified.Dungeonified;
import com.kraggle09.dungeonified.blocks.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

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
        getOrCreateTagBuilder(STONE_TYPES)
                .add(ModBlocks.RUNESTONE)
                .add(ModBlocks.RUNESTONE_STAIRS)
                .add(ModBlocks.RUNESTONE_SLAB)
                .add(ModBlocks.RUNESTONE_WALL)
                .add(ModBlocks.POLISHED_RUNESTONE)
                .add(ModBlocks.POLISHED_RUNESTONE_STAIRS)
                .add(ModBlocks.POLISHED_RUNESTONE_SLAB)
                .add(ModBlocks.POLISHED_RUNESTONE_WALL)
                .add(ModBlocks.PATTERNED_RUNESTONE)
                .add(ModBlocks.PATTERNED_RUNESTONE_STAIRS)
                .add(ModBlocks.PATTERNED_RUNESTONE_SLAB)
                .add(ModBlocks.PATTERNED_RUNESTONE_WALL)
                .add(ModBlocks.CHISELED_RUNESTONE)
                .add(ModBlocks.RUNESTONE_BRICKS)
                .add(ModBlocks.RUNESTONE_BRICK_STAIRS)
                .add(ModBlocks.RUNESTONE_BRICK_SLAB)
                .add(ModBlocks.RUNESTONE_BRICK_WALL)
                .add(ModBlocks.SQUARED_RUNESTONE_BRICKS)
                .add(ModBlocks.SQUARED_RUNESTONE_BRICK_STAIRS)
                .add(ModBlocks.SQUARED_RUNESTONE_BRICK_SLAB)
                .add(ModBlocks.SQUARED_RUNESTONE_BRICK_WALL)
                .add(ModBlocks.CHISELED_RUNESTONE_BRICKS)
                .add(ModBlocks.MORTISED_RUNESTONE_BRICKS)
                .add(ModBlocks.RUNESTONE_PILLAR)
                .add(ModBlocks.POLISHED_DRIPSTONE)
                .add(ModBlocks.POLISHED_DRIPSTONE_STAIRS)
                .add(ModBlocks.POLISHED_DRIPSTONE_SLAB)
                .add(ModBlocks.POLISHED_DRIPSTONE_WALL)
                .add(ModBlocks.DRIPSTONE_BRICKS)
                .add(ModBlocks.DRIPSTONE_BRICK_STAIRS)
                .add(ModBlocks.DRIPSTONE_BRICK_SLAB)
                .add(ModBlocks.DRIPSTONE_BRICK_WALL)
                .add(ModBlocks.CHISELED_DRIPSTONE)
                .add(ModBlocks.STONE_QUARTZ)
                .add(ModBlocks.STONE_QUARTZ_SLAB)
                .add(ModBlocks.STONE_QUARTZ_STAIRS)
                .add(ModBlocks.STONE_QUARTZ_WALL)
                .add(ModBlocks.CHISELED_STONE_QUARTZ)
                .add(ModBlocks.STONE_QUARTZ_BRICKS)
                .add(ModBlocks.STONE_QUARTZ_BRICK_STAIRS)
                .add(ModBlocks.STONE_QUARTZ_BRICK_SLAB)
                .add(ModBlocks.STONE_QUARTZ_BRICK_WALL)
                .add(ModBlocks.CHISELED_STONE_QUARTZ_BRICKS)
                .add(ModBlocks.STONE_QUARTZ_PILLAR);
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .addTag(STONE_TYPES);
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.BURNT_PUMPKIN);
    }

    public static final TagKey<Block> STONE_TYPES = TagKey.of(RegistryKeys.BLOCK, Identifier.of(Dungeonified.MOD_ID, "stone_types"));
}
