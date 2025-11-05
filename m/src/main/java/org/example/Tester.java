package org.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester() {
        this("Имя", "Фамилия", 0, "A1", 0.0);
    }

    public Tester(String name, String surname) {
        this(name, surname, 1, "A2", 500.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void showInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Опыт: " + experienceInYears + " года");
        System.out.println("Уровень английского: " + englishLevel);
        System.out.println("Зарплата: " + salary);
    }


    public void work() {
        System.out.println(name + " работает.");
    }

    public void work(int hours) {
        System.out.println(name + " работает " + hours + " часов.");
    }

    public void work(String project) {
        System.out.println(name + " работает над проектом: " + project);
    }

    public static void printCompanyInfo() {
        System.out.println("Компания: Вашей мечты");
    }
}
