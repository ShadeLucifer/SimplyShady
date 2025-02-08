package calamitykage.terraponbta.plugins;

import calamitykage.terraponbta.blocks.TerraponBTABlocks;
import useless.terrainapi.api.TerrainAPI;
import useless.terrainapi.generation.nether.api.ChunkDecoratorNetherAPI;
import useless.terrainapi.generation.overworld.OverworldConfig;
import useless.terrainapi.generation.overworld.api.ChunkDecoratorOverworldAPI;

import static calamitykage.terraponbta.TerraponBTA.MOD_ID;

public class TerrainApiPlugin implements TerrainAPI {
	@Override
	public String getModID() {
		return MOD_ID;
	}

	public static final OverworldConfig overworldConfig = ChunkDecoratorOverworldAPI.overworldConfig;

	@Override
	public void onInitialize() {

		ChunkDecoratorOverworldAPI.oreFeatures.addManagedOreFeature(getModID(), TerraponBTABlocks.seidriliumOreStone, 4, 1, 0.0f, 12/256f, true);

		ChunkDecoratorNetherAPI.oreFeatures.addManagedOreFeature(getModID(), TerraponBTABlocks.netherSeidriliumOree, 4, 2, 32/128f, 128/128f, false);

		ChunkDecoratorOverworldAPI.oreFeatures.addManagedOreFeature(getModID(), TerraponBTABlocks.einvadrilOreStone, 4, 1, 0.0f, 12/256f, true);

		ChunkDecoratorOverworldAPI.oreFeatures.addManagedOreFeature(getModID(), TerraponBTABlocks.hlifintiteOreStone, 4, 1, 0.0f, 12/256f, true);

		ChunkDecoratorNetherAPI.oreFeatures.addManagedOreFeature(getModID(), TerraponBTABlocks.sollogiumOree, 4, 1, 0.0f, 12/128f, false);

		ChunkDecoratorOverworldAPI.oreFeatures.addManagedOreFeature(getModID(), TerraponBTABlocks.framiumOreStone, 4, 1, 0.0f, 12/256f, true);





	}
}
