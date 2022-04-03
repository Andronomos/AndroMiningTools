package andronomos.androminingtools;

import andronomos.androminingtools.registry.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class AndroMiningToolsItemGroup extends CreativeModeTab
{
    public AndroMiningToolsItemGroup(String name) {
        super(name);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(
                ModItems.DIAMOND_EXCAVATOR.get()
        );
    }
}
