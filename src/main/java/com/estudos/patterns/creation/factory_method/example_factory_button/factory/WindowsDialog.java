package com.estudos.patterns.creation.factory_method.example_factory_button.factory;

import com.estudos.patterns.creation.factory_method.example_factory_button.domain.Button;
import com.estudos.patterns.creation.factory_method.example_factory_button.domain.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
