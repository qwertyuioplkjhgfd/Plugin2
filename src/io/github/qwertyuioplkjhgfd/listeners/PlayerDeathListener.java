package io.github.qwertyuioplkjhgfd.listeners;

import io.github.qwertyuioplkjhgfd.Plugin2;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

public class PlayerDeathListener implements Listener {
    private static Plugin2 plugin;

    public PlayerDeathListener (Plugin2 plugin) {
        this.plugin = plugin;

        Bukkit.getPluginManager().registerEvents(this, plugin);
    }
    /*
    heals anyone who kills a player by 4 hearts
     */
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {
        if(e.getEntity().getKiller() instanceof Player){
            Player killer = (Player)e.getEntity().getKiller();
            Player killed = (Player)e.getEntity();
            new BukkitRunnable(){

                @Override
                public void run() {
                    killer.setHealth(Math.min(killer.getHealth()+8, 20));
                }

            }.runTaskLater(plugin,5);


        }
    }
    /*
    @EventHandler
    public void doesThisWork(PlayerInteractEvent e) {
        Player clicker = e.getPlayer();

        if(e.getMaterial().equals(Material.BLAZE_ROD)) {
            if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK)
                clicker.getWorld().spawnEntity(clicker.getLocation().add(0,1,0),EntityType.FIREBALL);
        }
    }
     */
    /*
    @EventHandler
    public void damage(EntityDamageEvent e) {
        if(e.getEntity() instanceof Player) {
            if(e.getCause().equals(EntityDamageEvent.DamageCause.BLOCK_EXPLOSION) || e.getCause().equals(EntityDamageEvent.DamageCause.FALL)) {
                e.setCancelled(true);
            }
        }
    }
    */


}
