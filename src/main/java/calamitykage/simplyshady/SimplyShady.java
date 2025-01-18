package calamitykage.simplyshady;

import calamitykage.simplyshady.item.SimplyShadyFireSword;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.crafting.LookupFuelFurnace;
import net.minecraft.core.crafting.LookupFuelFurnaceBlast;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ArmorMaterial;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.ItemToolAxe;
import net.minecraft.core.item.tool.ItemToolHoe;
import net.minecraft.core.item.tool.ItemToolPickaxe;
import net.minecraft.core.item.tool.ItemToolShovel;
import net.minecraft.core.item.tool.ItemToolSword;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.ArmorHelper;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.ConfigHandler;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;
import net.minecraft.core.block.Block;

import java.util.Properties;

public class SimplyShady implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint {
    public static final String MOD_ID = "simplyshady";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static int itemId;
	public static int blockId;
	static {
		Properties prop = new Properties();
		prop.setProperty("starting_block_id","4700");
		prop.setProperty("starting_item_id","16200");
		ConfigHandler config = new ConfigHandler(MOD_ID,prop);

		blockId = config.getInt("starting_block_id");
		itemId = config.getInt("starting_item_id");
		config.updateConfig();
	}
	public static Block seidriliumBlock = new BlockBuilder(MOD_ID)
		.setSideTextures(MOD_ID + ":block/seidrilium_block_side")
		.setTopTexture(MOD_ID + ":block/seidrilium_block_top")
		.setBottomTexture(MOD_ID + ":block/seidrilium_block_bottom")
		.setHardness(6f)
		.setResistance(3000f)
		.setLuminance(25)
		.addTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("block.seidrilium", blockId++, Material.metal));
	public static Block einvadrilBlock = new BlockBuilder(MOD_ID)
		.setSideTextures(MOD_ID + ":block/einvadril_block_side")
		.setTopTexture(MOD_ID + ":block/einvadril_block_top")
		.setBottomTexture(MOD_ID + ":block/einvadril_block_bottom")
		.setHardness(7f)
		.setResistance(4000f)
		.addTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("block.einvadril", blockId++, Material.metal));
	public static Block hlifintiteBlock = new BlockBuilder(MOD_ID)
		.setSideTextures(MOD_ID + ":block/hlifintite_block_side")
		.setTopTexture(MOD_ID + ":block/hlifintite_block_top")
		.setBottomTexture(MOD_ID + ":block/hlifintite_block_bottom")
		.setHardness(8f)
		.setResistance(9001f)
		.addTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("block.hlifintite", blockId++, Material.metal));
	public static Block eilifligroniumBlock = new BlockBuilder(MOD_ID)
		.setSideTextures(MOD_ID + ":block/eilifligronium_block_side")
		.setTopTexture(MOD_ID + ":block/eilifligronium_block_top")
		.setBottomTexture(MOD_ID + ":block/eilifligronium_block_bottom")
		.setHardness(12f)
		.setResistance(16000f)
		.addTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("block.eilifligronium", blockId++, Material.metal));
	public static Block eilifligrLamp = new BlockBuilder(MOD_ID)
		.setSideTextures(MOD_ID + ":block/eilifligrlamp_side")
		.setTopTexture(MOD_ID + ":block/eilifligrlamp_top")
		.setBottomTexture(MOD_ID + ":block/eilifligrlamp_bottom")
		.setHardness(12f)
		.setResistance(16000f)
		.setLuminance(30)
		.addTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("block.eilifligrlamp", blockId++, Material.metal));

	public static ToolMaterial seidriliumTool = new ToolMaterial().setDurability(14162).setEfficiency(18.0f, 22.0f).setMiningLevel(7).setDamage(6);
	public static ToolMaterial einvadrilTool = new ToolMaterial().setDurability(16384).setEfficiency(14.0f, 20.0f).setMiningLevel(9).setDamage(8);
	public static ToolMaterial hlifintiteTool = new ToolMaterial().setDurability(23150).setEfficiency(16.0f, 16.0f).setMiningLevel(11).setDamage(7);
	public static ToolMaterial eilifligroniumTool = new ToolMaterial().setDurability(-1).setEfficiency(25.0f, 25.0f).setMiningLevel(25).setDamage(25);
	public static ArmorMaterial seidriliumArmor = ArmorHelper.createArmorMaterial(MOD_ID, "seidrilium", 15000, 65f, 65f, 65f, 90f);
	public static ArmorMaterial einvadrilArmor = ArmorHelper.createArmorMaterial(MOD_ID, "einvadril", 17000, 90f, 65f, 90f, 65f);
	public static ArmorMaterial hlifintiteArmor = ArmorHelper.createArmorMaterial(MOD_ID, "hlifintite", 24000, 90f, 90f, 65f, 65f);
	public static ArmorMaterial eilifligroniumArmor = ArmorHelper.createArmorMaterial(MOD_ID, "eilifligronium", -1, 100f, 100f, 100f, 100f);
	public static Item ingotSeidriliumIngot = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/seidrilium_ingot")
		.build(new Item("ingot.seidrilium", itemId++));
	public static Item rawSeidriliumRaw = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/raw_seidrilium")
		.build(new Item("seidrilium.raw", itemId++));
	public static Item toolSwordSeidrilium = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/seidrilium_sword")
		.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
		.build(new ItemToolSword("tool.sword.seidrilium", itemId++, seidriliumTool));
	public static Item toolAxeSeidrilium = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/seidrilium_axe")
		.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
		.build(new ItemToolAxe("tool.axe.seidrilium", itemId++, seidriliumTool));
	public static Item toolPickaxeSeidrilium = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/seidrilium_pickaxe")
		.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
		.build(new ItemToolPickaxe("tool.pickaxe.seidrilium", itemId++, seidriliumTool));
	public static Item toolShovelSeidrilium = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/seidrilium_shovel")
		.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
		.build(new ItemToolShovel("tool.shovel.seidrilium", itemId++, seidriliumTool));
	public static Item toolHoeSeidrilium = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/seidrilium_hoe")
		.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
		.build(new ItemToolHoe("tool.hoe.seidrilium", itemId++, seidriliumTool));
	public static Item hatSeidrilium = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/seidrilium_helmet")
		.build(new ItemArmor("helmet.seidrilium", itemId++, seidriliumArmor, 0));
	public static Item shirtSeidrilium = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/seidrilium_chestplate")
		.build(new ItemArmor("chestplate.seidrilium", itemId++, seidriliumArmor, 1));
	public static Item pantsSeidrilium = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/seidrilium_leggings")
		.build(new ItemArmor("leggings.seidrilium", itemId++, seidriliumArmor, 2));
	public static Item feetsiesSeidrilium = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/seidrilium_boots")
		.build(new ItemArmor("boots.seidrilium", itemId++, seidriliumArmor, 3));
	public static Item ingotEinvadrilIngot = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/einvadril_ingot")
		.build(new Item("ingot.einvadril", itemId++));
	public static Item rawEinvadrilRaw = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/raw_einvadril")
		.build(new Item("einvadril.raw", itemId++));
	public static Item toolSwordEinvadril = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/einvadril_sword")
		.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
		.build(new SimplyShadyFireSword("tool.sword.einvadril", itemId++, einvadrilTool));
	public static Item toolAxeEinvadril = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/einvadril_axe")
		.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
		.build(new ItemToolAxe("tool.axe.einvadril", itemId++, einvadrilTool));
	public static Item toolPickaxeEinvadril = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/einvadril_pickaxe")
		.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
		.build(new ItemToolPickaxe("tool.pickaxe.einvadril", itemId++, einvadrilTool));
	public static Item toolShovelEinvadril = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/einvadril_shovel")
		.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
		.build(new ItemToolShovel("tool.shovel.einvadril", itemId++, einvadrilTool));
	public static Item toolHoeEinvadril = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/einvadril_hoe")
		.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
		.build(new ItemToolHoe("tool.hoe.einvadril", itemId++, einvadrilTool));
	public static Item hatEinvadril = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/einvadril_helmet")
		.build(new ItemArmor("helmet.einvadril", itemId++, einvadrilArmor, 0));
	public static Item shirtEinvadril = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/einvadril_chestplate")
		.build(new ItemArmor("chestplate.einvadril", itemId++, einvadrilArmor, 1));
	public static Item pantsEinvadril = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/einvadril_leggings")
		.build(new ItemArmor("leggings.einvadril", itemId++, einvadrilArmor, 2));
	public static Item feetsiesEinvadril = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/einvadril_boots")
		.build(new ItemArmor("boots.einvadril", itemId++, einvadrilArmor, 3));
	public static Item loptFuel = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/lopt_fuel")
		.setItemModel((i) -> new ItemModelStandard(i, null))
		.build(new Item("fuel.lopt", itemId++));
	public static Item ingotHlifintiteIngot = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/hlifintite_ingot")
		.build(new Item("ingot.hlifintite", itemId++));
	public static Item rawHlifintiteRaw = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/raw_hlifintite")
		.build(new Item("hlifintite.raw", itemId++));
	public static Item toolSwordHlifintite = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/hlifintite_sword")
		.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
		.build(new ItemToolSword("tool.sword.hlifintite", itemId++, hlifintiteTool));
	public static Item toolAxeHlifintite = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/hlifintite_axe")
		.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
		.build(new ItemToolAxe("tool.axe.hlifintite", itemId++, hlifintiteTool));
	public static Item toolPickaxeHlifintite = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/hlifintite_pickaxe")
		.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
		.build(new ItemToolPickaxe("tool.pickaxe.hlifintite", itemId++, hlifintiteTool));
	public static Item toolShovelHlifintite = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/hlifintite_shovel")
		.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
		.build(new ItemToolShovel("tool.shovel.hlifintite", itemId++, hlifintiteTool));
	public static Item toolHoeHlifintite = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/hlifintite_hoe")
		.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
		.build(new ItemToolHoe("tool.hoe.hlifintite", itemId++, hlifintiteTool));
	public static Item hatHlifintite = new ItemBuilder(MOD_ID)
		.setIcon("simplyshady:item/hlifintite_helmet")
		.build(new ItemArmor("helmet.hlifintite", itemId++, hlifintiteArmor, 0));
	public static Item shirtHlifintite = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/hlifintite_chestplate")
		.build(new ItemArmor("chestplate.hlifintite", itemId++, hlifintiteArmor, 1));
	public static Item pantsHlifintite = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/hlifintite_leggings")
		.build(new ItemArmor("leggings.hlifintite", itemId++, hlifintiteArmor, 2));
	public static Item feetsiesHlifintite = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/hlifintite_boots")
		.build(new ItemArmor("boots.hlifintite", itemId++, hlifintiteArmor, 3));
	public static Item ingotEilifligroniumIngot = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/eilifligronium_ingot")
		.build(new Item("ingot.eilifligronium", itemId++));
	public static Item toolSwordEilifligronium = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/eilifligronium_sword")
		.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
		.build(new SimplyShadyFireSword("tool.sword.eilifligronium", itemId++, eilifligroniumTool));
	public static Item toolAxeEilifligronium = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/eilifligronium_axe")
		.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
		.build(new ItemToolAxe("tool.axe.eilifligronium", itemId++, eilifligroniumTool));
	public static Item toolPickaxeEilifligronium = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/eilifligronium_pickaxe")
		.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
		.build(new ItemToolPickaxe("tool.pickaxe.eilifligronium", itemId++, eilifligroniumTool));
	public static Item toolShovelEilifligronium = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/eilifligronium_shovel")
		.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
		.build(new ItemToolShovel("tool.shovel.eilifligronium", itemId++, eilifligroniumTool));
	public static Item toolHoeEilifligronium= new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/eilifligronium_hoe")
		.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
		.build(new ItemToolHoe("tool.hoe.eilifligronium", itemId++, eilifligroniumTool));
	public static Item hatEilifligronium = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/eilifligronium_helmet")
		.build(new ItemArmor("helmet.eilifligronium", itemId++, eilifligroniumArmor, 0));
	public static Item shirtEilifligronium = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/eilifligronium_chestplate")
		.build(new ItemArmor("chestplate.eilifligronium", itemId++, eilifligroniumArmor, 1));
	public static Item pantsEilifligronium = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/eilifligronium_leggings")
		.build(new ItemArmor("leggings.eilifligronium", itemId++, eilifligroniumArmor, 2));
	public static Item feetsiesEilifligronium = new ItemBuilder(MOD_ID)
		.setIcon(MOD_ID + ":item/eilifligronium_boots")
		.build(new ItemArmor("boots.eilifligronium", itemId++, eilifligroniumArmor, 3));

	@Override
	public void onInitialize() {
		LOGGER.info("SimplyShady initialized.");
	}

	@Override
	public void beforeGameStart() {

	}

	@Override
	public void afterGameStart() {

	}

	@Override
	public void onRecipesReady() {
	LookupFuelFurnace.instance.addFuelEntry(loptFuel.id, 28000);
	LookupFuelFurnaceBlast.instance.addFuelEntry(loptFuel.id, 28000);

	RecipeBuilder.Shaped(MOD_ID)
		.setShape(
			"CGC",
			"G G",
			"CGC")
		.addInput('G', Block.glowstone)
		.addInput('C', Item.ingotSteelCrude)
		.create("raw_seidrilium", rawSeidriliumRaw.getDefaultStack());
	RecipeBuilder.Shaped(MOD_ID)
		.setShape(
			"CGC",
			"G G",
			"CGC")
		.addInput('G', Item.nethercoal)
		.addInput('C', ingotSeidriliumIngot)
		.create("raw_einvadril", rawEinvadrilRaw.getDefaultStack());
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"CGC",
				"G G",
				"CGC")
			.addInput('G', Block.blockLapis)
			.addInput('C', ingotEinvadrilIngot)
			.create("raw_hlifintite", rawHlifintiteRaw.getDefaultStack());
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
			.addInput('E', Block.blockNetherCoal)
			.create("lopt_fuel", loptFuel.getDefaultStack());
	RecipeBuilder.Shaped(MOD_ID)
		.setShape(
			"EEE",
			"EEE",
			"EEE")
		.addInput('E', ingotEinvadrilIngot)
		.create("block_of_einvadril", einvadrilBlock.getDefaultStack());
	RecipeBuilder.Shaped(MOD_ID)
		.setShape(
			"SSS",
			"SSS",
			"SSS")
		.addInput('S', ingotSeidriliumIngot)
		.create("block_of_seidrilium", seidriliumBlock.getDefaultStack());
	RecipeBuilder.Shaped(MOD_ID)
		.setShape(
			"HHH",
			"HHH",
			"HHH")
		.addInput('H', ingotHlifintiteIngot)
		.create("block_of_hlifintite", hlifintiteBlock.getDefaultStack());
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"UUU",
				"UUU",
				"UUU")
			.addInput('U', ingotEilifligroniumIngot)
			.create("eilifligronium_block", eilifligroniumBlock.getDefaultStack());
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"LUL",
				"USU",
				"LUL")
			.addInput('U', ingotEilifligroniumIngot)
			.addInput('L', loptFuel)
			.addInput('S', seidriliumBlock)
			.create("eilifligrlamp", eilifligrLamp.getDefaultStack());
	RecipeBuilder.Shaped(MOD_ID)
		.setShape(
			"DDD",
			" S ",
			" S ")
		.addInput('D', ingotSeidriliumIngot)
		.addInput('S', Item.stick)
		.create("seidrilium_pickaxe", toolPickaxeSeidrilium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"DD ",
				"DS ",
				" S ")
			.addInput('D', ingotSeidriliumIngot)
			.addInput('S', Item.stick)
			.create("seidrilium_axe", toolAxeSeidrilium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" D ",
				" S ",
				" S ")
			.addInput('D', ingotSeidriliumIngot)
			.addInput('S', Item.stick)
			.create("seidrilium_shovel", toolShovelSeidrilium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"DD ",
				" S ",
				" S ")
			.addInput('D', ingotSeidriliumIngot)
			.addInput('S', Item.stick)
			.create("seidrilium_hoe", toolHoeSeidrilium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" D ",
				" D ",
				" S ")
			.addInput('D', ingotSeidriliumIngot)
			.addInput('S', Item.stick)
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
			"EEE",
			" S ",
			" S ")
		.addInput('E', ingotEinvadrilIngot)
		.addInput('S', Item.stick)
		.create("einvadril_pickaxe", toolPickaxeEinvadril);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"EE ",
				" S ",
				" S ")
			.addInput('E', ingotEinvadrilIngot)
			.addInput('S', Item.stick)
			.create("einvadril_hoe", toolHoeEinvadril);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"EE ",
				"ES ",
				" S ")
			.addInput('E', ingotEinvadrilIngot)
			.addInput('S', Item.stick)
			.create("einvadril_axe", toolAxeEinvadril);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" E ",
				" S ",
				" S ")
			.addInput('E', ingotEinvadrilIngot)
			.addInput('S', Item.stick)
			.create("einvadril_shovel", toolShovelEinvadril);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" E ",
				" E ",
				" S ")
			.addInput('E', ingotEinvadrilIngot)
			.addInput('S', Item.stick)
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
			"HHH",
			" S ",
			" S ")
		.addInput('H', ingotHlifintiteIngot)
		.addInput('S', Item.stick)
		.create("hlifintite_pickaxe", toolPickaxeHlifintite);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"HH ",
				"HS ",
				" S ")
			.addInput('H', ingotHlifintiteIngot)
			.addInput('S', Item.stick)
			.create("hlifintite_axe", toolAxeHlifintite);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" H ",
				" S ",
				" S ")
			.addInput('H', ingotHlifintiteIngot)
			.addInput('S', Item.stick)
			.create("hlifintite_shovel", toolShovelHlifintite);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"HH ",
				" S ",
				" S ")
			.addInput('H', ingotHlifintiteIngot)
			.addInput('S', Item.stick)
			.create("hlifintite_hoe", toolHoeHlifintite);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" H ",
				" H ",
				" S ")
			.addInput('H', ingotHlifintiteIngot)
			.addInput('S', Item.stick)
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
			.addInput('H', ingotEinvadrilIngot)
			.create("hlifintite_leggings", pantsHlifintite);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"H H",
				"H H",
				"   ")
			.addInput('H', ingotEinvadrilIngot)
			.create("hlifintite_boots", feetsiesHlifintite);
	RecipeBuilder.Shaped(MOD_ID)
		.setShape(
			"UU ",
			" L ",
			" L ")
		.addInput('U', ingotEilifligroniumIngot)
		.addInput('L', Block.blockLapis)
		.create("eilifligronium_hoe", toolHoeEilifligronium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"UU ",
				"UL ",
				" L ")
			.addInput('U', ingotEilifligroniumIngot)
			.addInput('L', Block.blockLapis)
			.create("eilifligronium_axe", toolAxeEilifligronium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" U ",
				" L ",
				" L ")
			.addInput('H', ingotEilifligroniumIngot)
			.addInput('L', Block.blockLapis)
			.create("eilifligronium_shovel", toolShovelEilifligronium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"UUU",
				" L ",
				" L ")
			.addInput('H', ingotEilifligroniumIngot)
			.addInput('L', Block.blockLapis)
			.create("eilifligronium_pickaxe", toolPickaxeEilifligronium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" U ",
				" U ",
				" L ")
			.addInput('U', ingotEilifligroniumIngot)
			.addInput('L', Block.blockLapis)
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
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(rawSeidriliumRaw)
			.create("seidrilium_ingot", new ItemStack(SimplyShady.ingotSeidriliumIngot));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(rawEinvadrilRaw)
			.create("einvadril_ingot", new ItemStack(SimplyShady.ingotEinvadrilIngot));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(rawHlifintiteRaw)
			.create("hlifintite_ingot", new ItemStack(SimplyShady.ingotHlifintiteIngot));
	}

	@Override
	public void initNamespaces() {
		RecipeBuilder.initNameSpace(MOD_ID);
	}
}
