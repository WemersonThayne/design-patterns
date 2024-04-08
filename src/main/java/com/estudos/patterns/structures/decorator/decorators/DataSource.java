package com.estudos.patterns.structures.decorator.decorators;

public interface DataSource {
    void writeData(String data);

    String readData();

}
