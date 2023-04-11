package net.mcreator.darkinfection.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.darkinfection.init.DarkInfectionModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CrptProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == DarkInfectionModItems.QUARTZ_ENRICHED_NETHERITE_ARMOR_BOOTS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == DarkInfectionModItems.QUARTZ_ENRICHED_NETHERITE_ARMOR_LEGGINGS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == DarkInfectionModItems.QUARTZ_ENRICHED_NETHERITE_ARMOR_CHESTPLATE.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == DarkInfectionModItems.QUARTZ_ENRICHED_NETHERITE_ARMOR_HELMET.get()) == false) {
			if (new Object() {
				public int getScore(String score, Entity _ent) {
					Scoreboard _sc = _ent.getLevel().getScoreboard();
					Objective _so = _sc.getObjective(score);
					if (_so != null)
						return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
					return 0;
				}
			}.getScore("crtp", entity) == 1 && new Object() {
				public int getScore(String score, Entity _ent) {
					Scoreboard _sc = _ent.getLevel().getScoreboard();
					Objective _so = _sc.getObjective(score);
					if (_so != null)
						return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
					return 0;
				}
			}.getScore("imune", entity) == 0) {
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.getLevel().getScoreboard();
					Objective _so = _sc.getObjective("crtp");
					if (_so == null)
						_so = _sc.addObjective("crtp", ObjectiveCriteria.DUMMY, Component.literal("crtp"), ObjectiveCriteria.RenderType.INTEGER);
					_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
				}
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.getLevel().getScoreboard();
					Objective _so = _sc.getObjective("infected");
					if (_so == null)
						_so = _sc.addObjective("infected", ObjectiveCriteria.DUMMY, Component.literal("infected"), ObjectiveCriteria.RenderType.INTEGER);
					_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(1);
				}
			} else {
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.getLevel().getScoreboard();
					Objective _so = _sc.getObjective("crtp");
					if (_so == null)
						_so = _sc.addObjective("crtp", ObjectiveCriteria.DUMMY, Component.literal("crtp"), ObjectiveCriteria.RenderType.INTEGER);
					_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
				}
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.getLevel().getScoreboard();
					Objective _so = _sc.getObjective("imune");
					if (_so == null)
						_so = _sc.addObjective("imune", ObjectiveCriteria.DUMMY, Component.literal("imune"), ObjectiveCriteria.RenderType.INTEGER);
					_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
				}
			}
		} else if (((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == DarkInfectionModItems.QUARTZ_ENRICHED_NETHERITE_ARMOR_BOOTS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == DarkInfectionModItems.QUARTZ_ENRICHED_NETHERITE_ARMOR_LEGGINGS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == DarkInfectionModItems.QUARTZ_ENRICHED_NETHERITE_ARMOR_CHESTPLATE.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == DarkInfectionModItems.QUARTZ_ENRICHED_NETHERITE_ARMOR_HELMET.get()) == true) {
			if (Math.random() > 0.975) {
				if (new Object() {
					public int getScore(String score, Entity _ent) {
						Scoreboard _sc = _ent.getLevel().getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null)
							return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
						return 0;
					}
				}.getScore("crtp", entity) == 1 && new Object() {
					public int getScore(String score, Entity _ent) {
						Scoreboard _sc = _ent.getLevel().getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null)
							return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
						return 0;
					}
				}.getScore("imune", entity) == 0) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.getLevel().getScoreboard();
						Objective _so = _sc.getObjective("crtp");
						if (_so == null)
							_so = _sc.addObjective("crtp", ObjectiveCriteria.DUMMY, Component.literal("crtp"), ObjectiveCriteria.RenderType.INTEGER);
						_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
					}
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.getLevel().getScoreboard();
						Objective _so = _sc.getObjective("infected");
						if (_so == null)
							_so = _sc.addObjective("infected", ObjectiveCriteria.DUMMY, Component.literal("infected"), ObjectiveCriteria.RenderType.INTEGER);
						_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(1);
					}
				} else {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.getLevel().getScoreboard();
						Objective _so = _sc.getObjective("crtp");
						if (_so == null)
							_so = _sc.addObjective("crtp", ObjectiveCriteria.DUMMY, Component.literal("crtp"), ObjectiveCriteria.RenderType.INTEGER);
						_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
					}
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.getLevel().getScoreboard();
						Objective _so = _sc.getObjective("imune");
						if (_so == null)
							_so = _sc.addObjective("imune", ObjectiveCriteria.DUMMY, Component.literal("imune"), ObjectiveCriteria.RenderType.INTEGER);
						_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
					}
				}
			}
		}
	}
}
