/**
 * This is an abstract class that represents a shape in the Bridge design pattern.
 * It serves as an abstraction layer between the client and the concrete implementations of shapes and colors.
 *
 * @author Ana Lizcano
 */
package org.example.factoryMethod.structuralPatterns.bridge.abstraccion;

import org.example.factoryMethod.structuralPatterns.bridge.implementacion.Color;
import org.example.factoryMethod.structuralPatterns.bridge.implementacion.Shape;

public abstract class AbstractShape implements Shape {
    /**
     * The color of the shape.
     */
    protected Color color;

    /**
     * Constructor for AbstractShape.
     *
     * @param color The color of the shape. It cannot be null.
     */
    public AbstractShape(Color color) {
        this.color = color;
    }
}
