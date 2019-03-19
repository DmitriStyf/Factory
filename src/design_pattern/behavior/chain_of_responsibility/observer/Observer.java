package design_pattern.behavior.chain_of_responsibility.observer;

public interface
Observer {

    void update();

    void setSubject(Subject sub);
}
