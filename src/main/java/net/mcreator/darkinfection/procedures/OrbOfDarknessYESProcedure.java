package net.mcreator.darkinfection.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import java.util.Map;

public class OrbOfDarknessYESProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z
) {
double i = 0;
i = 0;for (int index0 = 0; index0<(int)(); index0++) {i = i+1;if ((world.getBlockState(new BlockPos(x,y,z))).getBlock() == ) {{
BlockPos _bp = new BlockPos(x,y,z);
BlockState _bs = .defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
world.setBlock(_bp, _bs, 3);
}
}}
}
}
