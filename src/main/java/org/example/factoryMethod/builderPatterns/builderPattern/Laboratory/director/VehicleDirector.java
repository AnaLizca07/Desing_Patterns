package org.example.factoryMethod.builderPatterns.builderPattern.Laboratory.director;

import org.example.factoryMethod.builderPatterns.builderPattern.Laboratory.builder.VehicleBuilder;
import org.example.factoryMethod.builderPatterns.builderPattern.Laboratory.product.Vehicle;

public class VehicleDirector {
    private VehicleBuilder builder;

    public VehicleDirector(VehicleBuilder builder) {
        this.builder = builder;
    }

    public Vehicle simpleCar() {
        return builder
                .setColor("Black")
                .setModel("Mino Cooper 2023")
                .setType("Car")
                .setWheels(4)
                .build();
    }

    public Vehicle simpleMotorcycle(){
        return builder
                .setColor("Red")
                .setModel("Gixxer 150")
                .setType("Motorcycle")
                .setWheels(2)
                .build();
    }

    public Vehicle bike(){
        return builder
                .setColor("Blue")
                .setModel("Trekking Bike")
                .setType("Bike")
                .setWheels(2)
                .build();
    }
}
