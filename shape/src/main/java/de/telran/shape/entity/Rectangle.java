package de.telran.shape.entity;

public class Rectangle extends Shape {
    private final int width;
    private final int height;

    public Rectangle(char s, int w, int h) {
        super(s);
        width = w;
        height = h;
    }

    @Override
    public void draw() {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                buffer.append(symbol);
            }
            buffer.append(System.lineSeparator());
        }
        System.out.print(buffer);
    }
}