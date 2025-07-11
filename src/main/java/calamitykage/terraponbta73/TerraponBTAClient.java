package calamitykage.terraponbta73;

import calamitykage.terraponbta73.dim.WorldTypeFXTerrapon;
import calamitykage.terraponbta73.dim.WorldTypeTerrapon;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.render.worldtype.WorldTypeFXDispatcher;
import net.minecraft.client.world.WorldClient;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.world.Dimension;
import turniplabs.halplibe.util.ClientStartEntrypoint;

import static calamitykage.terraponbta73.TerraponBTA73.LOGGER;

public class TerraponBTAClient implements ClientModInitializer, ClientStartEntrypoint {

	@Override
	public void beforeClientStart() {
		LOGGER.info("Beginning client pre init");
	}

	public void afterClientStart() {
		LOGGER.info("Beginning client post init");
	}

	public static void movePlayerToDimension(Player player, int dimension) {
		Minecraft mc = Minecraft.getMinecraft();
		Dimension lastDim = Dimension.getDimensionList().get(player.dimension);
		Dimension newDim = Dimension.getDimensionList().get(dimension);
		System.out.println("Switching to dimension \"" + newDim.getTranslatedName() + "\"!!");
		player.dimension = dimension;
		mc.currentWorld.setEntityDead(player);
		mc.thePlayer.removed = false;
		double x = player.x;
		double y = player.y + 64;
		double z = player.z;
		player.moveTo(x *= Dimension.getCoordScale(lastDim, newDim), y, z *= Dimension.getCoordScale(lastDim, newDim), player.yRot, player.xRot);
		if (player.isAlive()) {
			mc.currentWorld.updateEntityWithOptionalForce(player, false);
		}
		WorldClient world = new WorldClient(mc.currentWorld, newDim);
		if (newDim == lastDim.homeDim) {
			mc.changeWorld(world, "Leaving " + lastDim.getTranslatedName(), player);
		} else {
			mc.changeWorld(world, "Entering " + newDim.getTranslatedName(), player);
		}
		player.world = mc.currentWorld;
		if (player.isAlive()) {
			player.moveTo(x, y, z, player.yRot, player.xRot);
			mc.currentWorld.updateEntityWithOptionalForce(player, false);
		}
	}

	@Override
	public void onInitializeClient() {

	}
}
