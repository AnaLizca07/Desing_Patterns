/**
 * This interface represents a component in a file system. It can be a file or a directory.
 * The interface provides a method to show the details of the component.
 *
 * @author Ana Lizcano
 */
package org.example.factoryMethod.structuralPatterns.composite;

public interface FileComponent {
    /**
     * Shows the details of the file component, such as its name, size, and type.
     */
    void showDetails();
}
