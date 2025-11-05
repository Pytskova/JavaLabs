package com.example.domain;

public class BookProduct extends Product {
    public BookProduct(int id, String name, double price) {
        super(id, name, price);
    }
    @Override public String getType() { return "Book"; }
}
