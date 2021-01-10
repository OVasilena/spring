package de.telran.shape.entity;

public class Line extends Shape{
    int length;

    public Line(char s, int l) {
        symbol = s;
        length = l;
    }

    @Override
    public void draw() {
        int i = 0;
        do {
            System.out.print(symbol);
            i++;
        } while (i<length);
        System.out.println();
    }
}
