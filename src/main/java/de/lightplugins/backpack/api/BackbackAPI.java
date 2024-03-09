package de.lightplugins.backpack.api;

import de.lightplugins.backpack.master.Backpack;
import de.lightplugins.backpack.util.ConvertBase;
import org.bukkit.inventory.ItemStack;

import java.io.IOException;

public class BackbackAPI {

    private Backpack backpack;

    private void BackpackAPI(Backpack backpack) {
        this.backpack = backpack;
    }

    public ItemStack[] deserializeArrayStack(String data) throws IOException {
        return ConvertBase.stackArrayDeserialize(data);
    }

    public ItemStack deserializeSingleStack(String data) throws IOException {
        return ConvertBase.singleStackDeserialize(data);
    }

    public String serializeArrayStack(ItemStack[] items) throws IllegalStateException {
        return ConvertBase.stackArraySerialize(items);
    }

    public String serializeSingleStack(ItemStack item) throws IllegalStateException {
        return ConvertBase.singleStackSerialize(item);
    }



}
