package de.lightplugins.backpack.api;

import java.util.List;

public class BackpackLevel {

    private int level;
    private int pages;
    private List<String> conditions;

    public BackpackLevel(int level, int pages, List<String> conditions) {
        this.level = level;
        this.pages = pages;
        this.conditions = conditions;
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

    public List<String> getConditions() {
        return conditions;
    }

    public void setConditions(List<String> conditions) {
        this.conditions = conditions;
    }
}
