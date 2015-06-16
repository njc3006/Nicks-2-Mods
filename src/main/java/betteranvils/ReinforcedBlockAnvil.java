package betteranvils;

import net.minecraft.block.BlockAnvil;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerRepair;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class ReinforcedBlockAnvil extends BlockAnvil{
	
	public class ReinforcedAnvil extends BlockAnvil.Anvil{

		protected World zeeWorld;
		protected BlockPos position; 
		
		public ReinforcedAnvil(World worldIn, BlockPos pos) {
			super(worldIn, pos);
			zeeWorld = worldIn;
			position = pos;
		}
		
		@Override
		public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn)
        {
            return new ReinforcedContainerRepair(playerInventory, zeeWorld, position, playerIn);
        }
		
		public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
	    {
	        if (!worldIn.isRemote)
	        {
	            playerIn.displayGui(new ReinforcedBlockAnvil.ReinforcedAnvil(worldIn, pos));
	        }

	        return true;
	    }
		
		
	}
}
