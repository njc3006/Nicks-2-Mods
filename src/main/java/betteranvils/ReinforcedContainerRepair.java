package betteranvils;

import java.util.Iterator;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import net.minecraft.block.BlockAnvil;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ContainerRepair;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ReinforcedContainerRepair extends ContainerRepair {

	public ReinforcedContainerRepair(InventoryPlayer playerInventory, World worldIn,
			BlockPos blockPosIn, EntityPlayer player) {
		super(playerInventory, worldIn, blockPosIn, player);
		// TODO Auto-generated constructor stub
	}

	public ReinforcedContainerRepair(InventoryPlayer playerInventory, World worldIn,
			EntityPlayer player) {
		super(playerInventory, worldIn, player);
		// TODO Auto-generated constructor stub
	}

	@Override 
	public void updateRepairOutput(){
	    super.updateRepairOutput();
	    this.maximumCost = 0;
	    this.materialCost = 0;
	}
	
}
