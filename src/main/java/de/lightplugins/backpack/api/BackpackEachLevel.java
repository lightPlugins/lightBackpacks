package de.lightplugins.backpack.api;

import java.util.ArrayList;
import java.util.List;

public class BackpackEachLevel {

    private int level;
    private int pages;
    private List<String> upgradeConditions;

    public BackpackEachLevel(int level, int pages, List<String> upgradeConditions) {
        this.level = level;
        this.pages = pages;
        this.upgradeConditions = upgradeConditions;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public List<String> getUpgradeConditions() {
        return upgradeConditions;
    }

    public void setUpgradeConditions(List<String> upgradeConditions) {
        this.upgradeConditions = upgradeConditions;
    }

}
