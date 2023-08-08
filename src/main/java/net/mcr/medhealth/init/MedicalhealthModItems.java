
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcr.medhealth.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import net.mcr.medhealth.item.TweezersItem;
import net.mcr.medhealth.item.PillsItem;
import net.mcr.medhealth.item.NeedleItem;
import net.mcr.medhealth.item.FirstaidpackItem;
import net.mcr.medhealth.item.DisinfectantItem;
import net.mcr.medhealth.item.CottonSwabItem;
import net.mcr.medhealth.item.BandageItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MedicalhealthModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item FIRSTAIDPACK = register(new FirstaidpackItem());
	public static final Item PILLS = register(new PillsItem());
	public static final Item NEEDLE = register(new NeedleItem());
	public static final Item BANDAGE = register(new BandageItem());
	public static final Item DISINFECTANT = register(new DisinfectantItem());
	public static final Item COTTON_SWAB = register(new CottonSwabItem());
	public static final Item TWEEZERS = register(new TweezersItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
