package com.pluralsight.week7.lambdaexpressions.streams.compareExercise;

public class Course implements Comparable<Course>{
    private String title;
    private int studyPoints;
    private int maxNrOfStudents;

    public Course(String title, int studyPoints, int maxNrOfStudents) {
        this.title = title;
        this.studyPoints = studyPoints;
        this.maxNrOfStudents = maxNrOfStudents;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStudyPoints() {
        return studyPoints;
    }

    public void setStudyPoints(int studyPoints) {
        this.studyPoints = studyPoints;
    }

    public int getMaxNrOfStudents() {
        return maxNrOfStudents;
    }

    public void setMaxNrOfStudents(int maxNrOfStudents) {
        this.maxNrOfStudents = maxNrOfStudents;
    }

    @Override
    public int compareTo(Course o) {
        return this.title.compareTo(o.getTitle());
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", studyPoints=" + studyPoints +
                ", maxNrOfStudents=" + maxNrOfStudents +
                '}';
    }
}
