package calamitykage.terraponbta73.blocks;

import calamitykage.terraponbta73.TerraponBTA73Config;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.util.TomlConfigHandler;
import turniplabs.halplibe.util.toml.Toml;

public class TerraponBTA73Blocks implements ModInitializer {
	public static final String MOD_ID = "terraponbta73";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static TomlConfigHandler tomlConfig;
	private static int startingID = TerraponBTA73Config.CFG.getInt("IDs.startingBlockID");
	private static int nextID() {
		return startingID++;
	}


	public static Block<?> seidriliumBlock;
	public static Block<?> einvadrilBlock;
	public static Block<?> hlifintiteBlock;
	public static Block<?> eilifligroniumBlock;
	public static Block<?> eilifligrLamp;


	@Override
	public void onInitialize() {
		BlockBuilder seidrilium_builder = new BlockBuilder(MOD_ID)
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


		einvadrilBlock = einvadril_builder
			.build("block.einvadril", "block/einvadril_block", nextID(), b -> new BlockLogic(b, Material.metal));


		hlifintiteBlock = hlifintite_builder
			.build("block.hlifintite", "block/hlifintite_block", nextID(), b -> new BlockLogic(b, Material.metal));

		eilifligroniumBlock = eilifligronium_builder
			.build("block.eilifligronium", "block/eilifligronium_block", nextID(), b -> new BlockLogic(b, Material.metal));
		eilifligrLamp = eilifligrlamp_builder
			.build("eilifligrlamp", "block/eilifligr_lamp", nextID(), b -> new BlockLogic(b, Material.metal));
	}

}
