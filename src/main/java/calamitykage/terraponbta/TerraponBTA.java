package calamitykage.terraponbta;

import calamitykage.terraponbta.blocks.TerraponBTABlocks;
import calamitykage.terraponbta.item.TerraponBTAItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.crafting.LookupFuelFurnace;
import net.minecraft.core.crafting.LookupFuelFurnaceBlast;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.tag.ItemTags;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tosutosu.betterwithbackpacks.item.ItemBackpack;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.helper.ModVersionHelper;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.ClientStartEntrypoint;
import turniplabs.halplibe.util.ConfigHandler;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;
import net.minecraft.core.block.Block;

import static calamitykage.terraponbta.blocks.TerraponBTABlocks.*;
import static calamitykage.terraponbta.item.TerraponBTAItems.*;

import java.util.Properties;

public class TerraponBTA implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint, ClientStartEntrypoint {
    public static final String MOD_ID = "terraponbta";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static int GUI_ID;


	public static int itemId;
	public static int blockId;

	static {
		Properties prop = new Properties();
		prop.setProperty("starting_item_id","25400");
		prop.setProperty("starting_block_id","4700");
		ConfigHandler config = new ConfigHandler(MOD_ID,prop);
		itemId = config.getInt("starting_item_id");
		blockId = config.getInt("starting_block_id");

		config.updateConfig();
	}

	@Override
	public void onInitialize() {
		LOGGER.info("TerraponBTA initialized.");
		new TerraponBTAItems().initializeItems();
		new TerraponBTABlocks().initializeBlocks();
	}

	@Override
	public void beforeGameStart() {

	}

	@Override
	public void afterGameStart() {

	}

	@Override
	public void onRecipesReady() {

	}

	@Override
	public void initNamespaces() {
		RecipeBuilder.initNameSpace(MOD_ID);
	}

	@Override
	public void beforeClientStart() {

	}

	@Override
	public void afterClientStart() {

	}
}
