package nick2.moreCrafts;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = Craftable.MODID, version = Craftable.VERSION)
public class Craftable {

	public static final String MODID = "craftable";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("whoo! Doing stuff");
    }
	
}
