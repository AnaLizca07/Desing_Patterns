/**
 * This abstract class represents a decorator for the Bebida interface. Decorators add new behavior to the existing
 * Bebida objects without altering their structure.
 *
 * @author Ana Lizcano
 *
 */
package org.example.factoryMethod.structuralPatterns.decorator.decorador;

import org.example.factoryMethod.structuralPatterns.decorator.componente.Bebida;

public abstract class DecoradorBebida implements Bebida {
    /**
     * The Bebida object that this decorator will decorate.
     */
    protected Bebida bebida;

    /**
     * Constructor that initializes the Bebida object to be decorated.
     *
     * @param bebida The Bebida object to be decorated.
     */
    public DecoradorBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String descripcion() {
        return bebida.descripcion();
    }

    @Override
    public double costo() {
        return bebida.costo();
    }

    @Override
    public String tamaño() {
        return bebida.tamaño();
    }
}
