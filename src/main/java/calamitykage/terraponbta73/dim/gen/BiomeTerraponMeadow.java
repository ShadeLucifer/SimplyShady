package calamitykage.terraponbta73.dim.gen;

import net.minecraft.core.world.biome.Biome;

public class BiomeTerraponMeadow extends Biome {

	public BiomeTerraponMeadow(String key) {
		super(key);
		setColor(0xf1f372);
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
	}
}
