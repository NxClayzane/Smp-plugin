package me.clayzane.smp.OnDeath;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerDropItemEvent;

public class OnDeath implements Listener {

    @EventHandler
    public void OnDeath(PlayerDeathEvent event){
        event.getEntity().sendMessage("Rest in peace dear friend!");
        event.getEntity().setFlying(true);
    }
}
