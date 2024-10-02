package org.example.factoryMethod.builderPatterns.factoryMethod.Laboratory.concreteClasses;

import org.example.factoryMethod.builderPatterns.factoryMethod.Laboratory.product.Pet;

public class Cat implements Pet {
    @Override
    public void makeSound() {
        System.out.println("Miawwwwww😸");
    }

    @Override
    public void walk() {
        System.out.println("Cat walking...🐈");
    }

    @Override
    public void eat() {
        System.out.println("Cat eating fish...🐈‍⬛🐟");
    }
}
