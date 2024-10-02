package org.example.factoryMethod.builderPatterns.builderPattern.Laboratory.builder;

import org.example.factoryMethod.builderPatterns.builderPattern.Laboratory.product.Vehicle;

public interface VehicleBuilder {
    VehicleBuilder setType(String type);
    VehicleBuilder setWheels(int wheels);
    VehicleBuilder setColor(String color);
    VehicleBuilder setModel(String model);
   Vehicle build();
}
