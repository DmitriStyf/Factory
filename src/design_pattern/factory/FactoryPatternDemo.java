package design_pattern.factory;

import design_pattern.factory.factoryHomeWork.Color;
import design_pattern.factory.factoryHomeWork.ColorFactory;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        ColorFactory colorFactory = new ColorFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Color color1 = colorFactory.getColor("RED");
        color1.draw();

        Color color2 = colorFactory.getColor("BLUE");
        color2.draw();

    }
}
