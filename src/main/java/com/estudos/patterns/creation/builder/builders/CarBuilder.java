package com.estudos.patterns.creation.builder.builders;

import com.estudos.patterns.creation.builder.domain.Car;
import com.estudos.patterns.creation.builder.domain.Type;
import com.estudos.patterns.creation.builder.domain.components.Engine;
import com.estudos.patterns.creation.builder.domain.components.GPSNavigator;
import com.estudos.patterns.creation.builder.domain.components.Transmission;
import com.estudos.patterns.creation.builder.domain.components.TripComputer;

public class CarBuilder implements Builder {
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getCar() {
        return new Car(this.seats, this.transmission, this.gpsNavigator, this.tripComputer, this.type, this.engine);
    }
}
