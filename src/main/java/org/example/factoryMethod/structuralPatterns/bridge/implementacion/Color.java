/**
 * This interface represents a color that can be applied to a graphical object.
 * It is used in the Bridge design pattern to decouple the abstraction (graphical object)
 * from its implementation (color).
 *
 * @author Ana Lizcano
 */
package org.example.factoryMethod.structuralPatterns.bridge.implementacion;

public interface Color {
    /**
     * Applies the color to the graphical object.
     *
     * @return A string representing the color applied to the graphical object.
     */
    String applyColor();
}