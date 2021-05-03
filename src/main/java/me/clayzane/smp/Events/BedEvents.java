package me.clayzane.smp.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class BedEvents implements Listener {

    //Sleep event...
    @EventHandler
    public void onleaveBed(PlayerBedLeaveEvent event){
        Player player = event.getPlayer();
        player.sendMessage("You have left your bed!");

}
 