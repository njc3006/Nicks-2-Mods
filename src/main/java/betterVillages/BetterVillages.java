package betterVillages;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import betteranvils.BetterAnvils;

@Mod(modid = BetterAnvils.MODID, version = BetterAnvils.VERSION, name = "Better Villages")
public class BetterVillages {

	public static final String MODID = "bettervillages";
    public static final String VERSION = "1.0";
    @EventHandler
    public void init(FMLInitializationEvent event){
        System.out.println("Starting Craftable Mod");
        makeChanges();
    }
	private void makeChanges() {
		
	}
}