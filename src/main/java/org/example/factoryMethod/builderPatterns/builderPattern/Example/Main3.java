package org.example.factoryMethod.builderPatterns.builderPattern.Example;

import org.example.factoryMethod.builderPatterns.builderPattern.Example.builder.ComputerBuilder;
import org.example.factoryMethod.builderPatterns.builderPattern.Example.concreteBuilder.ConcreteComputerBuilder;
import org.example.factoryMethod.builderPatterns.builderPattern.Example.director.ComputerDirector;
import org.example.factoryMethod.builderPatterns.builderPattern.Example.product.Computer;

public class Main3 {
    public static void main(String[] args) {
        ComputerBuilder builder = new ConcreteComputerBuilder();
        ComputerDirector director = new ComputerDirector(builder);
        Computer gamingComputer = director.constructGamingComputer();
        System.out.println(gamingComputer);
        Computer officeComputer = director.constructOfficeComputer();
        System.out.println(officeComputer);
    }
}
