package me.clayzane.smp.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class DeathCommand extends JavaPlugin implements Listener {

    @Override
    public boolean onCommands(CommandSender sender, Command. String label, String[] args) {
        if(Command.getName().equals("die")){
            if(sender instanceof Player){
                Player player = (Player) sender;
                player.sendMessage("Death was never an option...");
                player.setHealth(0);
                }else {
                    System.out.println("You need to be a player to do this command");
            }
        }
        return false;
    }
}
