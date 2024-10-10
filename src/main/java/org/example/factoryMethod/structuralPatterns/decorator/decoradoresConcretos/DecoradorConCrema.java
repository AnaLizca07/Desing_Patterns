package org.example.factoryMethod.structuralPatterns.decorator.decoradoresConcretos;

import org.example.factoryMethod.structuralPatterns.decorator.componente.Bebida;
import org.example.factoryMethod.structuralPatterns.decorator.decorador.DecoradorBebida;

/**
 * DecoradorConCrema is a concrete decorator that adds crema to a beverage.
 * It extends DecoradorBebida and overrides its methods to provide the desired functionality.
 *
 * @author Ana Lizcano
 */
public class DecoradorConCrema extends DecoradorBebida {

    /**
     * Constructor that takes a Bebida object and passes it to the DecoradorBebida constructor.
     *
     * @param bebida The beverage to be decorated.
     */
    public DecoradorConCrema(Bebida bebida) {
        super(bebida);
    }

    /**
     * Returns a description of the beverage with added crema.
     *
     * @return A string describing the beverage with crema.
     */
    @Override
    public String descripcion() {
        return bebida.descripcion() + " con cremita";
    }

    /**
     * Returns the cost of the beverage with added crema.
     *
     * @return A double representing the cost of the beverage with crema.
     */
    @Override
    public double costo() {
        return bebida.costo() + 0.500;
    }

    /**
     * Returns the size of the beverage.
     *
     * @return A string representing the size of the beverage.
     */
    @Override
    public String tamaño() {
        return bebida.tamaño();
    }
}
