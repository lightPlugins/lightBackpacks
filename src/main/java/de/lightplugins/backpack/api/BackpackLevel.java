package de.lightplugins.backpack.api;


import org.bukkit.configuration.file.FileConfiguration;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BackpackLevel {

    private FileConfiguration targetBackpackFile;
    private Set<String> levelSet;
    private List<BackpackEachLevel> levelList = new ArrayList<>();

    public BackpackLevel(FileConfiguration targetBackpackFile, Set<String> levelSection) {
        this.levelSet = levelSection;
        this.targetBackpackFile = targetBackpackFile;
        createLevels();
    }

    public FileConfiguration getTargetBackpackFile() {
        return targetBackpackFile;
    }

    public void setTargetBackpackFile(FileConfiguration targetBackpackFile) {
        this.targetBackpackFile = targetBackpackFile;
    }

    public Set<String> getLevelSection() {
        return levelSet;
    }

    public void setLevelSection(Set<String> levelSet) {
        this.levelSet = levelSet;
    }

    public List<BackpackEachLevel> getLevelList() {
        return levelList;
    }

    public void setLevelList(List<BackpackEachLevel> levelList) {
        this.levelList = levelList;
    }

    private void createLevels() {

        for(String path : levelSet) {

            int currentLevel = Integer.parseInt(path);
            int pages = targetBackpackFile.getInt("levels." + path + ".pages");
            List<String> upgradeConditions = targetBackpackFile.getStringList("levels." + path + ".conditions");

            BackpackEachLevel level = new BackpackEachLevel(currentLevel, pages, upgradeConditions);

            levelList.add(level);

        }
    }
}
