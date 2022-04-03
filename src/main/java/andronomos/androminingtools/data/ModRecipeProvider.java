package andronomos.androminingtools.data;

import andronomos.androminingtools.registry.ModItems;
import net.minecraft.data.*;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        super.buildCraftingRecipes(consumer);

        /** Hammers **/
        ShapedRecipeBuilder.shaped(ModItems.IRON_HAMMER.get())
                .pattern("xxx")
                .pattern("xsx")
                .pattern(" s ")
                .define('x', Tags.Items.INGOTS_IRON)
                .define('s', Items.STICK)
                .group("hammers")
                .unlockedBy("has_item", has(Items.IRON_INGOT))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.GOLD_HAMMER.get())
                .pattern("xxx")
                .pattern("xsx")
                .pattern(" s ")
                .define('x', Tags.Items.INGOTS_GOLD)
                .define('s', Items.STICK)
                .group("hammers")
                .unlockedBy("has_item", has(Items.GOLD_INGOT))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.DIAMOND_HAMMER.get())
                .pattern("xxx")
                .pattern("xsx")
                .pattern(" s ")
                .define('x', Tags.Items.GEMS_DIAMOND)
                .define('s', Items.STICK)
                .group("hammers")
                .unlockedBy("has_item", has(Items.DIAMOND))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.NETHERITE_HAMMER.get())
                .pattern("xxx")
                .pattern("xsx")
                .pattern(" s ")
                .define('x', Tags.Items.INGOTS_NETHERITE)
                .define('s', Items.STICK)
                .group("hammers")
                .unlockedBy("has_item", has(Items.NETHERITE_INGOT))
                .save(consumer);

        /** Excavators **/
        ShapedRecipeBuilder.shaped(ModItems.IRON_EXCAVATOR.get())
                .pattern("xxx")
                .pattern(" s ")
                .pattern(" s ")
                .define('x', Tags.Items.INGOTS_IRON)
                .define('s', Items.STICK)
                .group("hammers")
                .unlockedBy("has_item", has(Items.IRON_INGOT))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.GOLD_EXCAVATOR.get())
                .pattern("xxx")
                .pattern(" s ")
                .pattern(" s ")
                .define('x', Tags.Items.INGOTS_GOLD)
                .define('s', Items.STICK)
                .group("hammers")
                .unlockedBy("has_item", has(Items.GOLD_INGOT))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.DIAMOND_EXCAVATOR.get())
                .pattern("xxx")
                .pattern(" s ")
                .pattern(" s ")
                .define('x', Tags.Items.GEMS_DIAMOND)
                .define('s', Items.STICK)
                .group("hammers")
                .unlockedBy("has_item", has(Tags.Items.GEMS_DIAMOND))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.NETHERITE_EXCAVATOR.get())
                .pattern("xxx")
                .pattern(" s ")
                .pattern(" s ")
                .define('x', Tags.Items.INGOTS_NETHERITE)
                .define('s', Items.STICK)
                .group("hammers")
                .unlockedBy("has_item", has(Items.NETHERITE_INGOT))
                .save(consumer);
    }
}