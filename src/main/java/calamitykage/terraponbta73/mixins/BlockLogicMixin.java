package calamitykage.terraponbta73.mixins;
import calamitykage.terraponbta73.TerraponBTA73;
import calamitykage.terraponbta73.blocks.TerraponBTA73Blocks;
import calamitykage.terraponbta73.item.TerraponBTA73Items;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.tool.ItemTool;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(value = BlockLogic.class,remap = false)
public abstract class BlockLogicMixin {

	@Shadow
	@Final
	@NotNull
	public Block<?> block;

	@Shadow
	public abstract void dropBlockWithCause(World world, EnumDropCause cause, int x, int y, int z, int meta, TileEntity tileEntity, Player player);

	@Inject(method = "harvestBlock(Lnet/minecraft/core/world/World;Lnet/minecraft/core/entity/player/Player;IIIILnet/minecraft/core/block/entity/TileEntity;)V",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/core/block/BlockLogic;dropBlockWithCause(Lnet/minecraft/core/world/World;Lnet/minecraft/core/enums/EnumDropCause;IIIILnet/minecraft/core/block/entity/TileEntity;Lnet/minecraft/core/entity/player/Player;)V",
			shift = At.Shift.AFTER))
	private void multiplyHarvest(final World world, final Player entityplayer, final int x, final int y, final int z, final int meta, final TileEntity tileEntity, final CallbackInfo ci){
		final ItemStack heldItemStack = entityplayer.inventory.getCurrentItem();
		if (heldItemStack != null && heldItemStack.getItem() instanceof ItemTool && ((ItemTool) heldItemStack.getItem()).getMaterial() == TerraponBTA73Items.framiumTool && TerraponBTA73Blocks.canBeFortuned(this.block)){
			for (int i = 0; i < world.rand.nextInt(TerraponBTA73.FORTUNE_AMOUNT); i++) {
				dropBlockWithCause(world, EnumDropCause.PROPER_TOOL, x, y, z, meta, tileEntity, entityplayer);
			}
		}
	}
	@Inject(method = "harvestBlock(Lnet/minecraft/core/world/World;Lnet/minecraft/core/entity/player/Player;IIIILnet/minecraft/core/block/entity/TileEntity;)V",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/core/block/BlockLogic;dropBlockWithCause(Lnet/minecraft/core/world/World;Lnet/minecraft/core/enums/EnumDropCause;IIIILnet/minecraft/core/block/entity/TileEntity;Lnet/minecraft/core/entity/player/Player;)V",
			shift = At.Shift.AFTER))
	private void multiplyHarvest1(final World world, final Player entityplayer, final int x, final int y, final int z, final int meta, final TileEntity tileEntity, final CallbackInfo ci){
		final ItemStack heldItemStack = entityplayer.inventory.getCurrentItem();
		if (heldItemStack != null && heldItemStack.getItem() instanceof ItemTool && ((ItemTool) heldItemStack.getItem()).getMaterial() == TerraponBTA73Items.eilifligroniumTool && TerraponBTA73Blocks.canBeFortuned(this.block)){
			for (int i = 0; i < world.rand.nextInt(TerraponBTA73.FORTUNE_AMOUNT); i++) {
				dropBlockWithCause(world, EnumDropCause.PROPER_TOOL, x, y, z, meta, tileEntity, entityplayer);
			}
		}
	}
}



