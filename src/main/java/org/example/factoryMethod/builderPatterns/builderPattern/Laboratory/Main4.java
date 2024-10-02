package org.example.factoryMethod.builderPatterns.builderPattern.Laboratory;

import org.example.factoryMethod.builderPatterns.builderPattern.Laboratory.builder.VehicleBuilder;
import org.example.factoryMethod.builderPatterns.builderPattern.Laboratory.concreteBuilder.ConcreteVehicleBuilder;
import org.example.factoryMethod.builderPatterns.builderPattern.Laboratory.director.VehicleDirector;
import org.example.factoryMethod.builderPatterns.builderPattern.Laboratory.product.Vehicle;

public class Main4 {
    public static void main(String[] args) {
        VehicleBuilder vehicleBuilder = new ConcreteVehicleBuilder();
        VehicleDirector vehicleDirector = new VehicleDirector(vehicleBuilder);

        Vehicle blackCar = vehicleDirector.simpleCar();
        System.out.println(blackCar);

        Vehicle redMotorcycle = vehicleDirector.simpleMotorcycle();
        System.out.println(redMotorcycle);

        Vehicle blueBike = vehicleDirector.bike();
        System.out.println(blueBike);
    }
}
