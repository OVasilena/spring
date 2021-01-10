package de.telran.shape.config;

import de.telran.shape.entity.Line;
import de.telran.shape.entity.Picture;
import de.telran.shape.entity.Rectangle;
import de.telran.shape.entity.Shape;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
public class ShapeConfiguration {

    @Bean
    public Line lineConf() {
        return new Line('*', 5);
    }

    @Bean
    public Rectangle rectConf() {
        return new Rectangle('+', 5,3);
    }

    @Bean
    public Picture pictureConf() {
        List<Shape> list = new ArrayList<>();
        list.add(lineConf());
        list.add(rectConf());
        return new Picture('-', list);
    }


}
