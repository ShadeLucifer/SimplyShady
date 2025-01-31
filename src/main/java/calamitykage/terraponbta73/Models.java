package calamitykage.terraponbta73;

import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.util.collection.NamespaceID;
import net.minecraft.core.util.helper.Side;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.ModelEntrypoint;

import static calamitykage.terraponbta73.TerraponBTA73.MOD_ID;
import static calamitykage.terraponbta73.blocks.TerraponBTA73Blocks.*;
import static calamitykage.terraponbta73.item.TerraponBTA73Items.*;


public class Models implements ModelEntrypoint {
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
		ModelHelper.setItemModel(steelRod, () -> {
			ItemModelStandard model = new ItemModelStandard(steelRod, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/steel_rod"));
			return model;
		});
		ModelHelper.setItemModel(redstoneAlloy, () -> {
			ItemModelStandard model = new ItemModelStandard(redstoneAlloy, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/redstone_alloy"));
			return model;
		});
		ModelHelper.setItemModel(redstoneAlloyRod, () -> {
			ItemModelStandard model = new ItemModelStandard(redstoneAlloyRod, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/redstone_alloy_rod"));
			return model;
		});
		ModelHelper.setItemModel(lapisAlloy, () -> {
			ItemModelStandard model = new ItemModelStandard(lapisAlloy, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/lapis_alloy"));
			return model;
		});
		ModelHelper.setItemModel(lapisAlloyRod, () -> {
			ItemModelStandard model = new ItemModelStandard(lapisAlloyRod, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/lapis_alloy_rod"));
			return model;
		});
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
		ModelHelper.setItemModel(orbOfRogmal, () -> {
			ItemModelStandard model = new ItemModelStandard(orbOfRogmal, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/orbofrogmal"));
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
