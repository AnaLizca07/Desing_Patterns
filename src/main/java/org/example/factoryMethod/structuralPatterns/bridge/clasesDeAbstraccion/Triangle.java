/**
 * This class represents a triangle shape that extends the AbstractShape class.
 * It uses the Bridge design pattern to decouple the abstraction (Triangle) from the implementation (Color).
 *
 * @author Ana Lizcano
 */
package org.example.factoryMethod.structuralPatterns.bridge.clasesDeAbstraccion;

import org.example.factoryMethod.structuralPatterns.bridge.abstraccion.AbstractShape;
import org.example.factoryMethod.structuralPatterns.bridge.implementacion.Color;

public class Triangle extends AbstractShape {
    /**
     * Constructor for Triangle class.
     *
     * @param color The color of the triangle. It should be an instance of the Color interface.
     */
    public Triangle(Color color) {
        super(color);
    }

    /**
     * Draws the triangle.
     * It prints a message indicating that a triangle is being drawn and its color.
     */
    @Override
    public void draw() {
        System.out.println("Drawing a triangle, but this triangle is " + color.applyColor());
    }
}