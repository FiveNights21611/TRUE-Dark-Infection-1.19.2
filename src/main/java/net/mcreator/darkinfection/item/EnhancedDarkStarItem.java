
package net.mcreator.darkinfection.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.Component;

import net.mcreator.darkinfection.procedures.DarkOrbStuffFiveNightsProcedure;
import net.mcreator.darkinfection.init.DarkInfectionModTabs;

import java.util.List;

public class EnhancedDarkStarItem extends Item {
	public EnhancedDarkStarItem() {
		super(new Item.Properties().tab(DarkInfectionModTabs.TAB_DARKINFECTED).durability(240).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Darker than ever imagined..."));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		DarkOrbStuffFiveNightsProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
