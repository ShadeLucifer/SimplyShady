package calamitykage.terraponbta.mixins;



import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.EntityItem;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.DamageType;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import static calamitykage.terraponbta.ModItemTags.fireImmuneAsEntity;

@Mixin(value = EntityItem.class, remap = false)
public abstract class ItemEntityMixin extends Entity {

	@Shadow
	public ItemStack item;

	@Shadow
	public abstract void tick();

	public ItemEntityMixin(World world) {
		super(world);
	}

	@Inject(method = "<init>(Lnet/minecraft/core/world/World;DDDLnet/minecraft/core/item/ItemStack;)V", at=@At("TAIL"))
	protected void init(World world, double d, double d1, double d2, ItemStack itemstack, CallbackInfo ci) {
		if (itemstack != null && itemstack.getItem() != null && fireImmuneAsEntity.appliesTo(itemstack.getItem())) {
			EntityItem instance = (EntityItem)(Object) this;
			instance.fireImmune = true;
		}
	}
	@Inject(method = "hurt", at=@At("HEAD"), cancellable = true)
	public void hurt(Entity entity, int i, DamageType type, CallbackInfoReturnable<Boolean> cir) {
		if (type.equals(DamageType.FIRE) && fireImmuneAsEntity.appliesTo(item.getItem())) {
			cir.setReturnValue(false);
		}
	}

	@Inject(method = "tick", at=@At("TAIL"))
	public void tick(CallbackInfo ci) {
		if (fireImmuneAsEntity.appliesTo(item.getItem()) && this.world.isMaterialInBB(this.bb.expand(+0.1, -0.25, +0.1), Material.lava)) {
			this.yd = 0.125f * random.nextFloat();
			this.xd *= 0.75f;
			this.zd *= 0.75f;
			this.remainingFireTicks = 100;
			this.maxFireTicks = 100;
		}
	}

	@Inject(method = "burn", at=@At("HEAD"), cancellable = true)
	public void stop_getting_block_mat(int damage, CallbackInfo ci) {
		if (fireImmuneAsEntity.appliesTo(item.getItem())) {
			ci.cancel();
		}
	}
}
