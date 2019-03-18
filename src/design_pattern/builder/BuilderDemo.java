package design_pattern.builder;



public class BuilderDemo {

    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder(12)
                .cheese(true)
                .pepperoni(true)
                .build();
        System.out.println(pizza);

//        StringBuilder stringBuilder =  new StringBuilder();
//        stringBuilder.append("helloo").append("This").append("is").append("test");

        design_pattern.builder.Pizza pizza2 = new design_pattern.builder.Pizza.Builder(3)
                .cheese(true)
                .pepperoni(true)
                .bacon(true)
                .build();

//        System.out.println(pizza2);

    }
}