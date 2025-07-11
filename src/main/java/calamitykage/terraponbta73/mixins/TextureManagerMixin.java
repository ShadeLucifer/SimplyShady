package calamitykage.terraponbta73.mixins;
import net.minecraft.client.Minecraft;
import net.minecraft.client.render.TextureManager;
import net.minecraft.client.render.dynamictexture.DynamicTexture;
import net.minecraft.client.render.dynamictexture.DynamicTextureCustom;
import net.minecraft.client.render.texture.meta.AnimationProperties;
import net.minecraft.client.render.texture.stitcher.IconCoordinate;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Collection;

@Mixin(
	value = TextureManager.class,
	remap = false
)
public abstract class TextureManagerMixin {
	@Shadow
	@Final
	public Minecraft mc;

	@Shadow
	protected abstract void addDynamicTexture(DynamicTexture texture);

	@Inject(
		method = "initDynamicTextures",
		at = @At(value = "TAIL")
	)
	public void initSIDynamicTextures(Collection<? super Throwable> errors, CallbackInfo ci) {
		IconCoordinate cNether = TextureRegistry.getTexture("terraponbta73:block/terraponPortal");

		assert cNether.hasMeta("animation") : "Coordinate " + cNether.namespaceId + " is expected to have animation data attached!";

		this.addDynamicTexture(new DynamicTextureCustom(cNether, (AnimationProperties) cNether.getMeta("animation", AnimationProperties.class)));

	}
}
