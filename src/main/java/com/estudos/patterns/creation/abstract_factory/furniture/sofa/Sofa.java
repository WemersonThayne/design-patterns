package com.estudos.patterns.creation.abstract_factory.furniture.sofa;

public abstract class Sofa {

    int numberOfAccents;

    public int getNumberOfAccents() {
        return numberOfAccents;
    }

    public void setNumberOfAccents(int numberOfAccents) {
        this.numberOfAccents = numberOfAccents;
    }

    public abstract void showType();
}
