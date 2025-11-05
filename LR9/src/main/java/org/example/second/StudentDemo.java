package org.example.second;

import java.util.ArrayList;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> group = new ArrayList<>();
        group.add(new Student("Алина",  "П-21", 1, List.of(5, 4, 3)));
        group.add(new Student("Борис",  "П-21", 1, List.of(2, 2, 3)));
        group.add(new Student("Вика",   "П-22", 2, List.of(3, 3, 3)));
        group.add(new Student("Глеб",   "П-22", 2, List.of(4, 5, 5)));
        group.add(new Student("Дана",   "П-23", 3, List.of()));

        System.out.println("До обработки:");
        for (Student s : group) System.out.println(" * " + s);

        StudentLog.removeAndPromote(group);

        System.out.println("\nПосле обработки:");
        for (Student s : group) System.out.println(" * " + s);

        System.out.println();
        StudentLog.printStudents(group, 2);
        StudentLog.printStudents(group, 3);
    }
}
