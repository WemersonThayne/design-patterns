package com.estudos.patterns.creation.abstract_factory.furniture.coffe_table;

public abstract class CoffeTable {

    int numberOfLeg;

    public int getNumberOfLeg() {
        return numberOfLeg;
    }

    public void setNumberOfLeg(int numberOfLeg) {
        this.numberOfLeg = numberOfLeg;
    }

    public abstract void showType();
}
