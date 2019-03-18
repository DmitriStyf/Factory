package design_pattern.builder.buildHomework;

import design_pattern.builder.Pizza;

public class Book {
    private int year;
    private String authorName;
    private String nameOfBook;


    public static class Builder {
        private final String authorName;

        private final String nameOfBook;

        private int year;

        @Override
        public String toString() {
            return "Builder{" +
                    "authorName='" + authorName + '\'' +
                    ", nameOfBook='" + nameOfBook + '\'' +
                    ", year=" + year +
                    '}';
        }

        public Builder(String authorName, String nameOfBook) {
            this.authorName = authorName;
            this.nameOfBook = nameOfBook;
        }

        public Builder year(int value) {
            year = value;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }

        private Book(Builder builder) {
            year = builder.year;
            authorName = builder.authorName;
            nameOfBook = builder.nameOfBook;
        }
    }