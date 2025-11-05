package com.example;

import com.example.domain.*;

public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new FoodProduct(1, "Coca-cola", 1.20, 12);
        Product p2 = new ToyProduct(2, "Rabbit", 19.90);
        Product p3 = new ShoesProduct(3, "Sneakers", 79.00);
        Product p4 = new BookProduct(4, "OOP", 25.00);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
