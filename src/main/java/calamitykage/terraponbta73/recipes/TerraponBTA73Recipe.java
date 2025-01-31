package calamitykage.terraponbta73.recipes;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.crafting.LookupFuelFurnace;
import net.minecraft.core.crafting.LookupFuelFurnaceBlast;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.RecipeEntrypoint;

import static calamitykage.terraponbta73.TerraponBTA73.MOD_ID;

import static calamitykage.terraponbta73.item.TerraponBTA73Items.*;
import static calamitykage.terraponbta73.blocks.TerraponBTA73Blocks.*;

public class TerraponBTA73Recipe implements RecipeEntrypoint {
	@Override
	public void onRecipesReady () {
		LookupFuelFurnace.instance.addFuelEntry(loptFuel.id, 128000);
		LookupFuelFurnaceBlast.instance.addFuelEntry(loptFuel.id, 128000);

		// Base Items using just vanilla

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"CEC",
				"ERE",
				"CEC")
			.addInput('E', Blocks.BLOCK_STEEL)
			.addInput('C', Items.NETHERCOAL)
			.addInput('R', Blocks.BLOCK_REDSTONE)
			.create("redstone_alloy", redstoneAlloy.getDefaultStack());
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"CEC",
				"ERE",
				"CEC")
			.addInput('E', Blocks.BLOCK_STEEL)
			.addInput('C', Items.NETHERCOAL)
			.addInput('R', Blocks.BLOCK_LAPIS)
			.create("lapis_alloy", lapisAlloy.getDefaultStack());

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" E ",
				" E ",
				" E ")
			.addInput('E', Items.INGOT_STEEL)
			.create("steel_rod", new ItemStack(steelRod, 3));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"  E",
				"  E",
				"  E")
			.addInput('E', Items.INGOT_STEEL)
			.create("steel_rod", new ItemStack(steelRod, 3));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"E  ",
				"E  ",
				"E  ")
			.addInput('E', Items.INGOT_STEEL)
			.create("steel_rod", new ItemStack(steelRod, 3));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" E ",
				" E ",
				" E ")
			.addInput('E', lapisAlloy)
			.create("lapis_alloy_rod", new ItemStack(lapisAlloyRod, 3));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"  E",
				"  E",
				"  E")
			.addInput('E', lapisAlloy)
			.create("lapis_alloy_rod", new ItemStack(lapisAlloyRod, 3));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"E  ",
				"E  ",
				"E  ")
			.addInput('E', lapisAlloy)
			.create("lapis_alloy_rod", new ItemStack(lapisAlloyRod, 3));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" E ",
				" E ",
				" E ")
			.addInput('E', redstoneAlloy)
			.create("redstone_alloy_rod", new ItemStack(redstoneAlloyRod, 3));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"  E",
				"  E",
				"  E")
			.addInput('E', redstoneAlloy)
			.create("redstone_alloy_rod", new ItemStack(redstoneAlloyRod, 3));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"E  ",
				"E  ",
				"E  ")
			.addInput('E', redstoneAlloy)
			.create("redstone_alloy_rod", new ItemStack(redstoneAlloyRod, 3));

		// New Items + Blocks

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
				"GSG",
				"SDS",
				"GSG")
			.addInput('G', Blocks.GLOWSTONE)
			.addInput('D', Blocks.BLOCK_DIAMOND)
			.addInput('S', Blocks.BLOCK_STEEL)
			.create("orbOfRogmal", orbOfRogmal.getDefaultStack());

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
				"CGC",
				"GOG",
				"CGC")
			.addInput('G', Blocks.GLOWSTONE)
			.addInput('C', Blocks.BLOCK_STEEL)
			.addInput('O', orbOfRogmal)
			.create("raw_seidrilium", rawSeidriliumRaw.getDefaultStack());

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
			.addInput('S', steelRod)
			.create("seidrilium_pickaxe", toolPickaxeSeidrilium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"DD ",
				"DS ",
				" S ")
			.addInput('D', ingotSeidriliumIngot)
			.addInput('S', steelRod)
			.create("seidrilium_axe", toolAxeSeidrilium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" D ",
				" S ",
				" S ")
			.addInput('D', ingotSeidriliumIngot)
			.addInput('S', steelRod)
			.create("seidrilium_shovel", toolShovelSeidrilium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"DD ",
				" S ",
				" S ")
			.addInput('D', ingotSeidriliumIngot)
			.addInput('S', steelRod)
			.create("seidrilium_hoe", toolHoeSeidrilium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" D ",
				" D ",
				" S ")
			.addInput('D', ingotSeidriliumIngot)
			.addInput('S', steelRod)
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
				"GCG",
				"COC",
				"GCG")
			.addInput('G', redstoneAlloy)
			.addInput('C', Blocks.BLOCK_STEEL)
			.addInput('O', orbOfRogmal)
			.create("raw_einvadril", rawEinvadrilRaw.getDefaultStack());
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"EEE",
				" S ",
				" S ")
			.addInput('E', ingotEinvadrilIngot)
			.addInput('S', lapisAlloyRod)
			.create("einvadril_pickaxe", toolPickaxeEinvadril);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"EE ",
				" S ",
				" S ")
			.addInput('E', ingotEinvadrilIngot)
			.addInput('S', lapisAlloyRod)
			.create("einvadril_hoe", toolHoeEinvadril);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"EE ",
				"ES ",
				" S ")
			.addInput('E', ingotEinvadrilIngot)
			.addInput('S', lapisAlloyRod)
			.create("einvadril_axe", toolAxeEinvadril);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" E ",
				" S ",
				" S ")
			.addInput('E', ingotEinvadrilIngot)
			.addInput('S', lapisAlloyRod)
			.create("einvadril_shovel", toolShovelEinvadril);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" E ",
				" E ",
				" S ")
			.addInput('E', ingotEinvadrilIngot)
			.addInput('S', lapisAlloyRod)
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
			.addInput('C', lapisAlloy)
			.addInput('O', orbOfRogmal)
			.create("raw_hlifintite", rawHlifintiteRaw);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"HHH",
				" S ",
				" S ")
			.addInput('H', ingotHlifintiteIngot)
			.addInput('S', redstoneAlloyRod)
			.create("hlifintite_pickaxe", toolPickaxeHlifintite);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"HH ",
				"HS ",
				" S ")
			.addInput('H', ingotHlifintiteIngot)
			.addInput('S', redstoneAlloyRod)
			.create("hlifintite_axe", toolAxeHlifintite);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" H ",
				" S ",
				" S ")
			.addInput('H', ingotHlifintiteIngot)
			.addInput('S', redstoneAlloyRod)
			.create("hlifintite_shovel", toolShovelHlifintite);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"HH ",
				" S ",
				" S ")
			.addInput('H', ingotHlifintiteIngot)
			.addInput('S', redstoneAlloyRod)
			.create("hlifintite_hoe", toolHoeHlifintite);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" H ",
				" H ",
				" S ")
			.addInput('H', ingotHlifintiteIngot)
			.addInput('S', redstoneAlloyRod)
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
				"LHL",
				"HHH")
			.addInput('H', ingotHlifintiteIngot)
			.addInput('L', Items.LEATHER)
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
		RecipeBuilder.initNameSpace(MOD_ID);
	}
}
