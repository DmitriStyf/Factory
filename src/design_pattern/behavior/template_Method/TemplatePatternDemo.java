package design_pattern.behavior.template_Method;

public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Basketball();
        game.play();

        Game football = new Football();
        football.play();

        Game tennis = new Tennis();
        tennis.play();

    }
}
