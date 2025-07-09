package calamitykage.terraponbta73;
import calamitykage.terraponbta73.blocks.TerraponBTA73Blocks;
import calamitykage.terraponbta73.item.TerraponBTA73Items;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.util.*;

import java.util.Properties;

public class TerraponBTA73 implements ModInitializer, GameStartEntrypoint, ClientStartEntrypoint {
	public static final String MOD_ID = "terraponbta73";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static int FORTUNE_AMOUNT;
	public static int LOOTING_AMOUNT;
	static {
		final Properties properties = new Properties();
		properties.setProperty("fortune_amount","3");
		properties.setProperty("looting_amount","3");
		final ConfigHandler config = new ConfigHandler(MOD_ID,properties);
		FORTUNE_AMOUNT = config.getInt("fortune_amount");
		LOOTING_AMOUNT = config.getInt("looting_amount");
		config.updateConfig();
	}


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

