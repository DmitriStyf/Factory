package design_pattern.behavior.template_Method;

public class Basketball extends Game {
    @Override
    void initialize() {
        System.out.println("Basketball: Game initialized");
    }

    @Override
    void startPlay() {
        System.out.println("Basketball: Game startt");
    }

    @Override
    void finish() {
        System.out.println("Basketball: Game finished");
    }

}
