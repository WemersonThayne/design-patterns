package com.estudos.patterns.creation.factory_method.example_factory_vehicle.factory;

import com.estudos.patterns.creation.factory_method.example_factory_vehicle.domain.Car;
import com.estudos.patterns.creation.factory_method.example_factory_vehicle.domain.Vehicle;

public class CarFactory implements VehicleFactory {
    @Override
    public Vehicle create() {
        return new Car();
    }
}
