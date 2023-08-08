
package net.mcr.medhealth.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcr.medhealth.procedures.HealthingProcedure;
import net.mcr.medhealth.init.MedicalhealthModTabs;

import java.util.List;

public class FirstaidpackItem extends Item {
	public FirstaidpackItem() {
		super(new Item.Properties().tab(MedicalhealthModTabs.TAB_MEDICAL_AID).durability(2).rarity(Rarity.COMMON));
		setRegistryName("firstaidpack");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 4;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Health"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		HealthingProcedure.execute(entity);
		return ar;
	}
}
