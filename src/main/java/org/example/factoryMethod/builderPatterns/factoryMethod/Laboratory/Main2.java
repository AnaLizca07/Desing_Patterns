package org.example.factoryMethod.builderPatterns.factoryMethod.Laboratory;

import org.example.factoryMethod.builderPatterns.factoryMethod.Laboratory.concreteCreators.CatFactory;
import org.example.factoryMethod.builderPatterns.factoryMethod.Laboratory.concreteCreators.DogFactory;
import org.example.factoryMethod.builderPatterns.factoryMethod.Laboratory.creator.PetFactory;
import org.example.factoryMethod.builderPatterns.factoryMethod.Laboratory.product.Pet;

public class Main2 {
    public static void main(String[] args) {
        PetFactory dogFactory = new DogFactory();
        PetFactory catFactory = new CatFactory();
        Pet dog = dogFactory.create();
        Pet cat = catFactory.create();

        dog.makeSound();
        dog.walk();
        dog.eat();

        cat.makeSound();
        cat.walk();
        cat.eat();
    }
}
