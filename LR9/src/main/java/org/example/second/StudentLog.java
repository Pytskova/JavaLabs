package org.example.second;
import java.util.Iterator;
import java.util.List;


public class StudentLog {

    public static void removeAndPromote(List<Student> students) {
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            double avg = s.average();
            if (avg < 3.0) {
                it.remove();
            } else {
                s.promote();
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты " + course + "-го курса:");
        boolean found = false;
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println(" - " + s.getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println(" (нет)");
        }
    }
}
