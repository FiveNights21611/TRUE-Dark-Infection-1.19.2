
package net.mcreator.darkinfection.world.biome;

import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;

import java.util.List;

public class DarkBiomeBiome {
	public static final List<Climate.ParameterPoint> PARAMETER_POINTS = List.of(
			new Climate.ParameterPoint(Climate.Parameter.span(-1.2000000000000002f, 0.7999999999999999f), Climate.Parameter.span(-2f, 0f), Climate.Parameter.span(-0.49f, 1.51f), Climate.Parameter.span(-0.19999999999999996f, 1.8f),
					Climate.Parameter.point(0.0f), Climate.Parameter.span(-1.4776619765132666f, 0.5223380234867334f), 0),
			new Climate.ParameterPoint(Climate.Parameter.span(-1.2000000000000002f, 0.7999999999999999f), Climate.Parameter.span(-2f, 0f), Climate.Parameter.span(-0.49f, 1.51f), Climate.Parameter.span(-0.19999999999999996f, 1.8f),
					Climate.Parameter.point(1.0f), Climate.Parameter.span(-1.4776619765132666f, 0.5223380234867334f), 0));

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-16777216).waterColor(-13487566).waterFogColor(-16053493).skyColor(-16777216).foliageColorOverride(-8684677).grassColorOverride(-11447983).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.NONE).temperature(0.2f).downfall(0f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build()).build();
	}
}
