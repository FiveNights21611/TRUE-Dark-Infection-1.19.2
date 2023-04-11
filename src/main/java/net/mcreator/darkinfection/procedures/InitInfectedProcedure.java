package net.mcreator.darkinfection.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;

import net.minecraft.world.item.ItemStack;

import net.mcreator.darkinfection.network.DarkInfectionModVariables;
import net.mcreator.darkinfection.init.DarkInfectionModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class InitInfectedProcedure {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		execute();
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		DarkInfectionModVariables.InfectedBlocksTRUE.clear();
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.INFECTEDSOIL.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.INFECTEDSOIL.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.INFECTEDSOIL.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.DARKDIRT.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.DARKDIRT.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.DARKDIRT.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.GRAVITYVOID.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.GRAVITYVOID.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOIDSTONE.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOIDSTONE.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOIDSTONE.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOID_COBBLE.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOID_COBBLE.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOID_COBBLE.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOID_COBBLE.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOID_STONE_COAL_ORE.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOID_STONE_COAL_ORE.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOID_STONE_IRON_ORE.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOID_STONE_IRON_ORE.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOID_STONE_REDSTONE_ORE.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOID_STONE_REDSTONE_ORE.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOID_STONE_REDSTONE_ORE.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOID_STONE_GOLD_ORE.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOID_STONE_GOLD_ORE.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOID_STONE_LAPIS_ORE.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOID_STONE_LAPIS_ORE.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOID_STONE_DIAMOND_ORE.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOID_STONE_DIAMOND_ORE.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOID_STONE_EMERALD_ORE.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOID_STONE_EMERALD_ORE.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOID_STONE_COPPER_ORE.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOID_STONE_COPPER_ORE.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.CHISSELDVOIDSTONEBRICKS.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.CHISSELDVOIDSTONEBRICKS.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOIDSTONEBRICKS.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOIDSTONEBRICKS.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOIDSTONEBRICKS.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOIDSTONEBRICKS.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOID_STONE_BRICK_WALLS.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOID_STONE_BRICK_WALLS.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOID_STONE_BRICK_STAIRS.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOID_STONE_BRICK_STAIRS.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOID_STONE_BRICK_SLABS.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOID_STONE_BRICK_SLABS.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOID_COBBLE.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOIDSTONEBRICKS.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.CHISSELDVOIDSTONEBRICKS.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOID_STONE_BRICK_STAIRS.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOID_STONE_BRICK_WALLS.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOID_STONE_BRICK_SLABS.get())).getItem()).toString()));
		DarkInfectionModVariables.InfectedBlocksTRUE.add((ForgeRegistries.ITEMS.getKey((new ItemStack(DarkInfectionModBlocks.VOIDSTONE.get())).getItem()).toString()));
	}
}
