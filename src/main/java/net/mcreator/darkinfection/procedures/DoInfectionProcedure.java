package net.mcreator.darkinfection.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

public class DoInfectionProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z
) {
double i = 0;
if (Mth.nextInt(RandomSource.create(), 1, 10)==1) {i = 0;for (int index0 = 0; index0<(int)(5); index0++) {i = i+1;if ( == (world.getBlockState(new BlockPos(x+1,y,z))).getBlock()) {world.setBlock(new BlockPos(x+1,y,z), .defaultBlockState(),3);}if ( == (world.getBlockState(new BlockPos(x-1,y,z))).getBlock()) {world.setBlock(new BlockPos(x-1,y,z), .defaultBlockState(),3);}if ( == (world.getBlockState(new BlockPos(x,y+1,z))).getBlock()) {world.setBlock(new BlockPos(x,y+1,z), .defaultBlockState(),3);}if ( == (world.getBlockState(new BlockPos(x,y-1,z))).getBlock()) {world.setBlock(new BlockPos(x,y-1,z), .defaultBlockState(),3);}if ( == (world.getBlockState(new BlockPos(x,y,z+1))).getBlock()) {world.setBlock(new BlockPos(x,y,z+1), .defaultBlockState(),3);}if ( == (world.getBlockState(new BlockPos(x,y,z-1))).getBlock()) {world.setBlock(new BlockPos(x,y,z-1), .defaultBlockState(),3);}}}
}
}
