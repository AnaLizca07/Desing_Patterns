package org.example.factoryMethod.builderPatterns.factoryMethod.Example.concreteClasses;

import org.example.factoryMethod.builderPatterns.factoryMethod.Example.product.Beverage;

public class Tea implements Beverage {
    @Override
    public void prepare() {
        System.out.println("Preparing tea...🍵");
    }
}
