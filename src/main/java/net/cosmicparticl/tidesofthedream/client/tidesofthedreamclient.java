package net.cosmicparticl.tidesofthedream.client;

import net.cosmicparticl.tidesofthedream.tidesofthedream;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

@SuppressWarnings("unused")
public class tidesofthedreamclient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(tidesofthedream.etherlily, RenderLayer.getCutout());

    }
}
