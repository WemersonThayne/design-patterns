package com.estudos.patterns.creation.factory_method.example_factory_vehicle.domain;

public class Truck implements Vehicle {

    @Override
    public void turnOn() {
        System.out.println("Truck turnOn...");
        System.out.println("wait a few minutes before you can drive.");
    }

    @Override
    public void turnOff() {
        System.out.println("Truck turnOff...");
    }

    @Override
    public void speedUp() {
        System.out.println("Truck accelerating...");
    }

    @Override
    public void brake() {
        System.out.println("Truck braking...");
    }
}