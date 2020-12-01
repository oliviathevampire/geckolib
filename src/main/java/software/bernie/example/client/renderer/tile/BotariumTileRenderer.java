package software.bernie.example.client.renderer.tile;

import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import software.bernie.example.block.tile.BotariumTileEntity;
import software.bernie.example.client.model.tile.BotariumModel;
import software.bernie.geckolib3.renderer.geo.GeoBlockRenderer;

public class BotariumTileRenderer extends GeoBlockRenderer<BotariumTileEntity> {
    public BotariumTileRenderer(BlockEntityRendererFactory<BotariumTileEntity> context) {
        super(context, new BotariumModel());
    }
}
