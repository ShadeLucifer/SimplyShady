package calamitykage.terraponbta73.dim;

import calamitykage.terraponbta73.blocks.TerraponBTA73Blocks;
import net.minecraft.core.block.BlockLogicOreLapis;
import net.minecraft.core.block.BlockLogicSand;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.World;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;
import net.minecraft.core.world.chunk.Chunk;
import net.minecraft.core.world.generate.chunk.ChunkDecorator;
import net.minecraft.core.world.generate.feature.WorldFeature;
import net.minecraft.core.world.generate.feature.WorldFeatureLake;
import net.minecraft.core.world.generate.feature.WorldFeatureLiquid;
import net.minecraft.core.world.generate.feature.WorldFeatureOre;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeTall;
import net.minecraft.core.world.noise.PerlinNoise;

import java.util.Random;

public class ChunkDecoratorTerrapon implements ChunkDecorator {
	private final World world;
	private final PerlinNoise treeDensityNoise;
	private final int treeDensityOverride;

	protected ChunkDecoratorTerrapon(World world, int treeDensityOverride) {
		this.world = world;
		this.treeDensityOverride = treeDensityOverride;
		this.treeDensityNoise = new PerlinNoise(world.getRandomSeed(), 8, 74);
	}

	public ChunkDecoratorTerrapon(World world) {
		this(world, -1);
	}

	public void decorate(Chunk chunk) {
		this.world.scheduledUpdatesAreImmediate = true;
		int chunkX = chunk.xPosition;
		int chunkZ = chunk.zPosition;
		int minY = this.world.getWorldType().getMinY();
		int maxY = this.world.getWorldType().getMaxY();
		int rangeY = maxY + 1 - minY;
		float oreHeightModifier = (float) rangeY / 128.0F;
		BlockLogicSand.fallInstantly = true;
		int x = chunkX * 16;
		int z = chunkZ * 16;
		int y = this.world.getHeightValue(x + 16, z + 16);
		Biome biome = this.world.getBlockBiome(x + 16, y, z + 16);
		Random rand = new Random(this.world.getRandomSeed());
		long l1 = rand.nextLong() / 2L * 2L + 1L;
		long l2 = rand.nextLong() / 2L * 2L + 1L;
		rand.setSeed((long) chunkX * l1 + (long) chunkZ * l2 ^ this.world.getRandomSeed());
		Random swampRand = new Random((long) chunkX * l1 + (long) chunkZ * l2 ^ this.world.getRandomSeed());

		int lakeChance = 4;
		if (biome == Biomes.OVERWORLD_SWAMPLAND) {
			lakeChance = 2;
		}

		if (biome == Biomes.OVERWORLD_DESERT) {
			lakeChance = 0;
		}

		if (lakeChance != 0 && rand.nextInt(lakeChance) == 0) {
			int fluid = Blocks.FLUID_WATER_STILL.id();

			int i1 = x + rand.nextInt(16) + 8;
			int l4 = minY + rand.nextInt(rangeY);
			int i8 = z + rand.nextInt(16) + 8;
			(new WorldFeatureLake(fluid)).place(this.world, rand, i1, l4, i8);
		}

		/*if (rand.nextInt(8) == 0) {
			int xf = x + rand.nextInt(16) + 8;
			int yf = minY + rand.nextInt(rand.nextInt(rangeY - rangeY / 16) + rangeY / 16);
			int zf = z + rand.nextInt(16) + 8;
			if (yf < minY + rangeY / 2 || rand.nextInt(10) == 0) {
				(new WorldFeatureLake(Blocks.FLUID_LAVA_STILL.id())).place(this.world, rand, xf, yf, zf);
			}
		}*/



		for (int i4 = 0; (float) i4 < oreHeightModifier * 1.5F; ++i4) {
			int j7 = x + rand.nextInt(16);
			int k10 = minY + rand.nextInt(rangeY / 8);
			int j13 = z + rand.nextInt(16);
			(new WorldFeatureOres(TerraponBTA73Blocks.seidriliumBlock.id(), 6)).place(this.world, rand, j7, k10, j13);
		}


		for (int j4 = 0; (float) j4 < oreHeightModifier; ++j4) {
			int k7 = x + rand.nextInt(16);
			int l10 = minY + rand.nextInt(rangeY / 8) + rand.nextInt(rangeY / 8);
			int k13 = z + rand.nextInt(16);
			(new WorldFeatureOre(BlockLogicOreLapis.variantMap, 6)).place(this.world, rand, k7, l10, k13);
		}

		for (int l18 = 0; l18 < 50; ++l18) {
			int l21 = x + rand.nextInt(16) + 8;
			int k23 = minY + rand.nextInt(rand.nextInt(rangeY - rangeY / 16) + rangeY / 16);
			int l24 = z + rand.nextInt(16) + 8;
			(new WorldFeatureLiquid(Blocks.FLUID_WATER_FLOWING.id())).place(this.world, rand, l21, k23, l24);
		}

		/*for(int i19 = 0; i19 < 20; ++i19) {
			int i22 = x + rand.nextInt(16) + 8;
			int l23 = minY + rand.nextInt(rand.nextInt(rand.nextInt(rangeY - rangeY / 8) + rangeY / 16) + rangeY / 16);
			int i25 = z + rand.nextInt(16) + 8;
			(new WorldFeatureLiquid(Blocks.FLUID_LAVA_FLOWING.id())).place(this.world, rand, i22, l23, i25);
		}*/
		BlockLogicSand.fallInstantly = false;
		this.world.scheduledUpdatesAreImmediate = false;
	}
}
