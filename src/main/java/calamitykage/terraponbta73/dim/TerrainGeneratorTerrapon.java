package calamitykage.terraponbta73.dim;

import calamitykage.terraponbta73.blocks.TerraponBTA73Blocks;
import net.minecraft.core.world.World;
import net.minecraft.core.world.generate.chunk.perlin.DensityGenerator;
import net.minecraft.core.world.generate.chunk.perlin.TerrainGeneratorLerp;
import net.minecraft.core.world.generate.chunk.perlin.overworld.DensityGeneratorOverworld;
import net.minecraft.core.world.type.WorldType;

public class TerrainGeneratorTerrapon extends TerrainGeneratorLerp {
	private final DensityGenerator densityGenerator;

	protected TerrainGeneratorTerrapon(World world, DensityGenerator densityGenerator) {
		super(world);
		this.densityGenerator = densityGenerator;
	}

	public TerrainGeneratorTerrapon(World world) {
		this(world, new DensityGeneratorOverworld(world));
	}

	@Override
	protected int getBlockAt(int x, int y, int z, double density) {
		WorldType type = this.world.getWorldType();
		if (y <= type.getMinY() + this.rand.nextInt(5)) {
			return TerraponBTA73Blocks.eilifligroniumBlock.id();
		}
		if (density > 0.0) {
			return type.getFillerBlockId();
		}
		if (y >= type.getMinY() && y < type.getMinY() + type.getOceanY()) {
			return type.getOceanBlockId();
		}
		return 0;
	}

	@Override
	public DensityGenerator getDensityGenerator() {
		return this.densityGenerator;
	}
}
