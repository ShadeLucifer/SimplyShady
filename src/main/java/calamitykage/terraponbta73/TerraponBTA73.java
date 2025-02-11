package calamitykage.terraponbta73;
import calamitykage.terraponbta73.blocks.TerraponBTA73Blocks;
import calamitykage.terraponbta73.item.TerraponBTA73Items;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.util.*;

public class TerraponBTA73 implements ModInitializer, GameStartEntrypoint, ClientStartEntrypoint {
	public static final String MOD_ID = "terraponbta73";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void beforeGameStart() {
		new TerraponBTA73Items();
		new Models();

	}

	@Override
	public void afterGameStart() {

	}


	@Override
	public void beforeClientStart() {

	}

	@Override
	public void afterClientStart() {

	}
	@Override
	public void onInitialize() {
		TerraponBTA73Blocks.initBlocks();
		TerraponBTA73Items.initializeArmorMaterials();
		TerraponBTA73Items.initializeToolMaterials();
		TerraponBTA73Items.initializeItems();
	}

}

