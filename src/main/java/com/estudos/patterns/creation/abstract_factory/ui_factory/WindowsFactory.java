package com.estudos.patterns.creation.abstract_factory.ui_factory;

import com.estudos.patterns.creation.abstract_factory.ui_factory.domain.Button;
import com.estudos.patterns.creation.abstract_factory.ui_factory.domain.Checkbox;
import com.estudos.patterns.creation.abstract_factory.ui_factory.domain.windows.WindowsButton;
import com.estudos.patterns.creation.abstract_factory.ui_factory.domain.windows.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
