package calamitykage.terraponbta73.item;

import calamitykage.terraponbta73.TerraponBTA73Config;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.material.ArmorMaterial;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.*;
import turniplabs.halplibe.helper.ArmorHelper;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.helper.ModelHelper;

import static calamitykage.terraponbta73.TerraponBTA73.MOD_ID;
import java.util.Properties;

public class TerraponBTA73Items {
	private static int startingID = TerraponBTA73Config.CFG.getInt("IDs.startingItemID");

	private static int nextID() {
		return startingID++;
	}


	public static ToolMaterial seidriliumTool = new ToolMaterial().setDurability(14162).setEfficiency(18.0f, 22.0f).setMiningLevel(7).setDamage(9);
	public static ToolMaterial einvadrilTool = new ToolMaterial().setDurability(16384).setEfficiency(14.0f, 20.0f).setMiningLevel(9).setDamage(12);
	public static ToolMaterial hlifintiteTool = new ToolMaterial().setDurability(23150).setEfficiency(16.0f, 16.0f).setMiningLevel(11).setDamage(10);
	public static ToolMaterial eilifligroniumTool = new ToolMaterial().setDurability(Integer.MAX_VALUE).setEfficiency(25.0f, 25.0f).setMiningLevel(25).setDamage(25);
	public static ArmorMaterial seidriliumArmor = ArmorHelper.createArmorMaterial(MOD_ID, "seidrilium", 15000, 65f, 65f, 65f, 90f);
	public static ArmorMaterial einvadrilArmor = ArmorHelper.createArmorMaterial(MOD_ID, "einvadril", 17000, 90f, 65f, 90f, 65f);
	public static ArmorMaterial hlifintiteArmor = ArmorHelper.createArmorMaterial(MOD_ID, "hlifintite", 24000, 90f, 90f, 65f, 65f);
	public static ArmorMaterial eilifligroniumArmor = ArmorHelper.createArmorMaterial(MOD_ID, "eilifligronium", Integer.MAX_VALUE, 100f, 100f, 100f, 100f);

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
	public static Item orbOfSeidril;

static {
	rawSeidriliumRaw = new ItemBuilder(MOD_ID)
		.build(new Item("item.raw.seidrilium", MOD_ID + ":item/raw_seidrilium", nextID()));
	ingotSeidriliumIngot = new ItemBuilder(MOD_ID)
		.build(new Item("item.seidrilium.ingot", MOD_ID + (":item/seidrilium_ingot"), nextID()));
	toolSwordSeidrilium = new ItemBuilder(MOD_ID)
		.build(new ItemToolSword("item.seidrilium.sword", MOD_ID + (":item/seidrilium_sword"), nextID(), seidriliumTool));
	toolAxeSeidrilium = new ItemBuilder(MOD_ID)
		.build(new ItemToolAxe("item.seidrilium.axe", MOD_ID + (":item/seidrilium_axe"), nextID(), seidriliumTool));
	toolPickaxeSeidrilium = new ItemBuilder(MOD_ID)
		.build(new ItemToolPickaxe("item.seidrilium.pickaxe", MOD_ID + (":item/seidrilium_pickaxe"), nextID(), seidriliumTool));
	toolShovelSeidrilium = new ItemBuilder(MOD_ID)
		.build(new ItemToolShovel("item.seidrilium.shovel", MOD_ID + (":item/seidrilium_shovel"), nextID(), seidriliumTool));
	toolHoeSeidrilium = new ItemBuilder(MOD_ID)
		.build(new ItemToolHoe("item.seidrilium.hoe", MOD_ID + (":item/seidrilium_hoe"), nextID(), seidriliumTool));
	hatSeidrilium = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("seidrilium.helmet", MOD_ID + (":item/seidrilium_helmet"), nextID(), seidriliumArmor, 3));
	shirtSeidrilium = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("seidrilium.chestplate", MOD_ID + (":item/seidrilium_chestplate"), nextID(), seidriliumArmor, 2));
	pantsSeidrilium = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("seidrilium.leggings", MOD_ID + (":item/seidrilium_leggings"), nextID(), seidriliumArmor, 1));
	feetsiesSeidrilium = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("seidrilium.boots", MOD_ID + (":item/seidrilium_boots"), nextID(), seidriliumArmor, 0));

	orbOfSeidril = new ItemBuilder(MOD_ID)
		.build(new Item("orbofseidril", MOD_ID + (":item/orbofseidril"), nextID()));
	loptFuel = new ItemBuilder(MOD_ID)
		.build(new Item("lopt.fuel", MOD_ID + (":item/lopt_fuel"), nextID()));

	rawEinvadrilRaw = new ItemBuilder(MOD_ID)
		.build(new Item("item.raw.einvadril", MOD_ID + ":item/raw_Einvadril", nextID()));
	ingotEinvadrilIngot = new ItemBuilder(MOD_ID)
		.build(new Item("item.einvadril.ingot", MOD_ID + (":item/einvadril_ingot"), nextID()));
	toolSwordEinvadril = new ItemBuilder(MOD_ID)
		.build(new ItemToolSword("item.einvadril.sword", MOD_ID + (":item/einvadril_sword"), nextID(), einvadrilTool));
	toolAxeEinvadril = new ItemBuilder(MOD_ID)
		.build(new ItemToolAxe("item.einvadril.axe", MOD_ID + (":item/einvadril_axe"), nextID(), einvadrilTool));
	toolPickaxeEinvadril = new ItemBuilder(MOD_ID)
		.build(new ItemToolPickaxe("item.einvadril.pickaxe", MOD_ID + (":item/einvadril_pickaxe"), nextID(), einvadrilTool));
	toolShovelEinvadril = new ItemBuilder(MOD_ID)
		.build(new ItemToolShovel("item.einvadril.shovel", MOD_ID + (":item/einvadril_shovel"), nextID(), einvadrilTool));
	toolHoeEinvadril = new ItemBuilder(MOD_ID)
		.build(new ItemToolHoe("item.einvadril.hoe", MOD_ID + (":item/einvadril_hoe"), nextID(), einvadrilTool));
	hatEinvadril = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("einvadril.helmet", MOD_ID + (":item/einvadril_helmet"), nextID(), einvadrilArmor, 3));
	shirtEinvadril = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("einvadril.chestplate", MOD_ID + (":item/einvadril_chestplate"), nextID(), einvadrilArmor, 2));
	pantsEinvadril = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("einvadril.leggings", MOD_ID + (":item/einvadril_leggings"), nextID(), einvadrilArmor, 1));
	feetsiesEinvadril = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("einvadril.boots", MOD_ID + (":item/einvadril_boots"), nextID(), einvadrilArmor, 0));

	rawHlifintiteRaw = new ItemBuilder(MOD_ID)
		.build(new Item("item.raw.hlifintite", MOD_ID + ":item/raw_Hlifintite", nextID()));
	ingotHlifintiteIngot = new ItemBuilder(MOD_ID)
		.build(new Item("item.hlifintite.ingot", MOD_ID + (":item/hlifintite_ingot"), nextID()));
	toolSwordHlifintite = new ItemBuilder(MOD_ID)
		.build(new ItemToolSword("item.hlifintite.sword", MOD_ID + (":item/hlifintite_sword"), nextID(), hlifintiteTool));
	toolAxeHlifintite = new ItemBuilder(MOD_ID)
		.build(new ItemToolAxe("item.hlifintite.axe", MOD_ID + (":item/hlifintite_axe"), nextID(), hlifintiteTool));
	toolPickaxeHlifintite = new ItemBuilder(MOD_ID)
		.build(new ItemToolPickaxe("item.hlifintite.pickaxe", MOD_ID + (":item/hlifintite_pickaxe"), nextID(), hlifintiteTool));
	toolShovelHlifintite = new ItemBuilder(MOD_ID)
		.build(new ItemToolShovel("item.hlifintite.shovel", MOD_ID + (":item/hlifintite_shovel"), nextID(), hlifintiteTool));
	toolHoeHlifintite = new ItemBuilder(MOD_ID)
		.build(new ItemToolHoe("item.hlifintite.hoe", MOD_ID + (":item/hlifintite_hoe"), nextID(), hlifintiteTool));
	hatHlifintite = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("hlifintite.helmet", MOD_ID + (":item/hlifintite_helmet"), nextID(), hlifintiteArmor, 3));
	shirtHlifintite = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("hlifintite.chestplate", MOD_ID + (":item/hlifintite_chestplate"), nextID(), hlifintiteArmor, 2));
	pantsHlifintite = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("hlifintite.leggings", MOD_ID + (":item/hlifintite_leggings"), nextID(), hlifintiteArmor, 1));
	feetsiesHlifintite = new ItemBuilder(MOD_ID)
		.build(new ItemArmor("hlifintite.boots", MOD_ID + (":item/hlifintite_boots"), nextID(), hlifintiteArmor, 0));

	ingotEilifligroniumIngot = new ItemBuilder(MOD_ID)
		.build(new Item("item.eilifligronium.ingot", MOD_ID + (":item/eilifligronium_ingot"), nextID()));
	toolSwordEilifligronium = new ItemBuilder(MOD_ID)
		.build(new ItemToolSword("item.eilifligronium.sword", MOD_ID + (":item/eilifligronium_sword"), nextID(), eilifligroniumTool));
	toolAxeEilifligronium = new ItemBuilder(MOD_ID)
		.build(new ItemToolAxe("item.eilifligronium.axe", MOD_ID + (":item/eilifligronium_axe"), nextID(), eilifligroniumTool));
	toolPickaxeEilifligronium = new ItemBuilder(MOD_ID)
		.build(new ItemToolPickaxe("item.eilifligronium.pickaxe", MOD_ID + (":item/eilifligronium_pickaxe"), nextID(), eilifligroniumTool));
	toolShovelEilifligronium = new ItemBuilder(MOD_ID)
		.build(new ItemToolShovel("item.eilifligronium.shovel", MOD_ID + (":item/eilifligronium_shovel"), nextID(), eilifligroniumTool));
	toolHoeEilifligronium = new ItemBuilder(MOD_ID)
		.build(new ItemToolHoe("item.eilifligronium.hoe", MOD_ID + (":item/eilifligronium_hoe"), nextID(), eilifligroniumTool));
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
