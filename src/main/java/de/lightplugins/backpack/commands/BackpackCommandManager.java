package de.lightplugins.backpack.commands;

import de.lightplugins.backpack.master.Backpack;
import de.lightplugins.backpack.util.SubCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;

public class BackpackCommandManager implements CommandExecutor {
    private final ArrayList<SubCommand> subCommands = new ArrayList<>();
    public ArrayList<SubCommand> getSubCommands() {
        return subCommands;
    }


    public Backpack plugin;
    public BackpackCommandManager(Backpack plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {


        if(sender instanceof Player player) {

            if (args.length > 0) {
                for(int i = 0; i < subCommands.size(); i++) {
                    if(args[0].equalsIgnoreCase(getSubCommands().get(i).getName())) {

                        try {
                            if(getSubCommands().get(i).perform(player, args)) {

                            }

                        } catch (ExecutionException | InterruptedException e) {
                            throw new RuntimeException("Something went wrong in executing " + Arrays.toString(args), e);
                        }
                    }
                }
            }
        }

        return false;
    }
}
