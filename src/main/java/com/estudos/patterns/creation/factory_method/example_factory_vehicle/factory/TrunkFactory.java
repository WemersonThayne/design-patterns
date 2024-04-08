package com.estudos.patterns.creation.factory_method.example_factory_vehicle.factory;

import com.estudos.patterns.creation.factory_method.example_factory_vehicle.domain.Truck;
import com.estudos.patterns.creation.factory_method.example_factory_vehicle.domain.Vehicle;

public class TrunkFactory implements VehicleFactory {

    @Override
    public Vehicle create() {
        return new Truck();
    }
    
}
