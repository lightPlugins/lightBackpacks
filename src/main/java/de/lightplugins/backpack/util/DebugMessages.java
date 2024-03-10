package de.lightplugins.backpack.util;

import de.lightplugins.backpack.master.Backpack;
import org.bukkit.Bukkit;

import java.util.logging.Level;

public class DebugMessages {

    public static void sendInfo(String message) {
        if(!Backpack.doDebug) {
            return;
        }
        Bukkit.getConsoleSender().sendMessage(Backpack.consolePrefix + message);

    }

    public static void sendWarning(String message) {
        if(!Backpack.doDebug) {
            return;
        }
        Bukkit.getConsoleSender().sendMessage(Backpack.consolePrefix + "§e" + message);
    }

    public static void sendError(String message) {
        if(!Backpack.doDebug) {
            return;
        }
        Bukkit.getConsoleSender().sendMessage(Backpack.consolePrefix + "§c" + message);
    }
}
