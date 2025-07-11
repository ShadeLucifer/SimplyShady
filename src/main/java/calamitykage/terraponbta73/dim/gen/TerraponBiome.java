package calamitykage.terraponbta73.dim.gen;

import calamitykage.terraponbta73.blocks.TerraponBTA73Blocks;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;

public class TerraponBiome extends Biomes {
	public static Biome TERRAPON_MEADOW = new BiomeTerraponMeadow("terrapon_meadow");

	public static void initializeBiomes() {
		Biomes.register("terraponbta73:biome.terrapon_meadow", TERRAPON_MEADOW.setFillerBlock(TerraponBTA73Blocks.terradirt.id()).setTopBlock(TerraponBTA73Blocks.terragrass.id())).getSkyColor(64.0f);
	}
}
