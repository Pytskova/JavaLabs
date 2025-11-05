package org.example.third;

public class HourlyEmployee extends Employee {
    private final double hourlyRate;

    public HourlyEmployee(int id, String fullName, double hourlyRate) {
        super(id, fullName);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double averageMonthlySalary() {
        return 20.8 * 8 * hourlyRate;
    }
}
