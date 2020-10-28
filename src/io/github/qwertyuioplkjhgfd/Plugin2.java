package io.github.qwertyuioplkjhgfd;

import io.github.qwertyuioplkjhgfd.listeners.PlayerDeathListener;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin2 extends JavaPlugin {
    Server server = getServer();
    @Override
    public void onEnable() {
//        System.out.println("lol idk");
        new PlayerDeathListener(this);

    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        /*
        if(label.equalsIgnoreCase("test")) {
            if(sender instanceof Player) {
                Player player = (Player)sender;
                player.sendMessage("if this works i'm gonna go sleep");
                player.chat("hi lol");
                server.broadcastMessage("broadcast");
                return true;
            }
        }

         */
        if(label.equalsIgnoreCase("heal")) {
            if(sender instanceof Player) {
                Player player = (Player)sender;
                player.sendMessage(ChatColor.RED+"healing is currently not enabled");
                /*
                player.setHealth(20);
                player.setFoodLevel(20);
                player.setSaturation(20);

                 */
                return true;
            }
        }
        return false;
    }



    @Override
    public void onDisable() {

    }
}
