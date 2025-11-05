package org.example.third;

public abstract class Employee implements Comparable<Employee> {
    private final int id;
    private final String fullName;

    protected Employee(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public int getId() { return id; }
    public String getFullName() { return fullName; }

    public abstract double averageMonthlySalary();

    @Override
    public int compareTo(Employee other) {
        double a = this.averageMonthlySalary();
        double b = other.averageMonthlySalary();
        if (a != b) return (a < b) ? 1 : -1;
        return other.fullName.compareTo(this.fullName);
    }
}
