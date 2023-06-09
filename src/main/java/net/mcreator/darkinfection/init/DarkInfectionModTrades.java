
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.darkinfection.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class DarkInfectionModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.CLERIC) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64), new ItemStack(Items.HEART_OF_THE_SEA), new ItemStack(DarkInfectionModItems.ITEMORBOFDARKNESS.get()), 25, 20, 0f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.DIAMOND, 32), new ItemStack(Items.GOLDEN_APPLE, 4), new ItemStack(Items.ENCHANTED_GOLDEN_APPLE), 10, 20, 0f));
		}
	}
}
