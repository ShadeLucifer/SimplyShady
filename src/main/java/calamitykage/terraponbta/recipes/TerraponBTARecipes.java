package calamitykage.terraponbta.recipes;

import net.minecraft.core.block.Block;
import net.minecraft.core.crafting.LookupFuelFurnace;
import net.minecraft.core.crafting.LookupFuelFurnaceBlast;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.RecipeEntrypoint;

import static calamitykage.terraponbta.TerraponBTA.MOD_ID;
import static calamitykage.terraponbta.item.TerraponBTAItems.*;
import static calamitykage.terraponbta.blocks.TerraponBTABlocks.*;

public class TerraponBTARecipes implements RecipeEntrypoint {
	@Override
	public void onRecipesReady() {
		LookupFuelFurnace.instance.addFuelEntry(loptFuel.id, 2540000);
		LookupFuelFurnaceBlast.instance.addFuelEntry(loptFuel.id, 2540000);

// Base Items using just vanilla items, used for the modded metals

		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(Item.bucketLava)
			.create("ball_of_lava", new ItemStack(balloflava, 3));

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"GSG",
				"SDS",
				"GSG")
			.addInput('G', Item.dustGlowstone)
			.addInput('D', Item.diamond)
			.addInput('S', Item.ingotSteel)
			.create("orbOfRogmal", orbOfRogmal.getDefaultStack());
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"CEC",
				"ERE",
				"CEC")
			.addInput('E', Item.ingotSteel)
			.addInput('C', Item.nethercoal)
			.addInput('R', Block.blockRedstone)
			.create("redstone_alloy", redstoneAlloy.getDefaultStack());
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"CEC",
				"ERE",
				"CEC")
			.addInput('E', Item.ingotSteel)
			.addInput('C', Item.nethercoal)
			.addInput('R', Block.glowstone)
			.create("glowstone_alloy", glowstoneAlloy.getDefaultStack());
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"CEC",
				"ERE",
				"CEC")
			.addInput('E', Item.ingotSteel)
			.addInput('C', Item.nethercoal)
			.addInput('R', Block.obsidian)
			.create("obsidian_alloy", obsidianAlloy.getDefaultStack());
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"CEC",
				"ERE",
				"CEC")
			.addInput('E', Item.ingotSteel)
			.addInput('C', Item.nethercoal)
			.addInput('R', Block.blockLapis)
			.create("lapis_alloy", lapisAlloy.getDefaultStack());

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" E ",
				" E ",
				" E ")
			.addInput('E', Item.ingotSteel)
			.create("steel_rod", new ItemStack(steelRod, 3));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"  E",
				"  E",
				"  E")
			.addInput('E', Item.ingotSteel)
			.create("steel_rod", new ItemStack(steelRod, 3));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"E  ",
				"E  ",
				"E  ")
			.addInput('E', Item.ingotSteel)
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
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" E ",
				" E ",
				" E ")
			.addInput('E', obsidianAlloy)
			.create("obsidian_alloy_rod", new ItemStack(obsidianAlloyRod, 3));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"  E",
				"  E",
				"  E")
			.addInput('E', obsidianAlloy)
			.create("obsidian_alloy_rod", new ItemStack(obsidianAlloyRod, 3));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"E  ",
				"E  ",
				"E  ")
			.addInput('E', obsidianAlloy)
			.create("obsidian_alloy_rod", new ItemStack(obsidianAlloyRod, 3));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" E ",
				"EGE",
				" E ")
			.addInput('E', balloflava)
			.addInput('G', Block.glowstone)
			.create("lava_star", new ItemStack(lavastar));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" E ",
				"ESE",
				" E ")
			.addInput('E', lavastar)
			.addInput('S', Item.ingotSteel)
			.create("hell_ingot", new ItemStack(hellingot));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"LLL",
				"LSL",
				"LLL")
			.addInput('L', reinforcedLeather)
			.addInput('S', Item.ingotSteel)
			.create("reinforced_leather", new ItemStack(reinforcedLeather));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"ABC",
				"EOD",
				"GFH")
			.addInput('A', Block.flowerRed)
			.addInput('B', Block.flowerYellow)
			.addInput('C', Block.flowerOrange)
			.addInput('D', Block.flowerPink)
			.addInput('E', Block.flowerLightBlue)
			.addInput('F', Block.flowerPurple)
			.addInput('G', Block.mushroomBrown)
			.addInput('H', Block.mushroomRed)
			.addInput('O', Item.dustGlowstone)
			.create("gaia_essence", new ItemStack(gaiaEssence));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" G ",
				"GOG",
				" G ")
			.addInput('G', gaiaEssence)
			.addInput('O', Block.glowstone)
			.create("radiant_gaia_essence", new ItemStack(radiantGaiaEssence));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" E ",
				"ESE",
				" E ")
			.addInput('E', gaiaEssence)
			.addInput('S', Item.ingotGold)
			.create("infused_gold", new ItemStack(infusedGold));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(radiantGaiaEssence)
			.addInput(Item.ingotSteel)
			.create("gaia_steel", new ItemStack(gaiaSteel));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" E ",
				" E ",
				" E ")
			.addInput('E', infusedGold)
			.create("infused_gold_rod", new ItemStack(infusedGoldRod, 3));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"  E",
				"  E",
				"  E")
			.addInput('E', infusedGold)
			.create("infused_gold_rod", new ItemStack(infusedGoldRod, 3));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"E  ",
				"E  ",
				"E  ")
			.addInput('E', infusedGold)
			.create("infused_gold_rod", new ItemStack(infusedGoldRod, 3));

