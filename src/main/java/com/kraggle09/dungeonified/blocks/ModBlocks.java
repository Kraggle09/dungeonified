package com.kraggle09.dungeonified.blocks;

import com.kraggle09.dungeonified.Dungeonified;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block BURNT_PUMPKIN = registerBlock("burnt_pumpkin",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(1f)));

    public static final Block RUNESTONE = registerBlock("runestone",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(2f)));
    public static final Block RUNESTONE_STAIRS = registerBlock("runestone_stairs", createStairsBlock(RUNESTONE));
    public static final Block RUNESTONE_SLAB = registerBlock("runestone_slab", createSlabBlock(RUNESTONE));
    public static final Block RUNESTONE_WALL = registerBlock("runestone_wall", createWallBlock(RUNESTONE));
    public static final Block RUNESTONE_BRICKS = registerBlock("runestone_bricks",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(2f).requiresTool()));
    public static final Block RUNESTONE_BRICK_SLAB = registerBlock("runestone_brick_slab", createSlabBlock(RUNESTONE_BRICKS));
    public static final Block RUNESTONE_BRICK_STAIRS = registerBlock("runestone_brick_stairs", createStairsBlock(RUNESTONE_BRICKS));
    public static final Block RUNESTONE_BRICK_WALL = registerBlock("runestone_brick_wall", createWallBlock(RUNESTONE_BRICKS));
    public static final Block CHISELED_RUNESTONE_BRICKS = registerBlock("chiseled_runestone_bricks",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(2f).requiresTool()));
    public static final Block MORTISED_RUNESTONE_BRICKS = registerBlock("mortised_runestone_bricks",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(2f).requiresTool()));
    public static final Block RUNESTONE_PILLAR = registerBlock("runestone_pillar",
            new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(2f).requiresTool()));
    public static final Block SQUARED_RUNESTONE_BRICKS = registerBlock("squared_runestone_bricks",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(2f).requiresTool()));
    public static final Block SQUARED_RUNESTONE_BRICK_SLAB = registerBlock("squared_runestone_brick_slab", createSlabBlock(SQUARED_RUNESTONE_BRICKS));
    public static final Block SQUARED_RUNESTONE_BRICK_STAIRS = registerBlock("squared_runestone_brick_stairs", createStairsBlock(SQUARED_RUNESTONE_BRICKS));
    public static final Block SQUARED_RUNESTONE_BRICK_WALL = registerBlock("squared_runestone_brick_wall", createWallBlock(SQUARED_RUNESTONE_BRICKS));
    public static final Block CHISELED_RUNESTONE = registerBlock("chiseled_runestone",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(2f).requiresTool()));
    public static final Block POLISHED_RUNESTONE = registerBlock("polished_runestone",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(2f).requiresTool()));
    public static final Block POLISHED_RUNESTONE_SLAB = registerBlock("polished_runestone_slab", createSlabBlock(POLISHED_RUNESTONE));
    public static final Block POLISHED_RUNESTONE_STAIRS = registerBlock("polished_runestone_stairs", createStairsBlock(POLISHED_RUNESTONE));
    public static final Block POLISHED_RUNESTONE_WALL = registerBlock("polished_runestone_wall", createWallBlock(POLISHED_RUNESTONE));
    public static final Block PATTERNED_RUNESTONE = registerBlock("patterned_runestone",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(2f).requiresTool()));
    public static final Block PATTERNED_RUNESTONE_SLAB = registerBlock("patterned_runestone_slab", createSlabBlock(PATTERNED_RUNESTONE));
    public static final Block PATTERNED_RUNESTONE_STAIRS = registerBlock("patterned_runestone_stairs", createStairsBlock(PATTERNED_RUNESTONE));
    public static final Block PATTERNED_RUNESTONE_WALL = registerBlock("patterned_runestone_wall", createWallBlock(PATTERNED_RUNESTONE));

    public static final Block POLISHED_DRIPSTONE = registerBlock("polished_dripstone",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));
    public static final Block POLISHED_DRIPSTONE_SLAB = registerBlock("polished_dripstone_slab", createSlabBlock(POLISHED_DRIPSTONE));
    public static final Block POLISHED_DRIPSTONE_STAIRS = registerBlock("polished_dripstone_stairs", createStairsBlock(POLISHED_DRIPSTONE));
    public static final Block POLISHED_DRIPSTONE_WALL = registerBlock("polished_dripstone_wall", createWallBlock(POLISHED_DRIPSTONE));
    public static final Block DRIPSTONE_BRICKS = registerBlock("dripstone_bricks",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));
    public static final Block DRIPSTONE_BRICK_SLAB = registerBlock("dripstone_brick_slab", createSlabBlock(DRIPSTONE_BRICKS));
    public static final Block DRIPSTONE_BRICK_STAIRS = registerBlock("dripstone_brick_stairs", createStairsBlock(DRIPSTONE_BRICKS));
    public static final Block DRIPSTONE_BRICK_WALL = registerBlock("dripstone_brick_wall", createWallBlock(DRIPSTONE_BRICKS));
    public static final Block CHISELED_DRIPSTONE = registerBlock("chiseled_dripstone",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));

    public static final Block STONE_QUARTZ = registerBlock("stone_quartz",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.2f).requiresTool()));
    public static final Block STONE_QUARTZ_SLAB = registerBlock("stone_quartz_slab", createSlabBlock(STONE_QUARTZ));
    public static final Block STONE_QUARTZ_STAIRS = registerBlock("stone_quartz_stairs", createStairsBlock(STONE_QUARTZ));
    public static final Block STONE_QUARTZ_WALL = registerBlock("stone_quartz_wall", createWallBlock(STONE_QUARTZ));
    public static final Block STONE_QUARTZ_BRICKS = registerBlock("stone_quartz_bricks",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.2f).requiresTool()));
    public static final Block STONE_QUARTZ_BRICK_SLAB = registerBlock("stone_quartz_brick_slab", createSlabBlock(STONE_QUARTZ_BRICKS));
    public static final Block STONE_QUARTZ_BRICK_STAIRS = registerBlock("stone_quartz_brick_stairs", createStairsBlock(STONE_QUARTZ_BRICKS));
    public static final Block STONE_QUARTZ_BRICK_WALL = registerBlock("stone_quartz_brick_wall", createWallBlock(STONE_QUARTZ_BRICKS));
    public static final Block CHISELED_STONE_QUARTZ_BRICKS = registerBlock("chiseled_stone_quartz_bricks",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.2f).requiresTool()));
    public static final Block CHISELED_STONE_QUARTZ = registerBlock("chiseled_stone_quartz",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.2f).requiresTool()));
    public static final Block STONE_QUARTZ_PILLAR = registerBlock("stone_quartz_pillar",
            new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.2f).requiresTool()));

    private static Block createStairsBlock(Block base) {
        return new StairsBlock(base.getDefaultState(), AbstractBlock.Settings.copy(base));
    }

    private static Block createSlabBlock(Block base) {
        return new SlabBlock(AbstractBlock.Settings.copy(base));
    }

    private static Block createWallBlock(Block base) {
        return new WallBlock(AbstractBlock.Settings.copy(base).solid());
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Dungeonified.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Dungeonified.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Dungeonified.LOGGER.info("[DUNGEONIFIED] Registering Blocks");
    }
}