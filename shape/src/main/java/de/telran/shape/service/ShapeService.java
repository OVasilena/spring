package de.telran.shape.service;

import de.telran.shape.entity.Shape;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShapeService {
    public void printShapes (List<Shape> shapes) {
        for (Shape s: shapes) {
            printShape(s);
        }
    }

    public void printShape(Shape shape) {
        shape.draw();
    }

}
