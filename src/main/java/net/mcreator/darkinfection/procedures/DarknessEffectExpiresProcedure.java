package net.mcreator.darkinfection.procedures;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.darkinfection.init.DarkInfectionModMobEffects;

public class DarknessEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("imune", entity) == 0 && new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("infected", entity) == 0) {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective("infected");
				if (_so == null)
					_so = _sc.addObjective("infected", ObjectiveCriteria.DUMMY, Component.literal("infected"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(1);
			}
		} else if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("imune", entity) == 1 && new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("infected", entity) == 0) {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective("imune");
				if (_so == null)
					_so = _sc.addObjective("imune", ObjectiveCriteria.DUMMY, Component.literal("imune"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
			}
		} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(DarkInfectionModMobEffects.DARKNESS.get()) ? _livEnt.getEffect(DarkInfectionModMobEffects.DARKNESS.get()).getAmplifier() : 0) == 2) {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective("infected");
				if (_so == null)
					_so = _sc.addObjective("infected", ObjectiveCriteria.DUMMY, Component.literal("infected"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(2);
			}
		} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(DarkInfectionModMobEffects.DARKNESS.get()) ? _livEnt.getEffect(DarkInfectionModMobEffects.DARKNESS.get()).getAmplifier() : 0) == 3) {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective("infected");
				if (_so == null)
					_so = _sc.addObjective("infected", ObjectiveCriteria.DUMMY, Component.literal("infected"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(3);
			}
		}
	}
}
