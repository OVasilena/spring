package de.telran.shape.entity;

import java.util.List;

public class Picture extends Shape {
    List<Shape> shapes;

    public Picture(char s, List<Shape> shapes) {
        this.shapes = shapes;
        symbol = s;
    }

    @Override
    public void draw() {
        Line line = new Line('-', 20);
        line.draw();
        for (Shape s: shapes) {
            s.draw();
        }
        line.draw();
    }
}
