package design_pattern.factory;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FacrotyProducer.getFactory("SHAPE");

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        AbstractFactory colorFactory = FacrotyProducer.getFactory("COLOR");
        Color color1 = colorFactory.getColor("RED");
        color1.fill();

        Color color2 = colorFactory.getColor("BLUE");
        color2.fill();
    }
}
