package calamitykage.terraponbta73.item;

import calamitykage.terraponbta73.TerraponBTA73Config;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicLeavesBase;
import net.minecraft.core.block.BlockLogicOreCoal;
import net.minecraft.core.data.tag.Tag;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.material.ArmorMaterial;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.*;
import turniplabs.halplibe.helper.ArmorHelper;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.ConfigHandler;

import static calamitykage.terraponbta73.TerraponBTA73.MOD_ID;
import java.util.Properties;

public class TerraponBTA73Items {
	private static int startingID = TerraponBTA73Config.CFG.getInt("IDs.startingItemID");
	public static final ConfigHandler config;

	private static int nextID() {
		return startingID++;
	}

	static {
		Properties prop = new Properties();
		prop.setProperty("durability.seidriliumArmor", "8168");
		prop.setProperty("durability.sollogiumArmor", "8168");
		prop.setProperty("durability.framiumArmor", "8192");
		prop.setProperty("durability.einvadrilArmor", "6124");
		prop.setProperty("durability.mattriteArmor", "6284");
		prop.setProperty("durability.feigrilArmor", "6862");
		prop.setProperty("durability.hlifintiteArmor", "12862");
		prop.setProperty("durability.ginnungienArmor", "13142");
		prop.setProperty("durability.modrastiriumArmor", "14644");
		prop.setProperty("durability.eilifligroniumArmor", "-1");

		prop.setProperty("durability.seidriliumTool", "8168");
		prop.setProperty("durability.sollogiumTool", "8168");
		prop.setProperty("durability.framiumTool", "8192");
		prop.setProperty("durability.einvadrilTool", "6124");
		prop.setProperty("durability.mattriteTool", "6284");
		prop.setProperty("durability.feigrilTool", "6862");
		prop.setProperty("durability.hlifintiteTool", "12862");
		prop.setProperty("durability.ginnungienTool", "13142");
		prop.setProperty("durability.modrastiriumTool", "14644");
		prop.setProperty("durability.eilifligroniumTool", "-1");

		config = new ConfigHandler(MOD_ID, prop);
	}

	public static void initializeArmorMaterials() {
		seidriliumArmor = ArmorHelper.createArmorMaterial(MOD_ID, "seidrilium", config.getInt("durability.seidriliumArmor"), 65f, 65f, 65f, 65f);
		sollogiumArmor = ArmorHelper.createArmorMaterial(MOD_ID, "sollogium", config.getInt("durability.sollogiumArmor"), 55f, 55f, 95f, 55f);
		framiumArmor = ArmorHelper.createArmorMaterial(MOD_ID, "framium", config.getInt("durability.framiumArmor"), 65f, 65f, 65f, 65f);
		einvadrilArmor = ArmorHelper.createArmorMaterial(MOD_ID, "einvadril", config.getInt("durability.einvadrilArmor"), 95f, 55f, 55f, 55f);
		mattriteArmor = ArmorHelper.createArmorMaterial(MOD_ID, "mattrite", config.getInt("durability.mattriteArmor"), 95f, 55f, 55f, 55f);
		feigrilArmor = ArmorHelper.createArmorMaterial(MOD_ID, "feigril", config.getInt("durability.feigrilArmor"), 95f, 55f, 55f, 55f);
		hlifintiteArmor = ArmorHelper.createArmorMaterial(MOD_ID, "hlifintite", config.getInt("durability.hlifintiteArmor"), 80f, 80f, 80f, 80f);
		ginnungienArmor = ArmorHelper.createArmorMaterial(MOD_ID, "ginnungien", config.getInt("durability.ginnungienArmor"), 70f, 70f, 70f, 100f);
		modrastiriumArmor = ArmorHelper.createArmorMaterial(MOD_ID, "modrastirium", config.getInt("durability.modrastiriumArmor"), 85f, 75f, 85f, 75f);
		eilifligroniumArmor = ArmorHelper.createArmorMaterial(MOD_ID, "eilifligronium", config.getInt("durability.eilifligroniumArmor"), 100f, 100f, 100f, 100f);
	}

