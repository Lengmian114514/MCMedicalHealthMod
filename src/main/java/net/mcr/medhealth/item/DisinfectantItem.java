
package net.mcr.medhealth.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcr.medhealth.init.MedicalhealthModTabs;

public class DisinfectantItem extends Item {
	public DisinfectantItem() {
		super(new Item.Properties().tab(MedicalhealthModTabs.TAB_MEDICAL_AID).stacksTo(2).rarity(Rarity.COMMON));
		setRegistryName("disinfectant");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}
}
