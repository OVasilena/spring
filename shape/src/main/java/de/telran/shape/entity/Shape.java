package de.telran.shape.entity;

public abstract class Shape {
    protected char symbol;

    Shape(char s) {
        symbol = s;
    }

    public abstract void draw();
}

