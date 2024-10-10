/**
 * This class represents a concrete implementation of the {@link Color} interface.
 * It represents the color blue.
 *
 * @author Ana Lizcano
 */
package org.example.factoryMethod.structuralPatterns.bridge.implConcretas;

import org.example.factoryMethod.structuralPatterns.bridge.implementacion.Color;

public class Blue implements Color {
    /**
     * Applies the color blue to an object.
     *
     * @return A string representation of the applied color, which is "Blue" in this case.
     */
    @Override
    public String applyColor() {
        return "Blue";
    }
}