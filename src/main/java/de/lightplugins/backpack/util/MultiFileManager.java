package de.lightplugins.backpack.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MultiFileManager {

    private final String directoryPath;
    private final List<File> fileList;

    public MultiFileManager(String directoryPath) {
        this.directoryPath = directoryPath;
        this.fileList = new ArrayList<>();
        loadFiles();
    }

    public void reloadFiles() {
        fileList.clear();
        loadFiles();
    }

    private void loadFiles() {
        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            findFilesRecursive(directory, fileList);
        }
    }

    private void findFilesRecursive(File directory, List<File> fileList) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    findFilesRecursive(file, fileList);
                } else {
                    if(file.getName().equalsIgnoreCase("_example.yml")) continue;
                    fileList.add(file);
                }
            }
        }
    }

    public List<File> getFiles() {
        return fileList;
    }
}
