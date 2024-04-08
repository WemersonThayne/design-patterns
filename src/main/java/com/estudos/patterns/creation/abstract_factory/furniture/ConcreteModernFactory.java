package com.estudos.patterns.creation.abstract_factory.furniture;

import com.estudos.patterns.creation.abstract_factory.furniture.chair.Chair;
import com.estudos.patterns.creation.abstract_factory.furniture.chair.ModernChair;
import com.estudos.patterns.creation.abstract_factory.furniture.coffe_table.CoffeTable;
import com.estudos.patterns.creation.abstract_factory.furniture.coffe_table.ModernCoffeTable;
import com.estudos.patterns.creation.abstract_factory.furniture.sofa.ModernSofa;
import com.estudos.patterns.creation.abstract_factory.furniture.sofa.Sofa;

public class ConcreteModernFactory implements AbstractFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeTable createCoffeTable() {
        return new ModernCoffeTable();
    }
}