	public static void initializeToolMaterials() {
		seidriliumTool = new ToolMaterial().setDurability(config.getInt("durability.seidriliumTool")).setEfficiency(22.0f, 26.0f).setMiningLevel(8).setDamage(10);
		sollogiumTool = new ToolMaterial().setDurability(config.getInt("durability.sollogiumTool")).setEfficiency(17.0f, 15.0f).setMiningLevel(8).setDamage(10);
		framiumTool = new ToolMaterial().setDurability(config.getInt("durability.framiumTool")).setEfficiency(17.0f, 15.0f).setMiningLevel(8).setDamage(9);
		einvadrilTool = new ToolMaterial().setDurability(config.getInt("durability.einvadrilTool")).setEfficiency(14.0f, 20.0f).setMiningLevel(7).setDamage(14);
		mattriteTool = new ToolMaterial().setDurability(config.getInt("durability.mattriteTool")).setEfficiency(15.0f, 21.0f).setMiningLevel(7).setDamage(13);
		feigrilTool = new ToolMaterial().setDurability(config.getInt("durability.feigrilTool")).setEfficiency(13.0f, 24.0f).setMiningLevel(7).setDamage(12);
		hlifintiteTool = new ToolMaterial().setDurability(config.getInt("durability.hlifintiteTool")).setEfficiency(12.0f, 12.0f).setMiningLevel(12).setDamage(7);
		ginnungienTool = new ToolMaterial().setDurability(config.getInt("durability.ginnungienTool")).setEfficiency(12.0f, 12.0f).setMiningLevel(11).setDamage(7);
		modrastiriumTool = new ToolMaterial().setDurability(config.getInt("durability.modrastiriumTool")).setEfficiency(10.0f, 10.0f).setMiningLevel(13).setDamage(7);
		eilifligroniumTool = new ToolMaterial().setDurability(config.getInt("durability.eilifligroniumTool")).setEfficiency(25.0f, 30.0f).setMiningLevel(25).setDamage(25);
	}

	public static ArmorMaterial seidriliumArmor;
	public static ArmorMaterial sollogiumArmor;
	public static ArmorMaterial framiumArmor;
	public static ArmorMaterial mattriteArmor;
	public static ArmorMaterial einvadrilArmor;
	public static ArmorMaterial feigrilArmor;
	public static ArmorMaterial hlifintiteArmor;
	public static ArmorMaterial ginnungienArmor;
	public static ArmorMaterial modrastiriumArmor;
	public static ArmorMaterial eilifligroniumArmor;

	public static ToolMaterial seidriliumTool;
	public static ToolMaterial sollogiumTool;
	public static ToolMaterial framiumTool;
	public static ToolMaterial mattriteTool;
	public static ToolMaterial einvadrilTool;
	public static ToolMaterial feigrilTool;
	public static ToolMaterial hlifintiteTool;
	public static ToolMaterial ginnungienTool;
	public static ToolMaterial modrastiriumTool;
	public static ToolMaterial eilifligroniumTool;

	public static Item ingotSeidriliumIngot;
	public static Item rawSeidriliumRaw;
	public static Item toolSwordSeidrilium;
	public static Item toolAxeSeidrilium;
	public static Item toolPickaxeSeidrilium;
	public static Item toolShovelSeidrilium;
	public static Item toolHoeSeidrilium;
	public static Item hatSeidrilium;
	public static Item shirtSeidrilium;
	public static Item pantsSeidrilium;
	public static Item feetsiesSeidrilium;
	public static Item ingotEinvadrilIngot;
	public static Item rawEinvadrilRaw;
	public static Item toolSwordEinvadril;
	public static Item toolAxeEinvadril;
	public static Item toolPickaxeEinvadril;
	public static Item toolShovelEinvadril;
	public static Item toolHoeEinvadril;
	public static Item hatEinvadril;
	public static Item shirtEinvadril;
	public static Item pantsEinvadril;
	public static Item feetsiesEinvadril;
	public static Item ingotHlifintiteIngot;
	public static Item rawHlifintiteRaw;
	public static Item loptFuel;
	public static Item toolSwordHlifintite;
	public static Item toolAxeHlifintite;
	public static Item toolPickaxeHlifintite;
	public static Item toolShovelHlifintite;
	public static Item toolHoeHlifintite;
	public static Item hatHlifintite;
	public static Item shirtHlifintite;
	public static Item pantsHlifintite;
	public static Item feetsiesHlifintite;
	public static Item ingotEilifligroniumIngot;
	public static Item toolSwordEilifligronium;
	public static Item toolAxeEilifligronium;
	public static Item toolPickaxeEilifligronium;
	public static Item toolShovelEilifligronium;
	public static Item toolHoeEilifligronium;
	public static Item hatEilifligronium;
	public static Item shirtEilifligronium;
	public static Item pantsEilifligronium;
	public static Item feetsiesEilifligronium;
	public static Item orbOfRogmal;
	public static Item steelRod;
	public static Item redstoneAlloy;
	public static Item redstoneAlloyRod;
	public static Item lapisAlloy;
	public static Item lapisAlloyRod;
	public static Item glowstoneAlloy;
	public static Item obsidianAlloy;
	public static Item obsidianAlloyRod;
	public static Item rawSollogiumRaw;
	public static Item ingotSollogiumIngot;
	public static Item toolPickaxeSollogium;
	public static Item toolAxeSollogium;
	public static Item toolSwordSollogium;
	public static Item toolShovelSollogium;
	public static Item toolHoeSollogium;
	public static Item hatSollogium;
	public static Item shirtSollogium;
	public static Item pantsSollogium;
	public static Item feetsiesSollogium;
	public static Item balloflava;
	public static Item lavastar;
	public static Item hellingot;
	public static Item reinforcedLeather;
	public static Item rawFramiumRaw;
	public static Item ingotFramiumIngot;
	public static Item toolPickaxeFramium;
	public static Item toolAxeFramium;
	public static Item toolSwordFramium;
	public static Item toolShovelFramium;
	public static Item toolHoeFramium;
	public static Item hatFramium;
	public static Item shirtFramium;
	public static Item pantsFramium;
	public static Item feetsiesFramium;
	public static Item gaiaEssence;
	public static Item radiantGaiaEssence;
	public static Item infusedGold;
	public static Item infusedGoldRod;
	public static Item gaiaSteel;

