package calamitykage.terraponbta73.blocks;

import net.minecraft.client.render.block.model.BlockModelTransparent;
import net.minecraft.client.render.texture.stitcher.IconCoordinate;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicPortal;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.WorldSource;

public class ModelTerraponPortal <T extends BlockLogicPortal> extends BlockModelTransparent<T> {
	protected IconCoordinate[] colors = new IconCoordinate[16];

	public ModelTerraponPortal(Block<T> block) {
		super(block, false);

		this.onRenderLayer(1);
	}

	public boolean shouldSideBeRendered(WorldSource blockAccess, AABB bounds, int x, int y, int z, int side) {
		return blockAccess.getBlockId(x, y, z) == this.block.id() ? false : super.shouldSideBeRendered(blockAccess, bounds, x, y, z, side);
	}
}
