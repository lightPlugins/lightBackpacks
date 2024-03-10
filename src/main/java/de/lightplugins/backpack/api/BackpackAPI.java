package de.lightplugins.backpack.api;

import de.lightplugins.backpack.master.Backpack;
import de.lightplugins.backpack.util.ConvertBase;
import de.lightplugins.backpack.util.DebugMessages;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.inventory.ItemStack;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BackpackAPI {

    private final List<BackpackConstructor> backpackData = new ArrayList<>();

    public BackpackAPI() {
        initBackpacksFromFile();
    }

    public ItemStack[] deserializeArrayStack(String data) throws IOException {
        return ConvertBase.stackArrayDeserialize(data);
    }

    public String serializeArrayStack(ItemStack[] items) throws IllegalStateException {
        return ConvertBase.stackArraySerialize(items);
    }

    public ItemStack deserializeSingleStack(String data) throws IOException {
        return ConvertBase.singleStackDeserialize(data);
    }

    public String serializeSingleStack(ItemStack item) throws IllegalStateException {
        return ConvertBase.singleStackSerialize(item);
    }

    public BackpackConstructor createBackpack(BackpackConstructor backpackConstructor) {

        return null;
    }

    public List<BackpackConstructor> getBackpackData() {
        return backpackData;
    }


    public String getBackpackID(BackpackConstructor backpackConstructor) {
        for(BackpackConstructor b : backpackData) {
            if(b.equals(backpackConstructor)) {
                return b.getBackpackID();
            }
        }
        return null;
    }

    private void initBackpacksFromFile() {

        if(Backpack.backpackFiles.size() == 0) {
            DebugMessages.sendError("No backpack files found!");
            return;
        }

        backpackData.clear();

        for (File f : Backpack.backpackFiles) {

            FileConfiguration conf = YamlConfiguration.loadConfiguration(f);

            BackpackLevel backpackLevel = new BackpackLevel(
                    conf, Objects.requireNonNull(conf.getConfigurationSection("levels")).getKeys(false));

            BackpackRestriction backpackRestriction = new BackpackRestriction(
                    conf.getStringList("restrictions.whitelist"),
                    conf.getStringList("restrictions.blacklist"));


            BackpackConstructor backpackFromFile = new BackpackConstructor(
                    f.getName().replace(".yml", ""),
                    conf.getString("displayName"),
                    Material.getMaterial(Objects.requireNonNull(conf.getString("material"))),
                    conf.getInt("model-data"),
                    conf.getStringList("lore"),
                    conf.getString("guiTitle"),
                    conf.getInt("startPages"),
                    conf.getString("requirePermission"),
                    backpackLevel,
                    backpackRestriction);


            DebugMessages.sendInfo("Added new Backpack with ID: " + backpackFromFile.getBackpackID());
            backpackData.add(backpackFromFile);

        }
    }
}
