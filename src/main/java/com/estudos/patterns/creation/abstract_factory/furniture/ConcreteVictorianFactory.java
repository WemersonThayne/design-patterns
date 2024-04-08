package com.estudos.patterns.creation.abstract_factory.furniture;

import com.estudos.patterns.creation.abstract_factory.furniture.chair.Chair;
import com.estudos.patterns.creation.abstract_factory.furniture.chair.VictorianChair;
import com.estudos.patterns.creation.abstract_factory.furniture.coffe_table.CoffeTable;
import com.estudos.patterns.creation.abstract_factory.furniture.coffe_table.VictorianCoffeTable;
import com.estudos.patterns.creation.abstract_factory.furniture.sofa.Sofa;
import com.estudos.patterns.creation.abstract_factory.furniture.sofa.VictorianSofa;

public class ConcreteVictorianFactory implements AbstractFactory {

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public CoffeTable createCoffeTable() {
        return new VictorianCoffeTable();
    }
}
