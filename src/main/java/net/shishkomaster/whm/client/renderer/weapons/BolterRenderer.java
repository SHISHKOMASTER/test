package net.shishkomaster.whm.client.renderer.weapons;

import net.shishkomaster.whm.client.model.weapons.BolterModel;
import net.shishkomaster.whm.common.item.weapon.BolterItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class BolterRenderer extends GeoItemRenderer<BolterItem> {
    public BolterRenderer() {
        super(new BolterModel());
    }

}