package com.estudos.patterns.structures.composite;


import com.estudos.patterns.structures.composite.editor.ImageEditor;
import com.estudos.patterns.structures.composite.shapes.Circle;
import com.estudos.patterns.structures.composite.shapes.CompoundShape;
import com.estudos.patterns.structures.composite.shapes.Dot;
import com.estudos.patterns.structures.composite.shapes.Rectangle;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }

}
