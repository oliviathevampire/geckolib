package software.bernie.geckolib.render;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.Entity;

public interface IModelRenderer<T extends Entity, M extends EntityModel<T>>
{
	M getEntityModel();
}