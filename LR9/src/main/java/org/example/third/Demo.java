package org.example.third;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<Employee> staff = new ArrayList<>();
        staff.add(new FixedSalaryEmployee(101, "Бурик Алина", 1800.00));
        staff.add(new HourlyEmployee(102, "Клоня Борис",9.50));
        staff.add(new FixedSalaryEmployee(103, "Веерник Вика", 1500.00));
        staff.add(new HourlyEmployee(104, "Орглан Глеб", 12.00));
        staff.add(new FixedSalaryEmployee(105, "Данина Дана", 1800.00));
        staff.add(new HourlyEmployee(106, "Денков Егор", 11.50));
        staff.add(new FixedSalaryEmployee(107, "Рунков Женя", 2100.00));
        staff.add(new HourlyEmployee(108, "Ахтец Зоя", 10.00));

        Collections.sort(staff);

        System.out.println("A) Полный список (после сортировки):");
        for (Employee e : staff) {
            System.out.printf("id=%d, %-12s, avg=%.2f%n",
                    e.getId(), e.getFullName(), e.averageMonthlySalary());
        }

        System.out.println("\nB) Первые 5 имён:");
        for (int i = 0; i < Math.min(5, staff.size()); i++) {
            System.out.println(" - " + staff.get(i).getFullName());
        }

        System.out.println("\nC) Последние 3 id:");
        int n = staff.size();
        for (int i = Math.max(0, n - 3); i < n; i++) {
            System.out.println(" - " + staff.get(i).getId());
        }

        System.out.println("\n— Форматированный отчёт (fullname ширина 15, salary справа, 2 знака) —");
        SimpleEmployee[] reportData = staff.stream()
                .map(e -> new SimpleEmployee(e.getFullName(), e.averageMonthlySalary()))
                .toArray(SimpleEmployee[]::new);

        Report.generateReport(reportData);
    }
}
