package de.lightplugins.backpack.api;

import java.util.UUID;

public class BackpackPlayer {

    private int backpackLevel;
    private UUID owner;
    private String[] contentData;
    private BackpackConstructor backpackConstructor;

    public BackpackPlayer(int backpackLevel, UUID owner, String[] contentData, BackpackConstructor backpackConstructor) {
        this.backpackLevel = backpackLevel;
        this.owner = owner;
        this.contentData = contentData;
        this.backpackConstructor = backpackConstructor;
    }

    public int getBackpackLevel() {
        return backpackLevel;
    }

    public void setBackpackLevel(int backpackLevel) {
        this.backpackLevel = backpackLevel;
    }

    public UUID getOwner() {
        return owner;
    }

    public void setOwner(UUID owner) {
        this.owner = owner;
    }

    public String[] getContentData() {
        return contentData;
    }

    public void setContentData(String[] contentData) {
        this.contentData = contentData;
    }

    public BackpackConstructor getBackpackConstructor() {
        return backpackConstructor;
    }

    public void setBackpackConstructor(BackpackConstructor backpackConstructor) {
        this.backpackConstructor = backpackConstructor;
    }
}
