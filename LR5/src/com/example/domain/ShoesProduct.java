package com.example.domain;

public class ShoesProduct extends Product {
    public ShoesProduct(int id, String name, double price) {
        super(id, name, price);
    }
    @Override public String getType() { return "Shoes"; }
}
