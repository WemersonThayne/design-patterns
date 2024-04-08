package com.estudos.patterns.creation.abstract_factory.ui_factory.domain.windows;

import com.estudos.patterns.creation.abstract_factory.ui_factory.domain.Button;

public class WindowsButton extends Button {
    @Override
    public void paint() {
        System.out.println("Windows button interface");
    }
}
