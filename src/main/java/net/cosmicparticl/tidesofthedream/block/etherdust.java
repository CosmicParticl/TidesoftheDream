package net.cosmicparticl.tidesofthedream.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class etherdust extends Block {

    protected static final VoxelShape SHAPE = createCuboidShape(5.0D, 5.0D, 5.0D, 11.0D, 11.0D, 11.0D);

    public etherdust(Settings settings) {
        super(settings);
    }
    @Override
    public BlockRenderType getRenderType(BlockState blockState) {
        return BlockRenderType.INVISIBLE;
    }
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
