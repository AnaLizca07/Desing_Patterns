/**
 * This class represents a circle shape that extends the AbstractShape class.
 * It uses the Bridge design pattern to decouple the abstraction (AbstractShape) from the implementation (Color).
 *
 * @author Ana Lizcano
 */
package org.example.factoryMethod.structuralPatterns.bridge.clasesDeAbstraccion;

import org.example.factoryMethod.structuralPatterns.bridge.abstraccion.AbstractShape;
import org.example.factoryMethod.structuralPatterns.bridge.implementacion.Color;

public class Circle extends AbstractShape {
    /**
     * Constructor for Circle class.
     *
     * @param color The color of the circle. It should be an instance of the Color interface.
     */
    public Circle(Color color) {
        super(color);
    }

    /**
     * Draws the circle.
     * It prints a message indicating that a circle is being drawn and its color.
     */
    @Override
    public void draw() {
        System.out.println("Drawing a circle, but this circle is " + color.applyColor());
    }
}
