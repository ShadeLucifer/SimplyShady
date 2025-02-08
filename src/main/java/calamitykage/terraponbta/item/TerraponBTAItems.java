package calamitykage.terraponbta.item;

import calamitykage.terraponbta.TerraponBTA;
import calamitykage.terraponbta.blocks.ores.*;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.core.block.*;
import net.minecraft.core.data.tag.Tag;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.material.ArmorMaterial;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.*;
import sunsetsatellite.signalindustries.blocks.BlockOreDilithium;
import sunsetsatellite.signalindustries.blocks.BlockOreDimensionalShard;
import sunsetsatellite.signalindustries.blocks.BlockOreSignalum;
import turniplabs.halplibe.helper.ArmorHelper;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.util.ConfigHandler;

import static calamitykage.terraponbta.ModItemTags.fireImmuneAsEntity;
import static calamitykage.terraponbta.TerraponBTA.MOD_ID;
import java.util.Properties;

public class TerraponBTAItems {
	public static int itemId;
	public static int FORTUNE_AMOUNT;
	public static int LOOTING_AMOUNT;

	static {
		Properties prop = new Properties();
		prop.setProperty("starting_item_id","25400");
		prop.setProperty("fortune_amount","10");
		prop.setProperty("looting_amount","10");

		ConfigHandler config = new ConfigHandler(MOD_ID,prop);
		itemId = config.getInt("starting_item_id");
		FORTUNE_AMOUNT = config.getInt("fortune_amount");
		LOOTING_AMOUNT = config.getInt("looting_amount");
		config.updateConfig();
	}
	public static Tag<Block> FORCE_FORTUNE = Tag.of("terraponbtaitems$force_enable_fortune");
	public static Tag<Block> FORCE_NO_FORTUNE = Tag.of("terraponbtaitems$force_disable_fortune");
	public static boolean canBeFortuned(Block block) {
		if (block.hasTag(FORCE_FORTUNE)) return true;
		if (block.hasTag(FORCE_NO_FORTUNE)) return false;
		if (block instanceof BlockLeavesBase) return true;
		if (block instanceof BlockLog) return true;
		if (block instanceof BlockOreCoal) return true;
		if (block instanceof BlockOreDiamond) return true;
		if (block instanceof BlockOreGold) return true;
		if (block instanceof BlockOreIron) return true;
		if (block instanceof BlockOreLapis) return true;
		if (block instanceof BlockOreNetherCoal) return true;
		if (block instanceof BlockOreRedstone) return true;
		if (block instanceof BlockTallGrass) return true;
		if (block instanceof BlockEinvadrilOre) return true;
		if (block instanceof BlockSollogiumOre) return true;
		if (block instanceof BlockHlifintiteOre) return true;
		if (block instanceof BlockSeidriliumOre) return true;
		if (block instanceof BlockFramiumOre) return true;
		if (block instanceof BlockOreSignalum) return true;
		if (block instanceof BlockOreDilithium) return true;
		if (block instanceof BlockOreDimensionalShard) return true;
		return false;
	}
	public static ToolMaterial seidriliumTool = new ToolMaterial().setDurability(8392).setEfficiency(22.0f, 26.0f).setMiningLevel(5).setDamage(10);
	public static ToolMaterial sollogiumTool = new ToolMaterial().setDurability(8168).setEfficiency(17.0f, 15.0f).setMiningLevel(5).setDamage(10);
	public static ToolMaterial framiumTool = new ToolMaterial().setDurability(8192).setEfficiency(17.0f, 15.0f).setMiningLevel(5).setDamage(9);
	public static ToolMaterial einvadrilTool = new ToolMaterial().setDurability(6124).setEfficiency(14.0f, 20.0f).setMiningLevel(4).setDamage(14);
	public static ToolMaterial mattriteTool = new ToolMaterial().setDurability(6284).setEfficiency(15.0f, 21.0f).setMiningLevel(4).setDamage(13);
	public static ToolMaterial feigrilTool = new ToolMaterial().setDurability(6862).setEfficiency(13.0f, 24.0f).setMiningLevel(4).setDamage(12);
	public static ToolMaterial hlifintiteTool = new ToolMaterial().setDurability(12862).setEfficiency(12.0f, 12.0f).setMiningLevel(7).setDamage(7);
	public static ToolMaterial ginnungienTool = new ToolMaterial().setDurability(13142).setEfficiency(12.0f, 12.0f).setMiningLevel(7).setDamage(7);
	public static ToolMaterial modrastiriumTool = new ToolMaterial().setDurability(14644).setEfficiency(10.0f, 10.0f).setMiningLevel(7).setDamage(7);
	public static ToolMaterial eilifligroniumTool = new ToolMaterial().setDurability(-1).setEfficiency(25.0f, 30.0f).setMiningLevel(9).setDamage(25);

