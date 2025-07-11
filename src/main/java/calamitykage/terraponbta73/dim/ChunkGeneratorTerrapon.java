package calamitykage.terraponbta73.dim;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.World;
import net.minecraft.core.world.chunk.Chunk;
import net.minecraft.core.world.generate.CavesLargeFeature;
import net.minecraft.core.world.generate.LargeFeature;
import net.minecraft.core.world.generate.chunk.ChunkGenerator;
import net.minecraft.core.world.generate.chunk.ChunkGeneratorResult;
import net.minecraft.core.world.generate.chunk.perlin.ChunkGeneratorPerlin;
import net.minecraft.core.world.generate.chunk.perlin.SurfaceGenerator;
import net.minecraft.core.world.generate.chunk.perlin.overworld.ChunkGeneratorOverworld;
import net.minecraft.core.world.noise.CombinedPerlinNoise;
import net.minecraft.core.world.noise.PerlinNoise;

public class ChunkGeneratorTerrapon extends ChunkGeneratorPerlin {

	protected ChunkGeneratorTerrapon(World world) {
		super(world, new ChunkDecoratorTerrapon(world), new TerrainGeneratorTerrapon(world), new SurfaceGeneratorTerrapon(world), new LargeFeature[]{new CavesLargeFeature()});
	}
}
