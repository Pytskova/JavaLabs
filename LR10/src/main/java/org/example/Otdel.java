package org.example;

public class Otdel {
    private String name;
    private int employeesCount;

    public Otdel(String name, int employeesCount) {
        setName(name);
        setEmployeesCount(employeesCount);
    }

    public String getName() { return name; }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Название отдела не может быть пустым");
        }
        this.name = name.trim();
    }

    public int getEmployeesCount() { return employeesCount; }

    public void setEmployeesCount(int employeesCount) {
        if (employeesCount < 0) {
            throw new IllegalArgumentException("Количество сотрудников не может быть отрицательным");
        }
        this.employeesCount = employeesCount;
    }
}
