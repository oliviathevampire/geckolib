package software.bernie.example.client.renderer.armor;

import net.minecraft.client.render.entity.EntityRendererFactory;
import software.bernie.example.client.model.armor.PotatoArmorModel;
import software.bernie.example.item.PotatoArmorItem;
import software.bernie.geckolib3.renderer.geo.GeoArmorRenderer;

public class PotatoArmorRenderer extends GeoArmorRenderer<PotatoArmorItem> {
    public PotatoArmorRenderer(EntityRendererFactory.Context context) {
        super(context, new PotatoArmorModel());

        //These values are what each bone name is in blockbench. So if your head bone is named "bone545", make sure to do this.headBone = "bone545";
        // The default values are the ones that come with the default armor template in the geckolib blockbench plugin.
        this.headBone = "helmet";
        this.bodyBone = "chestplate";
        this.rightArmBone = "rightArm";
        this.leftArmBone = "leftArm";
        this.rightLegBone = "rightLeg";
        this.leftLegBone = "leftLeg";
        this.rightBootBone = "rightBoot";
        this.leftBootBone = "leftBoot";
    }
}
