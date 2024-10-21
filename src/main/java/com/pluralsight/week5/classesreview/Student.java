package com.pluralsight.week5.classesreview;

import java.time.LocalDate;
import java.util.List;

public class Student {
    // knowing / data
    private int id;
    private String name;
    private List<Double> grades;
    private LocalDate dob;
    private boolean lazy = true;

    public Student() {
    }

    public Student(int id, String name, List<Double> grades, LocalDate dob, boolean lazy) {
        this.id = id;
        this.name = name;
        this.grades = grades;
        this.dob = dob;
        this.lazy = lazy;
    }

    public Student(int id, String name, List<Double> grades, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.grades = grades;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public boolean isLazy() {
        return lazy;
    }

    public void setLazy(boolean lazy) {
        this.lazy = lazy;
    }

    // doing / action
    public void addGrade(double grade) {
        grades.add(grade);
    }

    // derived getter or calculated getter
    public double getAvgGrade() {
        double sum = 0;
        for(double grade: grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grades=" + grades +
                ", dob=" + dob +
                ", lazy=" + lazy +
                '}';
    }
}
