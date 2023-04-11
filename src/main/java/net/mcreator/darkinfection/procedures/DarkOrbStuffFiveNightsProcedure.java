package net.mcreator.darkinfection.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.darkinfection.network.DarkInfectionModVariables;
import net.mcreator.darkinfection.init.DarkInfectionModItems;
import net.mcreator.darkinfection.DarkInfectionMod;

public class DarkOrbStuffFiveNightsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double i = 0;
		i = 0;
		for (int index0 = 0; index0 < (int) (DarkInfectionModVariables.InfectedBlocksTRUE.size()); index0++) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == (DarkInfectionModVariables.InfectableBlocksTRUE.get((int) i))) {
				DarkInfectionMod.LOGGER.info("Trying to infect the block that the Player was looking at");
				world.setBlock(new BlockPos(x, y, z),
						(ForgeRegistries.ITEMS.getValue(new ResourceLocation((("" + DarkInfectionModVariables.InfectedBlocksTRUE.get((int) i))).toLowerCase(java.util.Locale.ENGLISH))) instanceof BlockItem _bi
								? _bi.getBlock().defaultBlockState()
								: Blocks.AIR.defaultBlockState()),
						3);
				DarkInfectionMod.LOGGER.info("" + DarkInfectionModVariables.InfectedBlocksTRUE.get((int) i));
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == DarkInfectionModItems.ITEMORBOFDARKNESS.get()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == DarkInfectionModItems.POPPED_ORB_OF_DARKNESS.get()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == DarkInfectionModItems.DARK_STAR.get()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == DarkInfectionModItems.ENHANCED_DARK_STAR.get()) {
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
					if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getDamageValue() > ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getMaxDamage()
							|| ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getDamageValue() == ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getMaxDamage()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(Blocks.AIR);
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == DarkInfectionModItems.ITEMORBOFDARKNESS.get()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == DarkInfectionModItems.POPPED_ORB_OF_DARKNESS.get()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == DarkInfectionModItems.DARK_STAR.get()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == DarkInfectionModItems.ENHANCED_DARK_STAR.get()) {
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
					if (((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).getDamageValue() > ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).getMaxDamage()
							|| ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).getDamageValue() == ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).getMaxDamage()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(Blocks.AIR);
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				}
			}
			i = i + 1;
		}
	}
}
