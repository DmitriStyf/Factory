package design_pattern.singlenton;

public class EnumDemo {
    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.INSTANCE;
        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());

        SingletonEnum singleton2 = SingletonEnum.INSTANCE;
        System.out.println(singleton2.getValue());
    }
}
