package com.estudos.patterns.creation.factory_method.example_factory_button.factory;

import com.estudos.patterns.creation.factory_method.example_factory_button.domain.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
