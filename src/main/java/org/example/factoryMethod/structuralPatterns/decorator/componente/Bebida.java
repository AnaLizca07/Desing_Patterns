/**
 * This interface represents a beverage in a decorator pattern example.
 * It provides methods to get the description, cost, and size of the beverage.
 *
 * @author Ana Lizcano
 */
package org.example.factoryMethod.structuralPatterns.decorator.componente;

public interface Bebida {
    /**
     * Returns a description of the beverage.
     *
     * @return a string describing the beverage
     */
    String descripcion();

    /**
     * Returns the cost of the beverage.
     *
     * @return a double representing the cost of the beverage
     */
    double costo();

    /**
     * Returns the size of the beverage.
     *
     * @return a string representing the size of the beverage
     */
    String tamaño();
}