	public static void initializeItems() {

// Basic Items used to craft the new stuff

 	orbOfRogmal = new ItemBuilder(MOD_ID)
		.build(new Item("orbofrogmal", MOD_ID + (":item/orbofrogmal"), nextID()));
	steelRod = new ItemBuilder(MOD_ID)
		.build(new Item("steel.rod", MOD_ID + ":item/steel_rod", nextID()));
	redstoneAlloy = new ItemBuilder(MOD_ID)
		.build(new Item("redstone.alloy", MOD_ID + ":item/redstone_alloy", nextID()));
	redstoneAlloyRod = new ItemBuilder(MOD_ID)
		.build(new Item("redstone.alloy.rod", MOD_ID + ":item/redstone_alloy_rod", nextID()));
	lapisAlloy = new ItemBuilder(MOD_ID)
		.build(new Item("lapis.alloy", MOD_ID + ":item/lapis_alloy", nextID()));
	lapisAlloyRod = new ItemBuilder(MOD_ID)
		.build(new Item("lapis.alloy.rod", MOD_ID + ":item/lapis_alloy_rod", nextID()));
	obsidianAlloy = new ItemBuilder(MOD_ID)
		.build(new Item("obsidian.alloy", MOD_ID + ":item/obsidian_alloy", nextID()));
	obsidianAlloyRod = new ItemBuilder(MOD_ID)
		.build(new Item("obsidian.alloy.rod", MOD_ID + ":item/obsidian_alloy_rod", nextID()));
	glowstoneAlloy = new ItemBuilder(MOD_ID)
		.build(new Item("glowstone.alloy", MOD_ID + ":item/glowstone_alloy", nextID()));
	balloflava = new ItemBuilder(MOD_ID)
		.build(new Item("balloflava", MOD_ID + ("item:/ball_of_lava"), nextID()));
	lavastar = new ItemBuilder(MOD_ID)
		.build(new Item("lavastar", MOD_ID + ("item:/lavastar"), nextID()));
	hellingot = new ItemBuilder(MOD_ID)
		.build(new Item("hell.ingot", MOD_ID + ("item:/hell_ingot"), nextID()));
	reinforcedLeather = new ItemBuilder(MOD_ID)
		.build(new Item("reinforced.leather", MOD_ID + ("item:/reinforced_leather"), nextID()));
	gaiaEssence = new ItemBuilder(MOD_ID)
		.build(new Item("gaia.essence", MOD_ID + ("item:/gaia_essence"), nextID()));
	radiantGaiaEssence = new ItemBuilder(MOD_ID)
		.build(new Item("radiant.gaia.essence", MOD_ID + ("item:/radiant_gaia_essence"), nextID()));
	gaiaSteel = new ItemBuilder(MOD_ID)
		.build(new Item("gaia.steel", MOD_ID + ("item:/gaia_steel"), nextID()));
	infusedGold = new ItemBuilder(MOD_ID)
		.build(new Item("infused.gold", MOD_ID + ("item:/infused_gold"), nextID()));
	infusedGoldRod = new ItemBuilder(MOD_ID)
		.build(new Item("infused.gold.rod", MOD_ID + ("item:/infused_gold_rod"), nextID()));


// Seidrilium (Magick... *snort snort*)

	rawSeidriliumRaw = new ItemBuilder(MOD_ID)
		.build(new Item("raw.seidrilium", MOD_ID + ":item/raw_seidrilium", nextID()));
	ingotSeidriliumIngot = new ItemBuilder(MOD_ID)
		.build(new Item("seidrilium.ingot", MOD_ID + (":item/seidrilium_ingot"), nextID()));
	toolSwordSeidrilium = new ItemBuilder(MOD_ID)
		.build(new ItemToolSword("seidrilium.sword", MOD_ID + (":item/seidrilium_sword"), nextID(), seidriliumTool));
	toolAxeSeidrilium = new ItemBuilder(MOD_ID)
		.build(new ItemToolAxe("seidrilium.axe", MOD_ID + (":item/seidrilium_axe"), nextID(), seidriliumTool));
	toolPickaxeSeidrilium = new ItemBuilder(MOD_ID)
		.build(new ItemToolPickaxe("seidrilium.pickaxe", MOD_ID + (":item/seidrilium_pickaxe"), nextID(), seidriliumTool));
	toolShovelSeidrilium = new ItemBuilder(MOD_ID)
		.build(new ItemToolShovel("seidrilium.shovel", MOD_ID + (":item/seidrilium_shovel"), nextID(), seidriliumTool));
	toolHoeSeidrilium = new ItemBuilder(MOD_ID)
		.build(new ItemToolHoe("seidrilium.hoe", MOD_ID + (":item/seidrilium_hoe"), nextID(), seidriliumTool));
	hatSeidrilium = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("seidrilium.helmet", MOD_ID + (":item/seidrilium_helmet"), nextID(), seidriliumArmor, 3));
	shirtSeidrilium = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("seidrilium.chestplate", MOD_ID + (":item/seidrilium_chestplate"), nextID(), seidriliumArmor, 2));
	pantsSeidrilium = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("seidrilium.leggings", MOD_ID + (":item/seidrilium_leggings"), nextID(), seidriliumArmor, 1));
	feetsiesSeidrilium = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("seidrilium.boots", MOD_ID + (":item/seidrilium_boots"), nextID(), seidriliumArmor, 0));


