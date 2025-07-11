package calamitykage.terraponbta73.dim.gen;


import net.minecraft.client.render.colorizer.ColorMap;
import net.minecraft.client.render.colorizer.Colorizer;
import net.minecraft.core.world.biome.Biome;

import java.awt.*;

public class BiomeTerraponMeadow extends Biome {

	public BiomeTerraponMeadow(String key) {
		super(key);
		setColor(0xf1f372);
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
	}
	public int getSkyColor(float temperature) {
		return 0xf1f372;
	}

}
