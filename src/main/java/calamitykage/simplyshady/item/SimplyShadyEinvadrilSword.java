package calamitykage.simplyshady.item;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.EntityLiving;
import net.minecraft.core.entity.monster.EntityMonster;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tag.ItemTags;
import net.minecraft.core.item.tool.ItemToolSword;

public class SimplyShadyEinvadrilSword extends ItemToolSword {

	public SimplyShadyEinvadrilSword(String name, int id, ToolMaterial enumtoolmaterial, int durability) {
		super(name, id, enumtoolmaterial);
		ItemTags.PREVENT_CREATIVE_MINING.tag(this);
		setMaxDamage(durability);
	}

	@Override
	public boolean hitEntity(ItemStack itemstack, EntityLiving attacked, EntityLiving player) {
		if (attacked instanceof EntityMonster) {
			attacked.remainingFireTicks = 35 + player.world.rand.nextInt(150);
			attacked.maxFireTicks = attacked.remainingFireTicks;
		}
		itemstack.damageItem(1, player);
		return true;
	}

	@Override
	public int getDamageVsEntity(Entity attacked) {
		if (attacked instanceof EntityMonster) {
			return Item.toolSwordSteel.getDamageVsEntity(attacked);
		}
		return Item.toolSwordSteel.getDamageVsEntity(attacked);
	}
}
