package com.pluralsight.week7.lambdaexpressions.streams.compareExercise;

import java.util.List;

public class CompareDemo {
    public static void main(String[] args) {
        Course c3 = new Course("Psychology", 6, 20);
        Course c1 = new Course("Java 101", 8, 25);
        Course c2 = new Course("Linear Algebra", 12, 15);
        Course c4 = new Course("World history", 9, 30);

        List<Course> courses = List.of(c1, c2, c3, c4);

        // print sorted by title name
        courses.stream()
                .sorted()
                .forEach(course -> System.out.println(course));

        // - name desc alphabetically
        // - max nr of students (low to high)
        // - nr of study points (high to low)
        // you can do this with three stream operations and three foreaches too
        courses.stream()
                .sorted((course1, course2) -> course2.getTitle().compareTo(course1.getTitle()))
                .peek(course -> System.out.println(course))
                .sorted((course1, course2) -> course1.getMaxNrOfStudents() - course2.getMaxNrOfStudents())
                .peek(course -> System.out.println(course))
                .sorted((course1, course2) -> course2.getStudyPoints() - course1.getStudyPoints())
                .forEach(course -> System.out.println(course));
    }
}
