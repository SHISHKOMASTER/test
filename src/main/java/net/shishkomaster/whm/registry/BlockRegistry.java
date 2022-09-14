package net.shishkomaster.whm.registry;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.shishkomaster.whm.Whm;
import net.shishkomaster.whm.common.block.GigachadBlock;


public class BlockRegistry {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Whm.MOD_ID);

    public static final RegistryObject<Block> Gigachad = BLOCKS.register("gigachad",
            () -> new GigachadBlock(AbstractBlock.Properties.of(Material.STONE)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
