/**
 * Represents a square shape that extends the AbstractShape class.
 * This class is a concrete implementation of the AbstractShape class,
 * providing a specific behavior for drawing a square.
 *
 * @author Ana Lizcano
 */
package org.example.factoryMethod.structuralPatterns.bridge.clasesDeAbstraccion;

import org.example.factoryMethod.structuralPatterns.bridge.abstraccion.AbstractShape;
import org.example.factoryMethod.structuralPatterns.bridge.implementacion.Color;

public class Square extends AbstractShape {
    /**
     * Constructs a new Square object with the specified color.
     *
     * @param color The color to be applied to the square.
     */
    public Square(Color color) {
        super(color);
    }

    /**
     * Draws the square with the specified color.
     * The color is determined by the color object passed to the constructor.
     */
    @Override
    public void draw() {
        System.out.println("Drawing a square, but this square is " + color.applyColor());
    }
}