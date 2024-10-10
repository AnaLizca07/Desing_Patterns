/**
 * This class represents a specific color, Violet, which implements the {@link Color} interface.
 * It provides a method to apply the color and return its name as a string.
 *
 * @author Ana Lizcano
 */
package org.example.factoryMethod.structuralPatterns.bridge.implConcretas;

import org.example.factoryMethod.structuralPatterns.bridge.implementacion.Color;

public class Violet implements Color {
    /**
     * Applies the color Violet and returns its name as a string.
     *
     * @return The name of the color, which is "violet".
     */
    @Override
    public String applyColor() {
        return "violet";
    }
}