
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.darkinfection.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.darkinfection.world.features.ores.VoidStoneRedstoneOreFeature;
import net.mcreator.darkinfection.world.features.ores.VoidStoneLapisOreFeature;
import net.mcreator.darkinfection.world.features.ores.VoidStoneIronOreFeature;
import net.mcreator.darkinfection.world.features.ores.VoidStoneGoldOreFeature;
import net.mcreator.darkinfection.world.features.ores.VoidStoneEmeraldOreFeature;
import net.mcreator.darkinfection.world.features.ores.VoidStoneDiamondOreFeature;
import net.mcreator.darkinfection.world.features.ores.VoidStoneCopperOreFeature;
import net.mcreator.darkinfection.world.features.ores.VoidStoneCoalOreFeature;
import net.mcreator.darkinfection.world.features.VoidtempleFeature;
import net.mcreator.darkinfection.DarkInfectionMod;

@Mod.EventBusSubscriber
public class DarkInfectionModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, DarkInfectionMod.MODID);
	public static final RegistryObject<Feature<?>> VOIDTEMPLE = REGISTRY.register("voidtemple", VoidtempleFeature::feature);
	public static final RegistryObject<Feature<?>> VOID_STONE_COAL_ORE = REGISTRY.register("void_stone_coal_ore", VoidStoneCoalOreFeature::feature);
	public static final RegistryObject<Feature<?>> VOID_STONE_IRON_ORE = REGISTRY.register("void_stone_iron_ore", VoidStoneIronOreFeature::feature);
	public static final RegistryObject<Feature<?>> VOID_STONE_REDSTONE_ORE = REGISTRY.register("void_stone_redstone_ore", VoidStoneRedstoneOreFeature::feature);
	public static final RegistryObject<Feature<?>> VOID_STONE_LAPIS_ORE = REGISTRY.register("void_stone_lapis_ore", VoidStoneLapisOreFeature::feature);
	public static final RegistryObject<Feature<?>> VOID_STONE_EMERALD_ORE = REGISTRY.register("void_stone_emerald_ore", VoidStoneEmeraldOreFeature::feature);
	public static final RegistryObject<Feature<?>> VOID_STONE_DIAMOND_ORE = REGISTRY.register("void_stone_diamond_ore", VoidStoneDiamondOreFeature::feature);
	public static final RegistryObject<Feature<?>> VOID_STONE_COPPER_ORE = REGISTRY.register("void_stone_copper_ore", VoidStoneCopperOreFeature::feature);
	public static final RegistryObject<Feature<?>> VOID_STONE_GOLD_ORE = REGISTRY.register("void_stone_gold_ore", VoidStoneGoldOreFeature::feature);
}
