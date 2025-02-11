package calamitykage.terraponbta73.mixins;

import calamitykage.terraponbta73.item.TerraponBTA73Items;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.player.gamemode.Gamemode;
import net.minecraft.core.player.inventory.container.ContainerInventory;
import net.minecraft.core.util.helper.DamageType;
import net.minecraft.core.world.World;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = net.minecraft.core.entity.player.Player.class, remap = false)
public abstract class EilifligroniumPlayerMixin extends net.minecraft.core.entity.Mob {
	@Shadow
	public ContainerInventory inventory;

	@Shadow
	public Gamemode gamemode;

	public EilifligroniumPlayerMixin(World world) {
        super(world);
    }
	@Inject(method = "hurt", at = @At("HEAD"), cancellable = true)
	public void hurt1(Entity attacker, int damage, DamageType type, CallbackInfoReturnable<Boolean> cir) {
		if (type == DamageType.FIRE) {
			for (int i = 0; i < ContainerInventory.playerMainInventorySize(); ++i) {
				ItemStack is = this.inventory.armorInventory[3];
				if (is != null && is.itemID == TerraponBTA73Items.hatEilifligronium.id && is.getMetadata() < is.getMaxDamage()) {
					cir.setReturnValue(false);
					break;
				}
			}
		}
	}
	@Inject(method = "hurt", at = @At("HEAD"), cancellable = true)
	public void hurt2(Entity attacker, int damage, DamageType type, CallbackInfoReturnable<Boolean> cir) {
		if (type == DamageType.FIRE) {
			for (int i = 0; i < ContainerInventory.playerMainInventorySize(); ++i) {
				ItemStack is = this.inventory.armorInventory[2];
				if (is != null && is.itemID == TerraponBTA73Items.shirtEilifligronium.id && is.getMetadata() < is.getMaxDamage()) {
					cir.setReturnValue(false);
					break;
				}
			}
		}
	}

	@Inject(method = "hurt", at = @At("HEAD"), cancellable = true)
	public void hurt3(Entity attacker, int damage, DamageType type, CallbackInfoReturnable<Boolean> cir) {
		if (type == DamageType.FIRE) {
			for (int i = 0; i < ContainerInventory.playerMainInventorySize(); ++i) {
				ItemStack is = this.inventory.armorInventory[1];
				if (is != null && is.itemID == TerraponBTA73Items.pantsEilifligronium.id && is.getMetadata() < is.getMaxDamage()) {
					cir.setReturnValue(false);
					break;
				}
			}
		}
	}
	@Inject(method = "hurt", at = @At("HEAD"), cancellable = true)
	public void hurt4(Entity attacker, int damage, DamageType type, CallbackInfoReturnable<Boolean> cir) {
		if (type == DamageType.FIRE) {
			for (int i = 0; i < ContainerInventory.playerMainInventorySize(); ++i) {
				ItemStack is = this.inventory.armorInventory[0];
				if (is != null && is.itemID == TerraponBTA73Items.feetsiesEilifligronium.id && is.getMetadata() < is.getMaxDamage()) {
					cir.setReturnValue(false);
					break;
				}
			}
		}
	}

}
