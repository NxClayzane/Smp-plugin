package me.clayzane.smp;

import me.clayzane.smp.Commands.DeathCommands;
import me.clayzane.smp.LeaveAndJoin.PlayerJoin;
import me.clayzane.smp.LeaveAndJoin.PlayerQuit;
import me.clayzane.smp.OnDeath.OnDeath;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerShearEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import java.awt.*;

public final class Smp extends JavaPlugin implements Listener {
    //ServerStarts
    @Override
    public void onEnable() {
        // ITS enables while starting the server
        System.out.println("--------------TheClaySmp_Plugin started working!!");
        System.out.println("Version 1.0 / Java JDK 11");
        getServer().getPluginManager().registerEvents(this , this);
        getServer().getPluginManager().registerEvents(new OnDeath(), this);
        getServer().getPluginManager().registerEvents(new PlayerJoin(),  this);
        getServer().getPluginManager().registerEvents(new PlayerQuit(), this );
        getServer().getPluginManager().registerEvents(new DeathCommands(), this);
    }

    //Event,ShearingSheep
    @EventHandler
    public void onShearingSheep(PlayerShearEntityEvent event){
        event.setCancelled(true);
        event.getPlayer().sendMessage(ChatColor.BLUE + "Wow wools");
    }
    //ServerShutDown
    @Override
    public void onDisable() {
        // Plugin shutdowns
        System.out.println("Disabling Smp plugin....");
        System.out.println("DONE!");
    }
}
