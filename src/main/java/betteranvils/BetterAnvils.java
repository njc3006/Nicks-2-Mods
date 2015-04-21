package betteranvils;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ContainerRepair;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry; 

@Mod(modid = BetterAnvils.MODID, version = BetterAnvils.VERSION, name = "Better Anvils")
public class BetterAnvils extends ContainerRepair{

	public static final String MODID = "betteranvils";
    public static final String VERSION = "1.0";
    
    public BetterAnvils(InventoryPlayer playerInventory, World worldIn,
			EntityPlayer player) {
		super(playerInventory, worldIn, player);
		// TODO Auto-generated constructor stub
	}

	public BetterAnvils(InventoryPlayer playerInventory, World worldIn,
			BlockPos blockPosIn, EntityPlayer player) {
		super(playerInventory, worldIn, blockPosIn, player);
		// TODO Auto-generated constructor stub
        
	}
    
    public void init(FMLInitializationEvent event){
        //System.out.println("Starting Better Anvils Mod");
        makeChanges();
    }
	
    public void makeChanges(){
    	//removeDamage();
    	//removeXPfromRepair();
	}
    
    
    //Removes the fact that anvils get damaged
    public void removeDamage(){
	    		    
    }
    
    //Removes xp cost from repairing normal tools
    public void removeXPfromRepair(){
  	
    }
    
    
    
}//end better anvils

