
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.darkinfection.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.darkinfection.DarkInfectionMod;

public class DarkInfectionModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, DarkInfectionMod.MODID);
	public static final RegistryObject<PaintingVariant> RIZEOFTHEVOID = REGISTRY.register("rizeofthevoid", () -> new PaintingVariant(48, 32));
	public static final RegistryObject<PaintingVariant> MISSION_F = REGISTRY.register("mission_f", () -> new PaintingVariant(32, 16));
	public static final RegistryObject<PaintingVariant> VK = REGISTRY.register("vk", () -> new PaintingVariant(48, 48));
	public static final RegistryObject<PaintingVariant> BATTLETOTHEDETH = REGISTRY.register("battletothedeth", () -> new PaintingVariant(64, 48));
}
