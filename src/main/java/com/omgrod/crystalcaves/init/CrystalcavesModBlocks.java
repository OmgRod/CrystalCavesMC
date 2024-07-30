
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.omgrod.crystalcaves.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import com.omgrod.crystalcaves.block.CrystaliteOreBlock;
import com.omgrod.crystalcaves.block.CrystaliteBlockBlock;
import com.omgrod.crystalcaves.CrystalcavesMod;

public class CrystalcavesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CrystalcavesMod.MODID);
	public static final RegistryObject<Block> CRYSTALITE_ORE = REGISTRY.register("crystalite_ore", () -> new CrystaliteOreBlock());
	public static final RegistryObject<Block> CRYSTALITE_BLOCK = REGISTRY.register("crystalite_block", () -> new CrystaliteBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
