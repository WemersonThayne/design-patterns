package com.estudos.patterns.creation.abstract_factory.ui_factory.domain.mac;

import com.estudos.patterns.creation.abstract_factory.ui_factory.domain.Checkbox;

public class MacCheckbox extends Checkbox {
    @Override
    public void paint() {
        System.out.println("iOS Checkbox interface...");
    }
}
