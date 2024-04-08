package com.estudos.patterns.creation.factory_method.example_factory_button;

import com.estudos.patterns.creation.factory_method.example_factory_button.factory.Dialog;
import com.estudos.patterns.creation.factory_method.example_factory_button.factory.HtmlDialog;
import com.estudos.patterns.creation.factory_method.example_factory_button.factory.WindowsDialog;

public class Main {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        dialog.renderWindow();

    }

    static void configure() {
        var osName = System.getProperty("os.name");
        if (osName.equalsIgnoreCase("Linux") || osName.equalsIgnoreCase("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

}
