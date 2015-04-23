package betterVillagers;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import betteranvils.BetterAnvils;

@Mod(modid = BetterVillagers.MODID, version = BetterVillagers.VERSION, name = "Better Villagers")
public class BetterVillagers {

	public static final String MODID = "bettervillagers";
    public static final String VERSION = "1.0";
    @EventHandler
    public void init(FMLInitializationEvent event){
        System.out.println("Starting Better Villagers Mod");
        makeChanges();
    }
	private void makeChanges() {
		
	}
}
