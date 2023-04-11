package net.mcreator.darkinfection.procedures;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;

import net.minecraft.world.level.block.Blocks;

import net.mcreator.darkinfection.network.DarkInfectionModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class InitInfectableProcedure {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		execute();
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		DarkInfectionModVariables.InfectableBlocksTRUE.clear();
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.GRASS_BLOCK);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.MYCELIUM);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.PODZOL);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.DIRT);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.COARSE_DIRT);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.ROOTED_DIRT);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.GRAVEL);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.SAND);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.RED_SAND);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.STONE);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.INFESTED_STONE);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.DEEPSLATE);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.COBBLESTONE);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.INFESTED_COBBLESTONE);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.COBBLED_DEEPSLATE);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.MOSSY_COBBLESTONE);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.COAL_ORE);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.DEEPSLATE_COAL_ORE);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.IRON_ORE);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.DEEPSLATE_IRON_ORE);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.REDSTONE_ORE);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.DEEPSLATE_REDSTONE_ORE);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.REDSTONE_ORE);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.GOLD_ORE);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.DEEPSLATE_GOLD_ORE);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.LAPIS_ORE);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.DEEPSLATE_LAPIS_ORE);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.DIAMOND_ORE);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.DEEPSLATE_DIAMOND_ORE);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.EMERALD_ORE);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.DEEPSLATE_EMERALD_ORE);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.COPPER_ORE);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.DEEPSLATE_COPPER_ORE);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.CHISELED_STONE_BRICKS);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.INFESTED_CHISELED_STONE_BRICKS);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.STONE_BRICKS);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.MOSSY_STONE_BRICKS);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.INFESTED_STONE_BRICKS);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.INFESTED_MOSSY_STONE_BRICKS);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.STONE_BRICK_WALL);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.MOSSY_STONE_BRICK_WALL);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.STONE_BRICK_STAIRS);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.MOSSY_STONE_BRICK_STAIRS);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.STONE_BRICK_SLAB);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.MOSSY_STONE_BRICK_SLAB);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.BLACKSTONE);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.POLISHED_BLACKSTONE_BRICKS);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.CHISELED_POLISHED_BLACKSTONE);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.POLISHED_BLACKSTONE_BRICK_WALL);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB);
		DarkInfectionModVariables.InfectableBlocksTRUE.add(Blocks.POLISHED_BLACKSTONE);
	}
}
