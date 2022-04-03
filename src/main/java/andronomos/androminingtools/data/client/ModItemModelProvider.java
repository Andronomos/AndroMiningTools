package andronomos.androminingtools.data.client;

import andronomos.androminingtools.AndroMiningTools;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, AndroMiningTools.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        builder(itemGenerated, "iron_hammer");
        builder(itemGenerated, "gold_hammer");
        builder(itemGenerated, "diamond_hammer");
        builder(itemGenerated, "netherite_hammer");

        builder(itemGenerated, "iron_excavator");
        builder(itemGenerated, "gold_excavator");
        builder(itemGenerated, "diamond_excavator");
        builder(itemGenerated, "netherite_excavator");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
