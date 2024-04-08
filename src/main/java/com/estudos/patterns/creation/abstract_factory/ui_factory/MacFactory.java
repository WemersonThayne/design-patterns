package com.estudos.patterns.creation.abstract_factory.ui_factory;

import com.estudos.patterns.creation.abstract_factory.ui_factory.domain.Button;
import com.estudos.patterns.creation.abstract_factory.ui_factory.domain.Checkbox;
import com.estudos.patterns.creation.abstract_factory.ui_factory.domain.mac.MacButton;
import com.estudos.patterns.creation.abstract_factory.ui_factory.domain.mac.MacCheckbox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
