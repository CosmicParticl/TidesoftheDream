package net.cosmicparticl.tidesofthedream.item;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Map;

public class hellflute extends Item {
    public hellflute(Settings settings) {
        super(settings);
    }
    private static final HashMap<Block, BlockState> REPLACEBLOCKS;

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        Blocks.NETHERRACK.getDefaultState();

        BlockState blockState = (BlockState)REPLACEBLOCKS.get(world.getBlockState(blockPos).getBlock());
        if (blockState != null) {
            PlayerEntity playerEntity = context.getPlayer();
            world.playSound(playerEntity, blockPos, SoundEvents.BLOCK_NYLIUM_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F/ (world.getRandom().nextFloat() * 0.4F + 0.8F));
          if (!world.isClient)
                {
                    world.setBlockState(blockPos, blockState);
                }
            return ActionResult.success(world.isClient);
        }
        return ActionResult.PASS;
    }
    static {

        REPLACEBLOCKS = Maps.newHashMap(Map.of(Blocks.GRASS_BLOCK, Blocks.NETHERRACK.getDefaultState(),Blocks.PODZOL, Blocks.WARPED_NYLIUM.getDefaultState(), Blocks.DIRT, Blocks.NETHERRACK.getDefaultState(), Blocks.COARSE_DIRT, Blocks.SOUL_SOIL.getDefaultState(),Blocks.MYCELIUM, Blocks.CRIMSON_NYLIUM.getDefaultState(),Blocks.STONE, Blocks.BLACKSTONE.getDefaultState(),Blocks.SAND, Blocks.SOUL_SAND.getDefaultState()));
    }
}


