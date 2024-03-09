package de.lightplugins.backpack.api;

import de.lightplugins.backpack.util.ConvertBase;
import org.bukkit.inventory.ItemStack;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BackbackAPI {

    private final List<BackpackConstructor> backpackData = new ArrayList<>();

    private void BackpackAPI() {
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

    public List<BackpackConstructor> getAllBackpacksFromPlayer(UUID uuid) {
        List<BackpackConstructor> sortedBackpacks = new ArrayList<>();
        for(BackpackConstructor b : backpackData) {
            if(b.getBackpackOwner().equals(uuid)) {
                sortedBackpacks.add(b);
            }
        }
        return sortedBackpacks;
    }

    public int getCurrentBackpackLevel(BackpackConstructor backpackConstructor) {
        for(BackpackConstructor b : backpackData) {
            if(b.equals(backpackConstructor)) {
                return b.getBackpackLevel();
            }
        }
        return 0;
    }

    public String getBackpackID(BackpackConstructor backpackConstructor) {
        for(BackpackConstructor b : backpackData) {
            if(b.equals(backpackConstructor)) {
                return b.getBackpackID();
            }
        }
        return null;
    }

    public ItemStack[] getBackpackContent(UUID owner, String backpackID) throws IOException {
        for(BackpackConstructor b : backpackData) {
            if(b.getBackpackOwner().equals(owner) && b.getBackpackID().equals(backpackID)) {
                return deserializeArrayStack(b.getContents());
            }
        }

        return null;
    }
}
