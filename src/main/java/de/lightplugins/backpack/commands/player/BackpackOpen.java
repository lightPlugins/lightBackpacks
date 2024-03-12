package de.lightplugins.backpack.commands.player;

import de.lightplugins.backpack.util.SubCommand;
import org.bukkit.entity.Player;

public class BackpackOpen extends SubCommand {
    @Override
    public String getName() {
        return "open";
    }

    @Override
    public String getSyntax() {
        return "/backpack open";
    }

    @Override
    public boolean perform(Player player, String[] args) {




        return false;
    }
}
