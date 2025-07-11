package calamitykage.terraponbta73.dim;

import calamitykage.terraponbta73.blocks.TerraponBTA73Blocks;
import calamitykage.terraponbta73.dim.gen.TerraponBiome;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.World;
import net.minecraft.core.world.biome.provider.BiomeProvider;
import net.minecraft.core.world.biome.provider.BiomeProviderSingleBiome;
import net.minecraft.core.world.config.season.SeasonConfig;
import net.minecraft.core.world.generate.chunk.ChunkGenerator;
import net.minecraft.core.world.season.Seasons;
import net.minecraft.core.world.type.WorldType;
import net.minecraft.core.world.type.overworld.WorldTypeOverworld;


public class WorldTypeTerrapon extends WorldTypeOverworld {

	public WorldTypeTerrapon(WorldType.Properties properties) {
		super(properties);
	}

	public static WorldType.Properties defaultProperties(String translationKey) {
		return Properties.of(translationKey).brightnessRamp(createLightRamp()).seasonConfig(SeasonConfig.builder()
			.withSeasonInCycle(Seasons.OVERWORLD_SPRING, 365)
			.withSeasonInCycle(Seasons.OVERWORLD_SUMMER, 365)
			.withSeasonInCycle(Seasons.OVERWORLD_FALL, 365)
			.withSeasonInCycle(Seasons.OVERWORLD_WINTER, 365).build()).oceanBlock(TerraponBTA73Blocks.manawater)
			.fillerBlock(Blocks.STONE).allowRespawn();

	}


	@Override
	public int getOceanBlockId() {
		return TerraponBTA73Blocks.manawater.id();
	}

	@Override
	public int getFillerBlockId() {
		return TerraponBTA73Blocks.terrastone.id();
	}

	@Override
	public int getMinY() {
		return 0;
	}

	@Override
	public int getMaxY() {
		return 127;
	}

	@Override
	public int getOceanY() {
		return 64;
	}

	@Override
	public BiomeProvider createBiomeProvider(World world) {
		return new BiomeProviderSingleBiome(TerraponBiome.TERRAPON_MEADOW, 32.0, 32.0, 1.0);
	}

	@Override
	public ChunkGenerator createChunkGenerator(World world) {
		return new ChunkGeneratorTerrapon(world);
	}


	@Override
	public boolean isValidSpawn(World world, int x, int y, int z) {
		return true;
	}

	@Override
	public boolean mayRespawn() {
		return true;
	}
}
