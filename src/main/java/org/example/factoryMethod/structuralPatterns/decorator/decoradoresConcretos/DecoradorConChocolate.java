package org.example.factoryMethod.structuralPatterns.decorator.decoradoresConcretos;

import org.example.factoryMethod.structuralPatterns.decorator.componente.Bebida;
import org.example.factoryMethod.structuralPatterns.decorator.decorador.DecoradorBebida;

/**
 * DecoradorConChocolate is a concrete decorator that adds chocolate to a Bebida.
 * It extends DecoradorBebida and overrides its methods to provide additional functionality.
 *
 * @author Ana Lizcano
 */
public class DecoradorConChocolate extends DecoradorBebida {

    /**
     * Constructor that takes a Bebida object and passes it to the DecoradorBebida constructor.
     *
     * @param bebida The Bebida object to be decorated.
     */
    public DecoradorConChocolate(Bebida bebida) {
        super(bebida);
    }

    /**
     * Returns a description of the Bebida with chocolate added.
     *
     * @return A String representing the description of the Bebida with chocolate.
     */
    @Override
    public String descripcion() {
        return bebida.descripcion() + " con chocolate";
    }

    /**
     * Returns the cost of the Bebida with chocolate added.
     *
     * @return A double representing the cost of the Bebida with chocolate.
     */
    @Override
    public double costo() {
        return bebida.costo() + 1.00;
    }

    /**
     * Returns the size of the Bebida.
     *
     * @return A String representing the size of the Bebida.
     */
    @Override
    public String tamaño() {
        return bebida.tamaño();
    }
}
