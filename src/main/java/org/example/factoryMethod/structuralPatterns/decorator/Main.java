package org.example.factoryMethod.structuralPatterns.decorator;

import org.example.factoryMethod.structuralPatterns.decorator.componente.Bebida;
import org.example.factoryMethod.structuralPatterns.decorator.componenteConcreto.BebidaSimple;
import org.example.factoryMethod.structuralPatterns.decorator.decoradoresConcretos.DecoradorConChocolate;
import org.example.factoryMethod.structuralPatterns.decorator.decoradoresConcretos.DecoradorConCrema;
import org.example.factoryMethod.structuralPatterns.decorator.decoradoresConcretos.DecoradorConSirope;

/**
 * The Main class demonstrates the Decorator design pattern in a coffee shop scenario.
 * It creates a simple coffee (BebidaSimple) and adds different decorators (DecoradorConCrema, DecoradorConChocolate, DecoradorConSirope)
 * to it to showcase the dynamic nature of the Decorator pattern.
 *
 * @author Ana Lizcano
 */
public class Main {

    /**
     * The main method is the entry point of the application.
     * It creates a simple coffee (BebidaSimple) and adds different decorators to it.
     * The descriptions, sizes, and costs of the beverages are printed to the console.
     *
     * @param args Command-line arguments (not used in this example)
     */
    public static void main(String[] args) {
        Bebida bebida = new BebidaSimple();
        System.out.println(bebida.descripcion() + "" + bebida.tamaño() + " " + bebida.costo());

        bebida = new DecoradorConCrema(bebida);
        System.out.println(bebida.descripcion() + "" + bebida.tamaño() + " " + bebida.costo());

        bebida = new DecoradorConChocolate(bebida);
        System.out.println(bebida.descripcion() + "" + bebida.tamaño() + " " + bebida.costo());

        bebida = new DecoradorConSirope(bebida);
        System.out.println(bebida.descripcion() + "" + bebida.tamaño() + " " + bebida.costo());
    }
}
