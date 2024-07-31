
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.omgrod.crystalcaves.init;

import com.omgrod.crystalcaves.item.CrystaliteItem;
import com.omgrod.crystalcaves.item.CrystalArmorItem;
import com.omgrod.crystalcaves.CrystalcavesMod;

public class CrystalcavesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CrystalcavesMod.MODID);
	public static final RegistryObject<Item> CRYSTALITE = REGISTRY.register("crystalite", () -> new CrystaliteItem());
	public static final RegistryObject<Item> CRYSTALITE_ORE = block(CrystalcavesModBlocks.CRYSTALITE_ORE);
	public static final RegistryObject<Item> CRYSTALITE_BLOCK = block(CrystalcavesModBlocks.CRYSTALITE_BLOCK);
	public static final RegistryObject<Item> CRYSTAL_ARMOR_HELMET = REGISTRY.register("crystal_armor_helmet", () -> new CrystalArmorItem.Helmet());
	public static final RegistryObject<Item> CRYSTAL_ARMOR_CHESTPLATE = REGISTRY.register("crystal_armor_chestplate", () -> new CrystalArmorItem.Chestplate());
	public static final RegistryObject<Item> CRYSTAL_ARMOR_LEGGINGS = REGISTRY.register("crystal_armor_leggings", () -> new CrystalArmorItem.Leggings());
	public static final RegistryObject<Item> CRYSTAL_ARMOR_BOOTS = REGISTRY.register("crystal_armor_boots", () -> new CrystalArmorItem.Boots());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
