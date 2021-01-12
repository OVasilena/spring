package de.telran.shape.config;

import de.telran.shape.entity.Line;
import de.telran.shape.entity.Picture;
import de.telran.shape.entity.Rectangle;
import de.telran.shape.entity.Shape;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.*;

@Configuration
public class ShapeConfiguration {

    @Bean
    public Line lineConf() {
        return new Line('*', 15);
    }

    @Bean
    @Order(2)
    @Qualifier("shapes")
    public Line lineConf1() {
        return new Line('$', 25);
    }

    @Bean
    @Order(1)
    @Qualifier("shapes")
    public Rectangle rectConf() {
        return new Rectangle('+', 10,5);
    }

/*    @Bean
    public Picture pictureConf() {
        List<Shape> list = new ArrayList<>();
        list.add(lineConf());
        list.add(rectConf());
        return new Picture('-', list);
    }*/

    @Bean
    public Picture pictureConf1(List<Shape> shapes) {
        return new Picture('-', shapes);
    }


}
