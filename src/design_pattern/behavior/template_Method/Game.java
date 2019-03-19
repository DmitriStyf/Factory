package design_pattern.behavior.template_Method;

public abstract class Game {

    abstract void initialize ();

    abstract void startPlay();

    abstract void finish();

    final void play(){
        initialize();

        startPlay();

        finish();
    }

}