// Einvadril (EINVADRIL (HULK) STRONGEST THERE IS!)

	rawEinvadrilRaw = new ItemBuilder(MOD_ID)
		.build(new Item("raw.einvadril", MOD_ID + ":item/raw_Einvadril", nextID()));
	ingotEinvadrilIngot = new ItemBuilder(MOD_ID)
		.build(new Item("einvadril.ingot", MOD_ID + (":item/einvadril_ingot"), nextID()));
	toolSwordEinvadril = new ItemBuilder(MOD_ID)
		.build(new ItemToolSword("einvadril.sword", MOD_ID + (":item/einvadril_sword"), nextID(), einvadrilTool));
	toolAxeEinvadril = new ItemBuilder(MOD_ID)
		.build(new ItemToolAxe("einvadril.axe", MOD_ID + (":item/einvadril_axe"), nextID(), einvadrilTool));
	toolPickaxeEinvadril = new ItemBuilder(MOD_ID)
		.build(new ItemToolPickaxe("einvadril.pickaxe", MOD_ID + (":item/einvadril_pickaxe"), nextID(), einvadrilTool));
	toolShovelEinvadril = new ItemBuilder(MOD_ID)
		.build(new ItemToolShovel("einvadril.shovel", MOD_ID + (":item/einvadril_shovel"), nextID(), einvadrilTool));
	toolHoeEinvadril = new ItemBuilder(MOD_ID)
		.build(new ItemToolHoe("einvadril.hoe", MOD_ID + (":item/einvadril_hoe"), nextID(), einvadrilTool));
	hatEinvadril = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("einvadril.helmet", MOD_ID + (":item/einvadril_helmet"), nextID(), einvadrilArmor, 3));
	shirtEinvadril = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("einvadril.chestplate", MOD_ID + (":item/einvadril_chestplate"), nextID(), einvadrilArmor, 2));
	pantsEinvadril = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("einvadril.leggings", MOD_ID + (":item/einvadril_leggings"), nextID(), einvadrilArmor, 1));
	feetsiesEinvadril = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("einvadril.boots", MOD_ID + (":item/einvadril_boots"), nextID(), einvadrilArmor, 0));

