package calamitykage.terraponbta73.item;

import net.minecraft.core.entity.Mob;
import net.minecraft.core.entity.animal.MobAnimal;
import net.minecraft.core.entity.monster.MobCreeper;
import net.minecraft.core.entity.monster.MobHuman;
import net.minecraft.core.entity.monster.MobMonster;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.ItemToolSword;

import static calamitykage.terraponbta73.TerraponBTA73.MOD_ID;

public class TerraponBTAFireSword extends ItemToolSword {

	public TerraponBTAFireSword(String name, String s, int id, ToolMaterial enumtoolmaterial) {
		super(name, MOD_ID + ":" + name, id, enumtoolmaterial);
	}

	@Override
	public boolean hitEntity(ItemStack itemstack, Mob attacked, Mob player) {
		if (attacked instanceof MobMonster) {
			attacked.remainingFireTicks = 35 + player.world.rand.nextInt(150);
			attacked.maxFireTicks = attacked.remainingFireTicks;
		}
		if (attacked instanceof MobCreeper) {
			attacked.remainingFireTicks = 35 + player.world.rand.nextInt(150);
			attacked.maxFireTicks = attacked.remainingFireTicks;
		}
		if (attacked instanceof MobHuman) {
			attacked.remainingFireTicks = 35 + player.world.rand.nextInt(150);
			attacked.maxFireTicks = attacked.remainingFireTicks;
		}
		if (attacked instanceof MobAnimal) {
			attacked.remainingFireTicks = 35 + player.world.rand.nextInt(150);
			attacked.maxFireTicks = attacked.remainingFireTicks;
		}
		itemstack.damageItem(1, player);
		return true;
	}
}
