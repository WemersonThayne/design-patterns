package com.estudos.patterns.creation.builder.domain;

import com.estudos.patterns.creation.builder.domain.components.Engine;
import com.estudos.patterns.creation.builder.domain.components.GPSNavigator;
import com.estudos.patterns.creation.builder.domain.components.Transmission;
import com.estudos.patterns.creation.builder.domain.components.TripComputer;

public class Car {

    private final int seats;
    private final Transmission transmission;
    private final GPSNavigator gpsNavigator;
    private final TripComputer tripComputer;
    private Type type;
    private Engine engine;
    private double fuel = 0;


    public Car(int seats, Transmission transmission, GPSNavigator gpsNavigator, TripComputer tripComputer, Type type, Engine engine) {
        this.seats = seats;
        this.transmission = transmission;
        this.gpsNavigator = gpsNavigator;
        this.type = type;
        this.engine = engine;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
    }

    public int getSeats() {
        return seats;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", transmission=" + transmission +
                ", gpsNavigator=" + gpsNavigator +
                ", tripComputer=" + tripComputer +
                ", type=" + type +
                ", engine=" + engine +
                ", fuel=" + fuel +
                '}';
    }
}
