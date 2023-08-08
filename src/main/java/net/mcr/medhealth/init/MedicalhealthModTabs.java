
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcr.medhealth.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MedicalhealthModTabs {
	public static CreativeModeTab TAB_MEDICAL_AID;

	public static void load() {
		TAB_MEDICAL_AID = new CreativeModeTab("tabmedical_aid") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MedicalhealthModItems.FIRSTAIDPACK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
