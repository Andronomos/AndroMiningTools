package andronomos.androminingtools.data;

import andronomos.androminingtools.AndroMiningTools;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, AndroMiningTools.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        //tag(BlockTags.MINEABLE_WITH_PICKAXE)
                //.add(ModBlocks.MACHINE_CASING.get())

        //tag(BlockTags.NEEDS_DIAMOND_TOOL)
        //        .add(ModBlocks.ADVANCED_SPAWNER.get());
    }

    @Override
    public String getName() {
        return "Mob Tools Tags";
    }
}
