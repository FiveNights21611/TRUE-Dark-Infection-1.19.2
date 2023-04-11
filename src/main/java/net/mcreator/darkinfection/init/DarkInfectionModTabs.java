
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.darkinfection.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class DarkInfectionModTabs {
	public static CreativeModeTab TAB_DARKINFECTED;

	public static void load() {
		TAB_DARKINFECTED = new CreativeModeTab("tabdarkinfected") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(DarkInfectionModItems.ITEMORBOFDARKNESS.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
