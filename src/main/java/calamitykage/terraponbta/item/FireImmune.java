package calamitykage.terraponbta.item;

import calamitykage.terraponbta.ModItemTags;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.material.ArmorMaterial;

public class FireImmune extends ItemArmor {
	public FireImmune(String name, int id, ArmorMaterial material, int armorPiece) {
		super(name, id, material, armorPiece);
		ModItemTags.fireImmuneAsEntity.tag(this);
	}
}
