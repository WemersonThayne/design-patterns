package com.estudos.patterns.creation.abstract_factory.furniture;

import com.estudos.patterns.creation.abstract_factory.furniture.chair.ArtDecoChair;
import com.estudos.patterns.creation.abstract_factory.furniture.chair.Chair;
import com.estudos.patterns.creation.abstract_factory.furniture.coffe_table.ArtDecoCoffeTable;
import com.estudos.patterns.creation.abstract_factory.furniture.coffe_table.CoffeTable;
import com.estudos.patterns.creation.abstract_factory.furniture.sofa.ArtDecoSofa;
import com.estudos.patterns.creation.abstract_factory.furniture.sofa.Sofa;

public class ConcreteArtDecoFactory implements AbstractFactory {

    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public CoffeTable createCoffeTable() {
        return new ArtDecoCoffeTable();
    }
}
