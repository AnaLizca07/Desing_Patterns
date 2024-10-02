package org.example.factoryMethod.builderPatterns.factoryMethod.Example.concreteCreators;

import org.example.factoryMethod.builderPatterns.factoryMethod.Example.product.Beverage;
import org.example.factoryMethod.builderPatterns.factoryMethod.Example.creator.BeverageFactory;
import org.example.factoryMethod.builderPatterns.factoryMethod.Example.concreteClasses.Coffee;

public class CoffeeFactory extends BeverageFactory {
    @Override
    public Beverage createBeverage() {
        return new Coffee();
    }
}
