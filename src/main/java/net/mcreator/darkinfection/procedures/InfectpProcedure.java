package net.mcreator.darkinfection.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.darkinfection.init.DarkInfectionModMobEffects;
import net.mcreator.darkinfection.init.DarkInfectionModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class InfectpProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("infected", sourceentity) > 0 && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem() && new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("infected", entity) == 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(DarkInfectionModMobEffects.DARKCORUPT.get(), 1200, 0, (false), (false)));
		} else if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("infected", sourceentity) > 0 && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == DarkInfectionModItems.DARK_SWORD.get() && new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("infected", entity) == 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(DarkInfectionModMobEffects.DARKCORUPT.get(), 1200, 0, (false), (false)));
		} else if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("infected", sourceentity) > 0 && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == DarkInfectionModItems.DARK_AXE.get() && new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("infected", entity) == 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(DarkInfectionModMobEffects.DARKCORUPT.get(), 1200, 0, (false), (false)));
		} else if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("infected", sourceentity) > 0 && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == DarkInfectionModItems.DARK_PICKAXE.get() && new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("infected", entity) == 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(DarkInfectionModMobEffects.DARKCORUPT.get(), 1200, 0, (false), (false)));
		} else if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("infected", sourceentity) > 0 && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == DarkInfectionModItems.DARK_SHOVEL.get() && new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("infected", entity) == 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(DarkInfectionModMobEffects.DARKCORUPT.get(), 1200, 0, (false), (false)));
		} else if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("infected", sourceentity) > 0 && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == DarkInfectionModItems.DARK_HOE.get() && new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("infected", entity) == 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(DarkInfectionModMobEffects.DARKCORUPT.get(), 1200, 0, (false), (false)));
		}
	}
}
