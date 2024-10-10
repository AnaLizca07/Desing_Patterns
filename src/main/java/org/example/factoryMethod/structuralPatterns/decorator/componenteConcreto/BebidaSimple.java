package org.example.factoryMethod.structuralPatterns.decorator.componenteConcreto;

import org.example.factoryMethod.structuralPatterns.decorator.componente.Bebida;

/**
 * This class represents a simple beverage. It implements the Bebida interface and provides
 * methods to get the description, cost, and size of the beverage.
 *
 * @author Ana Lizcano
 */
public class BebidaSimple implements Bebida {

    /**
     * Returns a brief description of the beverage.
     *
     * @return A string describing the beverage.
     */
    @Override
    public String descripcion() {
        return "Bebida simple";
    }

    /**
     * Returns the cost of the beverage.
     *
     * @return A double representing the cost of the beverage.
     */
    @Override
    public double costo() {
        return 5.500;
    }

    /**
     * Returns the size of the beverage.
     *
     * @return A string representing the size of the beverage.
     */
    @Override
    public String tamaño() {
        return "Pequeño";
    }
}