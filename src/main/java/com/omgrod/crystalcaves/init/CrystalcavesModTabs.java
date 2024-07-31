
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.omgrod.crystalcaves.init;

import com.omgrod.crystalcaves.CrystalcavesMod;

public class CrystalcavesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CrystalcavesMod.MODID);
	public static final RegistryObject<CreativeModeTab> CRYSTAL_CAVES_TAB = REGISTRY.register("crystal_caves_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.crystalcaves.crystal_caves_tab")).icon(() -> new ItemStack(CrystalcavesModBlocks.CRYSTALITE_ORE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CrystalcavesModBlocks.CRYSTALITE_ORE.get().asItem());
				tabData.accept(CrystalcavesModItems.CRYSTALITE.get());
				tabData.accept(CrystalcavesModBlocks.CRYSTALITE_BLOCK.get().asItem());
				tabData.accept(CrystalcavesModItems.CRYSTAL_ARMOR_HELMET.get());
				tabData.accept(CrystalcavesModItems.CRYSTAL_ARMOR_CHESTPLATE.get());
				tabData.accept(CrystalcavesModItems.CRYSTAL_ARMOR_LEGGINGS.get());
				tabData.accept(CrystalcavesModItems.CRYSTAL_ARMOR_BOOTS.get());
			}).withSearchBar().build());
}
