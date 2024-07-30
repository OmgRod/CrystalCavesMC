
package com.omgrod.crystalcaves.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CrystaliteItem extends Item {
	public CrystaliteItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
