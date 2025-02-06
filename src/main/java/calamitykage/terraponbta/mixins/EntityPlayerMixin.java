package calamitykage.terraponbta.mixins;
import calamitykage.terraponbta.*;
import calamitykage.terraponbta.item.TerraponBTAItems;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.core.entity.Entity;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.player.gamemode.Gamemode;
import net.minecraft.core.player.inventory.InventoryPlayer;
import net.minecraft.core.util.helper.DamageType;
import net.minecraft.core.world.World;



import org.spongepowered.asm.mixin.Shadow;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Mixin(value = net.minecraft.core.entity.player.EntityPlayer.class, remap = false)
public abstract class EntityPlayerMixin extends net.minecraft.core.entity.EntityLiving {
	@Shadow
	public InventoryPlayer inventory;

	@Shadow
	public Gamemode gamemode;

	public EntityPlayerMixin(World world) {
		super(world);
	}

	@Inject(method = "hurt", at = @At("HEAD"), cancellable = true)
	public void hurt1(Entity attacker, int damage, DamageType type, CallbackInfoReturnable<Boolean> cir) {
		if (type == DamageType.FIRE) {
			for (int i = 0; i < this.inventory.getSizeInventory(); ++i) {
				ItemStack is = this.inventory.getStackInSlot(i);
				if (is != null && is.itemID == TerraponBTAItems.hatSollogium.id && is.getMetadata() < is.getMaxDamage()) {
					cir.setReturnValue(false);
					break;
				}
			}
		}
	}
	@Inject(method = "hurt", at = @At("HEAD"), cancellable = true)
	public void hurt2(Entity attacker, int damage, DamageType type, CallbackInfoReturnable<Boolean> cir) {
		if (type == DamageType.FIRE) {
			for (int i = 0; i < this.inventory.getSizeInventory(); ++i) {
				ItemStack is = this.inventory.getStackInSlot(i);
				if (is != null && is.itemID == TerraponBTAItems.shirtSollogium.id && is.getMetadata() < is.getMaxDamage()) {
					cir.setReturnValue(false);
					break;
				}
			}
		}
	}
	@Inject(method = "hurt", at = @At("HEAD"), cancellable = true)
	public void hurt3(Entity attacker, int damage, DamageType type, CallbackInfoReturnable<Boolean> cir) {
		if (type == DamageType.FIRE) {
			for (int i = 0; i < this.inventory.getSizeInventory(); ++i) {
				ItemStack is = this.inventory.getStackInSlot(i);
				if (is != null && is.itemID == TerraponBTAItems.pantsSollogium.id && is.getMetadata() < is.getMaxDamage()) {
					cir.setReturnValue(false);
					break;
				}
			}
		}
	}
	@Inject(method = "hurt", at = @At("HEAD"), cancellable = true)
	public void hurt4(Entity attacker, int damage, DamageType type, CallbackInfoReturnable<Boolean> cir) {
		if (type == DamageType.FIRE) {
			for (int i = 0; i < this.inventory.getSizeInventory(); ++i) {
				ItemStack is = this.inventory.getStackInSlot(i);
				if (is != null && is.itemID == TerraponBTAItems.feetsiesSollogium.id && is.getMetadata() < is.getMaxDamage()) {
					cir.setReturnValue(false);
					break;
				}
			}
		}
	}
	@Inject(method = "hurt", at = @At("HEAD"), cancellable = true)
	public void hurt5(Entity attacker, int damage, DamageType type, CallbackInfoReturnable<Boolean> cir) {
		if (type == DamageType.FIRE) {
			for (int i = 0; i < this.inventory.getSizeInventory(); ++i) {
				ItemStack is = this.inventory.getStackInSlot(i);
				if (is != null && is.itemID == TerraponBTAItems.hatEilifligronium.id && is.getMetadata() < is.getMaxDamage()) {
					cir.setReturnValue(false);
					break;
				}
			}
		}
	}
	@Inject(method = "hurt", at = @At("HEAD"), cancellable = true)
	public void hurt6(Entity attacker, int damage, DamageType type, CallbackInfoReturnable<Boolean> cir) {
		if (type == DamageType.FIRE) {
			for (int i = 0; i < this.inventory.getSizeInventory(); ++i) {
				ItemStack is = this.inventory.getStackInSlot(i);
				if (is != null && is.itemID == TerraponBTAItems.shirtEilifligronium.id && is.getMetadata() < is.getMaxDamage()) {
					cir.setReturnValue(false);
					break;
				}
			}
		}
	}
	@Inject(method = "hurt", at = @At("HEAD"), cancellable = true)
	public void hurt7(Entity attacker, int damage, DamageType type, CallbackInfoReturnable<Boolean> cir) {
		if (type == DamageType.FIRE) {
			for (int i = 0; i < this.inventory.getSizeInventory(); ++i) {
				ItemStack is = this.inventory.getStackInSlot(i);
				if (is != null && is.itemID == TerraponBTAItems.pantsEilifligronium.id && is.getMetadata() < is.getMaxDamage()) {
					cir.setReturnValue(false);
					break;
				}
			}
		}
	}
	@Inject(method = "hurt", at = @At("HEAD"), cancellable = true)
	public void hurt8(Entity attacker, int damage, DamageType type, CallbackInfoReturnable<Boolean> cir) {
		if (type == DamageType.FIRE) {
			for (int i = 0; i < this.inventory.getSizeInventory(); ++i) {
				ItemStack is = this.inventory.getStackInSlot(i);
				if (is != null && is.itemID == TerraponBTAItems.feetsiesEilifligronium.id && is.getMetadata() < is.getMaxDamage()) {
					cir.setReturnValue(false);
					break;
				}
			}
		}
	}
}
