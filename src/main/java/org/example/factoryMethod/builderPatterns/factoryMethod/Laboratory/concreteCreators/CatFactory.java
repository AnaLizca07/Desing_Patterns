package org.example.factoryMethod.builderPatterns.factoryMethod.Laboratory.concreteCreators;

import org.example.factoryMethod.builderPatterns.factoryMethod.Laboratory.concreteClasses.Cat;
import org.example.factoryMethod.builderPatterns.factoryMethod.Laboratory.creator.PetFactory;
import org.example.factoryMethod.builderPatterns.factoryMethod.Laboratory.product.Pet;

public class CatFactory extends PetFactory {
    @Override
    public Pet create() {
        return new Cat();
    }
}
