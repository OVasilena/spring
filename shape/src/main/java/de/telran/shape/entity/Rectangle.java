package de.telran.shape.entity;

public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(char s, int w, int h) {
        symbol = s;
        width = w;
        height = h;
    }

    @Override
    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}