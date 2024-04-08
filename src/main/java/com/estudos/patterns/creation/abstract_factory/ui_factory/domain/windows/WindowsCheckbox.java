package com.estudos.patterns.creation.abstract_factory.ui_factory.domain.windows;

import com.estudos.patterns.creation.abstract_factory.ui_factory.domain.Checkbox;

public class WindowsCheckbox extends Checkbox {
    @Override
    public void paint() {
        System.out.println("Windows Checkbox interface...");
    }
}
