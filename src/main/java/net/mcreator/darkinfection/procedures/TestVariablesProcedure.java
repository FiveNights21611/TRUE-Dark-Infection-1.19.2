package net.mcreator.darkinfection.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.ServerChatEvent;

import net.mcreator.darkinfection.network.DarkInfectionModVariables;
import net.mcreator.darkinfection.DarkInfectionMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TestVariablesProcedure {
	@SubscribeEvent
	public static void onChat(ServerChatEvent.Submitted event) {
		execute(event);
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		double i = 0;
		i = 0;
		for (int index0 = 0; index0 < (int) (DarkInfectionModVariables.InfectedBlocksTRUE.size()); index0++) {
			i = i + 1;
			DarkInfectionMod.LOGGER.info("Entry Number " + new java.text.DecimalFormat("##.##").format(i) + ": " + DarkInfectionModVariables.InfectedBlocksTRUE.get((int) i));
		}
	}
}
