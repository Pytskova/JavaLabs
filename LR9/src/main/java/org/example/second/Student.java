package org.example.second;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
    private final String name;
    private final String group;
    private int course;
    private final List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new ArrayList<>(grades == null ? List.of() : grades);
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public List<Integer> getGrades() {
        return Collections.unmodifiableList(grades);
    }

    public void promote() {
        this.course += 1;
    }

    public double average() {
        if (grades.isEmpty()) return 0.0;
        int sum = 0;
        for (int g : grades) sum += g;
        return sum * 1.0 / grades.size();
    }

    @Override
    public String toString() {
        return "%s, гр.%s, %d курс, ср.балл=%.2f".formatted(name, group, course, average());
    }
}
