package com.example.domain;

public class FoodProduct extends Product {
    public int calories;
    public FoodProduct(int id, String name, double price, int calories) {
        super(id, name, price);
        this.calories = calories;
    }
    @Override
    public String getType() { return "Food"; }

    @Override
    public String toString() {
        return super.toString() + " calories=" + calories;
    }
}


