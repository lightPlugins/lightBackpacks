package de.lightplugins.backpack.api;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.UUID;

public class BackpackConstructor {

    private String contentsSerialized;
    private String backpackID;
    private UUID backpackOwner;
    private String displayname;
    private Material material;
    private int modelData;
    private List<String> lore;
    private String guiTitle;
    private int startPages;
    private String requirePermission;
    private BackpackLevel backpackLevel;
    private BackpackRestriction backpackRestriction;

    public BackpackConstructor(String contentsSerialized,
                               String backpackID,
                               UUID backpackOwner,
                               String displayname,
                               Material material,
                               int modelData,
                               List<String> lore,
                               String guiTitle,
                               int startPages,
                               String requirePermission,
                               BackpackLevel backpackLevel,
                               BackpackRestriction backpackRestriction) {

        this.contentsSerialized = contentsSerialized;
        this.backpackID = backpackID;
        this.backpackOwner = backpackOwner;
        this.displayname = displayname;
        this.material = material;
        this.modelData = modelData;
        this.lore = lore;
        this.guiTitle = guiTitle;
        this.startPages = startPages;
        this.requirePermission = requirePermission;
        this.backpackLevel = backpackLevel;
        this.backpackRestriction = backpackRestriction;
    }

    public String getContentsSerialized() {
        return contentsSerialized;
    }

    public void setContentsSerialized(String contentsSerialized) {
        this.contentsSerialized = contentsSerialized;
    }

    public String getBackpackID() {
        return backpackID;
    }

    public void setBackpackID(String backpackID) {
        this.backpackID = backpackID;
    }

    public UUID getBackpackOwner() {
        return backpackOwner;
    }

    public void setBackpackOwner(UUID backpackOwner) {
        this.backpackOwner = backpackOwner;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public int getModelData() {
        return modelData;
    }

    public void setModelData(int modelData) {
        this.modelData = modelData;
    }

    public List<String> getLore() {
        return lore;
    }

    public void setLore(List<String> lore) {
        this.lore = lore;
    }

    public String getGuiTitle() {
        return guiTitle;
    }

    public void setGuiTitle(String guiTitle) {
        this.guiTitle = guiTitle;
    }

    public int getStartPages() {
        return startPages;
    }

    public void setStartPages(int startPages) {
        this.startPages = startPages;
    }

    public String getRequirePermission() {
        return requirePermission;
    }

    public void setRequirePermission(String requirePermission) {
        this.requirePermission = requirePermission;
    }

    public BackpackLevel getBackpackLevel() {
        return backpackLevel;
    }

    public void setBackpackLevel(BackpackLevel backpackLevel) {
        this.backpackLevel = backpackLevel;
    }

    public BackpackRestriction getBackpackRestriction() {
        return backpackRestriction;
    }

    public void setBackpackRestriction(BackpackRestriction backpackRestriction) {
        this.backpackRestriction = backpackRestriction;
    }
}
