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

public class TerraponBTA73 implements ModInitializer, GameStartEntrypoint, ClientStartEntrypoint {
	public static final String MOD_ID = "terraponbta73";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static TomlConfigHandler tomlConfig;
	private static int startingID = TerraponBTA73Config.CFG.getInt("IDs.startingBlockID");
	private static int nextID() {
		return startingID++;
	}



	@Override
	public void beforeGameStart() {
		new TerraponBTA73Items();
		new Models();

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
	}

}

