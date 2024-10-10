package org.example.factoryMethod.structuralPatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a folder in a file system. It can contain other files or folders.
 *
 * @author Ana Lizcano
 */
public class Folder implements FileComponent{
    private String name;
    private List<FileComponent> files = new ArrayList<>();

    /**
     * Constructs a new folder with the given name.
     *
     * @param name the name of the folder
     */
    public Folder(String name) {
        this.name = name;
    }

    /**
     * Adds a file or folder to the folder.
     *
     * @param file the file or folder to add
     */
    public void add(FileComponent file) {
        files.add(file);
    }

    /**
     * Removes a file or folder from the folder.
     *
     * @param file the file or folder to remove
     */
    public void remove(FileComponent file) {
        files.remove(file);
    }

    /**
     * Displays the details of the folder and its contents.
     */
    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        for (FileComponent fileComponent : files){
            fileComponent.showDetails();
        }
    }

}