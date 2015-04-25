package betteranvils;
import net.minecraft.creativetab.CreativeTabs;
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
    
    @EventHandler
    public void init(FMLInitializationEvent event){
        System.out.println("Starting Better Anvils Mod");
        
        ReinforcedBlockAnvil blockAnvil = new ReinforcedBlockAnvil();
        
        GameRegistry.registerBlock(blockAnvil, "reinforcedAnvil");
        
        blockAnvil.setUnlocalizedName("reinforcedAnvil");
        blockAnvil.setCreativeTab(CreativeTabs.tabBlock);
       
        GameRegistry.addRecipe(new ItemStack(blockAnvil, 1),
    			"A",
	  			'A', Blocks.anvil);
    }    
    
    
}//end better anvils

