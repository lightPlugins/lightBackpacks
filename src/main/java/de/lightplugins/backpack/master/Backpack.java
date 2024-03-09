package de.lightplugins.backpack.master;

import de.lightplugins.backpack.api.BackbackAPI;
import de.lightplugins.backpack.api.BackpackData;
import org.bukkit.plugin.java.JavaPlugin;

public class Backpack extends JavaPlugin {


    public static Backpack getInstance;
    public static BackpackData backpackData;
    private static BackbackAPI api;
    public static final String consolePrefix = "§r[light§cBackpack§r] ";


    public void onLoad() {

        getInstance = this;
        backpackData = new BackpackData();
        api = new BackbackAPI();

    }

    public void onEnable() {


    }

    public void onDisable() {

    }

    public static BackbackAPI getAPI() {
        return api;
    }
}