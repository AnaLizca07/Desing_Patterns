package org.example.factoryMethod.structuralPatterns.composite;

/**
 * This is the main class that demonstrates the usage of the composite design pattern.
 * It creates a hierarchical structure of files and folders, and then displays their details.
 *
 * @author Ana Lizcano
 */
public class Main {
    public static void main(String[] args) {
        // Create individual files
        FileComponent file1 = new File("Test.txt");
        FileComponent file2 = new File("Document.txt");

        // Create a folder and add files to it
        Folder folder1 = new Folder("University docs");
        folder1.add(file1);
        folder1.add(file2);

        // Create another folder and add a file to it
        Folder folder2 = new Folder("Personal docs");
        folder2.add(new File("Photos"));

        // Create a general folder and add other folders to it
        Folder generalFolder = new Folder("General docs");
        generalFolder.add(folder1);
        generalFolder.add(folder2);

        // Display the details of the entire hierarchical structure
        generalFolder.showDetails();
    }
}
