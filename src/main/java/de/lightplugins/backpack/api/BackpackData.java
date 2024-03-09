package de.lightplugins.backpack.api;

import org.bukkit.inventory.ItemStack;
import java.util.UUID;

public class BackpackData {

    private ItemStack[] contents;
    private UUID backpackID;
    private UUID backpackOwner;
    private UUID[] trustedUsers;

    public BackpackData(ItemStack[] contents, UUID backpackID, UUID backpackOwner, UUID[] trustedUsers) {
        this.contents = contents;
        this.backpackID = backpackID;
        this.backpackOwner = backpackOwner;
        this.trustedUsers = trustedUsers;
    }

    public ItemStack[] getContents() {
        return contents;
    }

    public void setContents(ItemStack[] contents) {
        this.contents = contents;
    }

    public UUID getBackpackID() {
        return backpackID;
    }

    public void setBackpackID(UUID backpackID) {
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








}