// Framium (Now there's two of you?!)
		/**
	rawFramiumRaw = new ItemBuilder(MOD_ID)
		.build(new Item("raw.framium", MOD_ID + ":item/raw_framium", nextID()));
	ingotFramiumIngot = new ItemBuilder(MOD_ID)
		.build(new Item("framium.ingot", MOD_ID + (":item/framium_ingot"), nextID()));
	toolSwordFramium = new ItemBuilder(MOD_ID)
		.build(new ItemToolSword("framium.sword", MOD_ID + (":item/framium_sword"), nextID(), framiumTool));
	toolAxeFramium = new ItemBuilder(MOD_ID)
		.build(new ItemToolAxe("framium.axe", MOD_ID + (":item/framium_axe"), nextID(), framiumTool));
	toolPickaxeFramium = new ItemBuilder(MOD_ID)
		.build(new ItemToolPickaxe("framium.pickaxe", MOD_ID + (":item/framium_pickaxe"), nextID(), framiumTool));
	toolShovelFramium = new ItemBuilder(MOD_ID)
		.build(new ItemToolShovel("framium.shovel", MOD_ID + (":item/framium_shovel"), nextID(), framiumTool));
	toolHoeFramium = new ItemBuilder(MOD_ID)
		.build(new ItemToolHoe("framium.hoe", MOD_ID + (":item/framium_hoe"), nextID(), framiumTool));
	hatFramium = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("framium.helmet", MOD_ID + (":item/framium_helmet"), nextID(), framiumArmor, 3));
	shirtFramium = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("framium.chestplate", MOD_ID + (":item/framium_chestplate"), nextID(), framiumArmor, 2));
	pantsFramium = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("framium.leggings", MOD_ID + (":item/framium_leggings"), nextID(), framiumArmor, 1));
	feetsiesFramium = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("framium.boots", MOD_ID + (":item/framium_boots"), nextID(), framiumArmor, 0));
*/

// Hlifintite (Durability is very protective)

	rawHlifintiteRaw = new ItemBuilder(MOD_ID)
		.build(new Item("raw.hlifintite", MOD_ID + ":item/raw_Hlifintite", nextID()));
	ingotHlifintiteIngot = new ItemBuilder(MOD_ID)
		.build(new Item("hlifintite.ingot", MOD_ID + (":item/hlifintite_ingot"), nextID()));
	toolSwordHlifintite = new ItemBuilder(MOD_ID)
		.build(new ItemToolSword("hlifintite.sword", MOD_ID + (":item/hlifintite_sword"), nextID(), hlifintiteTool));
	toolAxeHlifintite = new ItemBuilder(MOD_ID)
		.build(new ItemToolAxe("hlifintite.axe", MOD_ID + (":item/hlifintite_axe"), nextID(), hlifintiteTool));
	toolPickaxeHlifintite = new ItemBuilder(MOD_ID)
		.build(new ItemToolPickaxe("hlifintite.pickaxe", MOD_ID + (":item/hlifintite_pickaxe"), nextID(), hlifintiteTool));
	toolShovelHlifintite = new ItemBuilder(MOD_ID)
		.build(new ItemToolShovel("hlifintite.shovel", MOD_ID + (":item/hlifintite_shovel"), nextID(), hlifintiteTool));
	toolHoeHlifintite = new ItemBuilder(MOD_ID)
		.build(new ItemToolHoe("hlifintite.hoe", MOD_ID + (":item/hlifintite_hoe"), nextID(), hlifintiteTool));
	hatHlifintite = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("hlifintite.helmet", MOD_ID + (":item/hlifintite_helmet"), nextID(), hlifintiteArmor, 3));
	shirtHlifintite = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("hlifintite.chestplate", MOD_ID + (":item/hlifintite_chestplate"), nextID(), hlifintiteArmor, 2));
	pantsHlifintite = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("hlifintite.leggings", MOD_ID + (":item/hlifintite_leggings"), nextID(), hlifintiteArmor, 1));
	feetsiesHlifintite = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("hlifintite.boots", MOD_ID + (":item/hlifintite_boots"), nextID(), hlifintiteArmor, 0));

