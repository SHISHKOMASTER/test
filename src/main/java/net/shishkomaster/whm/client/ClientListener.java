package net.shishkomaster.whm.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.shishkomaster.whm.Whm;
import net.shishkomaster.whm.client.renderer.armor.PowerArmorRenderer;
import net.shishkomaster.whm.common.item.armor.PowerArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;


@Mod.EventBusSubscriber(modid = Whm.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientListener {

    @SubscribeEvent
    public static void registerRenderers(final FMLClientSetupEvent event) {

        GeoArmorRenderer.registerArmorRenderer(PowerArmorItem.class, new PowerArmorRenderer());

    }
}


