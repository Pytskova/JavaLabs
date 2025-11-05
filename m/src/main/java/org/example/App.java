package org.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, Olga!");

        Tester t1 = new Tester();
        Tester t2 = new Tester("Ольга", "Пытькова");

        t2.showInfo();
        System.out.println();
        t2.work();
        t2.work(8);
        t2.work("Maven");

        Tester.printCompanyInfo();
    }
}
