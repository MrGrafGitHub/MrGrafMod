package com.mgm;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = MrGrafMOD.MOD_ID, name = MrGrafMOD.MOD_NAME, version = MrGrafMOD.VERSION)

public class MrGrafMOD {

    public static final String MOD_ID = "mgm";
    public static final String MOD_NAME = "MrGrafMOD";
    public static final String VERSION = "2023.01.24";

    @SidedProxy(clientSide = "com.mgm.ClientProxy",serverSide = "com.mgm.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance(MOD_ID)
    public static MrGrafMOD INSTANCE;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {
    }

    @GameRegistry.ObjectHolder(MOD_ID)
    public static class Blocks {
    }

    @GameRegistry.ObjectHolder(MOD_ID)
    public static class Items {
    }

    @Mod.EventBusSubscriber
    public static class ObjectRegistryHandler {

        @SubscribeEvent
        public static void addItems(RegistryEvent.Register<Item> event) {
        }

        @SubscribeEvent
        public static void addBlocks(RegistryEvent.Register<Block> event) {
        }
    }

}
