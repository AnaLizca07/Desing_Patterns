/**
 * This is the main class that demonstrates the usage of the Bridge design pattern.
 * It creates instances of different shapes with different colors and calls the draw method on each.
 *
 * @author Ana Lizcano
 */
package org.example.factoryMethod.structuralPatterns.bridge;

import org.example.factoryMethod.structuralPatterns.bridge.clasesDeAbstraccion.Circle;
import org.example.factoryMethod.structuralPatterns.bridge.clasesDeAbstraccion.Square;
import org.example.factoryMethod.structuralPatterns.bridge.clasesDeAbstraccion.Triangle;
import org.example.factoryMethod.structuralPatterns.bridge.implConcretas.Blue;
import org.example.factoryMethod.structuralPatterns.bridge.implConcretas.Violet;
import org.example.factoryMethod.structuralPatterns.bridge.implementacion.Shape;

public class Main {
    public static void main(String[] args) {
        // Create a circle with violet color
        Shape violetCircle = new Circle(new Violet());
        // Create a square with blue color
        Shape blueSquare = new Square(new Blue());
        // Create a triangle with violet color
        Shape violetTriangle = new Triangle(new Violet());

        // Draw the shapes
        violetCircle.draw();
        blueSquare.draw();
        violetTriangle.draw();
    }
}