
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.omgrod.crystalcaves.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.core.registries.BuiltInRegistries;

import com.omgrod.crystalcaves.item.CrystaliteItem;
import com.omgrod.crystalcaves.item.CrystalArmorItem;
import com.omgrod.crystalcaves.CrystalcavesMod;

public class CrystalcavesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, CrystalcavesMod.MODID);
	public static final DeferredHolder<Item, Item> CRYSTALITE = REGISTRY.register("crystalite", () -> new CrystaliteItem());
	public static final DeferredHolder<Item, Item> CRYSTALITE_ORE = block(CrystalcavesModBlocks.CRYSTALITE_ORE);
	public static final DeferredHolder<Item, Item> CRYSTALITE_BLOCK = block(CrystalcavesModBlocks.CRYSTALITE_BLOCK);
	public static final DeferredHolder<Item, Item> CRYSTAL_ARMOR_HELMET = REGISTRY.register("crystal_armor_helmet", () -> new CrystalArmorItem.Helmet());
	public static final DeferredHolder<Item, Item> CRYSTAL_ARMOR_CHESTPLATE = REGISTRY.register("crystal_armor_chestplate", () -> new CrystalArmorItem.Chestplate());
	public static final DeferredHolder<Item, Item> CRYSTAL_ARMOR_LEGGINGS = REGISTRY.register("crystal_armor_leggings", () -> new CrystalArmorItem.Leggings());
	public static final DeferredHolder<Item, Item> CRYSTAL_ARMOR_BOOTS = REGISTRY.register("crystal_armor_boots", () -> new CrystalArmorItem.Boots());
	public static final DeferredHolder<Item, Item> CRYSTALITE_GOLEM_SPAWN_EGG = REGISTRY.register("crystalite_golem_spawn_egg", () -> new DeferredSpawnEggItem(CrystalcavesModEntities.CRYSTALITE_GOLEM, -6750055, -52276, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	public static void register(IEventBus bus) {
		REGISTRY.register(bus);
	}

	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
