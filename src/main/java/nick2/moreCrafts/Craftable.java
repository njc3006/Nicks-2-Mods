package nick2.moreCrafts;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry; 

@Mod(modid = Craftable.MODID, version = Craftable.VERSION, name = "Craftable")
public class Craftable {

	public static final String MODID = "craftable";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("Starting Craftable Mod");
        addRecipes();
    }
	
    public void addRecipes(){
    	addSaddle();	
    	addNameTag();
    	addDisks();
    	addLilyPads();
    	addVines();
    	addClay();
    	addGravel();
    	addChainmail();
    	addSlime();
    	addHorseArmors();
	}
    
    
    //Adds recipe for saddle
    public void addSaddle(){
		GameRegistry.addRecipe(new ItemStack(Items.saddle, 1),
				"LLL",
				"LSL",
				"LIL",
				'L', Items.leather,
				'S', Items.string,
				'I', Items.iron_ingot);
	    		    
    }
    
    //Adds recipes for name tag
    public void addNameTag(){
  		GameRegistry.addRecipe(new ItemStack(Items.name_tag, 4),
	  			"SIS",
	  			'I', Items.sign,
	  			'S', Items.string);
  	
    }

    //Adds recipes for disks
    public void addDisks(){
    	
    	//record 13 yellow
    	GameRegistry.addRecipe(new ItemStack(Items.record_13, 1),
	  			"CCC",
	  			"CDC",
	  			"CCC",
	  			'C', Items.coal,
	  			'D', new ItemStack(Items.dye, 1, 11));
    	
    	//record cat dark green
    	GameRegistry.addRecipe(new ItemStack(Items.record_cat, 1),
	  			"CCC",
	  			"CDC",
	  			"CCC",
	  			'C', Items.coal,
	  			'D', new ItemStack(Items.dye, 1, 2));
    	
    	//record blocks pink
    	GameRegistry.addRecipe(new ItemStack(Items.record_blocks, 1),
	  			"CCC",
	  			"CDC",
	  			"CCC",
	  			'C', Items.coal,
	  			'D', new ItemStack(Items.dye, 1, 9));
    	
    	//record chirp red
    	GameRegistry.addRecipe(new ItemStack(Items.record_chirp, 1),
	  			"CCC",
	  			"CDC",
	  			"CCC",
	  			'C', Items.coal,
	  			'D', new ItemStack(Items.dye, 1, 1));
    	
    	//record far lime green
    	GameRegistry.addRecipe(new ItemStack(Items.record_far, 1),
	  			"CCC",
	  			"CDC",
	  			"CCC",
	  			'C', Items.coal,
	  			'D', new ItemStack(Items.dye, 1, 10));
    	
    	//record mall purple
    	GameRegistry.addRecipe(new ItemStack(Items.record_mall, 1),
	  			"CCC",
	  			"CDC",
	  			"CCC",
	  			'C', Items.coal,
	  			'D', new ItemStack(Items.dye, 1, 5));
    	
    	//record mellohi magenta
    	GameRegistry.addRecipe(new ItemStack(Items.record_mellohi, 1),
	  			"CCC",
	  			"CDC",
	  			"CCC",
	  			'C', Items.coal,
	  			'D', new ItemStack(Items.dye, 1, 13));
    	
    	//record stal gray
    	GameRegistry.addRecipe(new ItemStack(Items.record_stal, 1),
	  			"CCC",
	  			"CDC",
	  			"CCC",
	  			'C', Items.coal,
	  			'D', new ItemStack(Items.dye, 1, 8));
    	
    	//record strad white
    	GameRegistry.addRecipe(new ItemStack(Items.record_strad, 1),
	  			"CCC",
	  			"CDC",
	  			"CCC",
	  			'C', Items.coal,
	  			'D', new ItemStack(Items.dye, 1, 7));
    	
    	//record ward cyan
    	GameRegistry.addRecipe(new ItemStack(Items.record_ward, 1),
	  			"CCC",
	  			"CDC",
	  			"CCC",
	  			'C', Items.coal,
	  			'D', new ItemStack(Items.dye, 1, 6));
    	
    	//record 11 black
    	GameRegistry.addRecipe(new ItemStack(Items.record_11, 1),
	  			"CCC",
	  			"CDC",
	  			"CCC",
	  			'C', Items.coal,
	  			'D', new ItemStack(Items.dye, 1, 0));
    	
    	//record wait light blue
    	GameRegistry.addRecipe(new ItemStack(Items.record_wait, 1),
	  			"CCC",
	  			"CDC",
	  			"CCC",
	  			'C', Items.coal,
	  			'D', new ItemStack(Items.dye, 1, 12));
    	
    	}
    
    //Adds recipes for lillypads
    public void addLilyPads(){
    	GameRegistry.addRecipe(new ItemStack(Blocks.waterlily, 16),
	  			"LL ",
	  			"LL ",
	  			"  L",
	  			'L', Blocks.leaves);
    	GameRegistry.addRecipe(new ItemStack(Blocks.waterlily, 16),
	  			"LL ",
	  			"LL ",
	  			"  L",
	  			'L', Blocks.leaves2);
    }
    
    //Addes recipies for vines
    public void addVines(){
    	GameRegistry.addRecipe(new ItemStack(Blocks.vine, 16),
	  			"   ",
	  			"LLL",
	  			"L L",
	  			'L', Blocks.leaves);
    	
    	GameRegistry.addRecipe(new ItemStack(Blocks.vine, 16),
	  			"   ",
	  			"LLL",
	  			"L L",
	  			'L', Blocks.leaves2);
    }
    
    //Adds recipe for clay
    public void addClay(){
    	GameRegistry.addRecipe(new ItemStack(Items.clay_ball, 32),
	  			"DBS",
	  			"DBS",
	  			"DBS",
	  			'D', Blocks.dirt,
	  			'B', Items.water_bucket,
	  			'S', Blocks.sand);
    }
    
    //Adds a recipe for gravel
    public void addGravel(){
    	
    	GameRegistry.addRecipe(new ItemStack(Blocks.gravel, 32),
	  			"CCC",
	  			"DDD",
	  			"CCC",
	  			'D', Blocks.dirt,
	  			'C', Blocks.cobblestone);
    	
    	}
    
    //Adds a recipe for chain mail
    public void addChainmail(){
    	
    	GameRegistry.addRecipe(new ItemStack(Items.chainmail_chestplate, 1),
	  			"I I",
	  			"LLL",
	  			"ILI",
	  			'I', Items.iron_ingot,
	  			'L', Items.leather);
    	
    	GameRegistry.addRecipe(new ItemStack(Items.chainmail_leggings, 1),
	  			"ILI",
	  			"L L",
	  			"I I",
	  			'I', Items.iron_ingot,
	  			'L', Items.leather);
    	
    	GameRegistry.addRecipe(new ItemStack(Items.chainmail_helmet, 1),
	  			"ILI",
	  			"L L",
	  			'I', Items.iron_ingot,
	  			'L', Items.leather);
    	
    	GameRegistry.addRecipe(new ItemStack(Items.chainmail_boots, 1),
    			"L L",
    			"I I",
	  			'I', Items.iron_ingot,
	  			'L', Items.leather);
    	
    	}
    
    //Adds a recipe for slime
    public void addSlime(){
    	
    	GameRegistry.addRecipe(new ItemStack(Items.slime_ball, 1),
	  			"MC",
	  			"G ",
	  			'M', Items.milk_bucket,
	  			'G', new ItemStack(Items.dye, 1, 10),
	  			'C', Items.clay_ball);
    	
    	}
    
    //Adds recipes for horse armor
    public void addHorseArmors(){
		GameRegistry.addRecipe(new ItemStack(Items.iron_horse_armor, 1),
				"III",
				"ISI",
				"III",
				'S', Items.saddle,
				'I', Items.iron_ingot);
		
		GameRegistry.addRecipe(new ItemStack(Items.golden_horse_armor, 1),
				"GGG",
				"GSG",
				"GGG",
				'S', Items.saddle,
				'G', Items.gold_ingot);
		
		GameRegistry.addRecipe(new ItemStack(Items.diamond_horse_armor, 1),
				"DDD",
				"DSD",
				"DDD",
				'S', Items.saddle,
				'D', Items.diamond);
	    		    
    }
    
}
