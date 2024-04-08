package com.estudos.patterns.creation.abstract_factory.ui_factory.domain.mac;

import com.estudos.patterns.creation.abstract_factory.ui_factory.domain.Button;

public class MacButton extends Button {

    @Override
    public void paint() {
        System.out.println("iOS button interface....");
    }
}
