package calamitykage.terraponbta.blocks;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.util.ConfigHandler;

import java.util.Properties;

import static calamitykage.terraponbta.TerraponBTA.MOD_ID;

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
	public static Block hlifintiteBlock;
	public static Block einvadrilBlock;
	public static Block eilifligroniumBlock;
	public static Block eilifligrLamp;

	public void initializeBlocks() {
		seidriliumBlock = new BlockBuilder(MOD_ID)
			.setSideTextures(MOD_ID + ":block/seidrilium_block_side")
			.setTopTexture(MOD_ID + ":block/seidrilium_block_top")
			.setBottomTexture(MOD_ID + ":block/seidrilium_block_bottom")
			.setHardness(6f)
			.setResistance(3000f)
			.setLuminance(25)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build(new Block("block.seidrilium", blockId++, Material.metal));
		einvadrilBlock = new BlockBuilder(MOD_ID)
			.setSideTextures(MOD_ID + ":block/einvadril_block_side")
			.setTopTexture(MOD_ID + ":block/einvadril_block_top")
			.setBottomTexture(MOD_ID + ":block/einvadril_block_bottom")
			.setHardness(7f)
			.setResistance(4000f)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build(new Block("block.einvadril", blockId++, Material.metal));
		hlifintiteBlock = new BlockBuilder(MOD_ID)
			.setSideTextures(MOD_ID + ":block/hlifintite_block_side")
			.setTopTexture(MOD_ID + ":block/hlifintite_block_top")
			.setBottomTexture(MOD_ID + ":block/hlifintite_block_bottom")
			.setHardness(8f)
			.setResistance(9001f)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build(new Block("block.hlifintite", blockId++, Material.metal));
		eilifligroniumBlock = new BlockBuilder(MOD_ID)
			.setSideTextures(MOD_ID + ":block/eilifligronium_block_side")
			.setTopTexture(MOD_ID + ":block/eilifligronium_block_top")
			.setBottomTexture(MOD_ID + ":block/eilifligronium_block_bottom")
			.setHardness(12f)
			.setResistance(16000f)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build(new Block("block.eilifligronium", blockId++, Material.metal));
		eilifligrLamp = new BlockBuilder(MOD_ID)
			.setSideTextures(MOD_ID + ":block/eilifligrlamp_side")
			.setTopTexture(MOD_ID + ":block/eilifligrlamp_top")
			.setBottomTexture(MOD_ID + ":block/eilifligrlamp_bottom")
			.setHardness(12f)
			.setResistance(16000f)
			.setLuminance(30)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build(new Block("block.eilifligrlamp", blockId++, Material.metal));
	}
}
