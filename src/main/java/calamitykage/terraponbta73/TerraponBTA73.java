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
import turniplabs.halplibe.helper.*;
import turniplabs.halplibe.util.*;

import java.util.Properties;

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
		TerraponBTA73Blocks.initBlocks();

	}

}

