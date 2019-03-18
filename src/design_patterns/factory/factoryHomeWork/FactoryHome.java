package design_patterns.factory.factoryHomeWork;

public class FactoryHome {

    public static void main(String[] args) {
        ColorFactory colorFactory = new ColorFactory();

        Color color1 = colorFactory.getColor("RED");
        color1.draw();

        Color shape2 = colorFactory.getColor("BLUE");
        shape2.draw();
    }
}
