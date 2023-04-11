package net.mcreator.darkinfection.procedures;

import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.Component;

import net.mcreator.darkinfection.init.DarkInfectionModMobEffects;

public class WhenUDAppliedProcedure {
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
		}.getScore("infected", entity) == 3) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeAllEffects();
		} else if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("infected", entity) == 2) {
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(DarkInfectionModMobEffects.DARKNESS.get()) ? _livEnt.getEffect(DarkInfectionModMobEffects.DARKNESS.get()).getAmplifier() : 0) == 2
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(DarkInfectionModMobEffects.ULTIMATE_DARKNESS.get()) : false)) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeAllEffects();
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You feel the darkness begin to consume your mind..."), (false));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(DarkInfectionModMobEffects.DARKNESS.get(), 24000, 3));
			}
		} else if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("infected", entity) == 1) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("You feel the darkness swell within you..."), (false));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1200, 2));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1200, 1));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200, 2));
		} else if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("infected", entity) == 0) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("You feel a darkness begin to swell inside you..."), (false));
			if (entity instanceof LivingEntity _entity)
				_entity.removeAllEffects();
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(DarkInfectionModMobEffects.DARKNESS.get(), 300, 1));
		}
	}
}
