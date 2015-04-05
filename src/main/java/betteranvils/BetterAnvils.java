package betteranvils;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry; 

@Mod(modid = BetterAnvils.MODID, version = BetterAnvils.VERSION, name = "Better Anvils")
public class BetterAnvils {

	public static final String MODID = "betteranvils";
    public static final String VERSION = "1.0";
    
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

