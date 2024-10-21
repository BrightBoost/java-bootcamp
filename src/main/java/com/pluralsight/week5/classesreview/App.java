package com.pluralsight.week5.classesreview;

import java.time.LocalDate;
import java.util.List;

public class App {
    public static void main(String[] args) {
        int x = 5;
        Student student1 = new Student(1, "Shawn", List.of(99.0), LocalDate.of(1996, 1, 1));
        Student student2 = new Student(2, "Cesar", List.of(79.0), LocalDate.of(1954, 1, 1));
        Student student3 = new Student(3, "Akbar", List.of(55.0), LocalDate.of(2019, 1, 2));

        System.out.println(student1);
        System.out.println(student2.getName());
        System.out.println(student3.getAvgGrade());
        System.out.println(student1.getDob());
    }
}
