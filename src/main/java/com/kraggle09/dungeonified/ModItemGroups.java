package com.kraggle09.dungeonified;

import com.kraggle09.dungeonified.blocks.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup DUNGEONIFIED_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Dungeonified.MOD_ID, "dungeonified_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.RUNESTONE_BRICKS))
                    .displayName(Text.translatable("itemgroup.dungeonified.dungeonified_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BURNT_PUMPKIN);
                        // Base Runestone
                        entries.add(ModBlocks.POLISHED_RUNESTONE);
                        entries.add(ModBlocks.POLISHED_RUNESTONE_STAIRS);
                        entries.add(ModBlocks.POLISHED_RUNESTONE_SLAB);
                        entries.add(ModBlocks.PATTERNED_RUNESTONE);
                        entries.add(ModBlocks.PATTERNED_RUNESTONE_STAIRS);
                        entries.add(ModBlocks.PATTERNED_RUNESTONE_SLAB);
                        entries.add(ModBlocks.CHISELED_RUNESTONE);
                        entries.add(ModBlocks.RUNESTONE_BRICKS);
                        entries.add(ModBlocks.RUNESTONE_BRICK_STAIRS);
                        entries.add(ModBlocks.RUNESTONE_BRICK_SLAB);
                        entries.add(ModBlocks.SQUARED_RUNESTONE_BRICKS);
                        entries.add(ModBlocks.SQUARED_RUNESTONE_BRICK_STAIRS);
                        entries.add(ModBlocks.SQUARED_RUNESTONE_BRICK_SLAB);
                        entries.add(ModBlocks.CHISELED_RUNESTONE_BRICKS);
                        entries.add(ModBlocks.MORTISED_RUNESTONE_BRICKS);
                        entries.add(ModBlocks.RUNESTONE_PILLAR);
                        entries.add(ModBlocks.POLISHED_DRIPSTONE);
                        entries.add(ModBlocks.POLISHED_DRIPSTONE_STAIRS);
                        entries.add(ModBlocks.POLISHED_DRIPSTONE_SLAB);
                        entries.add(ModBlocks.DRIPSTONE_BRICKS);
                        entries.add(ModBlocks.DRIPSTONE_BRICK_STAIRS);
                        entries.add(ModBlocks.DRIPSTONE_BRICK_SLAB);
                        entries.add(ModBlocks.CHISELED_DRIPSTONE);
                        entries.add(ModBlocks.STONE_QUARTZ);
                        entries.add(ModBlocks.STONE_QUARTZ_SLAB);
                        entries.add(ModBlocks.STONE_QUARTZ_STAIRS);
                        entries.add(ModBlocks.CHISELED_STONE_QUARTZ);
                        entries.add(ModBlocks.STONE_QUARTZ_BRICKS);
                        entries.add(ModBlocks.STONE_QUARTZ_BRICK_STAIRS);
                        entries.add(ModBlocks.STONE_QUARTZ_BRICK_SLAB);
                        entries.add(ModBlocks.CHISELED_STONE_QUARTZ_BRICKS);
                        entries.add(ModBlocks.STONE_QUARTZ_PILLAR);
                    })
                    .build());

    public static void registerItemsGroups() {
        Dungeonified.LOGGER.info("Registering Item Groups");
    }
}
