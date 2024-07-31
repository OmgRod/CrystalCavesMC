
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.omgrod.crystalcaves.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import com.omgrod.crystalcaves.block.CrystaliteOreBlock;
import com.omgrod.crystalcaves.block.CrystaliteBlockBlock;
import com.omgrod.crystalcaves.CrystalcavesMod;

public class CrystalcavesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK, CrystalcavesMod.MODID);
	public static final DeferredHolder<Block, Block> CRYSTALITE_ORE = REGISTRY.register("crystalite_ore", () -> new CrystaliteOreBlock());
	public static final DeferredHolder<Block, Block> CRYSTALITE_BLOCK = REGISTRY.register("crystalite_block", () -> new CrystaliteBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
