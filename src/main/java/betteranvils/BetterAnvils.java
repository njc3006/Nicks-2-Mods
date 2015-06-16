package betteranvils;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.ExistingSubstitutionException;
import net.minecraftforge.fml.common.registry.GameRegistry; 

@Mod(modid = BetterAnvils.MODID, version = BetterAnvils.VERSION, name = "Better Anvils")
public class BetterAnvils {

	public static final String MODID = "betteranvils";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event){
        System.out.println("Starting Better Anvils Mod");
        
        ReinforcedBlockAnvil reinBlockAnvil = new ReinforcedBlockAnvil();
        
        // GameRegistry.registerBlock(reinBlockAnvil, "reinforcedAnvil");
        try {
			GameRegistry.addSubstitutionAlias("minecraft:anvil", GameRegistry.Type.BLOCK, reinBlockAnvil);
		} catch (ExistingSubstitutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			GameRegistry.addSubstitutionAlias("minecraft:anvil", GameRegistry.Type.ITEM, reinBlockAnvil);
		} catch (ExistingSubstitutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        reinBlockAnvil.setUnlocalizedName("reinforcedAnvil");
        reinBlockAnvil.setCreativeTab(CreativeTabs.tabBlock);
       
        GameRegistry.addRecipe(new ItemStack(reinBlockAnvil, 1),
    			"A",
	  			'A', Blocks.anvil);
    }    
    
    
}//end better anvils