	public static ArmorMaterial seidriliumArmor = ArmorHelper.createArmorMaterial(MOD_ID, "seidrilium", 8392, 65f, 65f, 65f, 65f);
	public static ArmorMaterial sollogiumArmor = ArmorHelper.createArmorMaterial(MOD_ID, "sollogium", 8168, 55f, 55f, 100f, 55f);
	public static ArmorMaterial framiumArmor = ArmorHelper.createArmorMaterial(MOD_ID, "framium", 8192, 65f, 65f, 65f, 65f);
	public static ArmorMaterial einvadrilArmor = ArmorHelper.createArmorMaterial(MOD_ID, "einvadril", 6124, 95f, 55f, 55f, 55f);
	public static ArmorMaterial mattriteArmor = ArmorHelper.createArmorMaterial(MOD_ID, "mattrite", 6284, 95f, 55f, 55f, 55f);
	public static ArmorMaterial feigrilArmor = ArmorHelper.createArmorMaterial(MOD_ID, "feigril", 6862, 95f, 55f, 55f, 55f);
	public static ArmorMaterial hlifintiteArmor = ArmorHelper.createArmorMaterial(MOD_ID, "hlifintite", 12862, 80f, 80f, 80f, 80f);
	public static ArmorMaterial ginnungienArmor = ArmorHelper.createArmorMaterial(MOD_ID, "ginnungien", 13142, 70f, 70f, 70f, 100f);
	public static ArmorMaterial modrastiriumArmor = ArmorHelper.createArmorMaterial(MOD_ID, "modrastirium", 14644, 85f, 75f, 85f, 75f);
	public static ArmorMaterial eilifligroniumArmor = ArmorHelper.createArmorMaterial(MOD_ID, "eilifligronium", -1, 100f, 100f, 100f, 100f);

	public static Item orbOfRogmal;
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
	public static Item rawSollogiumRaw;
	public static Item ingotSollogiumIngot;
	public static Item toolSwordSollogium;
	public static Item toolAxeSollogium;
	public static Item toolPickaxeSollogium;
	public static Item toolShovelSollogium;
	public static Item toolHoeSollogium;
	public static Item hatSollogium;
	public static Item shirtSollogium;
	public static Item pantsSollogium;
	public static Item feetsiesSollogium;
	public static Item balloflava;
	public static Item lavastar;
	public static Item hellingot;
	public static Item steelRod;
	public static Item redstoneAlloy;
	public static Item redstoneAlloyRod;
	public static Item lapisAlloy;
	public static Item lapisAlloyRod;
	public static Item glowstoneAlloy;
	public static Item obsidianAlloy;
	public static Item obsidianAlloyRod;
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