// Blocks

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
				"SSS",
				"SSS",
				"SSS")
			.addInput('S', ingotSollogiumIngot)
			.create("sollogium_block", sollogiumBlock.getDefaultStack());
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

// Misc. Modded Items

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"DED",
				"ECE",
				"DED")
			.addInput('D', hellingot)
			.addInput('C', Item.coal)
			.addInput('E', Block.blockNetherCoal)
			.create("lopt_fuel", loptFuel.getDefaultStack());

// Seidrilium

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"CGC",
				"GOG",
				"CGC")
			.addInput('G', Item.ingotSteel)
			.addInput('C', glowstoneAlloy)
			.addInput('O', orbOfRogmal)
			.create("raw_seidrilium", rawSeidriliumRaw.getDefaultStack());
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

// Einvadril

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"GCG",
				"COC",
				"GCG")
			.addInput('G', redstoneAlloy)
			.addInput('C', Item.ingotSteel)
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

// Hlifintite

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"CGC",
				"GOG",
				"CGC")
			.addInput('G', Item.ingotSteel)
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
			.addInput('L', reinforcedLeather)
			.create("hlifintite_chestplate", shirtHlifintite);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"HHH",
				"L L",
				"H H")
			.addInput('H', ingotHlifintiteIngot)
			.addInput('L', reinforcedLeather)
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

// Framium

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"CGC",
				"GOG",
				"CGC")
			.addInput('G', infusedGold)
			.addInput('C', gaiaSteel)
			.addInput('O', orbOfRogmal)
			.create("raw_framium", rawFramiumRaw);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"HHH",
				" S ",
				" S ")
			.addInput('H', ingotFramiumIngot)
			.addInput('S', infusedGoldRod)
			.create("framium_pickaxe", toolPickaxeFramium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"HH ",
				"HS ",
				" S ")
			.addInput('H', ingotFramiumIngot)
			.addInput('S', infusedGoldRod)
			.create("framium_axe", toolAxeFramium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" H ",
				" S ",
				" S ")
			.addInput('H', ingotFramiumIngot)
			.addInput('S', infusedGoldRod)
			.create("framium_shovel", toolShovelFramium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"HH ",
				" S ",
				" S ")
			.addInput('H', ingotFramiumIngot)
			.addInput('S', infusedGoldRod)
			.create("framium_hoe", toolHoeFramium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" H ",
				" H ",
				" S ")
			.addInput('H', ingotFramiumIngot)
			.addInput('S', infusedGoldRod)
			.create("framium_sword", toolSwordFramium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"HHH",
				"H H",
				"   ")
			.addInput('H', ingotFramiumIngot)
			.create("framium_helmet", hatFramium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"   ",
				"HHH",
				"H H")
			.addInput('H', ingotFramiumIngot)
			.create("framium_helmet", hatFramium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"H H",
				"HHH",
				"HHH")
			.addInput('H', ingotFramiumIngot)
			.addInput('L', reinforcedLeather)
			.create("framium_chestplate", shirtFramium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"HHH",
				"H H",
				"H H")
			.addInput('H', ingotFramiumIngot)
			.create("framium_leggings", pantsFramium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"H H",
				"H H",
				"   ")
			.addInput('H', ingotFramiumIngot)
			.create("framium_boots", feetsiesFramium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"   ",
				"H H",
				"H H")
			.addInput('H', ingotFramiumIngot)
			.create("framium_boots", feetsiesFramium);

