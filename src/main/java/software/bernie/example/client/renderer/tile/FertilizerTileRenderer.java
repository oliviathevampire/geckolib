package software.bernie.example.client.renderer.tile;

import net.minecraft.client.render.entity.EntityRendererFactory;
import software.bernie.example.block.tile.FertilizerTileEntity;
import software.bernie.example.client.model.tile.FertilizerModel;
import software.bernie.geckolib3.renderer.geo.GeoBlockRenderer;

public class FertilizerTileRenderer extends GeoBlockRenderer<FertilizerTileEntity> {
    public FertilizerTileRenderer(EntityRendererFactory.Context context) {
        super(context, new FertilizerModel());
    }
}
