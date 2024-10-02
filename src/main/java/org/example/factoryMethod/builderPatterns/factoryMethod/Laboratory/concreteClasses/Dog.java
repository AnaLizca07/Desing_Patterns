package org.example.factoryMethod.builderPatterns.factoryMethod.Laboratory.concreteClasses;

import org.example.factoryMethod.builderPatterns.factoryMethod.Laboratory.product.Pet;

public class Dog implements Pet {
    @Override
    public void makeSound() {
        System.out.println("Guauuuu...🐶");
    }

    @Override
    public void walk() {
        System.out.println("Dog walking...🐾");
    }

    @Override
    public void eat() {
        System.out.println("Dog eating...🐕🦴");
    }
}
