package calamitykage.terraponbta73.blocks;

import calamitykage.terraponbta73.TerraponBTA73Config;
import net.minecraft.core.block.*;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.data.tag.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.util.TomlConfigHandler;

public class TerraponBTA73Blocks {
	public static final String MOD_ID = "terraponbta73";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static TomlConfigHandler tomlConfig;
	private static int startingID = TerraponBTA73Config.CFG.getInt("IDs.startingBlockID");

	private static int nextID() {
		return startingID++;
	}


	public static Block<?> seidriliumBlock;
	public static Block<?> sollogiumBlock;
	public static Block<?> framiumBlock;
	public static Block<?> einvadrilBlock;
	public static Block<?> hlifintiteBlock;
	public static Block<?> eilifligroniumBlock;
	public static Block<?> eilifligrLamp;


	public static void initBlocks() {
		BlockBuilder seidrilium_builder = new BlockBuilder(MOD_ID)
			.setHardness(6.0f)
			.setResistance(30.0f)
			.setLuminance(25)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		BlockBuilder sollogium_builder = new BlockBuilder(MOD_ID)
			.setHardness(6.0f)
			.setResistance(30.0f)
			.setLuminance(25)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		BlockBuilder framium_builder = new BlockBuilder(MOD_ID)
			.setHardness(6.0f)
			.setResistance(30.0f)
			.setLuminance(25)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		BlockBuilder einvadril_builder = new BlockBuilder(MOD_ID)
			.setHardness(7.0f)
			.setResistance(45.0f)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		BlockBuilder hlifintite_builder = new BlockBuilder(MOD_ID)
			.setHardness(9.0f)
			.setResistance(80.0f)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		BlockBuilder eilifligronium_builder = new BlockBuilder(MOD_ID)
			.setHardness(12.0f)
			.setResistance(600.0f)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		BlockBuilder eilifligrlamp_builder = new BlockBuilder(MOD_ID)
			.setHardness(12.0f)
			.setResistance(600.0f)
			.setLuminance(40)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);

		seidriliumBlock = seidrilium_builder
			.build("block.seidrilium", "block/seidrilium_block", nextID(), b -> new BlockLogic(b, Material.metal));

		sollogiumBlock = sollogium_builder
			.build("block.sollogium", "block/sollogium_block", nextID(), b -> new BlockLogic(b, Material.metal));

		framiumBlock = framium_builder
			.build("block.framium", "block/framium_block", nextID(), b -> new BlockLogic(b, Material.metal));

		einvadrilBlock = einvadril_builder
			.build("block.einvadril", "block/einvadril_block", nextID(), b -> new BlockLogic(b, Material.metal));


		hlifintiteBlock = hlifintite_builder
			.build("block.hlifintite", "block/hlifintite_block", nextID(), b -> new BlockLogic(b, Material.metal));

		eilifligroniumBlock = eilifligronium_builder
			.build("block.eilifligronium", "block/eilifligronium_block", nextID(), b -> new BlockLogic(b, Material.metal));
		eilifligrLamp = eilifligrlamp_builder
			.build("eilifligrlamp", "block/eilifligr_lamp", nextID(), b -> new BlockLogic(b, Material.metal));
	}


	public static Tag<Block<?>> FORCE_FORTUNE = Tag.of("terraponbta73$force_enable_fortune");
	public static Tag<Block<?>> FORCE_NO_FORTUNE = Tag.of("terraponbta73$force_disable_fortune");

	public static boolean canBeFortuned(Block block) {
		if (block.hasTag(FORCE_FORTUNE)) return true;
		if (block.hasTag(FORCE_NO_FORTUNE)) return false;
		if (Block.hasLogicClass(block, BlockLogicLeavesBase.class)) return true;
		if (Block.hasLogicClass(block, BlockLogicOreCoal.class)) return true;
		if (Block.hasLogicClass(block, BlockLogicOreDiamond.class)) return true;
		if (Block.hasLogicClass(block, BlockLogicOreGold.class)) return true;
		if (Block.hasLogicClass(block, BlockLogicOreIron.class)) return true;
		if (Block.hasLogicClass(block, BlockLogicOreLapis.class)) return true;
		if (Block.hasLogicClass(block, BlockLogicOreNetherCoal.class)) return true;
		if (Block.hasLogicClass(block, BlockLogicOreRedstone.class)) return true;
		if (Block.hasLogicClass(block, BlockLogicLog.class)) return true;
		if (Block.hasLogicClass(block, BlockLogicTallGrass.class)) return true;
		return false;

	}
	public static void init() {

	}
}
