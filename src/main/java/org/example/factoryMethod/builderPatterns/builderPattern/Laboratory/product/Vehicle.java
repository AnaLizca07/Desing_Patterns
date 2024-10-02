package org.example.factoryMethod.builderPatterns.builderPattern.Laboratory.product;

public class Vehicle {
    private final String type;
    private final int wheels;
    private final String color;
    private final String model;

    public Vehicle(String type, int wheels, String color, String model) {
        this.type = type;
        this.wheels = wheels;
        this.color = color;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", wheels=" + wheels +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
