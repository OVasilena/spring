package de.telran.shape.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Picture extends Shape {
    private final List<Shape> shapes;
    private Line border;
    private final char BORDER_SYMBOL = '-';
    private final int BORDER_LENGTH = 20;

    public Picture(char s, Collection<Shape> shapes) {
        super(s);
        this.shapes = new ArrayList<Shape>(shapes);
        border = new Line(BORDER_SYMBOL, BORDER_LENGTH);
    }

    @Override
    public void draw() {
        border.draw();
        for (Shape s: shapes) {
            s.draw();
        }
        border.draw();
    }
}
