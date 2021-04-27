package me.clayzane.smp;

import jdk.tools.jaotc.binformat.SymbolTable;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Smp extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // ITS enables while starting the server
        System.out.println("--------------TheClaySmp_Plugin started working!!");
        System.out.println("Version 1.0 / Java JDK 11");

    }

    @EventHandler
    public void onLeaveBed(PlayerDropItemEvent event){

    }

    @Override
    public void onDisable() {
        // Plugin shutdowns
        System.out.println("Disabling Smp plugin....");
        System.out.println("DONE!");
    }
}
