package de.lightplugins.backpack.api;

public class BackpackOptions {

    private boolean storeInventoryIsFull;

    public BackpackOptions(boolean storeInventoryIsFull) {
        this.storeInventoryIsFull = storeInventoryIsFull;
    }

    public boolean isStoreInventoryIsFull() {
        return storeInventoryIsFull;
    }

    public void setStoreInventoryIsFull(boolean storeInventoryIsFull) {
        this.storeInventoryIsFull = storeInventoryIsFull;
    }
}
