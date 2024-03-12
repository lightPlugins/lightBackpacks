package de.lightplugins.backpack.events;

import de.lightplugins.backpack.master.Backpack;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerJoinEvent implements Listener {


    @EventHandler
    public void onPlayerJoin(org.bukkit.event.player.PlayerJoinEvent event) {
        Player player = event.getPlayer();
        Backpack.getAPI().prepareBackpacksForPlayer(player);
    }
}
