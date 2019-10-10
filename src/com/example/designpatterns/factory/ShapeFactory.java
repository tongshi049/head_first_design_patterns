package com.example.designpatterns.factory;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType == null) return null;
        else if (shapeType.equals("Circle"))
            return new Circle();
        else if (shapeType.equals("Square"))
            return new Square();
        else if (shapeType.equals("Rectangle"))
            return new Rectangle();
        else
            return null;
    }

}
