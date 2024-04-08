package com.estudos.patterns.creation.abstract_factory.furniture;

public class AbstractFactoryTest {

    public static void main(String[] args) {

        ConcreteArtDecoFactory concreteArtDecoFactory = new ConcreteArtDecoFactory();
        ConcreteModernFactory concreteModernFactory = new ConcreteModernFactory();
        ConcreteVictorianFactory concreteVictorianFactory = new ConcreteVictorianFactory();

        System.out.println("Art Deco produtos");
        concreteArtDecoFactory.createChair().showType();
        concreteArtDecoFactory.createSofa().showType();
        concreteArtDecoFactory.createCoffeTable().showType();

        System.out.println("\n\n\n");
        System.out.println("Modern produtos");
        concreteModernFactory.createChair().showType();
        concreteModernFactory.createSofa().showType();
        concreteModernFactory.createCoffeTable().showType();

        System.out.println("\n\n\n");
        System.out.println("Victorian produtos");
        concreteVictorianFactory.createChair().showType();
        concreteVictorianFactory.createSofa().showType();
        concreteVictorianFactory.createCoffeTable().showType();

    }
}
