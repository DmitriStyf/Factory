package design_pattern.factory.factoryHomeWork;

public class ColorFactory {

    public Color getColor(String colorType){
        if (colorType == null){

        }
        if (colorType.equalsIgnoreCase("RED")){
            return new Red();
        }else if (colorType.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}