// Sollogium

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"CGC",
				"GOG",
				"CGC")
			.addInput('G', hellingot)
			.addInput('C', Item.ingotSteel)
			.addInput('O', orbOfRogmal)
			.create("raw_sollogium", rawSollogiumRaw);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"HHH",
				" S ",
				" S ")
			.addInput('H', ingotSollogiumIngot)
			.addInput('S', obsidianAlloyRod)
			.create("sollogium_pickaxe", toolPickaxeSollogium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"HH ",
				"HS ",
				" S ")
			.addInput('H', ingotSollogiumIngot)
			.addInput('S', obsidianAlloyRod)
			.create("sollogium_axe", toolAxeSollogium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" H ",
				" S ",
				" S ")
			.addInput('H', ingotSollogiumIngot)
			.addInput('S', obsidianAlloyRod)
			.create("sollogium_shovel", toolShovelSollogium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"HH ",
				" S ",
				" S ")
			.addInput('H', ingotSollogiumIngot)
			.addInput('S', obsidianAlloyRod)
			.create("sollogium_hoe", toolHoeSollogium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				" H ",
				" H ",
				" S ")
			.addInput('H', ingotSollogiumIngot)
			.addInput('S', obsidianAlloyRod)
			.create("sollogium_sword", toolSwordSollogium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"LHL",
				"H H",
				"   ")
			.addInput('H', ingotSollogiumIngot)
			.addInput('L', obsidianAlloy)
			.create("sollogium_helmet", hatSollogium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"   ",
				"LHL",
				"H H")
			.addInput('H', ingotSollogiumIngot)
			.addInput('L', obsidianAlloy)
			.create("sollogium_helmet", hatSollogium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"H H",
				"LHL",
				"HHH")
			.addInput('H', ingotSollogiumIngot)
			.addInput('L', obsidianAlloy)
			.create("sollogium_chestplate", shirtSollogium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"HHH",
				"L L",
				"H H")
			.addInput('H', ingotSollogiumIngot)
			.addInput('L', obsidianAlloy)
			.create("sollogium_leggings", pantsSollogium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"H H",
				"L L",
				"   ")
			.addInput('H', ingotSollogiumIngot)
			.addInput('L', obsidianAlloy)
			.create("sollogium_boots", feetsiesSollogium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"   ",
				"H H",
				"L L")
			.addInput('H', ingotSollogiumIngot)
			.addInput('L', obsidianAlloy)
			.create("sollogium_boots", feetsiesSollogium);

// Eilifligronium

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
			.addInput('U', ingotEilifligroniumIngot)
			.addInput('L', Block.blockLapis)
			.create("eilifligronium_shovel", toolShovelEilifligronium);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"UUU",
				" L ",
				" L ")
			.addInput('U', ingotEilifligroniumIngot)
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

// Smelting to refund armor and tools

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
			.setInput(hatFramium)
			.create("framium_ingot", new ItemStack(ingotFramiumIngot, 5));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(shirtFramium)
			.create("framium_ingot", new ItemStack(ingotFramiumIngot, 8));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(pantsFramium)
			.create("framium_ingot", new ItemStack(ingotFramiumIngot, 7));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(feetsiesFramium)
			.create("framium_ingot", new ItemStack(ingotFramiumIngot, 4));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(toolShovelFramium)
			.create("framium_ingot", new ItemStack(ingotFramiumIngot, 1));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(toolPickaxeFramium)
			.create("framium_ingot", new ItemStack(ingotFramiumIngot, 3));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(toolAxeFramium)
			.create("framium_ingot", new ItemStack(ingotFramiumIngot, 3));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(toolHoeFramium)
			.create("framium_ingot", new ItemStack(ingotFramiumIngot, 2));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(toolSwordFramium)
			.create("framium_ingot", new ItemStack(ingotFramiumIngot, 2));

		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(hatSollogium)
			.create("sollogium_ingot", new ItemStack(ingotSollogiumIngot, 5));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(shirtSollogium)
			.create("sollogium_ingot", new ItemStack(ingotSollogiumIngot, 8));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(pantsSollogium)
			.create("sollogium_ingot", new ItemStack(ingotSollogiumIngot, 7));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(feetsiesSollogium)
			.create("sollogium_ingot", new ItemStack(ingotSollogiumIngot, 4));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(toolShovelSollogium)
			.create("sollogium_ingot", new ItemStack(ingotSollogiumIngot, 1));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(toolPickaxeSollogium)
			.create("sollogium_ingot", new ItemStack(ingotSollogiumIngot, 3));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(toolAxeSollogium)
			.create("sollogium_ingot", new ItemStack(ingotSollogiumIngot, 3));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(toolHoeSollogium)
			.create("sollogium_ingot", new ItemStack(ingotSollogiumIngot, 2));
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(toolSwordSollogium)
			.create("sollogium_ingot", new ItemStack(ingotSollogiumIngot, 2));

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
			.setInput(rawSollogiumRaw)
			.create("sollogium_ingot", ingotSollogiumIngot);
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(rawFramiumRaw)
			.create("framium_ingot", ingotFramiumIngot);
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(rawEinvadrilRaw)
			.create("einvadril_ingot", ingotEinvadrilIngot);
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(rawHlifintiteRaw)
			.create("hlifintite_ingot", ingotHlifintiteIngot);

		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(Block.blockIron)
			.create("steel_ingot", new ItemStack(Item.ingotSteel, 6));
	}

	@Override
	public void initNamespaces() {

	}
}