// Sollogium (BURN BABY BURN)

	rawSollogiumRaw = new ItemBuilder(MOD_ID)
		.build(new Item("raw.sollogium", MOD_ID + ":item/raw_sollogium", nextID()));
	ingotSollogiumIngot = new ItemBuilder(MOD_ID)
		.build(new Item("sollogium.ingot", MOD_ID + (":item/sollogium_ingot"), nextID()));
	toolSwordSollogium = new ItemBuilder(MOD_ID)
		.build(new ItemToolSword("sollogium.sword", MOD_ID + (":item/sollogium_sword"), nextID(), sollogiumTool));
	toolAxeSollogium = new ItemBuilder(MOD_ID)
		.build(new ItemToolAxe("sollogium.axe", MOD_ID + (":item/sollogium_axe"), nextID(), sollogiumTool));
	toolPickaxeSollogium = new ItemBuilder(MOD_ID)
		.build(new ItemToolPickaxe("sollogium.pickaxe", MOD_ID + (":item/sollogium_pickaxe"), nextID(), sollogiumTool));
	toolShovelSollogium = new ItemBuilder(MOD_ID)
		.build(new ItemToolShovel("sollogium.shovel", MOD_ID + (":item/sollogium_shovel"), nextID(), sollogiumTool));
	toolHoeSollogium = new ItemBuilder(MOD_ID)
		.build(new ItemToolHoe("sollogium.hoe", MOD_ID + (":item/sollogium_hoe"), nextID(), sollogiumTool));
	hatSollogium = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("sollogium.helmet", MOD_ID + (":item/sollogium_helmet"), nextID(), sollogiumArmor, 3));
	shirtSollogium = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("sollogium.chestplate", MOD_ID + (":item/sollogium_chestplate"), nextID(), sollogiumArmor, 2));
	pantsSollogium = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("sollogium.leggings", MOD_ID + (":item/sollogium_leggings"), nextID(), sollogiumArmor, 1));
	feetsiesSollogium = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("sollogium.boots", MOD_ID + (":item/sollogium_boots"), nextID(), sollogiumArmor, 0));

// This is for any unique items made purely with the modded stuff I have added.

	loptFuel = new ItemBuilder(MOD_ID)
		.build(new Item("lopt.fuel", MOD_ID + (":item/lopt_fuel"), nextID()));

// Ultimate Metal Eilifligronium

	ingotEilifligroniumIngot = new ItemBuilder(MOD_ID)
		.build(new Item("eilifligronium.ingot", MOD_ID + (":item/eilifligronium_ingot"), nextID()));
	toolSwordEilifligronium = new ItemBuilder(MOD_ID)
		.build(new ItemToolSword("eilifligronium.sword", MOD_ID + (":item/eilifligronium_sword"), nextID(), eilifligroniumTool));
	toolAxeEilifligronium = new ItemBuilder(MOD_ID)
		.build(new ItemToolAxe("eilifligronium.axe", MOD_ID + (":item/eilifligronium_axe"), nextID(), eilifligroniumTool));
	toolPickaxeEilifligronium = new ItemBuilder(MOD_ID)
		.build(new ItemToolPickaxe("eilifligronium.pickaxe", MOD_ID + (":item/eilifligronium_pickaxe"), nextID(), eilifligroniumTool));
	toolShovelEilifligronium = new ItemBuilder(MOD_ID)
		.build(new ItemToolShovel("eilifligronium.shovel", MOD_ID + (":item/eilifligronium_shovel"), nextID(), eilifligroniumTool));
	toolHoeEilifligronium = new ItemBuilder(MOD_ID)
		.build(new ItemToolHoe("eilifligronium.hoe", MOD_ID + (":item/eilifligronium_hoe"), nextID(), eilifligroniumTool));
	hatEilifligronium = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("eilifligronium.helmet", MOD_ID + (":item/eilifligronium_helmet"), nextID(), eilifligroniumArmor, 3));
	shirtEilifligronium = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("eilifligronium.chestplate", MOD_ID + (":item/eilifligronium_chestplate"), nextID(), eilifligroniumArmor, 2));
	pantsEilifligronium = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("eilifligronium.leggings", MOD_ID + (":item/eilifligronium_leggings"), nextID(), eilifligroniumArmor, 1));
	feetsiesEilifligronium = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("eilifligronium.boots", MOD_ID + (":item/eilifligronium_boots"), nextID(), eilifligroniumArmor, 0));

}


}
