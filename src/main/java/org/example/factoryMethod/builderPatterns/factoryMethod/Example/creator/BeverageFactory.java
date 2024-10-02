package org.example.factoryMethod.builderPatterns.factoryMethod.Example.creator;

import org.example.factoryMethod.builderPatterns.factoryMethod.Example.product.Beverage;

//Abstract class to define the methods to create beverages
public abstract class BeverageFactory {
    public abstract Beverage createBeverage();
}
