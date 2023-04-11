package net.mcreator.darkinfection.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.darkinfection.network.DarkInfectionModVariables;
import net.mcreator.darkinfection.DarkInfectionMod;

public class BlockInfectionSystembyFiveNightsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double i = 0;
		double randomSide = 0;
		i = 0;
		if (Mth.nextInt(RandomSource.create(), 1, 8) == 1) {
			randomSide = Mth.nextInt(RandomSource.create(), 1, 6);
			for (int index0 = 0; index0 < (int) (DarkInfectionModVariables.InfectedBlocksTRUE.size()); index0++) {
				if (randomSide == 1) {
					if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == (DarkInfectionModVariables.InfectableBlocksTRUE.get((int) i))) {
						DarkInfectionMod.LOGGER.info("Trying to infect X+1");
						world.setBlock(new BlockPos(x + 1, y, z), ForgeRegistries.BLOCKS.getValue(new ResourceLocation(("" + DarkInfectionModVariables.InfectedBlocksTRUE.get((int) i)))).defaultBlockState(), 3);
						DarkInfectionMod.LOGGER.info("" + DarkInfectionModVariables.InfectedBlocksTRUE.get((int) i));
					}
				} else if (randomSide == 2) {
					if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == (DarkInfectionModVariables.InfectableBlocksTRUE.get((int) i))) {
						DarkInfectionMod.LOGGER.info("Trying to infect X-1");
						world.setBlock(new BlockPos(x - 1, y, z), ForgeRegistries.BLOCKS.getValue(new ResourceLocation(("" + DarkInfectionModVariables.InfectedBlocksTRUE.get((int) i)))).defaultBlockState(), 3);
						DarkInfectionMod.LOGGER.info("" + DarkInfectionModVariables.InfectedBlocksTRUE.get((int) i));
					}
				} else if (randomSide == 3) {
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == (DarkInfectionModVariables.InfectableBlocksTRUE.get((int) i))) {
						DarkInfectionMod.LOGGER.info("Trying to infect Y+1");
						world.setBlock(new BlockPos(x, y + 1, z), ForgeRegistries.BLOCKS.getValue(new ResourceLocation(("" + DarkInfectionModVariables.InfectedBlocksTRUE.get((int) i)))).defaultBlockState(), 3);
						DarkInfectionMod.LOGGER.info("" + DarkInfectionModVariables.InfectedBlocksTRUE.get((int) i));
					}
				} else if (randomSide == 4) {
					if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == (DarkInfectionModVariables.InfectableBlocksTRUE.get((int) i))) {
						DarkInfectionMod.LOGGER.info("Trying to infect Y-1");
						world.setBlock(new BlockPos(x, y - 1, z), ForgeRegistries.BLOCKS.getValue(new ResourceLocation(("" + DarkInfectionModVariables.InfectedBlocksTRUE.get((int) i)))).defaultBlockState(), 3);
						DarkInfectionMod.LOGGER.info("" + DarkInfectionModVariables.InfectedBlocksTRUE.get((int) i));
					}
				} else if (randomSide == 5) {
					if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == (DarkInfectionModVariables.InfectableBlocksTRUE.get((int) i))) {
						DarkInfectionMod.LOGGER.info("Trying to infect Z+1");
						world.setBlock(new BlockPos(x, y, z + 1), ForgeRegistries.BLOCKS.getValue(new ResourceLocation(("" + DarkInfectionModVariables.InfectedBlocksTRUE.get((int) i)))).defaultBlockState(), 3);
						DarkInfectionMod.LOGGER.info("" + DarkInfectionModVariables.InfectedBlocksTRUE.get((int) i));
					}
				} else if (randomSide == 6) {
					if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == (DarkInfectionModVariables.InfectableBlocksTRUE.get((int) i))) {
						DarkInfectionMod.LOGGER.info("Trying to infect Z-1");
						world.setBlock(new BlockPos(x, y, z - 1), ForgeRegistries.BLOCKS.getValue(new ResourceLocation(("" + DarkInfectionModVariables.InfectedBlocksTRUE.get((int) i)))).defaultBlockState(), 3);
						DarkInfectionMod.LOGGER.info("" + DarkInfectionModVariables.InfectedBlocksTRUE.get((int) i));
					}
				}
				i = i + 1;
			}
		}
	}
}
