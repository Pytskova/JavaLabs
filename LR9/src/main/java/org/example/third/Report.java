package org.example.third;

public class Report {

    public static void generateReport(SimpleEmployee[] staff) {
        System.out.println("Отчёт по зарплатам:");
        for (SimpleEmployee e : staff) {
            System.out.printf("%-15s %10.2f%n", e.getFullName(), e.getSalary());
        }
    }
}
