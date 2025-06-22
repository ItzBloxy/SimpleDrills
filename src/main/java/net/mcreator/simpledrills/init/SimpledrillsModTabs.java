
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.simpledrills.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.simpledrills.SimpledrillsMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class SimpledrillsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SimpledrillsMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(SimpledrillsModItems.IRON_DRILL.get());
			tabData.accept(SimpledrillsModItems.GOLD_DRILL.get());
			tabData.accept(SimpledrillsModItems.EMERALD_DRILL.get());
			tabData.accept(SimpledrillsModItems.DIAMOND_DRILL.get());
			tabData.accept(SimpledrillsModItems.NETHERITE_DRILL.get());
			tabData.accept(SimpledrillsModItems.MULTI_DRILL.get());
			tabData.accept(SimpledrillsModItems.COPPER_DRILL.get());
			tabData.accept(SimpledrillsModItems.AMETHYST_DRILL.get());
			tabData.accept(SimpledrillsModItems.SCULK_DRILL.get());
		}
	}
}
