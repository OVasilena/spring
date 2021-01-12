package de.telran.shape.entity;

public class Line extends Shape {
    private int length;

    public Line(char s, int l) {
        super(s);
        length = l;
    }

    @Override
    public void draw() {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < length; i++) {
            buffer.append(symbol);
        }
        System.out.println(buffer);
    }
}
