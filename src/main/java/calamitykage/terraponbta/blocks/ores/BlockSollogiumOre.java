package calamitykage.terraponbta.blocks.ores;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

import static calamitykage.terraponbta.item.TerraponBTAItems.*;

public class BlockSollogiumOre extends Block {
	public BlockSollogiumOre(String key, int id) {
		super(key, id, Material.stone);
	}
	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
		switch (dropCause) {
			case SILK_TOUCH:
			case PICK_BLOCK:
				return new ItemStack[]{new ItemStack(this)};
			case EXPLOSION:
			case PROPER_TOOL:
				return new ItemStack[]{new ItemStack((rawSollogiumRaw), 1)};
			default:
				return null;
		}
	}

}
