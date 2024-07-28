package dev.piteam.projind.block;

import dev.piteam.projind.PI;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlock {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(PI.MOD_ID);

    public static final DeferredBlock<Block> EXAMPLE_BLOCK = BLOCKS.registerSimpleBlock("example_block", BlockBehaviour.Properties.of().mapColor(MapColor.STONE).destroyTime(-1f));

    public static final DeferredBlock<Block> Tin_ore = BLOCKS.registerSimpleBlock("tin_ore", BlockBehaviour.Properties.of()
            .destroyTime(300.0f)
            .
    );

}