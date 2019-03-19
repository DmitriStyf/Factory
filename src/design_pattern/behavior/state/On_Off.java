package design_pattern.behavior.state;

public class On_Off {

    boolean onOff;

    public void doSomething() {
        if (onOff) {
            onOff = false;
            System.out.println("TV OFF");
        } else {
            onOff = true;
            System.out.println("TV ON");
        }
    }
}