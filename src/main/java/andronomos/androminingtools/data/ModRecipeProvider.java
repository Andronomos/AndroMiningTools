package andronomos.androminingtools.data;

import andronomos.androminingtools.registry.ModItems;
import net.minecraft.data.*;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Item;
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
        createHammerRecipe(ModItems.IRON_HAMMER.get(), Tags.Items.INGOTS_IRON, consumer);
        createHammerRecipe(ModItems.GOLD_HAMMER.get(), Tags.Items.INGOTS_GOLD, consumer);
        createHammerRecipe(ModItems.DIAMOND_HAMMER.get(), Tags.Items.GEMS_DIAMOND, consumer);
        createHammerRecipe(ModItems.NETHERITE_HAMMER.get(), Tags.Items.INGOTS_NETHERITE, consumer);

        /** Excavators **/
        createExcavatorRecipe(ModItems.IRON_EXCAVATOR.get(), Tags.Items.INGOTS_IRON, consumer);
        createExcavatorRecipe(ModItems.GOLD_EXCAVATOR.get(), Tags.Items.INGOTS_GOLD, consumer);
        createExcavatorRecipe(ModItems.DIAMOND_EXCAVATOR.get(), Tags.Items.GEMS_DIAMOND, consumer);
        createExcavatorRecipe(ModItems.NETHERITE_EXCAVATOR.get(), Tags.Items.INGOTS_NETHERITE, consumer);
    }

    private void createHammerRecipe(Item output, Tags.IOptionalNamedTag material, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(output)
                .pattern("xxx")
                .pattern("xsx")
                .pattern(" s ")
                .define('x', material)
                .define('s', Items.STICK)
                .group("hammers")
                .unlockedBy("has_item", has(material))
                .save(consumer);
    }

    private void createExcavatorRecipe(Item output, Tags.IOptionalNamedTag material, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(output)
                .pattern(" xx")
                .pattern(" sx")
                .pattern("s  ")
                .define('x', material)
                .define('s', Items.STICK)
                .group("hammers")
                .unlockedBy("has_item", has(material))
                .save(consumer);
    }
}