package design_pattern.behavior.template_Method;

public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football: Game initialized");
    }

    @Override
    void startPlay() {
        System.out.println("Football: Game startt");
    }

    @Override
    void finish() {
        System.out.println("Football: Game finished");
    }

}
