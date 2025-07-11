package calamitykage.terraponbta73;

import calamitykage.terraponbta73.blocks.ModelTerraponPortal;
import calamitykage.terraponbta73.blocks.TerraponBTA73Blocks;
import calamitykage.terraponbta73.item.TerraponBTA73Items;
import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.block.model.BlockModelFluid;
import net.minecraft.client.render.block.model.BlockModelPortal;
import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.client.render.item.model.ItemModel;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.item.Item;
import net.minecraft.core.util.collection.NamespaceID;
import net.minecraft.core.util.helper.Side;
import org.jetbrains.annotations.NotNull;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.ModelEntrypoint;

import static calamitykage.terraponbta73.TerraponBTA73.MOD_ID;
import static calamitykage.terraponbta73.blocks.TerraponBTA73Blocks.*;
import static calamitykage.terraponbta73.item.TerraponBTA73Items.*;


public class Models implements ModelEntrypoint {

	public static final Side[] S_TB = new Side[]{Side.TOP, Side.BOTTOM};
	public static final Side[] S_SIDES = new Side[]{Side.NORTH, Side.EAST, Side.SOUTH, Side.WEST};

	@Override
	public void initBlockModels(BlockModelDispatcher dispatcher) {
		ModelHelper.setBlockModel(seidriliumBlock, () -> new BlockModelStandard<>(seidriliumBlock)
			.setTex(0, "terraponbta73:block/seidrilium_block", Side.sides));
		ModelHelper.setBlockModel(sollogiumBlock, () -> new BlockModelStandard<>(sollogiumBlock)
			.setTex(0, "terraponbta73:block/sollogium_block", Side.sides));
//		ModelHelper.setBlockModel(framiumBlock, () -> new BlockModelStandard<>(framiumBlock)
//			.setTex(0, "terraponbta73:block/framium_block", Side.sides));
		ModelHelper.setBlockModel(terraponPortalBlock, () -> new BlockModelStandard<>(terraponPortalBlock)
		.setTex(0, "terraponbta73:block/terraponPortalBlock", Side.sides));
		ModelHelper.setBlockModel(einvadrilBlock, () -> new BlockModelStandard<>(einvadrilBlock)
			.setTex(0, "terraponbta73:block/einvadril_block", Side.sides));
		ModelHelper.setBlockModel(hlifintiteBlock, () -> new BlockModelStandard<>(hlifintiteBlock)
			.setTex(0, "terraponbta73:block/hlifintite_block", Side.sides));
		ModelHelper.setBlockModel(eilifligroniumBlock, () -> new BlockModelStandard<>(eilifligroniumBlock)
			.setTex(0, "terraponbta73:block/eilifligronium_block", Side.sides));
		ModelHelper.setBlockModel(eilifligrLamp, () -> new BlockModelStandard<>(eilifligrLamp)
			.setTex(0, "terraponbta73:block/eilifligrlamp", Side.sides));
		ModelHelper.setBlockModel(terragrass, () -> new BlockModelStandard<>(terragrass)
			.setTex(0, "terraponbta73:block/terragrass_top", Side.TOP)
			.setTex(0, "terraponbta73:block/terragrass_side", Side.EAST, Side.WEST, Side.NORTH, Side.SOUTH)
			.setTex(0, "terraponbta73:block/terragrass_bottom", Side.BOTTOM));
		ModelHelper.setBlockModel(terrastone, () -> new BlockModelStandard<>(terrastone)
			.setTex(0, "terraponbta73:block/terrastone", Side.sides));
		ModelHelper.setBlockModel(terradirt, () -> new BlockModelStandard<>(terradirt)
			.setTex(0, "terraponbta73:block/terradirt", Side.sides));

		dispatcher.addDispatch((new BlockModelFluid(manawaterflow)).onRenderLayer(1).setAllTextures(0, "terraponbta73:block/manawaterflow").setTex(0, "terraponbta73:block/manawater", new Side[]{Side.TOP}));
		dispatcher.addDispatch((new BlockModelFluid(manawater)).onRenderLayer(1).setTex(0, "terraponbta73:block/manawater", S_TB).setTex(0, "tofucraft:block/manawaterflow", S_SIDES));
		dispatcher.addDispatch((new ModelTerraponPortal<>(TerraponBTA73Blocks.terraponPortal)).setAllTextures(0, "terraponbta73:block/terraponPortal"));
	}

