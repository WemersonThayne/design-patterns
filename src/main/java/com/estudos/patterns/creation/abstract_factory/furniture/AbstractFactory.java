package com.estudos.patterns.creation.abstract_factory.furniture;

import com.estudos.patterns.creation.abstract_factory.furniture.chair.Chair;
import com.estudos.patterns.creation.abstract_factory.furniture.coffe_table.CoffeTable;
import com.estudos.patterns.creation.abstract_factory.furniture.sofa.Sofa;

public interface AbstractFactory {

    Chair createChair();

    Sofa createSofa();

    CoffeTable createCoffeTable();

}
