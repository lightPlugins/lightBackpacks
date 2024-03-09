package de.lightplugins.backpack.api;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import java.util.UUID;

public class BackpackConstructor {

    private String contentsSerialized;
    private String backpackID;
    private UUID backpackOwner;
    private UUID[] trustedUsers;
    private int backpackLevel;
    private ItemStack[] restrictions;

    public BackpackConstructor(String contentsSerialized,
                               String backpackID,
                               UUID backpackOwner,
                               UUID[] trustedUsers,
                               int backpackLevel) {

        this.contentsSerialized = contentsSerialized;
        this.backpackID = backpackID;
        this.backpackOwner = backpackOwner;
        this.trustedUsers = trustedUsers;
        this.backpackLevel = backpackLevel;
    }

    public String getContents() {
        return contentsSerialized;
    }

    public void setContents(String contentsSerialized) {
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

    public UUID[] getTrustedUsers() {
        return trustedUsers;
    }

    public void setTrustedUsers(UUID[] trustedUsers) {
        this.trustedUsers = trustedUsers;
    }

    public int getBackpackLevel() {
        return backpackLevel;
    }
    public void setBackpackLevel(int backpackLevel) {
        this.backpackLevel = backpackLevel;
    }
}
