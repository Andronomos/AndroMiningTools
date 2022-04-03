package andronomos.androminingtools;

import andronomos.androminingtools.event.HammerEvents;
import andronomos.androminingtools.registry.ModBlockEntities;
import andronomos.androminingtools.registry.ModBlocks;
import andronomos.androminingtools.registry.ModContainers;
import andronomos.androminingtools.registry.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(AndroMiningTools.MOD_ID)
public class AndroMiningTools {
	public static final String MOD_ID = "androminingtools";
	public static final String TAB_NAME = "androminingtools_group";
	public static final CreativeModeTab ANDROMININGTOOLS_TAB = new AndroMiningToolsItemGroup(TAB_NAME);
	public static final Logger LOGGER = LogManager.getLogger(AndroMiningTools.MOD_ID);

	public AndroMiningTools() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		ModBlocks.BLOCKS.register(modEventBus);
		ModItems.ITEMS.register(modEventBus);
		ModContainers.CONTAINERS.register(modEventBus);
		ModBlockEntities.BLOCK_ENTITIES.register(modEventBus);
		MinecraftForge.EVENT_BUS.register(this);
		MinecraftForge.EVENT_BUS.register(new HammerEvents());

		modEventBus.addListener(this::clientSetup);
	}

	private void clientSetup(final FMLClientSetupEvent event) {
		//event.enqueueWork(() -> {
		//
		//});
	}
}
