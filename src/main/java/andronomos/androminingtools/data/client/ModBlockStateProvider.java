package andronomos.androminingtools.data.client;

import andronomos.androminingtools.AndroMiningTools;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.*;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, AndroMiningTools.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

    }

    private void registerSimpleStateAndModel(Block block, String name) {
        simpleBlock(block);
        itemModels().withExistingParent(block.getRegistryName().getPath(), modLoc("block/" + name));
    }

    private void registerMachineStateAndModel(Block block, String top, String down, String side) {
        ModelFile model = models().cube(block.getRegistryName().getPath(),
                modLoc("block/" + down),
                modLoc("block/" + top),
                modLoc("block/" + side),
                modLoc("block/" + side),
                modLoc("block/" + side),
                modLoc("block/" + side));
        simpleBlock(block, model);
        itemModels().withExistingParent(block.getRegistryName().getPath(), modLoc("block/" + block.getRegistryName().getPath()));
    }

    //private void registerPadStateAndModel(Block block, String top) {
    //    ModelFile model = models().withExistingParent(block.getRegistryName().getPath(), modLoc("pad_base"))
    //            .texture("particle", modLoc("block/" + top))
    //            .texture("design", modLoc("block/" + top))
    //            .texture("pad", modLoc("block/machine_bottom"));
    //    simpleBlock(block, model);
    //    itemModels().withExistingParent(block.getRegistryName().getPath(), modLoc("block/" + block.getRegistryName().getPath()));
    //}
}