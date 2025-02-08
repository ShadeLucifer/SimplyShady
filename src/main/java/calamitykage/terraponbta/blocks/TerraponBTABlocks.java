package calamitykage.terraponbta.blocks;

import calamitykage.terraponbta.blocks.ores.*;
import calamitykage.terraponbta.item.TerraponBTAItems;
import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.item.tool.ItemToolPickaxe;
import net.minecraft.core.sound.BlockSound;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.util.ConfigHandler;

import java.util.Properties;

import static calamitykage.terraponbta.TerraponBTA.MOD_ID;
import static calamitykage.terraponbta.item.TerraponBTAItems.*;

public class TerraponBTABlocks {
	public static int blockId;

	static {
		Properties prop = new Properties();
		prop.setProperty("starting_block_id","4700");
		ConfigHandler config = new ConfigHandler(MOD_ID,prop);
		blockId = config.getInt("starting_block_id");

		config.updateConfig();
	}

	public static Block seidriliumBlock;
	public static Block sollogiumBlock;
	public static Block hlifintiteBlock;
	public static Block einvadrilBlock;
	public static Block eilifligroniumBlock;
	public static Block eilifligrLamp;
	public static Block seidriliumOreStone;
	public static Block seidriliumOreBasalt;
	public static Block netherSeidriliumOree;
	public static Block einvadrilOreStone;
	public static Block einvadrilOreBasalt;
	public static Block hlifintiteOreStone;
	public static Block hlifintiteOreBasalt;
	public static Block framiumOreStone;
	public static Block framiumOreBasalt;
	public static Block sollogiumOree;


	public void initializeBlocks() {
		BlockBuilder seidriliumOre = new BlockBuilder(MOD_ID)
			.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
			.setHardness(6.0f)
			.setLuminance(12)
			.setResistance(3000.0f)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		BlockBuilder netherSeidriliumOre = new BlockBuilder(MOD_ID)
			.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
			.setHardness(6.0f)
			.setLuminance(12)
			.setResistance(3000.0f)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);


