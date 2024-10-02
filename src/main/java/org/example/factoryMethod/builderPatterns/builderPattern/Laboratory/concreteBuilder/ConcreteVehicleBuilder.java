package org.example.factoryMethod.builderPatterns.builderPattern.Laboratory.concreteBuilder;

import org.example.factoryMethod.builderPatterns.builderPattern.Laboratory.builder.VehicleBuilder;
import org.example.factoryMethod.builderPatterns.builderPattern.Laboratory.product.Vehicle;

public class ConcreteVehicleBuilder implements VehicleBuilder {
    private String type;
    private int wheels;
    private String color;
    private String model;
    @Override
    public VehicleBuilder setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public VehicleBuilder setWheels(int wheels) {
        this.wheels = wheels;
        return this;
    }

    @Override
    public VehicleBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public VehicleBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public Vehicle build() {
        return new Vehicle(type, wheels, color, model);
    }
}
