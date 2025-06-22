
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.simpledrills.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.GameRules;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class SimpledrillsModGameRules {
	public static GameRules.Key<GameRules.IntegerValue> DRILL_RADIUS;

	@SubscribeEvent
	public static void registerGameRules(FMLCommonSetupEvent event) {
		DRILL_RADIUS = GameRules.register("drillRadius", GameRules.Category.PLAYER, GameRules.IntegerValue.create(3));
	}
}
