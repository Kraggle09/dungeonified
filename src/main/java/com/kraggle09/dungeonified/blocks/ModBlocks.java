package com.kraggle09.dungeonified.blocks;

import com.kraggle09.dungeonified.Dungeonified;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block BURNT_PUMPKIN = registerBlock("burnt_pumpkin",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD)));

    public static final Block RUNESTONE_BRICKS = registerBlock("runestone_bricks",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)));
    public static final Block CHISELED_RUNESTONE_BRICKS = registerBlock("chiseled_runestone_bricks",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)));
    public static final Block MORTISED_RUNESTONE_BRICKS = registerBlock("mortised_runestone_bricks",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)));
    public static final Block RUNESTONE_PILLAR = registerBlock("runestone_pillar",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)));
    public static final Block SQUARED_RUNESTONE_BRICKS = registerBlock("squared_runestone_bricks",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)));
    public static final Block CHISELED_RUNESTONE = registerBlock("chiseled_runestone",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_RUNESTONE = registerBlock("polished_runestone",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)));
    public static final Block PATTERNED_RUNESTONE = registerBlock("patterned_runestone",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Dungeonified.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Dungeonified.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Dungeonified.LOGGER.info("[DUNGEONIFIED] Registering Blocks...");
    }
}