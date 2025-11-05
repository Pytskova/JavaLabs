package com.example;

import com.example.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.setEmpId(100);
        emp.setName("Pytkova Olga");
        emp.setSalary(120_345.27);
        emp.setSsn("012-34-5678");

        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee name: " + emp.getName());
        System.out.println("Employee Soc Sec numberё: " + emp.getSsn());
        System.out.println("Employee salary: " + emp.getSalary());

    }
}
