package org.example.factoryMethod.structuralPatterns.composite;

/**
 * Represents a file in a file system.
 * Implements the FileComponent interface to provide a common interface for files and directories.
 *
 * @author Ana Lizcano
 */
public class File implements FileComponent {
    /**
     * The name of the file.
     */
    private String name;

    /**
     * Constructs a new File object with the given name.
     *
     * @param name The name of the file.
     */
    public File(String name) {
        this.name = name;
    }

    /**
     * Displays the details of the file, including its name.
     */
    @Override
    public void showDetails() {
        System.out.println("File: " + name);
    }
}
