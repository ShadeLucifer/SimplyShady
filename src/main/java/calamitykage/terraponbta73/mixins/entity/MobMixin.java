package calamitykage.terraponbta73.mixins.entity;

import calamitykage.terraponbta73.TerraponBTA73;
import calamitykage.terraponbta73.item.TerraponBTA73Items;
import calamitykage.terraponbta73.mixins.accessor.ItemToolSwordAccessor;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.tool.ItemToolSword;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
@Mixin(value = Mob.class, remap = false)
public abstract class MobMixin extends Entity {
	@Shadow
	protected abstract void dropDeathItems();

	public MobMixin(final World world) {
		super(world);
	}
	@Inject(method = "onDeath(Lnet/minecraft/core/entity/Entity;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/core/entity/Mob;dropDeathItems()V"))
	private void multiplyDrop(final Entity entity, final CallbackInfo callbackInfo){
		if (entity instanceof Player) {
			final ItemStack heldStack = ((Player) entity).getHeldItem();
			if (heldStack != null && heldStack.getItem() instanceof ItemToolSword && ((ItemToolSwordAccessor) heldStack.getItem()).getMaterial() == TerraponBTA73Items.framiumTool) {
				for (int i = 0; i < this.random.nextInt(TerraponBTA73.LOOTING_AMOUNT); i++) {
					dropDeathItems();
				}
			}
		}
	}
	@Inject(method = "onDeath(Lnet/minecraft/core/entity/Entity;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/core/entity/Mob;dropDeathItems()V"))
	private void multiplyDrop1(final Entity entity, final CallbackInfo callbackInfo){
		if (entity instanceof Player) {
			final ItemStack heldStack = ((Player) entity).getHeldItem();
			if (heldStack != null && heldStack.getItem() instanceof ItemToolSword && ((ItemToolSwordAccessor) heldStack.getItem()).getMaterial() == TerraponBTA73Items.eilifligroniumTool) {
				for (int i = 0; i < this.random.nextInt(TerraponBTA73.LOOTING_AMOUNT); i++) {
					dropDeathItems();
				}
			}
		}
	}
}
