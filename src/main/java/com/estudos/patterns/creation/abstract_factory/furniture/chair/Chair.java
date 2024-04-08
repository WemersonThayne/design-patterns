package com.estudos.patterns.creation.abstract_factory.furniture.chair;

public abstract class Chair {

    private boolean hasLegs;
    private boolean sitOn;

    public boolean isHasLegs() {
        return hasLegs;
    }

    public void setHasLegs(boolean hasLegs) {
        this.hasLegs = hasLegs;
    }

    public abstract void showType();
}
