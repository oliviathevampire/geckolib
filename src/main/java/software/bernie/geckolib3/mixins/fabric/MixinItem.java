package software.bernie.geckolib3.mixins.fabric;

import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import software.bernie.geckolib3.ArmorProviderExtensions;
import software.bernie.geckolib3.ArmorRenderingRegistry;

@Mixin(Item.class)
public class MixinItem implements ArmorProviderExtensions {
	@Unique
	private ArmorRenderingRegistry.ModelProvider armorModelProvider;
	@Unique
	private ArmorRenderingRegistry.TextureProvider armorTextureProvider;

	@Override
	public ArmorRenderingRegistry.ModelProvider gl_getArmorModelProvider() {
		return armorModelProvider;
	}

	@Override
	public ArmorRenderingRegistry.TextureProvider gl_getArmorTextureProvider() {
		return armorTextureProvider;
	}

	@Override
	public void gl_setArmorModelProvider(ArmorRenderingRegistry.ModelProvider provider) {
		armorModelProvider = provider;
	}

	@Override
	public void gl_setArmorTextureProvider(ArmorRenderingRegistry.TextureProvider provider) {
		armorTextureProvider = provider;
	}
}