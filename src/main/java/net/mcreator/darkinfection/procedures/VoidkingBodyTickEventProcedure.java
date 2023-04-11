package net.mcreator.darkinfection.procedures;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.network.chat.Component;

import net.mcreator.darkinfection.init.DarkInfectionModItems;
import net.mcreator.darkinfection.DarkInfectionMod;

public class VoidkingBodyTickEventProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
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
		}.getScore("infected", entity) == 5) {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == DarkInfectionModItems.VOIDKING_BOOTS.get()
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == DarkInfectionModItems.VOIDKING_LEGGINGS.get()
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == DarkInfectionModItems.VOIDKING_CHESTPLATE.get()
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == DarkInfectionModItems.VOIDKING_HELMET.get()) {
				if (entity instanceof Player _player) {
					_player.getAbilities().mayfly = (true);
					_player.onUpdateAbilities();
				}
				entity.fallDistance = 0;
				if (((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)).getDamageValue() == 400) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("You feel yourself fade as you and the voice, as one, are extinguished..."), (false));
					if (entity instanceof Player _player)
						_player.getInventory().clearContent();
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.getLevel().getScoreboard();
						Objective _so = _sc.getObjective("infected");
						if (_so == null)
							_so = _sc.addObjective("infected", ObjectiveCriteria.DUMMY, Component.literal("infected"), ObjectiveCriteria.RenderType.INTEGER);
						_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
					}
					if (entity instanceof LivingEntity _entity)
						_entity.hurt(new DamageSource("gone").bypassArmor(), 40);
				}
			} else {
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == (ItemStack.EMPTY).getItem()
						&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == (ItemStack.EMPTY).getItem()
						&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == DarkInfectionModItems.VOIDKING_CHESTPLATE.get()
						&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == (ItemStack.EMPTY).getItem()) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("You feel your Will slip away as a voice speaks in your mind... my voice =)"), (false));
				} else {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 999999999, 0, (false), (false)));
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 999999999, 0, (false), (false)));
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(
								"You struggle to get the armor that is controlling you off, but it does not work, and that voice tries to tell you to give up... eventually, you fall, and that voice starts to become your own... You struggle to get the armor that is controlling you off, but it does not work, and that voice tries to tell you to give up..."),
								(false));
					DarkInfectionMod.queueServerWork(240, () -> {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Eventually, you fall to your knees, and that voice starts to become your own..."), (false));
						DarkInfectionMod.queueServerWork(180, () -> {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("You suddenly feel... like you are right where you want to be."), (false));
						});
					});
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(MobEffects.POISON);
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(MobEffects.CONFUSION);
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(20);
					(new ItemStack(DarkInfectionModItems.VOIDKING_BOOTS.get())).enchant(Enchantments.BINDING_CURSE, 1);
					(new ItemStack(DarkInfectionModItems.VOIDKING_LEGGINGS.get())).enchant(Enchantments.BINDING_CURSE, 1);
					(new ItemStack(DarkInfectionModItems.VOIDKING_CHESTPLATE.get())).enchant(Enchantments.BINDING_CURSE, 1);
					(new ItemStack(DarkInfectionModItems.VOIDKING_HELMET.get())).enchant(Enchantments.BINDING_CURSE, 1);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(DarkInfectionModItems.VOIDKING_HELMET.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(DarkInfectionModItems.VOIDKING_CHESTPLATE.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(DarkInfectionModItems.VOIDKING_BOOTS.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(DarkInfectionModItems.VOIDKING_LEGGINGS.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(DarkInfectionModItems.VOIDKING_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(DarkInfectionModItems.VOIDKING_BOOTS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(DarkInfectionModItems.VOIDKING_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(DarkInfectionModItems.VOIDKING_LEGGINGS.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(DarkInfectionModItems.VOIDKING_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(DarkInfectionModItems.VOIDKING_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(3, new ItemStack(DarkInfectionModItems.VOIDKING_HELMET.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(DarkInfectionModItems.VOIDKING_HELMET.get()));
					}
				}
			}
		} else if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("infected", entity) == 3) {
			DarkInfectionMod.queueServerWork(160, () -> {
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.getLevel().getScoreboard();
					Objective _so = _sc.getObjective("infected");
					if (_so == null)
						_so = _sc.addObjective("infected", ObjectiveCriteria.DUMMY, Component.literal("infected"), ObjectiveCriteria.RenderType.INTEGER);
					_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(5);
				}
			});
		} else if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("infected", entity) == 0) {
			DarkInfectionMod.queueServerWork(160, () -> {
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.getLevel().getScoreboard();
					Objective _so = _sc.getObjective("infected");
					if (_so == null)
						_so = _sc.addObjective("infected", ObjectiveCriteria.DUMMY, Component.literal("infected"), ObjectiveCriteria.RenderType.INTEGER);
					_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(1);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You feel a darkness swelling within you..."), (false));
			});
		} else if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("infected", entity) == 1) {
			DarkInfectionMod.queueServerWork(160, () -> {
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.getLevel().getScoreboard();
					Objective _so = _sc.getObjective("infected");
					if (_so == null)
						_so = _sc.addObjective("infected", ObjectiveCriteria.DUMMY, Component.literal("infected"), ObjectiveCriteria.RenderType.INTEGER);
					_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(2);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("The darkness grows, consuming your thoughts..."), (false));
			});
		} else if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("infected", entity) == 2) {
			DarkInfectionMod.queueServerWork(160, () -> {
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.getLevel().getScoreboard();
					Objective _so = _sc.getObjective("infected");
					if (_so == null)
						_so = _sc.addObjective("infected", ObjectiveCriteria.DUMMY, Component.literal("infected"), ObjectiveCriteria.RenderType.INTEGER);
					_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(3);
				}
			});
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("You cannot stop the darkness..."), (false));
		}
	}
}
