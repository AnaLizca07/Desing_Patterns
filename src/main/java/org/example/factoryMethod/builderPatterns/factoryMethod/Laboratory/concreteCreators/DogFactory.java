package org.example.factoryMethod.builderPatterns.factoryMethod.Laboratory.concreteCreators;

import org.example.factoryMethod.builderPatterns.factoryMethod.Laboratory.concreteClasses.Dog;
import org.example.factoryMethod.builderPatterns.factoryMethod.Laboratory.creator.PetFactory;
import org.example.factoryMethod.builderPatterns.factoryMethod.Laboratory.product.Pet;

public class DogFactory extends PetFactory {
    @Override
    public Pet create() {
        return new Dog();
    }
}