	public void initializeItems() {

	// Misc. Items used for crafting all current items

		orbOfRogmal = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/orbofrogmal")
			.build(new Item("orbofrogmal", itemId++));
		steelRod = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/steel_rod")
			.build(new Item("steel.rod", itemId++));
		redstoneAlloy = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/redstone_alloy")
			.build(new Item("redstone.alloy", itemId++));
		redstoneAlloyRod = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/redstone_alloy_rod")
			.build(new Item("redstone.alloy.rod", itemId++));
		lapisAlloy = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/lapis_alloy")
			.build(new Item("lapis.alloy", itemId++));
		lapisAlloyRod = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/lapis_alloy_rod")
			.build(new Item("lapis.alloy.rod", itemId++));
		obsidianAlloy = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/obsidian_alloy")
			.build(new Item("obsidian.alloy", itemId++));
		obsidianAlloyRod = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/obsidian_alloy_rod")
			.build(new Item("obsidian.alloy.rod", itemId++));
		glowstoneAlloy = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/glowstone_alloy")
			.build(new Item("glowstone.alloy", itemId++));
		balloflava = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/ball_of_lava")
			.build(new Item("balloflava", itemId++));
		lavastar = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/lava_star")
			.build(new Item("lavastar", itemId++));
		hellingot = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/hell_ingot")
			.build(new Item("hell.ingot", itemId++));
		reinforcedLeather = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/reinforced_leather")
			.build(new Item("reinforced.leather", itemId++));
		gaiaEssence = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/gaia_essence")
			.build(new Item("gaia.essence", itemId++));
		radiantGaiaEssence = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/radiant_gaia_essence")
			.build(new Item("radiant.gaia.essence", itemId++));
		gaiaSteel = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/gaia_steel")
			.build(new Item("gaia.steel", itemId++));
		infusedGold = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/infused_gold")
			.build(new Item("infused.gold", itemId++));
		infusedGoldRod = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/infused_gold_rod")
			.build(new Item("infused.gold.rod", itemId++));

	// Seidrilium

		rawSeidriliumRaw = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/raw_seidrilium")
			.build(new Item("raw.seidrilium", itemId++));
		ingotSeidriliumIngot = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/seidrilium_ingot")
			.build(new Item("seidrilium.ingot", itemId++));
		toolSwordSeidrilium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/seidrilium_sword")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolSword("seidrilium.sword", itemId++, seidriliumTool));
		toolAxeSeidrilium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/seidrilium_axe")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolAxe("seidrilium.axe", itemId++, seidriliumTool));
		toolPickaxeSeidrilium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/seidrilium_pickaxe")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolPickaxe("seidrilium.pickaxe", itemId++, seidriliumTool));
		toolShovelSeidrilium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/seidrilium_shovel")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolShovel("seidrilium.shovel", itemId++, seidriliumTool));
		toolHoeSeidrilium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/seidrilium_hoe")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolHoe("seidrilium.hoe", itemId++, seidriliumTool));
		hatSeidrilium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/seidrilium_helmet")
			.build(new ItemArmor("seidrilium.helmet", itemId++, seidriliumArmor, 0));
		shirtSeidrilium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/seidrilium_chestplate")
			.build(new ItemArmor("seidrilium.chestplate", itemId++, seidriliumArmor, 1));
		pantsSeidrilium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/seidrilium_leggings")
			.build(new ItemArmor("seidrilium.leggings", itemId++, seidriliumArmor, 2));
		feetsiesSeidrilium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/seidrilium_boots")
			.build(new ItemArmor("seidrilium.leggings", itemId++, seidriliumArmor, 3));

	// Einvadril

		rawEinvadrilRaw = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/raw_einvadril")
			.build(new Item("raw.einvadril", itemId++));
		ingotEinvadrilIngot = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/einvadril_ingot")
			.build(new Item("einvadril.ingot", itemId++));
		toolSwordEinvadril = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/einvadril_sword")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolSword("einvadril.sword", itemId++, einvadrilTool));
		toolAxeEinvadril = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/einvadril_axe")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolAxe("einvadril.axe", itemId++, einvadrilTool));
		toolPickaxeEinvadril = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/einvadril_pickaxe")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolPickaxe("einvadril.pickaxe", itemId++, einvadrilTool));
		toolShovelEinvadril = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/einvadril_shovel")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolShovel("einvadril.shovel", itemId++, einvadrilTool));
		toolHoeEinvadril = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/einvadril_hoe")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolHoe("einvadril.hoe", itemId++, einvadrilTool));
		hatEinvadril = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/einvadril_helmet")
			.build(new ItemArmor("einvadril.helmet", itemId++, einvadrilArmor, 0));
		shirtEinvadril = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/einvadril_chestplate")
			.build(new ItemArmor("einvadril.chestplate", itemId++, einvadrilArmor, 1));
		pantsEinvadril = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/einvadril_leggings")
			.build(new ItemArmor("einvadril.leggings", itemId++, einvadrilArmor, 2));
		feetsiesEinvadril = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/einvadril_boots")
			.build(new ItemArmor("einvadril.boots", itemId++, einvadrilArmor, 3));

	// MISC Modded Recipes

		loptFuel = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/lopt_fuel")
			.setItemModel((i) -> new ItemModelStandard(i, null))
			.build(new Item("lopt.fuel", itemId++));

	// Hlifintite

		rawHlifintiteRaw = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/raw_hlifintite")
			.build(new Item("raw.hlifintite", itemId++));
		ingotHlifintiteIngot = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/hlifintite_ingot")
			.build(new Item("hlifintite.ingot", itemId++));
		toolSwordHlifintite = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/hlifintite_sword")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolSword("hlifintite.sword", itemId++, hlifintiteTool));
		toolAxeHlifintite = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/hlifintite_axe")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolAxe("hlifintite.axe", itemId++, hlifintiteTool));
		toolPickaxeHlifintite = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/hlifintite_pickaxe")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolPickaxe("hlifintite.pickaxe", itemId++, hlifintiteTool));
		toolShovelHlifintite = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/hlifintite_shovel")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolShovel("hlifintite.shovel", itemId++, hlifintiteTool));
		toolHoeHlifintite = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/hlifintite_hoe")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolHoe("hlifintite.hoe", itemId++, hlifintiteTool));
		hatHlifintite = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/hlifintite_helmet")
			.build(new ItemArmor("hlifintite.helmet", itemId++, hlifintiteArmor, 0));
		shirtHlifintite = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/hlifintite_chestplate")
			.build(new ItemArmor("hlifintite.chestplate", itemId++, hlifintiteArmor, 1));
		pantsHlifintite = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/hlifintite_leggings")
			.build(new ItemArmor("hlifintite.leggings", itemId++, hlifintiteArmor, 2));
		feetsiesHlifintite = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/hlifintite_boots")
			.build(new ItemArmor("hlifintite.boots", itemId++, hlifintiteArmor, 3));

	// Sollogium

		rawSollogiumRaw = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/raw_sollogium")
			.build(new Item("raw.sollogium", itemId++));
		ingotSollogiumIngot = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/sollogium_ingot")
			.build(new Item("sollogium.ingot", itemId++));
		toolSwordSollogium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/sollogium_sword")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new TerraponBTAFireSword("sollogium.sword", itemId++, sollogiumTool));
		toolAxeSollogium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/sollogium_axe")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolAxe("sollogium.axe", itemId++, sollogiumTool));
		toolPickaxeSollogium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/sollogium_pickaxe")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolPickaxe("sollogium.pickaxe", itemId++, sollogiumTool));
		toolShovelSollogium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/sollogium_shovel")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolShovel("sollogium.shovel", itemId++, sollogiumTool));
		toolHoeSollogium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/sollogium_hoe")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolHoe("sollogium.hoe", itemId++, sollogiumTool));
		hatSollogium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/sollogium_helmet")
			.setTags(fireImmuneAsEntity)
			.build(new ItemArmor("sollogium.helmet", itemId++, sollogiumArmor, 0));
		shirtSollogium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/sollogium_chestplate")
			.setTags(fireImmuneAsEntity)
			.build(new ItemArmor("sollogium.chestplate", itemId++, sollogiumArmor, 1));
		pantsSollogium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/sollogium_leggings")
			.setTags(fireImmuneAsEntity)
			.build(new ItemArmor("sollogium.leggings", itemId++, sollogiumArmor, 2));
		feetsiesSollogium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/sollogium_boots")
			.setTags(fireImmuneAsEntity)
			.build(new ItemArmor("sollogium.boots", itemId++, sollogiumArmor, 3));

	//Framium

		rawFramiumRaw = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/raw_framium")
			.build(new Item("raw.framium", itemId++));
		ingotFramiumIngot = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/framium_ingot")
			.build(new Item("framium.ingot", itemId++));
		toolSwordFramium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/framium_sword")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new TerraponBTAFireSword("framium.sword", itemId++, framiumTool));
		toolAxeFramium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/framium_axe")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolAxe("framium.axe", itemId++, framiumTool));
		toolPickaxeFramium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/framium_pickaxe")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolPickaxe("framium.pickaxe", itemId++, framiumTool));
		toolShovelFramium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/framium_shovel")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolShovel("framium.shovel", itemId++, framiumTool));
		toolHoeFramium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/framium_hoe")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolHoe("framium.hoe", itemId++, framiumTool));
		hatFramium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/framium_helmet")
			.build(new ItemArmor("framium.helmet", itemId++, framiumArmor, 0));
		shirtFramium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/framium_chestplate")
			.build(new ItemArmor("framium.chestplate", itemId++, framiumArmor, 1));
		pantsFramium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/framium_leggings")
			.build(new ItemArmor("framium.leggings", itemId++, framiumArmor, 2));
		feetsiesFramium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/framium_boots")
			.build(new ItemArmor("framium.boots", itemId++, framiumArmor, 3));

	// Eilifligronium

		ingotEilifligroniumIngot = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/eilifligronium_ingot")
			.build(new Item("eilifligronium.ingot", itemId++));
		toolSwordEilifligronium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/eilifligronium_sword")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new TerraponBTAFireSword("eilifligronium.sword", itemId++, eilifligroniumTool));
		toolAxeEilifligronium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/eilifligronium_axe")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolAxe("eilifligronium.axe", itemId++, eilifligroniumTool));
		toolPickaxeEilifligronium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/eilifligronium_pickaxe")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolPickaxe("eilifligronium.pickaxe", itemId++, eilifligroniumTool));
		toolShovelEilifligronium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/eilifligronium_shovel")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolShovel("eilifligronium.shovel", itemId++, eilifligroniumTool));
		toolHoeEilifligronium= new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/eilifligronium_hoe")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolHoe("eilifligronium.hoe", itemId++, eilifligroniumTool));
		hatEilifligronium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/eilifligronium_helmet")
			.setTags(fireImmuneAsEntity)
			.build(new ItemArmor("eilifligronium.helmet", itemId++, eilifligroniumArmor, 0));
		shirtEilifligronium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/eilifligronium_chestplate")
			.setTags(fireImmuneAsEntity)
			.build(new ItemArmor("eilifligronium.chestplate", itemId++, eilifligroniumArmor, 1));
		pantsEilifligronium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/eilifligronium_leggings")
			.setTags(fireImmuneAsEntity)
			.build(new ItemArmor("eilifligronium.leggings", itemId++, eilifligroniumArmor, 2));
		feetsiesEilifligronium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/eilifligronium_boots")
			.setTags(fireImmuneAsEntity)
			.build(new ItemArmor("eilifligronium.boots", itemId++, eilifligroniumArmor, 3));
	}
}
