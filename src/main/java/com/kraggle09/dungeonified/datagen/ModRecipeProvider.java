package com.kraggle09.dungeonified.datagen;

import com.kraggle09.dungeonified.blocks.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.CookingRecipeSerializer;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.SmeltingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        CookingRecipeJsonBuilder.create(
                Ingredient.ofItems(Items.PUMPKIN),
                RecipeCategory.DECORATIONS,
                ModBlocks.BURNT_PUMPKIN,
                0.1f,
                200,
                CookingRecipeSerializer.SMELTING,
                SmeltingRecipe::new
        )
                .criterion("has_pumpkin", InventoryChangedCriterion.Conditions.items(Items.PUMPKIN))
                .offerTo(recipeExporter, "burnt_pumpkin_from_smelting");
        // 4X4 BLOCKS
        // Runestone
        create4x4Recipe(recipeExporter, ModBlocks.RUNESTONE, ModBlocks.POLISHED_RUNESTONE);
        create4x4Recipe(recipeExporter, ModBlocks.POLISHED_RUNESTONE, ModBlocks.RUNESTONE_BRICKS);
        create4x4Recipe(recipeExporter, ModBlocks.RUNESTONE_BRICKS, ModBlocks.SQUARED_RUNESTONE_BRICKS);
        // Dripstone
        create4x4Recipe(recipeExporter, Blocks.DRIPSTONE_BLOCK, ModBlocks.POLISHED_DRIPSTONE);
        create4x4Recipe(recipeExporter, ModBlocks.POLISHED_DRIPSTONE, ModBlocks.DRIPSTONE_BRICKS);
        // Stone Quartz
        create4x4Recipe(recipeExporter, ModBlocks.STONE_QUARTZ, ModBlocks.STONE_QUARTZ_BRICKS);
        // STAIRS/SLABS/WALLS
        // Runestone
        createStairsRecipe(recipeExporter, ModBlocks.RUNESTONE, ModBlocks.RUNESTONE_STAIRS);
        createSlabRecipe(recipeExporter, ModBlocks.RUNESTONE, ModBlocks.RUNESTONE_SLAB);
        createWallRecipe(recipeExporter, ModBlocks.RUNESTONE, ModBlocks.RUNESTONE_WALL);
        createStairsRecipe(recipeExporter, ModBlocks.RUNESTONE_BRICKS, ModBlocks.RUNESTONE_BRICK_STAIRS);
        createSlabRecipe(recipeExporter, ModBlocks.RUNESTONE_BRICKS, ModBlocks.RUNESTONE_BRICK_SLAB);
        createWallRecipe(recipeExporter, ModBlocks.RUNESTONE_BRICKS, ModBlocks.RUNESTONE_BRICK_WALL);
        createStairsRecipe(recipeExporter, ModBlocks.SQUARED_RUNESTONE_BRICKS, ModBlocks.SQUARED_RUNESTONE_BRICK_STAIRS);
        createSlabRecipe(recipeExporter, ModBlocks.SQUARED_RUNESTONE_BRICKS, ModBlocks.SQUARED_RUNESTONE_BRICK_SLAB);
        createWallRecipe(recipeExporter, ModBlocks.SQUARED_RUNESTONE_BRICKS, ModBlocks.SQUARED_RUNESTONE_BRICK_WALL);
        createStairsRecipe(recipeExporter, ModBlocks.POLISHED_RUNESTONE, ModBlocks.POLISHED_RUNESTONE_STAIRS);
        createSlabRecipe(recipeExporter, ModBlocks.POLISHED_RUNESTONE, ModBlocks.POLISHED_RUNESTONE_SLAB);
        createWallRecipe(recipeExporter, ModBlocks.POLISHED_RUNESTONE, ModBlocks.POLISHED_RUNESTONE_WALL);
        createStairsRecipe(recipeExporter, ModBlocks.PATTERNED_RUNESTONE, ModBlocks.PATTERNED_RUNESTONE_STAIRS);
        createSlabRecipe(recipeExporter, ModBlocks.PATTERNED_RUNESTONE, ModBlocks.PATTERNED_RUNESTONE_SLAB);
        createWallRecipe(recipeExporter, ModBlocks.PATTERNED_RUNESTONE, ModBlocks.PATTERNED_RUNESTONE_WALL);
        // Dripstone
        createStairsRecipe(recipeExporter, ModBlocks.POLISHED_DRIPSTONE, ModBlocks.POLISHED_DRIPSTONE_STAIRS);
        createSlabRecipe(recipeExporter, ModBlocks.POLISHED_DRIPSTONE, ModBlocks.POLISHED_DRIPSTONE_SLAB);
        createWallRecipe(recipeExporter, ModBlocks.POLISHED_DRIPSTONE, ModBlocks.POLISHED_DRIPSTONE_WALL);
        createStairsRecipe(recipeExporter, ModBlocks.DRIPSTONE_BRICKS, ModBlocks.DRIPSTONE_BRICK_STAIRS);
        createSlabRecipe(recipeExporter, ModBlocks.DRIPSTONE_BRICKS, ModBlocks.DRIPSTONE_BRICK_SLAB);
        createWallRecipe(recipeExporter, ModBlocks.DRIPSTONE_BRICKS, ModBlocks.DRIPSTONE_BRICK_WALL);
        // Stone Quartz
        createStairsRecipe(recipeExporter, ModBlocks.STONE_QUARTZ, ModBlocks.STONE_QUARTZ_STAIRS);
        createSlabRecipe(recipeExporter, ModBlocks.STONE_QUARTZ, ModBlocks.STONE_QUARTZ_SLAB);
        createWallRecipe(recipeExporter, ModBlocks.STONE_QUARTZ, ModBlocks.STONE_QUARTZ_WALL);
        createStairsRecipe(recipeExporter, ModBlocks.STONE_QUARTZ_BRICKS, ModBlocks.STONE_QUARTZ_BRICK_STAIRS);
        createSlabRecipe(recipeExporter, ModBlocks.STONE_QUARTZ_BRICKS, ModBlocks.STONE_QUARTZ_BRICK_SLAB);
        createWallRecipe(recipeExporter, ModBlocks.STONE_QUARTZ_BRICKS, ModBlocks.STONE_QUARTZ_BRICK_WALL);

        // CHISELED BLOCKS
        createChiseledRecipe(recipeExporter, ModBlocks.RUNESTONE_BRICK_SLAB, ModBlocks.CHISELED_RUNESTONE_BRICKS);
        createChiseledRecipe(recipeExporter, ModBlocks.POLISHED_RUNESTONE_SLAB, ModBlocks.CHISELED_RUNESTONE);
        createChiseledRecipe(recipeExporter, ModBlocks.POLISHED_DRIPSTONE_SLAB, ModBlocks.CHISELED_DRIPSTONE);
        createChiseledRecipe(recipeExporter, ModBlocks.STONE_QUARTZ_SLAB, ModBlocks.CHISELED_STONE_QUARTZ);
        createChiseledRecipe(recipeExporter, ModBlocks.STONE_QUARTZ_BRICK_SLAB, ModBlocks.CHISELED_STONE_QUARTZ_BRICKS);

        // PILLARS
        createPillarRecipe(recipeExporter, ModBlocks.POLISHED_RUNESTONE, ModBlocks.RUNESTONE_PILLAR);
        createPillarRecipe(recipeExporter, ModBlocks.STONE_QUARTZ, ModBlocks.STONE_QUARTZ_PILLAR);

        // MISC
        createPatternedRecipe(recipeExporter, ModBlocks.POLISHED_RUNESTONE, ModBlocks.POLISHED_RUNESTONE_SLAB, ModBlocks.PATTERNED_RUNESTONE);
        createMortisedRecipe(recipeExporter, ModBlocks.RUNESTONE_BRICKS, ModBlocks.MORTISED_RUNESTONE_BRICKS);
    }

    public void createStairsRecipe(RecipeExporter recipeExporter, Block input_block, Block output_block) {
        FabricRecipeProvider.createStairsRecipe(output_block, Ingredient.ofItems(input_block)).criterion("has_"+input_block.getTranslationKey(), InventoryChangedCriterion.Conditions.items(input_block)).offerTo(recipeExporter);
    }
    public void createSlabRecipe(RecipeExporter recipeExporter, Block input_block, Block output_block) {
        FabricRecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, output_block, Ingredient.ofItems(input_block)).criterion("has_"+input_block.getTranslationKey(), InventoryChangedCriterion.Conditions.items(input_block)).offerTo(recipeExporter);
    }
    public void createWallRecipe(RecipeExporter recipeExporter, Block input_block, Block output_block) {
        FabricRecipeProvider.getWallRecipe(RecipeCategory.BUILDING_BLOCKS, output_block, Ingredient.ofItems(input_block)).criterion("has_"+input_block.getTranslationKey(), InventoryChangedCriterion.Conditions.items(input_block)).offerTo(recipeExporter);
    }
    public void createChiseledRecipe(RecipeExporter recipeExporter, Block input_block, Block output_block) {
        FabricRecipeProvider.createChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, output_block, Ingredient.ofItems(input_block)).criterion("has_"+input_block.getTranslationKey(), InventoryChangedCriterion.Conditions.items(input_block)).offerTo(recipeExporter);
    }
    public void create4x4Recipe(RecipeExporter recipeExporter, Block input_block, Block output_block) {
        FabricRecipeProvider.createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, output_block, Ingredient.ofItems(input_block)).criterion("has_"+input_block.getTranslationKey(), InventoryChangedCriterion.Conditions.items(input_block)).offerTo(recipeExporter);
    }
    public void createPillarRecipe(RecipeExporter recipeExporter, Block input_block, Block output_block) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output_block)
                .pattern("#")
                .pattern("#")
                .input('#', input_block)
                .criterion("has_"+input_block.getTranslationKey(), InventoryChangedCriterion.Conditions.items(input_block))
                .offerTo(recipeExporter);
    }
    public void createPatternedRecipe(RecipeExporter recipeExporter, Block input_block_main, Block input_block_slab, Block output_block) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output_block)
                .pattern("_#_")
                .pattern("###")
                .pattern("_#_")
                .input('#', input_block_main)
                .input('_', input_block_slab)
                .criterion("has_"+input_block_main.getTranslationKey(), InventoryChangedCriterion.Conditions.items(input_block_main))
                .offerTo(recipeExporter);
    }
    public void createMortisedRecipe(RecipeExporter recipeExporter, Block input_block, Block output_block) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output_block)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .input('#', input_block)
                .criterion("has_"+input_block.getTranslationKey(), InventoryChangedCriterion.Conditions.items(input_block))
                .offerTo(recipeExporter);
    }
}
