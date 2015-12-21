package com.tinkeracademy.mod.quidditch;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = QuidditchMod.MODID, version = QuidditchMod.VERSION, name = QuidditchMod.NAME)
public class QuidditchMod {

	public static final String MODID = "quidditch";
    public static final String VERSION = "1.0";
    public static final String NAME = "quidditch";
    
    public static QuidditchChest chest;
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	chest = new QuidditchChest();
    	GameRegistry.registerBlock(chest, "quidditchChest");
    }
}
