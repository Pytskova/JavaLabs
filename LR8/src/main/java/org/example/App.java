package org.example;

import org.plant.*;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Plant oak  = new Tree("Oak", 30.0, 1.5);
        Plant rose = new Flower("Rose", 10.0);

        List<Plant> garden = List.of(oak, rose);

        System.out.println("------ Before ------");
        garden.forEach(System.out::println);

        garden.forEach(p -> p.grow(40));

        System.out.println("\n------ After 40 days ------");
        garden.forEach(System.out::println);
    }
}