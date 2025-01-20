package calamitykage.terraponbta.item;

import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.material.ArmorMaterial;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.*;
import turniplabs.halplibe.helper.ArmorHelper;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.util.ConfigHandler;
import static calamitykage.terraponbta.TerraponBTA.MOD_ID;
import java.util.Properties;

public class TerraponBTAItems {
	public static int itemId;

	static {
		Properties prop = new Properties();
		prop.setProperty("starting_item_id","25400");
		ConfigHandler config = new ConfigHandler(MOD_ID,prop);
		itemId = config.getInt("starting_item_id");

		config.updateConfig();
	}
	public static ToolMaterial seidriliumTool = new ToolMaterial().setDurability(14162).setEfficiency(18.0f, 22.0f).setMiningLevel(7).setDamage(6);
	public static ToolMaterial einvadrilTool = new ToolMaterial().setDurability(16384).setEfficiency(14.0f, 20.0f).setMiningLevel(9).setDamage(8);
	public static ToolMaterial hlifintiteTool = new ToolMaterial().setDurability(23150).setEfficiency(16.0f, 16.0f).setMiningLevel(11).setDamage(7);
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

	public void initializeItems() {
		ingotSeidriliumIngot = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/seidrilium_ingot")
			.build(new Item("ingot.seidrilium", itemId++));
		rawSeidriliumRaw = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/raw_seidrilium")
			.build(new Item("seidrilium.raw", itemId++));
		toolSwordSeidrilium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/seidrilium_sword")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolSword("tool.sword.seidrilium", itemId++, seidriliumTool));
		toolAxeSeidrilium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/seidrilium_axe")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolAxe("tool.axe.seidrilium", itemId++, seidriliumTool));
		toolPickaxeSeidrilium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/seidrilium_pickaxe")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolPickaxe("tool.pickaxe.seidrilium", itemId++, seidriliumTool));
		toolShovelSeidrilium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/seidrilium_shovel")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolShovel("tool.shovel.seidrilium", itemId++, seidriliumTool));
		toolHoeSeidrilium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/seidrilium_hoe")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolHoe("tool.hoe.seidrilium", itemId++, seidriliumTool));
		hatSeidrilium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/seidrilium_helmet")
			.build(new ItemArmor("helmet.seidrilium", itemId++, seidriliumArmor, 0));
		shirtSeidrilium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/seidrilium_chestplate")
			.build(new ItemArmor("chestplate.seidrilium", itemId++, seidriliumArmor, 1));
		pantsSeidrilium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/seidrilium_leggings")
			.build(new ItemArmor("leggings.seidrilium", itemId++, seidriliumArmor, 2));
		feetsiesSeidrilium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/seidrilium_boots")
			.build(new ItemArmor("boots.seidrilium", itemId++, seidriliumArmor, 3));
		ingotEinvadrilIngot = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/einvadril_ingot")
			.build(new Item("ingot.einvadril", itemId++));
		rawEinvadrilRaw = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/raw_einvadril")
			.build(new Item("einvadril.raw", itemId++));
		toolSwordEinvadril = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/einvadril_sword")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new TerraponBTAFireSword("tool.sword.einvadril", itemId++, einvadrilTool));
		toolAxeEinvadril = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/einvadril_axe")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolAxe("tool.axe.einvadril", itemId++, einvadrilTool));
		toolPickaxeEinvadril = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/einvadril_pickaxe")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolPickaxe("tool.pickaxe.einvadril", itemId++, einvadrilTool));
		toolShovelEinvadril = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/einvadril_shovel")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolShovel("tool.shovel.einvadril", itemId++, einvadrilTool));
		toolHoeEinvadril = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/einvadril_hoe")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolHoe("tool.hoe.einvadril", itemId++, einvadrilTool));
		hatEinvadril = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/einvadril_helmet")
			.build(new ItemArmor("helmet.einvadril", itemId++, einvadrilArmor, 0));
		shirtEinvadril = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/einvadril_chestplate")
			.build(new ItemArmor("chestplate.einvadril", itemId++, einvadrilArmor, 1));
		pantsEinvadril = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/einvadril_leggings")
			.build(new ItemArmor("leggings.einvadril", itemId++, einvadrilArmor, 2));
		feetsiesEinvadril = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/einvadril_boots")
			.build(new ItemArmor("boots.einvadril", itemId++, einvadrilArmor, 3));
		loptFuel = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/lopt_fuel")
			.setItemModel((i) -> new ItemModelStandard(i, null))
			.build(new Item("fuel.lopt", itemId++));
		ingotHlifintiteIngot = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/hlifintite_ingot")
			.build(new Item("ingot.hlifintite", itemId++));
		rawHlifintiteRaw = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/raw_hlifintite")
			.build(new Item("hlifintite.raw", itemId++));
		toolSwordHlifintite = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/hlifintite_sword")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolSword("tool.sword.hlifintite", itemId++, hlifintiteTool));
		toolAxeHlifintite = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/hlifintite_axe")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolAxe("tool.axe.hlifintite", itemId++, hlifintiteTool));
		toolPickaxeHlifintite = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/hlifintite_pickaxe")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolPickaxe("tool.pickaxe.hlifintite", itemId++, hlifintiteTool));
		toolShovelHlifintite = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/hlifintite_shovel")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolShovel("tool.shovel.hlifintite", itemId++, hlifintiteTool));
		toolHoeHlifintite = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/hlifintite_hoe")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolHoe("tool.hoe.hlifintite", itemId++, hlifintiteTool));
		hatHlifintite = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/hlifintite_helmet")
			.build(new ItemArmor("helmet.hlifintite", itemId++, hlifintiteArmor, 0));
		shirtHlifintite = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/hlifintite_chestplate")
			.build(new ItemArmor("chestplate.hlifintite", itemId++, hlifintiteArmor, 1));
		pantsHlifintite = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/hlifintite_leggings")
			.build(new ItemArmor("leggings.hlifintite", itemId++, hlifintiteArmor, 2));
		feetsiesHlifintite = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/hlifintite_boots")
			.build(new ItemArmor("boots.hlifintite", itemId++, hlifintiteArmor, 3));
		ingotEilifligroniumIngot = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/eilifligronium_ingot")
			.build(new Item("ingot.eilifligronium", itemId++));
		toolSwordEilifligronium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/eilifligronium_sword")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new TerraponBTAFireSword("tool.sword.eilifligronium", itemId++, eilifligroniumTool));
		toolAxeEilifligronium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/eilifligronium_axe")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolAxe("tool.axe.eilifligronium", itemId++, eilifligroniumTool));
		toolPickaxeEilifligronium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/eilifligronium_pickaxe")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolPickaxe("tool.pickaxe.eilifligronium", itemId++, eilifligroniumTool));
		toolShovelEilifligronium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/eilifligronium_shovel")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolShovel("tool.shovel.eilifligronium", itemId++, eilifligroniumTool));
		toolHoeEilifligronium= new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/eilifligronium_hoe")
			.setItemModel(item -> new ItemModelStandard(item, null).setFull3D())
			.build(new ItemToolHoe("tool.hoe.eilifligronium", itemId++, eilifligroniumTool));
		hatEilifligronium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/eilifligronium_helmet")
			.build(new ItemArmor("helmet.eilifligronium", itemId++, eilifligroniumArmor, 0));
		shirtEilifligronium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/eilifligronium_chestplate")
			.build(new ItemArmor("chestplate.eilifligronium", itemId++, eilifligroniumArmor, 1));
		pantsEilifligronium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/eilifligronium_leggings")
			.build(new ItemArmor("leggings.eilifligronium", itemId++, eilifligroniumArmor, 2));
		feetsiesEilifligronium = new ItemBuilder(MOD_ID)
			.setIcon(MOD_ID + ":item/eilifligronium_boots")
			.build(new ItemArmor("boots.eilifligronium", itemId++, eilifligroniumArmor, 3));
	}
}
