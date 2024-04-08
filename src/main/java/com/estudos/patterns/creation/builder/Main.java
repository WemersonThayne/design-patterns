package com.estudos.patterns.creation.builder;

import com.estudos.patterns.creation.builder.builders.CarBuilder;
import com.estudos.patterns.creation.builder.builders.ManualBuilder;
import com.estudos.patterns.creation.builder.directors.Director;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();

        director.constructCityCar(carBuilder);
        System.out.println(carBuilder.getCar());

        director.constructSUV(carBuilder);
        System.out.println(carBuilder.getCar());

        ManualBuilder manualBuilder = new ManualBuilder();
        director.constructSportsCar(manualBuilder);
        System.out.println(manualBuilder.getManual().print());
    }
}
