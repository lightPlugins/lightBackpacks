package de.lightplugins.backpack.master;

import de.lightplugins.backpack.api.BackbackAPI;
import de.lightplugins.backpack.api.BackpackConstructor;
import de.lightplugins.backpack.util.FileManager;
import de.lightplugins.backpack.util.MultiFileManager;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;

public class Backpack extends JavaPlugin {


    public static Backpack getInstance;
    private static BackbackAPI api;
    public static final String consolePrefix = "§r[light§cBackpack§r] ";

    public MultiFileManager multiFileManager;
    public static List<File> backpackFiles;


    public void onLoad() {

        getInstance = this;
        api = new BackbackAPI();

        try {
            multiFileManager = new MultiFileManager("plugins/lightBackpack/backpacks/");
            backpackFiles = multiFileManager.getYamlFiles();
        } catch (IOException e) {
            throw new RuntimeException(consolePrefix + "Could not load backpacks", e);
        }

        backpackFiles.forEach(singleFile -> {
            String name = multiFileManager.getFileNameWithoutExtension(singleFile);
            Bukkit.getLogger().log(Level.INFO, "Loaded backpack " + name);
        });

        new FileManager(this, "backpacks/_example.yml", false);
    }

    public void onEnable() {

    }

    public void onDisable() {

    }

    public static BackbackAPI getAPI() {
        return api;
    }
}