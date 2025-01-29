package calamitykage.terraponbta73;
import calamitykage.terraponbta73.blocks.TerraponBTA73Blocks;
import calamitykage.terraponbta73.item.TerraponBTA73Items;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.client.render.texture.Texture;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.crafting.LookupFuelFurnace;
import net.minecraft.core.crafting.LookupFuelFurnaceBlast;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import net.minecraft.core.item.tool.*;
import net.minecraft.core.util.collection.NamespaceID;
import net.minecraft.core.util.helper.Side;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.*;

import static calamitykage.terraponbta73.blocks.TerraponBTA73Blocks.*;
import static calamitykage.terraponbta73.item.TerraponBTA73Items.*;

public class TerraponBTA73 implements ModInitializer, RecipeEntrypoint, GameStartEntrypoint, ModelEntrypoint, ClientStartEntrypoint {
	public static final String MOD_ID = "terraponbta73";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static TomlConfigHandler tomlConfig;
	private static int startingID = TerraponBTA73Config.CFG.getInt("IDs.startingBlockID");
	private static int nextID() {
		return startingID++;
	}

	@Override
	public void onRecipesReady() {
		LookupFuelFurnace.instance.addFuelEntry(loptFuel.id, 96000);
		LookupFuelFurnaceBlast.instance.addFuelEntry(loptFuel.id, 96000);

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"GSG",
				"SDS",
				"GSG")
			.addInput('G', Blocks.GLOWSTONE)
			.addInput('D', Items.DIAMOND)
			.addInput('S', Items.INGOT_STEEL_CRUDE)
			.create("orbofseidril", orbOfSeidril.getDefaultStack());

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"CCC",
				"GGG",
				"DDD")
			.addInput('G', ingotEinvadrilIngot)
			.addInput('C', ingotSeidriliumIngot)
			.addInput('D', ingotHlifintiteIngot)
			.create("eilifligronium_ingot", ingotEilifligroniumIngot.getDefaultStack());
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"CEC",
				"GEG",
				"DED")
			.addInput('G', ingotEinvadrilIngot)
			.addInput('C', ingotSeidriliumIngot)
			.addInput('D', ingotHlifintiteIngot)
			.addInput('E', Blocks.BLOCK_NETHER_COAL)
			.create("lopt_fuel", loptFuel.getDefaultStack());

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"DDD",
				" S ",
				" S ")
			.addInput('D', ingotSeidriliumIngot)
			.addInput('S', Items.STICK)
			.create("seidrilium_pickaxe", toolPickaxeSeidrilium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"DD ",
				"DS ",
				" S ")
			.addInput('D', ingotSeidriliumIngot)
			.addInput('S', Items.STICK)
			.create("seidrilium_axe", toolAxeSeidrilium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" D ",
				" S ",
				" S ")
			.addInput('D', ingotSeidriliumIngot)
			.addInput('S', Items.STICK)
			.create("seidrilium_shovel", toolShovelSeidrilium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"DD ",
				" S ",
				" S ")
			.addInput('D', ingotSeidriliumIngot)
			.addInput('S', Items.STICK)
			.create("seidrilium_hoe", toolHoeSeidrilium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" D ",
				" D ",
				" S ")
			.addInput('D', ingotSeidriliumIngot)
			.addInput('S', Items.STICK)
			.create("seidrilium_sword", toolSwordSeidrilium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"SSS",
				"S S",
				"   ")
			.addInput('S', ingotSeidriliumIngot)
			.create("seidrilium_helmet", hatSeidrilium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"   ",
				"SSS",
				"S S")
			.addInput('S', ingotSeidriliumIngot)
			.create("seidrilium_helmet", hatSeidrilium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"S S",
				"SSS",
				"SSS")
			.addInput('S', ingotSeidriliumIngot)
			.create("seidrilium_chestplate", shirtSeidrilium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"SSS",
				"S S",
				"S S")
			.addInput('S', ingotSeidriliumIngot)
			.create("seidrilium_leggings", pantsSeidrilium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"S S",
				"S S",
				"   ")
			.addInput('S', ingotSeidriliumIngot)
			.create("seidrilium_boots", feetsiesSeidrilium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"   ",
				"S S",
				"S S")
			.addInput('S', ingotSeidriliumIngot)
			.create("seidrilium_boots", feetsiesSeidrilium);

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"CGC",
				"GOG",
				"CGC")
			.addInput('G', Items.NETHERCOAL)
			.addInput('C', Items.INGOT_STEEL_CRUDE)
			.addInput('O', orbOfSeidril)
			.create("raw_einvadril", rawEinvadrilRaw.getDefaultStack());
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"EEE",
				" S ",
				" S ")
			.addInput('E', ingotEinvadrilIngot)
			.addInput('S', Items.STICK)
			.create("einvadril_pickaxe", toolPickaxeEinvadril);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"EE ",
				" S ",
				" S ")
			.addInput('E', ingotEinvadrilIngot)
			.addInput('S', Items.STICK)
			.create("einvadril_hoe", toolHoeEinvadril);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"EE ",
				"ES ",
				" S ")
			.addInput('E', ingotEinvadrilIngot)
			.addInput('S', Items.STICK)
			.create("einvadril_axe", toolAxeEinvadril);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" E ",
				" S ",
				" S ")
			.addInput('E', ingotEinvadrilIngot)
			.addInput('S', Items.STICK)
			.create("einvadril_shovel", toolShovelEinvadril);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" E ",
				" E ",
				" S ")
			.addInput('E', ingotEinvadrilIngot)
			.addInput('S', Items.STICK)
			.create("einvadril_sword", toolSwordEinvadril);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"EEE",
				"E E",
				"   ")
			.addInput('E', ingotEinvadrilIngot)
			.create("einvadril_helmet", hatEinvadril);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"   ",
				"EEE",
				"E E")
			.addInput('E', ingotEinvadrilIngot)
			.create("einvadril_helmet", hatEinvadril);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"E E",
				"EEE",
				"EEE")
			.addInput('E', ingotEinvadrilIngot)
			.create("einvadril_chestplate", shirtEinvadril);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"EEE",
				"E E",
				"E E")
			.addInput('E', ingotEinvadrilIngot)
			.create("einvadril_leggings", pantsEinvadril);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"E E",
				"E E",
				"   ")
			.addInput('E', ingotEinvadrilIngot)
			.create("einvadril_boots", feetsiesEinvadril);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"   ",
				"E E",
				"E E")
			.addInput('E', ingotEinvadrilIngot)
			.create("einvadril_boots", feetsiesEinvadril);

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"CGC",
				"GOG",
				"CGC")
			.addInput('G', Blocks.BLOCK_LAPIS)
			.addInput('C', Items.DIAMOND)
			.addInput('O', orbOfSeidril)
			.create("raw_hlifintite", rawHlifintiteRaw);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"HHH",
				" S ",
				" S ")
			.addInput('H', ingotHlifintiteIngot)
			.addInput('S', Items.STICK)
			.create("hlifintite_pickaxe", toolPickaxeHlifintite);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"HH ",
				"HS ",
				" S ")
			.addInput('H', ingotHlifintiteIngot)
			.addInput('S', Items.STICK)
			.create("hlifintite_axe", toolAxeHlifintite);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" H ",
				" S ",
				" S ")
			.addInput('H', ingotHlifintiteIngot)
			.addInput('S', Items.STICK)
			.create("hlifintite_shovel", toolShovelHlifintite);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"HH ",
				" S ",
				" S ")
			.addInput('H', ingotHlifintiteIngot)
			.addInput('S', Items.STICK)
			.create("hlifintite_hoe", toolHoeHlifintite);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" H ",
				" H ",
				" S ")
			.addInput('H', ingotHlifintiteIngot)
			.addInput('S', Items.STICK)
			.create("hlifintite_sword", toolSwordHlifintite);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"HHH",
				"H H",
				"   ")
			.addInput('H', ingotHlifintiteIngot)
			.create("hlifintite_helmet", hatHlifintite);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"   ",
				"HHH",
				"H H")
			.addInput('H', ingotHlifintiteIngot)
			.create("hlifintite_helmet", hatHlifintite);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"H H",
				"HHH",
				"HHH")
			.addInput('H', ingotHlifintiteIngot)
			.create("hlifintite_chestplate", shirtHlifintite);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"HHH",
				"H H",
				"H H")
			.addInput('H', ingotHlifintiteIngot)
			.create("hlifintite_leggings", pantsHlifintite);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"H H",
				"H H",
				"   ")
			.addInput('H', ingotHlifintiteIngot)
			.create("hlifintite_boots", feetsiesHlifintite);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"   ",
				"H H",
				"H H")
			.addInput('H', ingotHlifintiteIngot)
			.create("hlifintite_boots", feetsiesHlifintite);

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"UU ",
				" L ",
				" L ")
			.addInput('U', ingotEilifligroniumIngot)
			.addInput('L', Blocks.BLOCK_LAPIS)
			.create("eilifligronium_hoe", toolHoeEilifligronium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"UU ",
				"UL ",
				" L ")
			.addInput('U', ingotEilifligroniumIngot)
			.addInput('L', Blocks.BLOCK_LAPIS)
			.create("eilifligronium_axe", toolAxeEilifligronium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" U ",
				" L ",
				" L ")
			.addInput('U', ingotEilifligroniumIngot)
			.addInput('L', Blocks.BLOCK_LAPIS)
			.create("eilifligronium_shovel", toolShovelEilifligronium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"UUU",
				" L ",
				" L ")
			.addInput('U', ingotEilifligroniumIngot)
			.addInput('L', Blocks.BLOCK_LAPIS)
			.create("eilifligronium_pickaxe", toolPickaxeEilifligronium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" U ",
				" U ",
				" L ")
			.addInput('U', ingotEilifligroniumIngot)
			.addInput('L', Blocks.BLOCK_LAPIS)
			.create("eilifligronium_sword", toolSwordEilifligronium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"UUU",
				"U U",
				"   ")
			.addInput('U', ingotEilifligroniumIngot)
			.create("eilifligronium_helmet", hatEilifligronium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"   ",
				"UUU",
				"U U")
			.addInput('U', ingotEilifligroniumIngot)
			.create("eilifligronium_helmet", hatEilifligronium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"U U",
				"UUU",
				"UUU")
			.addInput('U', ingotEilifligroniumIngot)
			.create("eilifligronium_chestplate", shirtEilifligronium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"UUU",
				"U U",
				"U U")
			.addInput('U', ingotEilifligroniumIngot)
			.create("eilifligronium_leggings", pantsEilifligronium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"U U",
				"U U",
				"   ")
			.addInput('U', ingotEilifligroniumIngot)
			.create("eilifligronium_boots", feetsiesEilifligronium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"   ",
				"U U",
				"U U")
			.addInput('U', ingotEilifligroniumIngot)
			.create("eilifligronium_boots", feetsiesEilifligronium);

		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(hatSeidrilium)
			.create("seidrilium_ingot", new ItemStack(ingotSeidriliumIngot, 5));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(shirtSeidrilium)
			.create("seidrilium_ingot", new ItemStack(ingotSeidriliumIngot, 8));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(pantsSeidrilium)
			.create("seidrilium_ingot", new ItemStack(ingotSeidriliumIngot, 7));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(feetsiesSeidrilium)
			.create("seidrilium_ingot", new ItemStack(ingotSeidriliumIngot, 4));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(toolShovelSeidrilium)
			.create("seidrilium_ingot", new ItemStack(ingotSeidriliumIngot, 1));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(toolPickaxeSeidrilium)
			.create("seidrilium_ingot", new ItemStack(ingotSeidriliumIngot, 3));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(toolAxeSeidrilium)
			.create("seidrilium_ingot", new ItemStack(ingotSeidriliumIngot, 3));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(toolHoeSeidrilium)
			.create("seidrilium_ingot", new ItemStack(ingotSeidriliumIngot, 2));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(toolSwordSeidrilium)
			.create("seidrilium_ingot", new ItemStack(ingotSeidriliumIngot, 2));

		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(hatEinvadril)
			.create("einvadril_ingot", new ItemStack(ingotEinvadrilIngot, 5));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(shirtEinvadril)
			.create("einvadril_ingot", new ItemStack(ingotEinvadrilIngot, 8));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(pantsEinvadril)
			.create("einvadril_ingot", new ItemStack(ingotEinvadrilIngot, 7));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(feetsiesEinvadril)
			.create("einvadril_ingot", new ItemStack(ingotEinvadrilIngot, 4));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(toolShovelEinvadril)
			.create("einvadril_ingot", new ItemStack(ingotEinvadrilIngot, 1));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(toolPickaxeEinvadril)
			.create("einvadril_ingot", new ItemStack(ingotEinvadrilIngot, 3));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(toolAxeEinvadril)
			.create("einvadril_ingot", new ItemStack(ingotEinvadrilIngot, 3));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(toolHoeEinvadril)
			.create("einvadril_ingot", new ItemStack(ingotEinvadrilIngot, 2));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(toolSwordEinvadril)
			.create("einvadril_ingot", new ItemStack(ingotEinvadrilIngot, 2));

		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(hatHlifintite)
			.create("hlifintite_ingot", new ItemStack(ingotHlifintiteIngot, 5));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(shirtHlifintite)
			.create("hlifintite_ingot", new ItemStack(ingotHlifintiteIngot, 8));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(pantsHlifintite)
			.create("hlifintite_ingot", new ItemStack(ingotHlifintiteIngot, 7));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(feetsiesHlifintite)
			.create("hlifintite_ingot", new ItemStack(ingotHlifintiteIngot, 4));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(toolShovelHlifintite)
			.create("hlifintite_ingot", new ItemStack(ingotHlifintiteIngot, 1));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(toolPickaxeHlifintite)
			.create("hlifintite_ingot", new ItemStack(ingotHlifintiteIngot, 3));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(toolAxeHlifintite)
			.create("hlifintite_ingot", new ItemStack(ingotHlifintiteIngot, 3));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(toolHoeHlifintite)
			.create("hlifintite_ingot", new ItemStack(ingotHlifintiteIngot, 2));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(toolSwordHlifintite)
			.create("hlifintite_ingot", new ItemStack(ingotHlifintiteIngot, 2));

		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(hatEilifligronium)
			.create("eilifligronium_ingot", new ItemStack(ingotEilifligroniumIngot, 5));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(shirtEilifligronium)
			.create("eilifligronium_ingot", new ItemStack(ingotEilifligroniumIngot, 8));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(pantsEilifligronium)
			.create("eilifligronium_ingot", new ItemStack(ingotEilifligroniumIngot, 7));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(feetsiesEilifligronium)
			.create("eilifligronium_ingot", new ItemStack(ingotEilifligroniumIngot, 4));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(toolShovelEilifligronium)
			.create("eilifligronium_ingot", new ItemStack(ingotEilifligroniumIngot, 1));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(toolPickaxeEilifligronium)
			.create("eilifligronium_ingot", new ItemStack(ingotEilifligroniumIngot, 3));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(toolAxeEilifligronium)
			.create("eilifligronium_ingot", new ItemStack(ingotEilifligroniumIngot, 3));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(toolHoeEilifligronium)
			.create("eilifligronium_ingot", new ItemStack(ingotEilifligroniumIngot, 2));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(toolSwordEilifligronium)
			.create("eilifligronium_ingot", new ItemStack(ingotEilifligroniumIngot, 2));

		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(rawSeidriliumRaw)
			.create("seidrilium_ingot", ingotSeidriliumIngot);
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(rawEinvadrilRaw)
			.create("einvadril_ingot", ingotEinvadrilIngot);
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(rawHlifintiteRaw)
			.create("hlifintite_ingot", ingotHlifintiteIngot);
	}

	@Override
	public void initNamespaces() {

	}

	@Override
	public void beforeGameStart() {
		new TerraponBTA73Items();
		new TerraponBTA73Blocks();
	}

	@Override
	public void afterGameStart() {

	}


	@Override
	public void beforeClientStart() {

	}

	@Override
	public void afterClientStart() {

	}
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
		LOGGER.info("TerraponBTA73 initialized.");

	}

	@Override
	public void initBlockModels(BlockModelDispatcher dispatcher) {
		ModelHelper.setBlockModel(seidriliumBlock, () -> new BlockModelStandard<>(seidriliumBlock)
		.setTex(0, "terraponbta73:block/seidrilium_blocktop", Side.TOP)
		.setTex(0, "terraponbta73:block/seidrilium_blockbottom", Side.BOTTOM)
		.setTex(0, "terraponbta73:block/seidrilium_blockside", Side.WEST, Side.EAST, Side.SOUTH)
		.setTex(0, "terraponbta73:block/seidrilium_blockfront", Side.NORTH));
		ModelHelper.setBlockModel(einvadrilBlock, () -> new BlockModelStandard<>(einvadrilBlock)
			.setTex(0, "terraponbta73:block/einvadril_blocktop", Side.TOP)
			.setTex(0, "terraponbta73:block/einvadril_blockbottom", Side.BOTTOM)
			.setTex(0, "terraponbta73:block/einvadril_blockside", Side.WEST, Side.EAST, Side.SOUTH)
			.setTex(0, "terraponbta73:block/einvadril_blockfront", Side.NORTH));
		ModelHelper.setBlockModel(hlifintiteBlock, () -> new BlockModelStandard<>(hlifintiteBlock)
			.setTex(0, "terraponbta73:block/hlifintite_blocktop", Side.TOP)
			.setTex(0, "terraponbta73:block/hlifintite_blockbottom", Side.BOTTOM)
			.setTex(0, "terraponbta73:block/hlifintite_blockside", Side.WEST, Side.EAST, Side.SOUTH)
			.setTex(0, "terraponbta73:block/hlifintite_blockfront", Side.NORTH));
		ModelHelper.setBlockModel(eilifligroniumBlock, () -> new BlockModelStandard<>(eilifligroniumBlock)
			.setTex(0, "terraponbta73:block/eilifligronium_blocktop", Side.TOP)
			.setTex(0, "terraponbta73:block/eilifligronium_blockbottom", Side.BOTTOM)
			.setTex(0, "terraponbta73:block/eilifligronium_blockside", Side.WEST, Side.EAST, Side.SOUTH)
			.setTex(0, "terraponbta73:block/eilifligronium_blockfront", Side.NORTH));
		ModelHelper.setBlockModel(eilifligrLamp, () -> new BlockModelStandard<>(eilifligrLamp)
			.setTex(0, "terraponbta73:block/eilifligrlamptop", Side.TOP)
			.setTex(0, "terraponbta73:block/eilifligrlampbottom", Side.BOTTOM)
			.setTex(0, "terraponbta73:block/eilifligrlampside", Side.WEST, Side.EAST, Side.SOUTH)
			.setTex(0, "terraponbta73:block/eilifligrlampfront", Side.NORTH));


	}

	@Override
	public void initItemModels(ItemModelDispatcher dispatcher) {
		ModelHelper.setItemModel(toolSwordSeidrilium, () -> {
			ItemModelStandard model = new ItemModelStandard(toolSwordSeidrilium, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/seidrilium_sword"));
			return model;
		});
		ModelHelper.setItemModel(toolAxeSeidrilium, () -> {
			ItemModelStandard model = new ItemModelStandard(toolAxeSeidrilium, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/seidrilium_axe"));
			return model;
		});
		ModelHelper.setItemModel(toolShovelSeidrilium, () -> {
			ItemModelStandard model = new ItemModelStandard(toolShovelSeidrilium, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/seidrilium_shovel"));
			return model;
		});
		ModelHelper.setItemModel(toolPickaxeSeidrilium, () -> {
			ItemModelStandard model = new ItemModelStandard(toolPickaxeSeidrilium, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/seidrilium_pickaxe"));
			return model;
		});
		ModelHelper.setItemModel(toolHoeSeidrilium, () -> {
			ItemModelStandard model = new ItemModelStandard(toolHoeSeidrilium, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/seidrilium_hoe"));
			return model;
		});
		ModelHelper.setItemModel(rawSeidriliumRaw, () -> {
			ItemModelStandard model = new ItemModelStandard(rawSeidriliumRaw, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/raw_seidrilium"));
			return model;
		});
		ModelHelper.setItemModel(ingotSeidriliumIngot, () -> {
			ItemModelStandard model = new ItemModelStandard(ingotSeidriliumIngot, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/seidrilium_ingot"));
			return model;
		});
		ModelHelper.setItemModel(hatSeidrilium, () -> {
			ItemModelStandard model = new ItemModelStandard(hatSeidrilium, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/seidrilium_helmet"));
			return model;
		});
		ModelHelper.setItemModel(hatSeidrilium, () -> {
			ItemModelStandard model = new ItemModelStandard(hatSeidrilium, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/seidrilium_helmet"));
			return model;
		});
		ModelHelper.setItemModel(shirtSeidrilium, () -> {
			ItemModelStandard model = new ItemModelStandard(shirtSeidrilium, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/seidrilium_chestplate"));
			return model;
		});
		ModelHelper.setItemModel(pantsSeidrilium, () -> {
			ItemModelStandard model = new ItemModelStandard(pantsSeidrilium, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/seidrilium_leggings"));
			return model;
		});
		ModelHelper.setItemModel(feetsiesSeidrilium, () -> {
			ItemModelStandard model = new ItemModelStandard(feetsiesSeidrilium, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/seidrilium_boots"));
			return model;
		});

		ModelHelper.setItemModel(loptFuel, () -> {
			ItemModelStandard model = new ItemModelStandard(loptFuel, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/lopt_fuel"));
			return model;
		});
		ModelHelper.setItemModel(orbOfSeidril, () -> {
			ItemModelStandard model = new ItemModelStandard(loptFuel, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/orbofseidril"));
			return model;
		});


		ModelHelper.setItemModel(toolSwordEinvadril, () -> {
			ItemModelStandard model = new ItemModelStandard(toolSwordEinvadril, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/einvadril_sword"));
			return model;
		});
		ModelHelper.setItemModel(toolAxeEinvadril, () -> {
			ItemModelStandard model = new ItemModelStandard(toolAxeEinvadril, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/einvadril_axe"));
			return model;
		});
		ModelHelper.setItemModel(toolShovelEinvadril, () -> {
			ItemModelStandard model = new ItemModelStandard(toolShovelEinvadril, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/einvadril_shovel"));
			return model;
		});
		ModelHelper.setItemModel(toolPickaxeEinvadril, () -> {
			ItemModelStandard model = new ItemModelStandard(toolPickaxeEinvadril, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/einvadril_pickaxe"));
			return model;
		});
		ModelHelper.setItemModel(toolHoeEinvadril, () -> {
			ItemModelStandard model = new ItemModelStandard(toolHoeEinvadril, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/einvadril_hoe"));
			return model;
		});
		ModelHelper.setItemModel(rawEinvadrilRaw, () -> {
			ItemModelStandard model = new ItemModelStandard(rawEinvadrilRaw, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/raw_einvadril"));
			return model;
		});
		ModelHelper.setItemModel(ingotEinvadrilIngot, () -> {
			ItemModelStandard model = new ItemModelStandard(ingotEinvadrilIngot, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/einvadril_ingot"));
			return model;
		});
		ModelHelper.setItemModel(hatEinvadril, () -> {
			ItemModelStandard model = new ItemModelStandard(hatEinvadril, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/einvadril_helmet"));
			return model;
		});
		ModelHelper.setItemModel(hatEinvadril, () -> {
			ItemModelStandard model = new ItemModelStandard(hatEinvadril, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/einvadril_helmet"));
			return model;
		});
		ModelHelper.setItemModel(shirtEinvadril, () -> {
			ItemModelStandard model = new ItemModelStandard(shirtEinvadril, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/einvadril_chestplate"));
			return model;
		});
		ModelHelper.setItemModel(pantsEinvadril, () -> {
			ItemModelStandard model = new ItemModelStandard(pantsEinvadril, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/einvadril_leggings"));
			return model;
		});
		ModelHelper.setItemModel(feetsiesEinvadril, () -> {
			ItemModelStandard model = new ItemModelStandard(feetsiesEinvadril, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/einvadril_boots"));
			return model;
		});


		ModelHelper.setItemModel(toolSwordHlifintite, () -> {
			ItemModelStandard model = new ItemModelStandard(toolSwordHlifintite, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/hlifintite_sword"));
			return model;
		});
		ModelHelper.setItemModel(toolAxeHlifintite, () -> {
			ItemModelStandard model = new ItemModelStandard(toolAxeHlifintite, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/hlifintite_axe"));
			return model;
		});
		ModelHelper.setItemModel(toolShovelHlifintite, () -> {
			ItemModelStandard model = new ItemModelStandard(toolShovelHlifintite, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/hlifintite_shovel"));
			return model;
		});
		ModelHelper.setItemModel(toolPickaxeHlifintite, () -> {
			ItemModelStandard model = new ItemModelStandard(toolPickaxeHlifintite, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/hlifintite_pickaxe"));
			return model;
		});
		ModelHelper.setItemModel(toolHoeHlifintite, () -> {
			ItemModelStandard model = new ItemModelStandard(toolHoeHlifintite, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/hlifintite_hoe"));
			return model;
		});
		ModelHelper.setItemModel(rawHlifintiteRaw, () -> {
			ItemModelStandard model = new ItemModelStandard(rawHlifintiteRaw, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/raw_hlifintite"));
			return model;
		});
		ModelHelper.setItemModel(ingotHlifintiteIngot, () -> {
			ItemModelStandard model = new ItemModelStandard(ingotHlifintiteIngot, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/hlifintite_ingot"));
			return model;
		});
		ModelHelper.setItemModel(hatHlifintite, () -> {
			ItemModelStandard model = new ItemModelStandard(hatHlifintite, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/hlifintite_helmet"));
			return model;
		});
		ModelHelper.setItemModel(hatHlifintite, () -> {
			ItemModelStandard model = new ItemModelStandard(hatHlifintite, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/hlifintite_helmet"));
			return model;
		});
		ModelHelper.setItemModel(shirtHlifintite, () -> {
			ItemModelStandard model = new ItemModelStandard(shirtHlifintite, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/hlifintite_chestplate"));
			return model;
		});
		ModelHelper.setItemModel(pantsHlifintite, () -> {
			ItemModelStandard model = new ItemModelStandard(pantsHlifintite, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/hlifintite_leggings"));
			return model;
		});
		ModelHelper.setItemModel(feetsiesHlifintite, () -> {
			ItemModelStandard model = new ItemModelStandard(feetsiesHlifintite, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/hlifintite_boots"));
			return model;
		});


		ModelHelper.setItemModel(toolSwordEilifligronium, () -> {
			ItemModelStandard model = new ItemModelStandard(toolSwordEilifligronium, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/eilifligronium_sword"));
			return model;
		});
		ModelHelper.setItemModel(toolAxeEilifligronium, () -> {
			ItemModelStandard model = new ItemModelStandard(toolAxeEilifligronium, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/eilifligronium_axe"));
			return model;
		});
		ModelHelper.setItemModel(toolShovelEilifligronium, () -> {
			ItemModelStandard model = new ItemModelStandard(toolShovelEilifligronium, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/eilifligronium_shovel"));
			return model;
		});
		ModelHelper.setItemModel(toolPickaxeEilifligronium, () -> {
			ItemModelStandard model = new ItemModelStandard(toolPickaxeEilifligronium, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/eilifligronium_pickaxe"));
			return model;
		});
		ModelHelper.setItemModel(toolHoeEilifligronium, () -> {
			ItemModelStandard model = new ItemModelStandard(toolHoeEilifligronium, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/eilifligronium_hoe"));
			return model;
		});
		ModelHelper.setItemModel(ingotEilifligroniumIngot, () -> {
			ItemModelStandard model = new ItemModelStandard(ingotEilifligroniumIngot, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/eilifligronium_ingot"));
			return model;
		});
		ModelHelper.setItemModel(hatEilifligronium, () -> {
			ItemModelStandard model = new ItemModelStandard(hatEilifligronium, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/eilifligronium_helmet"));
			return model;
		});
		ModelHelper.setItemModel(hatEilifligronium, () -> {
			ItemModelStandard model = new ItemModelStandard(hatEilifligronium, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/eilifligronium_helmet"));
			return model;
		});
		ModelHelper.setItemModel(shirtEilifligronium, () -> {
			ItemModelStandard model = new ItemModelStandard(shirtEilifligronium, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/eilifligronium_chestplate"));
			return model;
		});
		ModelHelper.setItemModel(pantsEilifligronium, () -> {
			ItemModelStandard model = new ItemModelStandard(pantsEilifligronium, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/eilifligronium_leggings"));
			return model;
		});
		ModelHelper.setItemModel(feetsiesEilifligronium, () -> {
			ItemModelStandard model = new ItemModelStandard(feetsiesEilifligronium, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/eilifligronium_boots"));
			return model;
		});
	}

	@Override
	public void initEntityModels(EntityRenderDispatcher dispatcher) {

	}

	@Override
	public void initTileEntityModels(TileEntityRenderDispatcher dispatcher) {

	}

	@Override
	public void initBlockColors(BlockColorDispatcher dispatcher) {

	}
}

