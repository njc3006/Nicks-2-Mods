package betterVillages;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = BetterVillages.MODID, version = BetterVillages.VERSION, name = "Better Villages")
public class BetterVillages {

	public static final String MODID = "bettervillages";
    public static final String VERSION = "1.0";
    @EventHandler
    public void init(FMLInitializationEvent event){
        System.out.println("Starting Better Villages Mod");
        makeChanges();
    }
	private void makeChanges() {
		
	}
}