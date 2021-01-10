package de.telran.shape;

import de.telran.shape.entity.*;
import de.telran.shape.entity.Picture;
import de.telran.shape.entity.Shape;
import de.telran.shape.service.ShapeService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
class ShapeFlow implements ApplicationRunner {

    List<Shape> listShape;
    ShapeService shapeService;
    final Picture picture;

    public ShapeFlow(Picture picture) {
        //listShape = shapes;
        //shapeService = service;
        this.picture = picture;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //shapeService.printShapes(listShape);
        picture.draw();
    }
}