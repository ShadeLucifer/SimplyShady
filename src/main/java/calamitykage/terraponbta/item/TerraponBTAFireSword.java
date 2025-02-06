package calamitykage.terraponbta.item;

import calamitykage.terraponbta.TerraponBTA;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.EntityLiving;
import net.minecraft.core.entity.animal.EntityAnimal;
import net.minecraft.core.entity.animal.EntityChicken;
import net.minecraft.core.entity.animal.EntityCow;
import net.minecraft.core.entity.animal.EntityPig;
import net.minecraft.core.entity.monster.*;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tag.ItemTags;
import net.minecraft.core.item.tool.ItemToolSword;
import net.minecraft.server.entity.player.EntityPlayerMP;

public class TerraponBTAFireSword extends ItemToolSword {

	public TerraponBTAFireSword
	(String name, int id, ToolMaterial enumtoolmaterial) {
		super(name, id, enumtoolmaterial);
		ItemTags.PREVENT_CREATIVE_MINING.tag(this);
	}

	@Override
	public boolean hitEntity(ItemStack itemstack, EntityLiving attacked, EntityLiving player) {
		if (attacked instanceof EntityMonster) {
			attacked.remainingFireTicks = 35 + player.world.rand.nextInt(150);
			attacked.maxFireTicks = attacked.remainingFireTicks;
		}
		if (attacked instanceof EntityCreeper) {
			attacked.remainingFireTicks = 35 + player.world.rand.nextInt(150);
			attacked.maxFireTicks = attacked.remainingFireTicks;
		}
		if (attacked instanceof EntityCow) {
			attacked.remainingFireTicks = 35 + player.world.rand.nextInt(150);
			attacked.maxFireTicks = attacked.remainingFireTicks;
		}
		if (attacked instanceof Entity) {
			attacked.remainingFireTicks = 35 + player.world.rand.nextInt(150);
			attacked.maxFireTicks = attacked.remainingFireTicks;
		}
		if (attacked instanceof EntityLiving) {
			attacked.remainingFireTicks = 35 + player.world.rand.nextInt(150);
			attacked.maxFireTicks = attacked.remainingFireTicks;
		}
		if (attacked instanceof EntityAnimal) {
			attacked.remainingFireTicks = 35 + player.world.rand.nextInt(150);
			attacked.maxFireTicks = attacked.remainingFireTicks;
		}
		if (attacked instanceof EntityGhast) {
			attacked.remainingFireTicks = 35 + player.world.rand.nextInt(150);
			attacked.maxFireTicks = attacked.remainingFireTicks;
		}
		if (attacked instanceof EntitySpider) {
			attacked.remainingFireTicks = 35 + player.world.rand.nextInt(150);
			attacked.maxFireTicks = attacked.remainingFireTicks;
		}
		if (attacked instanceof EntitySkeleton) {
			attacked.remainingFireTicks = 35 + player.world.rand.nextInt(150);
			attacked.maxFireTicks = attacked.remainingFireTicks;
		}
		if (attacked instanceof EntityPig) {
			attacked.remainingFireTicks = 35 + player.world.rand.nextInt(150);
			attacked.maxFireTicks = attacked.remainingFireTicks;
			}
		if (attacked instanceof EntityPlayer) {
			attacked.remainingFireTicks = 35 + player.world.rand.nextInt(150);
			attacked.maxFireTicks = attacked.remainingFireTicks;
		}
		if (attacked instanceof EntityPlayerMP) {
			attacked.remainingFireTicks = 35 + player.world.rand.nextInt(150);
			attacked.maxFireTicks = attacked.remainingFireTicks;
		}
		if (attacked instanceof EntityChicken) {
			attacked.remainingFireTicks = 35 + player.world.rand.nextInt(150);
			attacked.maxFireTicks = attacked.remainingFireTicks;
		}
		itemstack.damageItem(1, player);
		return true;
	}

}
