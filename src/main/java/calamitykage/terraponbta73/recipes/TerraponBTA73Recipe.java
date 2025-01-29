package calamitykage.terraponbta73.recipes;

import net.minecraft.core.block.Block;
import net.minecraft.core.crafting.LookupFuelFurnace;
import net.minecraft.core.crafting.LookupFuelFurnaceBlast;
import net.minecraft.core.item.Item;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.RecipeEntrypoint;

import static calamitykage.terraponbta73.TerraponBTA73.MOD_ID;

import static calamitykage.terraponbta73.item.TerraponBTA73Items.*;

public class TerraponBTA73Recipe implements RecipeEntrypoint {
	@Override
	public void onRecipesReady () {

}

	@Override
	public void initNamespaces() {
		RecipeBuilder.initNameSpace(MOD_ID);
	}
}
