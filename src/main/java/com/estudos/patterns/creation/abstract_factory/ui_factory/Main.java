package com.estudos.patterns.creation.abstract_factory.ui_factory;

public class Main {

    public static void main(String[] args) {

        Application appWindows = new Application(new WindowsFactory());
        appWindows.createUI();
        appWindows.paints();

        Application appIos = new Application(new MacFactory());
        appIos.createUI();
        appIos.paints();


    }
}