		BlockBuilder einvadrilOre = new BlockBuilder(MOD_ID)
			.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
			.setHardness(7.0f)
			.setResistance(2000.0f)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);

		BlockBuilder hlifintiteOre = new BlockBuilder(MOD_ID)
			.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
			.setHardness(12.0f)
			.setResistance(9001.0f)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);

		BlockBuilder sollogiumOre = new BlockBuilder(MOD_ID)
			.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
			.setHardness(6.0f)
			.setLuminance(18)
			.setResistance(3000.0f)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);

		BlockBuilder framiumOre = new BlockBuilder(MOD_ID)
			.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
			.setHardness(6.0f)
			.setLuminance(8)
			.setResistance(3000.0f)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);

	// Standard Blocks
		seidriliumBlock = new BlockBuilder(MOD_ID)
			.setSideTextures(MOD_ID + ":block/seidrilium_block")
			.setTopTexture(MOD_ID + ":block/seidrilium_block")
			.setBottomTexture(MOD_ID + ":block/seidrilium_block")
			.setHardness(6f)
			.setResistance(3000f)
			.setLuminance(25)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build(new Block("block.seidrilium", blockId++, Material.metal));
		ItemToolPickaxe.miningLevels.put(seidriliumBlock, 5);
		sollogiumBlock = new BlockBuilder(MOD_ID)
			.setSideTextures(MOD_ID + ":block/sollogium_block")
			.setTopTexture(MOD_ID + ":block/sollogium_block")
			.setBottomTexture(MOD_ID + ":block/seidrilium_block")
			.setHardness(6f)
			.setResistance(3000f)
			.setLuminance(25)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build(new Block("block.sollogium", blockId++, Material.metal));
		ItemToolPickaxe.miningLevels.put(sollogiumBlock, 5);
		einvadrilBlock = new BlockBuilder(MOD_ID)
			.setSideTextures(MOD_ID + ":block/einvadril_block")
			.setTopTexture(MOD_ID + ":block/einvadril_block")
			.setBottomTexture(MOD_ID + ":block/einvadril_block")
			.setHardness(7f)
			.setResistance(2000f)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build(new Block("block.einvadril", blockId++, Material.metal));
		ItemToolPickaxe.miningLevels.put(einvadrilBlock, 4);
		hlifintiteBlock = new BlockBuilder(MOD_ID)
			.setSideTextures(MOD_ID + ":block/hlifintite_block")
			.setTopTexture(MOD_ID + ":block/hlifintite_block")
			.setBottomTexture(MOD_ID + ":block/hlifintite_block")
			.setHardness(8f)
			.setResistance(9001f)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build(new Block("block.hlifintite", blockId++, Material.metal));
		ItemToolPickaxe.miningLevels.put(einvadrilBlock, 6);
		eilifligroniumBlock = new BlockBuilder(MOD_ID)
			.setSideTextures(MOD_ID + ":block/eilifligronium_block")
			.setTopTexture(MOD_ID + ":block/eilifligronium_block")
			.setBottomTexture(MOD_ID + ":block/eilifligronium_block")
			.setHardness(12f)
			.setResistance(16000f)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build(new Block("block.eilifligronium", blockId++, Material.metal));
		ItemToolPickaxe.miningLevels.put(eilifligroniumBlock, 9);
		eilifligrLamp = new BlockBuilder(MOD_ID)
			.setSideTextures(MOD_ID + ":block/eilifligrlamp")
			.setTopTexture(MOD_ID + ":block/eilifligrlamp")
			.setBottomTexture(MOD_ID + ":block/eilifligrlamp")
			.setHardness(12f)
			.setResistance(16000f)
			.setLuminance(30)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build(new Block("eilifligrlamp", blockId++, Material.metal));
		ItemToolPickaxe.miningLevels.put(eilifligrLamp, 9);

	// Ores

	// Seidrilium Ore

		seidriliumOreStone = seidriliumOre
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures(MOD_ID + ":block/seidrilium_ore_stone"))
			.build(new BlockSeidriliumOre("seidriliumorestone", blockId++));
		ItemToolPickaxe.miningLevels.put(seidriliumOreStone, 3);
		seidriliumOreBasalt = seidriliumOre
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures(MOD_ID + ":block/seidrilium_ore_basalt"))
			.build(new BlockSeidriliumOre("seidriliumorebasalt", blockId++));
		ItemToolPickaxe.miningLevels.put(seidriliumOreBasalt, 3);

		netherSeidriliumOree = netherSeidriliumOre
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures(MOD_ID + ":block/nether_seidrilium_ore"))
			.build(new BlockSeidriliumOre("netherseidriliumore", blockId++));
		ItemToolPickaxe.miningLevels.put(netherSeidriliumOree, 3);

	// Einvadril

		einvadrilOreStone = einvadrilOre
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures(MOD_ID + ":block/einvadril_ore_stone"))
			.build(new BlockEinvadrilOre("einvadrilorestone", blockId++));
		ItemToolPickaxe.miningLevels.put(einvadrilOreStone, 3);
		einvadrilOreBasalt = einvadrilOre
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures(MOD_ID + ":block/einvadril_ore_basalt"))
			.build(new BlockEinvadrilOre("einvadrilorebasalt", blockId++));
		ItemToolPickaxe.miningLevels.put(einvadrilOreBasalt, 3);

	// Hlifintite
		hlifintiteOreStone = hlifintiteOre
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures(MOD_ID + ":block/hlifintite_ore_stone"))
			.build(new BlockHlifintiteOre("hlifintiteorestone", blockId++));
		ItemToolPickaxe.miningLevels.put(hlifintiteOreStone, 3);
		hlifintiteOreBasalt = hlifintiteOre
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures(MOD_ID + ":block/hlifintite_ore_basalt"))
			.build(new BlockHlifintiteOre("hlifintiteorebasalt", blockId++));
		ItemToolPickaxe.miningLevels.put(hlifintiteOreBasalt, 3);

	// Sollogium

		sollogiumOree = sollogiumOre
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures(MOD_ID + ":block/sollogium_ore"))
			.build(new BlockSollogiumOre("sollogiumore", blockId++));
		ItemToolPickaxe.miningLevels.put(sollogiumOree, 3);

	// Framium

		framiumOreStone = framiumOre
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures(MOD_ID + ":block/framium_ore_stone"))
			.build(new BlockFramiumOre("framiumorestone", blockId++));
		ItemToolPickaxe.miningLevels.put(framiumOreStone, 3);
		framiumOreBasalt = framiumOre
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures(MOD_ID + ":block/framium_ore_basalt"))
			.build(new BlockFramiumOre("framiumorebasalt", blockId++));
		ItemToolPickaxe.miningLevels.put(framiumOreBasalt, 3);


	}


}
