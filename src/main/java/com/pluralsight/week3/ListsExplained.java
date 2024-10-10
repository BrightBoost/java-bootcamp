package com.pluralsight.week3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListsExplained {
    public static void main(String[] args) {
        String student1 = "Joezari";
        String student2 = "Nima";
        String student3 = "Osmig";
        String student4 = "Mordecai";

        // create 1 variable to hold all of the students
        String[] studentsArr = {"Joezari", "Nima", "Osmig", "Mordecai"};

        // lists give us more flexibility than arrays
        // built in Java type for storing multiple values
        List<String> studentList = new ArrayList<>();
        studentList.add("Joezari");
        studentList.add("Nima");
        studentList.add("Osmig");
        studentList.add("Mordecai");
        studentList.add("Fran");
        studentList.add("Remsey");

        System.out.println("There are " + studentList.size() + " students!");

        studentList.remove("Remsey");

        System.out.println(studentList.get(0));
        studentList.remove(0);
        System.out.println(studentList.get(0));

        List<String> gfg = new ArrayList<>(List.of("Geeks", "for", "Geeks"));

        Collections.sort(studentList);
        System.out.println(studentList);

    }
}
