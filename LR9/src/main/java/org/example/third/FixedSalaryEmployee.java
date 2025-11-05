package org.example.third;

public class FixedSalaryEmployee extends Employee {
    private final double monthlySalary;

    public FixedSalaryEmployee(int id, String fullName, double monthlySalary) {
        super(id, fullName);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double averageMonthlySalary() { return monthlySalary; }
}
