
package net.mcr.medhealth.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcr.medhealth.init.MedicalhealthModTabs;

import java.util.List;

public class TweezersItem extends Item {
	public TweezersItem() {
		super(new Item.Properties().tab(MedicalhealthModTabs.TAB_MEDICAL_AID).stacksTo(1).rarity(Rarity.COMMON));
		setRegistryName("tweezers");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("MakeMedicalPack"));
	}
}
