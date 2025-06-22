
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.simpledrills.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.simpledrills.item.SculkDrillItem;
import net.mcreator.simpledrills.item.NetheriteDrillItem;
import net.mcreator.simpledrills.item.MultiDrillItem;
import net.mcreator.simpledrills.item.IronDrillItem;
import net.mcreator.simpledrills.item.GoldDrillItem;
import net.mcreator.simpledrills.item.EmeraldDrillItem;
import net.mcreator.simpledrills.item.DiamondDrillItem;
import net.mcreator.simpledrills.item.CopperDrillItem;
import net.mcreator.simpledrills.item.AmethystDrillItem;
import net.mcreator.simpledrills.SimpledrillsMod;

import java.util.function.Function;

public class SimpledrillsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(SimpledrillsMod.MODID);
	public static final DeferredItem<Item> IRON_DRILL = register("iron_drill", IronDrillItem::new);
	public static final DeferredItem<Item> GOLD_DRILL = register("gold_drill", GoldDrillItem::new);
	public static final DeferredItem<Item> EMERALD_DRILL = register("emerald_drill", EmeraldDrillItem::new);
	public static final DeferredItem<Item> DIAMOND_DRILL = register("diamond_drill", DiamondDrillItem::new);
	public static final DeferredItem<Item> NETHERITE_DRILL = register("netherite_drill", NetheriteDrillItem::new);
	public static final DeferredItem<Item> MULTI_DRILL = register("multi_drill", MultiDrillItem::new);
	public static final DeferredItem<Item> COPPER_DRILL = register("copper_drill", CopperDrillItem::new);
	public static final DeferredItem<Item> AMETHYST_DRILL = register("amethyst_drill", AmethystDrillItem::new);
	public static final DeferredItem<Item> SCULK_DRILL = register("sculk_drill", SculkDrillItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}
