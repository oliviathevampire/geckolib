package software.bernie.geckolib.model.provider;

import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib.geo.render.built.GeoModel;
import software.bernie.geckolib.resource.GeckoLibCache;

public abstract class GeoModelProvider<T>
{
	public double seekTime;
	public double lastGameTickTime;
	public boolean shouldCrashOnMissing = false;

	public GeoModel getModel(ResourceLocation location)
	{
		return GeckoLibCache.geoModels.get(location);
	}

	public abstract ResourceLocation getModelLocation(T object);
	public abstract ResourceLocation getTextureLocation(T object);
}
