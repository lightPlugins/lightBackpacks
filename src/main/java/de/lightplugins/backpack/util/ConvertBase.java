package de.lightplugins.backpack.util;

import org.bukkit.inventory.ItemStack;

import java.io.*;
import java.util.Base64;

public class ConvertBase {

    /**
     * Deserialize a string into an array of ItemStack objects.
     *
     * @param  data  the string to deserialize
     * @return       the deserialized array of ItemStack objects
     */
    public static ItemStack[] stackArrayDeserialize(String data) throws IOException {
        try {
            byte[] byteData = Base64.getDecoder().decode(data);
            ByteArrayInputStream inputStream = new ByteArrayInputStream(byteData);
            ObjectInputStream objectInput = new ObjectInputStream(inputStream);

            int size = objectInput.readInt();
            ItemStack[] items = new ItemStack[size];

            for (int i = 0; i < size; i++) {
                try {
                    items[i] = (ItemStack) objectInput.readObject();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace(); // Handle the exception appropriately
                }
            }

            objectInput.close();
            return items;
        } catch (IOException e) {
            throw new IOException("Unable to decode item stack array from Base64.", e);
        }
    }

    /**
     * Serializes an array of ItemStacks into a Base64-encoded string.
     *
     * @param  items  the array of ItemStacks to be serialized
     * @return       the Base64-encoded string representing the serialized array
     */
    public static String stackArraySerialize(ItemStack[] items) throws IllegalStateException {
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutput = new ObjectOutputStream(outputStream);

            objectOutput.writeInt(items.length);

            for (ItemStack item : items) {
                objectOutput.writeObject(item);
            }

            objectOutput.close();
            return Base64.getEncoder().encodeToString(outputStream.toByteArray());
        } catch (IOException e) {
            throw new IllegalStateException("Unable to convert item stacks to Base64.", e);
        }
    }

    /**
     * A method to deserialize a given ItemStack object to a Base64 encoded string.
     *
     * @param  item  the ItemStack object to be deserialized
     * @return       the Base64 encoded string representing the deserialized ItemStack
     */
    public static String singleStackSerialize(ItemStack item) throws IllegalStateException {
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutput = new ObjectOutputStream(outputStream);

            objectOutput.writeObject(item);
            objectOutput.close();

            return Base64.getEncoder().encodeToString(outputStream.toByteArray());
        } catch (IOException e) {
            throw new IllegalStateException("Unable to convert item stack to Base64.", e);
        }
    }

    /**
     * Deserialize a single ItemStack from a Base64 encoded string.
     *
     * @param  data  the Base64 encoded string representing the ItemStack
     * @return       the deserialized ItemStack
     */
    public static ItemStack singleStackDeserialize(String data) throws IOException {
        try {
            byte[] byteData = Base64.getDecoder().decode(data);
            ByteArrayInputStream inputStream = new ByteArrayInputStream(byteData);
            ObjectInputStream objectInput = new ObjectInputStream(inputStream);

            ItemStack item = (ItemStack) objectInput.readObject();

            objectInput.close();
            return item;
        } catch (ClassNotFoundException e) {
            throw new IOException("Unable to decode item stack from Base64.", e);
        }
    }
}
