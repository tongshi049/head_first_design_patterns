package com.example.designpatterns.factory;

public class ShapeFactoryDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();

        Shape square = shapeFactory.getShape("Square");
        square.draw();

        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();
    }
}
