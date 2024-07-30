
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.omgrod.crystalcaves.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import com.omgrod.crystalcaves.item.CrystaliteItem;
import com.omgrod.crystalcaves.CrystalcavesMod;

public class CrystalcavesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CrystalcavesMod.MODID);
	public static final RegistryObject<Item> CRYSTALITE = REGISTRY.register("crystalite", () -> new CrystaliteItem());
	public static final RegistryObject<Item> CRYSTALITE_ORE = block(CrystalcavesModBlocks.CRYSTALITE_ORE);
	public static final RegistryObject<Item> CRYSTALITE_BLOCK = block(CrystalcavesModBlocks.CRYSTALITE_BLOCK);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
