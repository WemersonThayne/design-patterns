package com.estudos.patterns.creation.factory_method.example_factory_vehicle.domain;

public class Car implements Vehicle {
    @Override
    public void turnOn() {
        System.out.println("Car turnOn...");
    }

    @Override
    public void turnOff() {
        System.out.println("Car turnOn...");
    }

    @Override
    public void speedUp() {
        System.out.println("Car accelerating...");
    }

    @Override
    public void brake() {
        System.out.println("Truck braking...");
    }
}
