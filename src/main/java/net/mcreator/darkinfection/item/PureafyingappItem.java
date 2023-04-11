
package net.mcreator.darkinfection.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.darkinfection.init.DarkInfectionModTabs;

public class PureafyingappItem extends Item {
	public PureafyingappItem() {
		super(new Item.Properties().tab(DarkInfectionModTabs.TAB_DARKINFECTED).stacksTo(64).rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(0).saturationMod(0.30000001192092896f).alwaysEat()

				.build()));
	}
}
