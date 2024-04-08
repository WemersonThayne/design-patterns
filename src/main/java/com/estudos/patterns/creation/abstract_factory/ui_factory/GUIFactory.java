package com.estudos.patterns.creation.abstract_factory.ui_factory;

import com.estudos.patterns.creation.abstract_factory.ui_factory.domain.Button;
import com.estudos.patterns.creation.abstract_factory.ui_factory.domain.Checkbox;

public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();

}
