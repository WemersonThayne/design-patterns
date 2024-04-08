package com.estudos.patterns.creation.abstract_factory.ui_factory;

import com.estudos.patterns.creation.abstract_factory.ui_factory.domain.Button;
import com.estudos.patterns.creation.abstract_factory.ui_factory.domain.Checkbox;

public class Application {

    private GUIFactory factory;
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        this.button = this.factory.createButton();
        this.checkbox = this.factory.createCheckbox();
    }

    public void paints() {
        this.button.paint();
        this.checkbox.paint();
    }
}
