package de.lightplugins.backpack.master;

import de.lightplugins.backpack.api.BackpackAPI;
import de.lightplugins.backpack.api.BackpackPlayer;
import de.lightplugins.backpack.commands.BackpackCommandManager;
import de.lightplugins.backpack.events.PlayerJoinEvent;
import de.lightplugins.backpack.util.DebugMessages;
import de.lightplugins.backpack.util.FileManager;
import de.lightplugins.backpack.util.MultiFileManager;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Backpack extends JavaPlugin {


    public static Backpack getInstance;
    private static BackpackAPI api;
    public static final String consolePrefix = "§r[light§cBackpack§r] ";
    public static boolean doDebug = true;

    public MultiFileManager multiFileManager;
    public static List<File> backpackFiles;
    public static ConcurrentHashMap<UUID, BackpackPlayer> backpackPlayerMap = new ConcurrentHashMap<>();

    public void onLoad() {
        DebugMessages.sendInfo("Preloader started ...");
        getInstance = this;

        DebugMessages.sendInfo("Try to detect existing backpacks from path plugins/lightBackpack/backpacks/");
        multiFileManager = new MultiFileManager("plugins/lightBackpack/backpacks/");
        backpackFiles = multiFileManager.getFiles();
        DebugMessages.sendInfo("Found §c" + backpackFiles.size() + "§f backpack file(s)");
        if(backpackFiles.size() != 0) {
            backpackFiles.forEach(singleFile -> DebugMessages.sendInfo(
                    " - " + singleFile.getName()));
        }

        DebugMessages.sendInfo("Creating _example.yml file if not exists");
        new FileManager(this, "backpacks/_example.yml", false);

        DebugMessages.sendInfo("Init Backpacks from existing files and register API");
        api = new BackpackAPI();
        DebugMessages.sendInfo("Successfully preloaded");

    }

    public void onEnable() {

        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new PlayerJoinEvent(), this);

    }

    public void onDisable() {

    }

    public static BackpackAPI getAPI() {
        return api;
    }
}