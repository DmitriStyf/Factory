package design_patterns.factory;

public class ShapeFactory {

    public Shape getShape(String shapeType){
        if (shapeType == null){

        }
        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }
}
