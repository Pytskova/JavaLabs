package com.example.domain;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


    public String getType() { return "Product"; }

    @Override public String toString() {
        return getType() + " ID" + id + " name \"" + name + "\" price=" + price;
    }
}