	@Override
	public void initItemModels(ItemModelDispatcher dispatcher) {

// MISC Stuff
		dispatcher.addDispatch(makeModel(orbOfRogmal, "orbofrogmal"));
		dispatcher.addDispatch(makeModel(radiantGaiaEssence, "radiant_gaia_essence"));
		dispatcher.addDispatch(makeModel(reinforcedLeather, "reinforced_leather"));
		dispatcher.addDispatch(makeModel(steelRod,"steel_rod"));
		dispatcher.addDispatch(makeModel(infusedGoldRod, "infused_gold_rod").setFull3D());
		dispatcher.addDispatch(makeModel(infusedGold, "infused_gold"));
		dispatcher.addDispatch(makeModel(redstoneAlloy, "redstone_alloy"));
		dispatcher.addDispatch(makeModel(redstoneAlloyRod, "redstone_alloy_rod").setFull3D());
		dispatcher.addDispatch(makeModel(lapisAlloy, "lapis_alloy"));
		dispatcher.addDispatch(makeModel(lapisAlloyRod, "lapis_alloy_rod").setFull3D());
		dispatcher.addDispatch(makeModel(obsidianAlloy, "obsidian_alloy"));
		dispatcher.addDispatch(makeModel(obsidianAlloyRod, "obsidian_alloy_rod").setFull3D());
		dispatcher.addDispatch(makeModel(glowstoneAlloy, "glowstone_alloy"));
		dispatcher.addDispatch(makeModel(gaiaEssence, "gaia_essence"));
		dispatcher.addDispatch(makeModel(gaiaSteel, "gaia_steel"));
		dispatcher.addDispatch(makeModel(hellingot, "hell_ingot"));
		dispatcher.addDispatch(makeModel(balloflava, "ball_of_lava"));
		dispatcher.addDispatch(makeModel(lavastar, "lava_star"));
		dispatcher.addDispatch(makeModel(loptFuel, "lopt_fuel"));
		dispatcher.addDispatch(makeModel(manawaterBucket, "manawater_bucket"));

// Seidrilium

		dispatcher.addDispatch(makeModel(rawSeidriliumRaw, "raw_seidrilium"));
		dispatcher.addDispatch(makeModel(ingotSeidriliumIngot, "seidrilium_ingot"));
		dispatcher.addDispatch(makeModel(toolAxeSeidrilium, "seidrilium_axe").setFull3D());
		dispatcher.addDispatch(makeModel(toolShovelSeidrilium, "seidrilium_shovel").setFull3D());
		dispatcher.addDispatch(makeModel(toolHoeSeidrilium, "seidrilium_hoe").setFull3D());
		dispatcher.addDispatch(makeModel(toolPickaxeSeidrilium, "seidrilium_pickaxe").setFull3D());
		dispatcher.addDispatch(makeModel(toolSwordSeidrilium, "seidrilium_sword").setFull3D());
		dispatcher.addDispatch(makeModel(hatSeidrilium, "seidrilium_helmet"));
		dispatcher.addDispatch(makeModel(shirtSeidrilium, "seidrilium_chestplate"));
		dispatcher.addDispatch(makeModel(pantsSeidrilium, "seidrilium_leggings"));
		dispatcher.addDispatch(makeModel(feetsiesSeidrilium, "seidrilium_boots"));

// Framium

		dispatcher.addDispatch(makeModel(rawFramiumRaw, "raw_framium").setFullBright());
		dispatcher.addDispatch(makeModel(ingotFramiumIngot, "framium_ingot").setFullBright());
		dispatcher.addDispatch(makeModel(toolAxeFramium, "framium_axe").setFull3D().setFullBright());
		dispatcher.addDispatch(makeModel(toolShovelFramium, "framium_shovel").setFull3D().setFullBright());
		dispatcher.addDispatch(makeModel(toolHoeFramium, "framium_hoe").setFull3D().setFullBright());
		dispatcher.addDispatch(makeModel(toolPickaxeFramium, "framium_pickaxe").setFull3D().setFullBright());
		dispatcher.addDispatch(makeModel(toolSwordFramium, "framium_sword").setFull3D().setFullBright());
		dispatcher.addDispatch(makeModel(hatFramium, "framium_helmet").setFullBright());
		dispatcher.addDispatch(makeModel(shirtFramium, "framium_chestplate").setFullBright());
		dispatcher.addDispatch(makeModel(pantsFramium, "framium_leggings").setFullBright());
		dispatcher.addDispatch(makeModel(feetsiesFramium, "framium_boots").setFullBright());

// Sollogium

		dispatcher.addDispatch(makeModel(rawSollogiumRaw, "raw_sollogium"));
		dispatcher.addDispatch(makeModel(ingotSollogiumIngot, "sollogium_ingot"));
		dispatcher.addDispatch(makeModel(toolAxeSollogium, "sollogium_axe").setFull3D());
		dispatcher.addDispatch(makeModel(toolShovelSollogium, "sollogium_shovel").setFull3D());
		dispatcher.addDispatch(makeModel(toolHoeSollogium, "sollogium_hoe").setFull3D());
		dispatcher.addDispatch(makeModel(toolPickaxeSollogium, "sollogium_pickaxe").setFull3D());
		dispatcher.addDispatch(makeModel(toolSwordSollogium, "sollogium_sword").setFull3D());
		dispatcher.addDispatch(makeModel(hatSollogium, "sollogium_helmet"));
		dispatcher.addDispatch(makeModel(shirtSollogium, "sollogium_chestplate"));
		dispatcher.addDispatch(makeModel(pantsSollogium, "sollogium_leggings"));
		dispatcher.addDispatch(makeModel(feetsiesSollogium, "sollogium_boots"));

// Einvadril

		dispatcher.addDispatch(makeModel(rawEinvadrilRaw, "raw_einvadril"));
		dispatcher.addDispatch(makeModel(ingotEinvadrilIngot, "einvadril_ingot"));
		dispatcher.addDispatch(makeModel(toolAxeEinvadril, "einvadril_axe").setFull3D());
		dispatcher.addDispatch(makeModel(toolShovelEinvadril, "einvadril_shovel").setFull3D());
		dispatcher.addDispatch(makeModel(toolHoeEinvadril, "einvadril_hoe").setFull3D());
		dispatcher.addDispatch(makeModel(toolPickaxeEinvadril, "einvadril_pickaxe").setFull3D());
		dispatcher.addDispatch(makeModel(toolSwordEinvadril, "einvadril_sword").setFull3D());
		dispatcher.addDispatch(makeModel(hatEinvadril, "einvadril_helmet"));
		dispatcher.addDispatch(makeModel(shirtEinvadril, "einvadril_chestplate"));
		dispatcher.addDispatch(makeModel(pantsEinvadril, "einvadril_leggings"));
		dispatcher.addDispatch(makeModel(feetsiesEinvadril, "einvadril_boots"));

// Feigril
/*
		dispatcher.addDispatch(makeModel(rawFeigrilRaw, "raw_feigril"));
		dispatcher.addDispatch(makeModel(ingotFeigrilIngot, "feigril_ingot"));
		dispatcher.addDispatch(makeModel(toolAxeFeigril, "feigril_axe").setFull3D());
		dispatcher.addDispatch(makeModel(toolShovelFeigril, "feigril_shovel").setFull3D());
		dispatcher.addDispatch(makeModel(toolHoeFeigril, "feigril_hoe").setFull3D());
		dispatcher.addDispatch(makeModel(toolPickaxeFeigril, "feigril_pickaxe").setFull3D());
		dispatcher.addDispatch(makeModel(toolSwordFeigril, "feigril_sword").setFull3D());
		dispatcher.addDispatch(makeModel(hatFeigril, "feigril_helmet"));
		dispatcher.addDispatch(makeModel(shirtFeigril, "feigril_chestplate"));
		dispatcher.addDispatch(makeModel(pantsFeigril, "feigril_leggings"));
		dispatcher.addDispatch(makeModel(feetsiesFeigril, "feigril_boots"));

// Mattrite

		dispatcher.addDispatch(makeModel(rawMattriteRaw, "raw_mattrite"));
		dispatcher.addDispatch(makeModel(ingotMattriteIngot, "mattrite_ingot"));
		dispatcher.addDispatch(makeModel(toolAxeMattrite, "mattrite_axe").setFull3D());
		dispatcher.addDispatch(makeModel(toolShovelMattrite, "mattrite_shovel").setFull3D());
		dispatcher.addDispatch(makeModel(toolHoeMattrite, "mattrite_hoe").setFull3D());
		dispatcher.addDispatch(makeModel(toolPickaxeMattrite, "mattrite_pickaxe").setFull3D());
		dispatcher.addDispatch(makeModel(toolSwordMattrite, "mattrite_sword").setFull3D());
		dispatcher.addDispatch(makeModel(hatMattrite, "mattrite_helmet"));
		dispatcher.addDispatch(makeModel(shirtMattrite, "mattrite_chestplate"));
		dispatcher.addDispatch(makeModel(pantsMattrite, "mattrite_leggings"));
		dispatcher.addDispatch(makeModel(feetsiesMattrite, "mattrite_boots"));
 **
*/
// Hlifintite

		dispatcher.addDispatch(makeModel(rawHlifintiteRaw, "raw_hlifintite"));
		dispatcher.addDispatch(makeModel(ingotHlifintiteIngot, "hlifintite_ingot"));
		dispatcher.addDispatch(makeModel(toolAxeHlifintite, "hlifintite_axe").setFull3D());
		dispatcher.addDispatch(makeModel(toolShovelHlifintite, "hlifintite_shovel").setFull3D());
		dispatcher.addDispatch(makeModel(toolHoeHlifintite, "hlifintite_hoe").setFull3D());
		dispatcher.addDispatch(makeModel(toolPickaxeHlifintite, "hlifintite_pickaxe").setFull3D());
		dispatcher.addDispatch(makeModel(toolSwordHlifintite, "hlifintite_sword").setFull3D());
		dispatcher.addDispatch(makeModel(hatHlifintite, "hlifintite_helmet"));
		dispatcher.addDispatch(makeModel(shirtHlifintite, "hlifintite_chestplate"));
		dispatcher.addDispatch(makeModel(pantsHlifintite, "hlifintite_leggings"));
		dispatcher.addDispatch(makeModel(feetsiesHlifintite, "hlifintite_boots"));

// Ginnungien
/*
		dispatcher.addDispatch(makeModel(rawGinnungienRaw, "raw_ginnungien"));
		dispatcher.addDispatch(makeModel(ingotGinnungienIngot, "ginnungien_ingot"));
		dispatcher.addDispatch(makeModel(toolAxeGinnungien, "ginnungien_axe").setFull3D());
		dispatcher.addDispatch(makeModel(toolShovelGinnungien, "ginnungien_shovel").setFull3D());
		dispatcher.addDispatch(makeModel(toolHoeGinnungien, "ginnungien_hoe").setFull3D());
		dispatcher.addDispatch(makeModel(toolPickaxeGinnungien, "ginnungien_pickaxe").setFull3D());
		dispatcher.addDispatch(makeModel(toolSwordGinnungien, "ginnungien_sword").setFull3D());
		dispatcher.addDispatch(makeModel(hatGinnungien, "ginnungien_helmet"));
		dispatcher.addDispatch(makeModel(shirtGinnungien, "ginnungien_chestplate"));
		dispatcher.addDispatch(makeModel(pantsGinnungien, "ginnungien_leggings"));
		dispatcher.addDispatch(makeModel(feetsiesGinnungien, "ginnungien_boots"));

// Modrastirium

		dispatcher.addDispatch(makeModel(rawModrastiriumRaw, "raw_modrastirium"));
		dispatcher.addDispatch(makeModel(ingotModrastiriumIngot, "modrastirium_ingot"));
		dispatcher.addDispatch(makeModel(toolAxeModrastirium, "modrastirium_axe").setFull3D());
		dispatcher.addDispatch(makeModel(toolShovelModrastirium, "modrastirium_shovel").setFull3D());
		dispatcher.addDispatch(makeModel(toolHoeModrastirium, "modrastirium_hoe").setFull3D());
		dispatcher.addDispatch(makeModel(toolPickaxeModrastirium, "modrastirium_pickaxe").setFull3D());
		dispatcher.addDispatch(makeModel(toolSwordModrastirium, "modrastirium_sword").setFull3D());
		dispatcher.addDispatch(makeModel(hatModrastirium, "modrastirium_helmet"));
		dispatcher.addDispatch(makeModel(shirtModrastirium, "modrastirium_chestplate"));
		dispatcher.addDispatch(makeModel(pantsModrastirium, "modrastirium_leggings"));
		dispatcher.addDispatch(makeModel(feetsiesModrastirium, "modrastirium_boots"));
 **
*/
// Eilifligronium

		dispatcher.addDispatch(makeModel(ingotEilifligroniumIngot, "eilifligronium_ingot"));
		dispatcher.addDispatch(makeModel(toolAxeEilifligronium, "eilifligronium_axe").setFull3D());
		dispatcher.addDispatch(makeModel(toolShovelEilifligronium, "eilifligronium_shovel").setFull3D());
		dispatcher.addDispatch(makeModel(toolHoeEilifligronium, "eilifligronium_hoe").setFull3D());
		dispatcher.addDispatch(makeModel(toolPickaxeEilifligronium, "eilifligronium_pickaxe").setFull3D());
		dispatcher.addDispatch(makeModel(toolSwordEilifligronium, "eilifligronium_sword").setFull3D());
		dispatcher.addDispatch(makeModel(hatEilifligronium, "eilifligronium_helmet"));
		dispatcher.addDispatch(makeModel(shirtEilifligronium, "eilifligronium_chestplate"));
		dispatcher.addDispatch(makeModel(pantsEilifligronium, "eilifligronium_leggings"));
		dispatcher.addDispatch(makeModel(feetsiesEilifligronium, "eilifligronium_boots"));

	}

	public static @NotNull ItemModelStandard makeModel(@NotNull final Item item, @NotNull final String textureValue) {
		return setIcon(new ItemModelStandard(item, null), NamespaceID.getTemp(MOD_ID, "item/" + textureValue));
	}

	public static <T extends ItemModelStandard> @NotNull T setIcon(@NotNull final T model, @NotNull final String texture) {
		model.icon = TextureRegistry.getTexture(texture);
		return model;
	}

	public static <T extends ItemModelStandard> @NotNull T setIcon(@NotNull final T model, @NotNull final NamespaceID texture) {
		model.icon = TextureRegistry.getTexture(texture);
		return model;
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
