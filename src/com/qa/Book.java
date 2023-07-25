package com.qa;

import java.util.Arrays;

public class Book {
    private String name;
    private String[] authors;
    private double prices;

    public Book(String name, String[] authors, double prices) {
        this.name = name;
        this.authors = authors;
        this.prices = prices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", prices=" + prices +
                '}';
    }

}




