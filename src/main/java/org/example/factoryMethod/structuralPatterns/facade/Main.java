package org.example.factoryMethod.structuralPatterns.facade;

import org.example.factoryMethod.structuralPatterns.facade.CasaFacade;

public class Main {
    public static void main(String[] args) {
        CasaFacade casa = new CasaFacade();

        casa.modoNoche();
        System.out.println();

        casa.modoDia();
    }
}
