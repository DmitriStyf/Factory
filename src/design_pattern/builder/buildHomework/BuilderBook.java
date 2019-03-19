package design_pattern.builder.buildHomework;

import design_pattern.builder.Pizza;

public class BuilderBook {

    public static void main(String[] args) {
        Book book = new Book.Builder("Dmitri", "BestBook")
                .year(2019).build();
        System.out.println(book);

    }

}
