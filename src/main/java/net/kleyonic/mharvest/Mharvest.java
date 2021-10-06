package net.kleyonic.mharvest;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Mharvest implements ModInitializer {
	public static final Item NYCHTA = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Logger LOGGER = LogManager.getLogger("mharvest");

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("mharvest", "nychta"), NYCHTA);
		LOGGER.info("Hello Fabric world!");
	}
}
