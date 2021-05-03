package me.clayzane.smp.LeaveAndJoin;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuit implements Listener {

    @EventHandler
    void onPlayerLeave(PlayerQuitEvent e){
        Player player = e.getPlayer();
        e.setQuitMessage(ChatColor.GOLD + player.getDisplayName() +  ChatColor.BLUE + "Left The SMP");
    }

