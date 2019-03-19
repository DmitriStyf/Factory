package design_pattern.behavior.template_Method;

public class Tennis extends Game {
    @Override
    void initialize() {
        System.out.println("Tennis: Game initialized");
    }

    @Override
    void startPlay() {
        System.out.println("Tennis: Game startt");
    }

    @Override
    void finish() {
        System.out.println("Tennis: Game finished");
    }

}
