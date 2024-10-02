package org.example.factoryMethod.builderPatterns.builderPattern.Example.builder;

import org.example.factoryMethod.builderPatterns.builderPattern.Example.product.Computer;

public interface ComputerBuilder {
    ComputerBuilder setProcessor(String processor);
    ComputerBuilder setRam(int ram);
    ComputerBuilder setStorage(String storage);
    ComputerBuilder setGraphicsCard(String graphicsCard);
    Computer build();//Build and return the computer
}
