package org.example.factoryMethod.builderPatterns.builderPattern.Example.director;

import org.example.factoryMethod.builderPatterns.builderPattern.Example.builder.ComputerBuilder;
import org.example.factoryMethod.builderPatterns.builderPattern.Example.product.Computer;

public class ComputerDirector {
    private ComputerBuilder builder;
    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    public Computer constructGamingComputer(){
        return builder.setProcessor("Intel core i9")
                .setRam(32)
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA GeForce RTX 3080")
                .build();
    }

    public Computer constructOfficeComputer(){
        return builder.setProcessor("Intel core i3")
                .setRam(8)
                .setStorage("512GB SSD")
                .setGraphicsCard("Integrated Graphics")
                .build();
    }
}
