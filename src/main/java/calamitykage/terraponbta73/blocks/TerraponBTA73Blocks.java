package calamitykage.terraponbta73.blocks;

import calamitykage.terraponbta73.TerraponBTA73;
import calamitykage.terraponbta73.TerraponBTA73Config;
import calamitykage.terraponbta73.TerraponDimension;
import net.minecraft.core.block.*;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.data.tag.Tag;
import net.minecraft.core.item.tool.ItemToolPickaxe;
import net.minecraft.core.sound.BlockSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sunsetsatellite.catalyst.core.util.DataInitializer;
import sunsetsatellite.signalindustries.SIBlocks;
import sunsetsatellite.signalindustries.util.MachineTextures;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.util.BlockInitEntrypoint;
import turniplabs.halplibe.util.TomlConfigHandler;

import static sunsetsatellite.catalyst.CatalystMultipart.block;

public class TerraponBTA73Blocks extends DataInitializer implements BlockInitEntrypoint {
	public static final String MOD_ID = "terraponbta73";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static TomlConfigHandler tomlConfig;
	private static int startingID = TerraponBTA73Config.CFG.getInt("IDs.startingBlockID");

	private static int nextID() {
		return startingID++;
	}

	@Override
	public void init() {
		if (initialized) return;
		LOGGER.info("Initializing blocks...");
	}

	public static Block<?> seidriliumBlock;
	public static Block<?> sollogiumBlock;
	//	public static Block<?> framiumBlock;
	public static Block<?> einvadrilBlock;
	public static Block<?> hlifintiteBlock;
	public static Block<?> eilifligroniumBlock;
	public static Block<?> eilifligrLamp;
	public static Block<?> terraponPortalBlock;
	public static Block<? extends BlockLogicPortal> terraponPortal;
	public static Block<?> terragrass;
	public static Block<?> terradirt;
	public static Block<?> terrastone;
	public static Block<?> manawater;
	public static Block<?> manawaterflow;


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
			.setHardness(15.0f)
			.setResistance(600.0f)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		BlockBuilder eilifligrlamp_builder = new BlockBuilder(MOD_ID)
			.setHardness(15.0f)
			.setResistance(600.0f)
			.setLuminance(40)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		BlockBuilder terraponPortalBlockBuild = new BlockBuilder(MOD_ID)
			.setHardness(15.0f)
			.setResistance(600.0f)
			.setLuminance(40)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		BlockBuilder terragrassbuilder = new BlockBuilder(MOD_ID)
			.setHardness(4.0f)
			.setResistance(10.0f)
			.setLuminance(1)
			.addTags(BlockTags.MINEABLE_BY_SHOVEL);
		BlockBuilder terradirtbuilder = new BlockBuilder(MOD_ID)
			.setHardness(4.0f)
			.setResistance(10.0f)
			.setLuminance(1)
			.addTags(BlockTags.MINEABLE_BY_SHOVEL);
		BlockBuilder terrastonebuilder = new BlockBuilder(MOD_ID)
			.setHardness(5.0f)
			.setResistance(10.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);

		manawater = new BlockBuilder(MOD_ID)
			.setHardness(100.0f)
			.setLightOpacity(3)
			.setVisualUpdateOnMetadata()
			.setTags(BlockTags.IS_WATER, BlockTags.PLACE_OVERWRITES, BlockTags.NOT_IN_CREATIVE_MENU)
			.build("soymilk", nextID(), block -> new ManaWaterStill(block, Material.water, manawaterflow)).withDisabledStats();
		manawaterflow = new BlockBuilder(MOD_ID)
			.setHardness(100.0f)
			.setLightOpacity(3)
			.setTags(BlockTags.IS_WATER, BlockTags.PLACE_OVERWRITES, BlockTags.NOT_IN_CREATIVE_MENU)
			.setVisualUpdateOnMetadata()
			.build("soymilk_flow", nextID(), block -> new ManaWaterFlow(block, Material.water, manawater)).withDisabledStats();
		terraponPortal = new BlockBuilder(MOD_ID)
			.setBlockSound(BlockSounds.PERMAFROST)
			.setUnbreakable()
			.setLuminance(20)
			.build("terraponPortal", nextID(), block -> new BlockLogicPortal(block, TerraponBTA73.terraponDimension, TerraponBTA73Blocks.terraponPortalBlock, TerraponBTA73Blocks.seidriliumBlock));

		terragrass = terragrassbuilder
			.build("terragrass", "block/terragrass", nextID(), b -> new BlockLogic(b, Material.grass));
		terradirt = terradirtbuilder
			.build("terradirt", "block/terradirt", nextID(), b -> new BlockLogic(b, Material.dirt));
		terrastone = terrastonebuilder
			.build("terrastone", "block/terrastone", nextID(), b -> new BlockLogic(b, Material.stone));

		terraponPortalBlock = terraponPortalBlockBuild
			.build("terraponPortalBlock", "block/terraponPortalBlock", nextID(), b -> new BlockLogic(b, Material.metal));
		seidriliumBlock = seidrilium_builder
			.build("block.seidrilium", "block/seidrilium_block", nextID(), b -> new BlockLogic(b, Material.metal));

		sollogiumBlock = sollogium_builder
			.build("block.sollogium", "block/sollogium_block", nextID(), b -> new BlockLogic(b, Material.metal));

//		framiumBlock = framium_builder
//			.build("block.framium", "block/framium_block", nextID(), b -> new BlockLogic(b, Material.metal));

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
		if (Block.hasLogicClass(block, BlockLogicCactus.class)) return true;
		if (Block.hasLogicClass(block, BlockLogicCropsPumpkin.class)) return true;
		if (Block.hasLogicClass(block, BlockLogicCropsWheat.class)) return true;
		if (Block.hasLogicClass(block, BlockLogicFlower.class)) return true;
		if (Block.hasLogicClass(block, BlockLogicClay.class)) return true;
		if (Block.hasLogicClass(block, BlockLogicSugarcane.class)) return true;
		if (Block.hasLogicClass(block, BlockLogicStone.class)) return true;
		if (Block.hasLogicClass(block, BlockLogicGlowStone.class)) return true;
		if (Block.hasLogicClass(block, BlockLogicCobweb.class)) return true;
		if (Block.hasLogicClass(block, BlockLogicDeadBush.class)) return true;
		return false;

	}

	@Override
	public void afterBlockInit() {
		init();
		new TerraponDimension().init();

		terraponPortal.getLogic().targetDimension = TerraponDimension.TERRAPON;

	}

}
