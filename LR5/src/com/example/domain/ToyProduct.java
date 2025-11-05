package com.example.domain;

public class ToyProduct extends Product {
    public ToyProduct(int id, String name, double price) {
        super(id, name, price);
    }
    @Override public String getType() { return "Toy"; }
}
