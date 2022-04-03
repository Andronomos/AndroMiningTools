package andronomos.androminingtools.data.client;

import andronomos.androminingtools.AndroMiningTools;
import andronomos.androminingtools.registry.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static andronomos.androminingtools.AndroMiningTools.TAB_NAME;

public class ModLanguageProvider extends LanguageProvider {

	public ModLanguageProvider(DataGenerator gen, String locale) {
		super(gen, AndroMiningTools.MOD_ID, locale);
	}

	@Override
	protected void addTranslations() {
		add("itemGroup." + TAB_NAME, "Andro Mining Tools");

		//items
		add(ModItems.IRON_HAMMER.get(), "Iron Hammer");
		add(ModItems.GOLD_HAMMER.get(), "Gold Hammer");
		add(ModItems.DIAMOND_HAMMER.get(), "Diamond Hammer");
		add(ModItems.NETHERITE_HAMMER.get(), "Netherite Hammer");

		add(ModItems.IRON_EXCAVATOR.get(), "Iron Excavator");
		add(ModItems.GOLD_EXCAVATOR.get(), "Gold Excavator");
		add(ModItems.DIAMOND_EXCAVATOR.get(), "Diamond Excavator");
		add(ModItems.NETHERITE_EXCAVATOR.get(), "Netherite Excavator");

		//blocks
	}
}
