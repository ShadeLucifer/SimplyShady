package calamitykage.terraponbta73;

import calamitykage.terraponbta73.blocks.TerraponBTA73Blocks;
import calamitykage.terraponbta73.dim.WorldTypeTerrapon;
import net.minecraft.core.world.Dimension;
import sunsetsatellite.catalyst.core.util.DataInitializer;

import static calamitykage.terraponbta73.item.TerraponBTA73Items.config;
import static sunsetsatellite.signalindustries.SignalIndustries.langKey;
import static sunsetsatellite.signalindustries.SignalIndustries.LOGGER;

public class TerraponDimension extends DataInitializer {

public static Dimension TERRAPON;
	@Override
	public void init() {
		if(initialized) return;
		LOGGER.info("Initializing dimensions...");

		TERRAPON = new Dimension(langKey("terrapon"),Dimension.OVERWORLD,1, TerraponBTA73Blocks.terraponPortal, TERRAPON.defaultWorldType);
		Dimension.registerDimension(config.getInt("Other.terraponDimId"), TERRAPON);

		setInitialized(true);
	}
}
