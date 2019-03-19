package design_pattern;

public class  StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello").append(" Dmitri").append(" Roma").append(" Mahdad");
        System.out.println(stringBuilder);
    }
}
