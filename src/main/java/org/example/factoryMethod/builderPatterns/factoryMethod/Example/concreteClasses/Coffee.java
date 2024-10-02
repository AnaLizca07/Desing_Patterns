package org.example.factoryMethod.builderPatterns.factoryMethod.Example.concreteClasses;

import org.example.factoryMethod.builderPatterns.factoryMethod.Example.product.Beverage;

public class Coffee implements Beverage {
    @Override
    public void prepare() {
        System.out.println("Preparing Coffee...☕️");
    }
}
