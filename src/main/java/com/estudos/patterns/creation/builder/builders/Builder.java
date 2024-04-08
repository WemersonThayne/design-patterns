package com.estudos.patterns.creation.builder.builders;

import com.estudos.patterns.creation.builder.domain.Type;
import com.estudos.patterns.creation.builder.domain.components.Engine;
import com.estudos.patterns.creation.builder.domain.components.GPSNavigator;
import com.estudos.patterns.creation.builder.domain.components.Transmission;
import com.estudos.patterns.creation.builder.domain.components.TripComputer;

public interface Builder {
    void setType(Type type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);

}
