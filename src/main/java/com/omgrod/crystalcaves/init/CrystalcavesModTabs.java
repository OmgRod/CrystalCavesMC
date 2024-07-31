
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.omgrod.crystalcaves.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import com.omgrod.crystalcaves.CrystalcavesMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CrystalcavesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CrystalcavesMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CRYSTAL_CAVES_TAB = REGISTRY.register("crystal_caves_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.crystalcaves.crystal_caves_tab")).icon(() -> new ItemStack(CrystalcavesModBlocks.CRYSTALITE_ORE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CrystalcavesModBlocks.CRYSTALITE_ORE.get().asItem());
				tabData.accept(CrystalcavesModItems.CRYSTALITE.get());
				tabData.accept(CrystalcavesModBlocks.CRYSTALITE_BLOCK.get().asItem());
				tabData.accept(CrystalcavesModItems.CRYSTAL_ARMOR_HELMET.get());
				tabData.accept(CrystalcavesModItems.CRYSTAL_ARMOR_CHESTPLATE.get());
				tabData.accept(CrystalcavesModItems.CRYSTAL_ARMOR_LEGGINGS.get());
				tabData.accept(CrystalcavesModItems.CRYSTAL_ARMOR_BOOTS.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(CrystalcavesModItems.CRYSTALITE_GOLEM_SPAWN_EGG.get());
		}
	}
}
