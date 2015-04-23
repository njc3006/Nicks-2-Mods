package moreOres;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = MoreOres.MODID, version = MoreOres.VERSION, name = "More Ores")
public class MoreOres {
	public static final String MODID = "moreores";
    public static final String VERSION = "1.0";
    @EventHandler
    public void init(FMLInitializationEvent event){
        System.out.println("Starting More Ores Mod");
        makeChanges();
    }
	private void makeChanges() {
		
	}
}
