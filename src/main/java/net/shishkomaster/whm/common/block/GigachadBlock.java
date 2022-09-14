package net.shishkomaster.whm.common.block;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;
import java.util.stream.Stream;

public class GigachadBlock extends HorizontalBlock {
    public GigachadBlock(Properties builder) {
        super(builder);
    }

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.box(6.32, 11.845, 6.334999999999999, 9.68, 16.045, 9.695),
            Block.box(7.789999999999999, 12.58, 5.915000000000001, 8.21, 13.42, 6.755000000000001),
            Block.box(7.16, 10.795, 6.02, 8.84, 11.635, 6.4399999999999995),
            Block.box(6.74, 11.425, 6.125, 9.26, 12.685, 6.965),
            Block.box(6.74, 11.425, 7.07, 9.26, 12.685, 9.17),
            Block.box(5.9, 7.225, 6.545, 10.1, 9.325, 9.485),
            Block.box(5.48, 9.325, 6.334999999999999, 10.52, 11.425, 9.695),
            Block.box(6.32, 5.125, 6.755000000000001, 9.68, 7.645, 9.275),
            Block.box(10.31, 5.545, 7.174999999999999, 11.99, 11.425, 8.855),
            Block.box(3.9049999999999994, 9.85, 6.965, 6.005000000000001, 11.53, 9.065),
            Block.box(4.01, 5.545, 7.174999999999999, 5.6899999999999995, 11.425, 8.855),
            Block.box(9.995, 9.85, 6.965, 12.095, 11.53, 9.065),
            Block.box(6.32, 0.085, 7.174999999999999, 8, 5.125, 8.855),
            Block.box(8, 0.085, 7.174999999999999, 9.68, 5.125, 8.855)
    ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.box(6.295, 11.845, 6.3100000000000005, 9.655000000000001, 16.045, 9.67),
            Block.box(9.235, 12.58, 7.779999999999999, 10.075, 13.42, 8.200000000000001),
            Block.box(9.55, 10.795, 7.15, 9.97, 11.635, 8.83),
            Block.box(9.025, 11.425, 6.73, 9.865, 12.685, 9.25),
            Block.box(6.82, 11.425, 6.73, 8.92, 12.685, 9.25),
            Block.box(6.505000000000001, 7.225, 5.890000000000001, 9.445, 9.325, 10.09),
            Block.box(6.295, 9.325, 5.470000000000001, 9.655000000000001, 11.425, 10.51),
            Block.box(6.715, 5.125, 6.3100000000000005, 9.235, 7.645, 9.67),
            Block.box(7.135, 5.545, 10.3, 8.815000000000001, 11.425, 11.98),
            Block.box(6.925000000000001, 9.85, 3.8949999999999996, 9.025, 11.53, 5.995000000000001),
            Block.box(7.135, 5.545, 4, 8.815000000000001, 11.425, 5.68),
            Block.box(6.925000000000001, 9.85, 9.985, 9.025, 11.53, 12.085),
            Block.box(7.135, 0.085, 6.3100000000000005, 8.815000000000001, 5.125, 7.99),
            Block.box(7.135, 0.085, 7.99, 8.815000000000001, 5.125, 9.67)
    ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

    private static final VoxelShape SHAPE_S = Stream.of(
            Block.box(6.32, 11.845, 6.285, 9.68, 16.045, 9.645000000000001),
            Block.box(7.789999999999999, 12.58, 9.225, 8.21, 13.42, 10.065),
            Block.box(7.16, 10.795, 9.540000000000001, 8.84, 11.635, 9.96),
            Block.box(6.74, 11.425, 9.015, 9.26, 12.685, 9.855),
            Block.box(6.74, 11.425, 6.8100000000000005, 9.26, 12.685, 8.91),
            Block.box(5.9, 7.225, 6.495000000000001, 10.1, 9.325, 9.435),
            Block.box(5.48, 9.325, 6.285, 10.52, 11.425, 9.645000000000001),
            Block.box(6.32, 5.125, 6.705, 9.68, 7.645, 9.225),
            Block.box(4.01, 5.545, 7.125, 5.6899999999999995, 11.425, 8.805000000000001),
            Block.box(9.995, 9.85, 6.915000000000001, 12.095, 11.53, 9.015),
            Block.box(10.31, 5.545, 7.125, 11.99, 11.425, 8.805000000000001),
            Block.box(3.9049999999999994, 9.85, 6.915000000000001, 6.005000000000001, 11.53, 9.015),
            Block.box(8, 0.085, 7.125, 9.68, 5.125, 8.805000000000001),
            Block.box(6.32, 0.085, 7.125, 8, 5.125, 8.805000000000001)
    ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

    private static final VoxelShape SHAPE_W = Stream.of(
            Block.box(6.344999999999999, 11.845, 6.3100000000000005, 9.705, 16.045, 9.67),
            Block.box(5.925000000000001, 12.58, 7.779999999999999, 6.765000000000001, 13.42, 8.200000000000001),
            Block.box(6.029999999999999, 10.795, 7.15, 6.449999999999999, 11.635, 8.83),
            Block.box(6.135, 11.425, 6.73, 6.975, 12.685, 9.25),
            Block.box(7.08, 11.425, 6.73, 9.18, 12.685, 9.25),
            Block.box(6.555, 7.225, 5.890000000000001, 9.495, 9.325, 10.09),
            Block.box(6.344999999999999, 9.325, 5.470000000000001, 9.705, 11.425, 10.51),
            Block.box(6.765000000000001, 5.125, 6.3100000000000005, 9.285, 7.645, 9.67),
            Block.box(7.184999999999999, 5.545, 4, 8.865, 11.425, 5.68),
            Block.box(6.975, 9.85, 9.985, 9.075, 11.53, 12.085),
            Block.box(7.184999999999999, 5.545, 10.3, 8.865, 11.425, 11.98),
            Block.box(6.975, 9.85, 3.8949999999999996, 9.075, 11.53, 5.995000000000001),
            Block.box(7.184999999999999, 0.085, 7.99, 8.865, 5.125, 9.67),
            Block.box(7.184999999999999, 0.085, 6.3100000000000005, 8.865, 5.125, 7.99)
    ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch (state.getValue(FACING)) {
            case NORTH:
                return SHAPE_N;
            case SOUTH:
                return SHAPE_S;
            case WEST:
                return SHAPE_W;
            case EAST:
                return SHAPE_E;
            default:
                return SHAPE_N;
        }
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }
}


