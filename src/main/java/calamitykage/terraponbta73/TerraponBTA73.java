package calamitykage.terraponbta73;
import calamitykage.terraponbta73.blocks.TerraponBTA73Blocks;
import calamitykage.terraponbta73.dim.gen.TerraponBiome;
import calamitykage.terraponbta73.dim.WorldTypeTerrapon;
import net.minecraft.core.world.Dimension;
import net.minecraft.core.world.type.WorldType;
import net.minecraft.core.world.type.WorldTypes;
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
	public static Dimension terraponDimension;
	public static WorldType terraponWorld;
	public static int terraponWorldID;

	static {
		final Properties properties = new Properties();
		properties.setProperty("fortune_amount","8");
		properties.setProperty("looting_amount","8");
		properties.setProperty("terrapon_world_id", "4");
		final ConfigHandler config = new ConfigHandler(MOD_ID,properties);
		FORTUNE_AMOUNT = config.getInt("fortune_amount");
		LOOTING_AMOUNT = config.getInt("looting_amount");
		terraponWorldID = config.getInt("terrapon_world_id");
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
		TerraponBiome.initializeBiomes();
		terraponWorld = WorldTypes.register("terraponbta73:terrapon", new WorldTypeTerrapon(WorldTypeTerrapon.defaultProperties("terraponbta73.worldtype.terrapon")));
		terraponDimension = new Dimension("terraponbta73.dimension.terrapon", Dimension.OVERWORLD, 1.0f, TerraponBTA73Blocks.terraponPortal, terraponWorld);
		Dimension.registerDimension(terraponWorldID, terraponDimension);
	}

}

