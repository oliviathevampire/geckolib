package software.bernie.geckolib3;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

public interface ArmorProviderExtensions {
    /*  */
    @Environment(EnvType.CLIENT)
    ArmorRenderingRegistry.ModelProvider gl_getArmorModelProvider();

    /*  */
    @Environment(EnvType.CLIENT)
    ArmorRenderingRegistry.TextureProvider gl_getArmorTextureProvider();

    @Environment(EnvType.CLIENT)
    void gl_setArmorModelProvider(/*  */ ArmorRenderingRegistry.ModelProvider provider);

    @Environment(EnvType.CLIENT)
    void gl_setArmorTextureProvider(/*  */ ArmorRenderingRegistry.TextureProvider provider);
}