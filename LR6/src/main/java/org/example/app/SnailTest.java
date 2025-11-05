package org.example.app;

import org.example.domain.Snail;

public class SnailTest {
    public static void main(String[] args) {
        Snail s1 = new Snail("Лу", 0.02, "мятно-белая");

        System.out.println(s1.getInfo());
        System.out.println(s1.crawl(12.5));

        System.out.println("\nПосле переименования:");
        s1.setName("Луни");


        System.out.println(s1.rest());
        System.out.println(s1.getInfo());



    }
}
