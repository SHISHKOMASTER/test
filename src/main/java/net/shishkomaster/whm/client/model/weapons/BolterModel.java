package net.shishkomaster.whm.client.model.weapons;

import net.minecraft.util.ResourceLocation;
import net.shishkomaster.whm.Whm;
import net.shishkomaster.whm.common.item.weapon.BolterItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BolterModel extends AnimatedGeoModel<BolterItem> {
    @Override
    public ResourceLocation getModelLocation(BolterItem object) {
        return new ResourceLocation(Whm.MOD_ID, "geo/bolter.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(BolterItem object) {
        return new ResourceLocation(Whm.MOD_ID, "textures/item/bolter_texture.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(BolterItem animatable) {
        return new ResourceLocation(Whm.MOD_ID, "animations/bolter.animation.json");
    }
}


