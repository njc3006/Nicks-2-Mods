package betteranvils;

import net.minecraft.block.BlockAnvil;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class ReinforcedBlockAnvil extends BlockAnvil{

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        if (!worldIn.isRemote)
        {
            playerIn.displayGui(new BlockAnvil.Anvil(worldIn, pos));
        }

        return true;
    }
	
	public class ReinforcedAnvil extends BlockAnvil.Anvil{

		public ReinforcedAnvil(World worldIn, BlockPos pos) {
			super(worldIn, pos);
		}
		
		
	}
}
