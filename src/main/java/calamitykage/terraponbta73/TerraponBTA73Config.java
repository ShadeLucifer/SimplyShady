package calamitykage.terraponbta73;

import turniplabs.halplibe.util.TomlConfigHandler;
import turniplabs.halplibe.util.toml.Toml;


public class TerraponBTA73Config {
	private static final Toml TOML = new Toml("Terrapon's TOML Config");
	public static final TomlConfigHandler CFG;

	static {
		TOML.addCategory("IDs")
			.addEntry("startingItemID", "Default: 25400", 25400)
			.addEntry("startingBlockID", "Default: 4700", 4700);

		CFG = new TomlConfigHandler(TerraponBTA73.MOD_ID, TOML);
	}
}
