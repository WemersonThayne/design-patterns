package com.estudos.patterns.creation.factory_method.example_factory_vehicle;

import com.estudos.patterns.creation.factory_method.example_factory_vehicle.domain.Vehicle;
import com.estudos.patterns.creation.factory_method.example_factory_vehicle.factory.CarFactory;
import com.estudos.patterns.creation.factory_method.example_factory_vehicle.factory.TrunkFactory;

public class Main {

    public static void main(String[] args) {

        CarFactory carFactory = new CarFactory();
        Vehicle myCar = carFactory.create();
        myCar.turnOn();
        myCar.speedUp();
        myCar.brake();
        myCar.turnOff();

        TrunkFactory trunkFactory = new TrunkFactory();
        Vehicle myTrunk = trunkFactory.create();
        myTrunk.turnOn();
        myTrunk.speedUp();
        myTrunk.brake();
        myTrunk.turnOff();

    }
}
