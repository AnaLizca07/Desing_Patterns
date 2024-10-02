package org.example.factoryMethod.builderPatterns.factoryMethod.Example;

import org.example.factoryMethod.builderPatterns.factoryMethod.Example.creator.BeverageFactory;
import org.example.factoryMethod.builderPatterns.factoryMethod.Example.concreteCreators.CoffeeFactory;
import org.example.factoryMethod.builderPatterns.factoryMethod.Example.concreteCreators.TeaFactory;
import org.example.factoryMethod.builderPatterns.factoryMethod.Example.product.Beverage;

public class Main1 {
    public static void main(String[] args) {
        //Create a factory for coffee
        BeverageFactory coffeeFactory = new CoffeeFactory();
        Beverage coffee = coffeeFactory.createBeverage(); //Create a coffee
        coffee.prepare();//Prepare coffee

        //Create a factory for tea
        BeverageFactory teaFactory = new TeaFactory();
        Beverage tea = teaFactory.createBeverage();
        tea.prepare();
    }
}
