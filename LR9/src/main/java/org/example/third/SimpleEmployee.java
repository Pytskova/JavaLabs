package org.example.third;

public class SimpleEmployee {
    private final String fullName;
    private final double salary;

    public SimpleEmployee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() { return fullName; }
    public double getSalary()   { return salary; }
}
