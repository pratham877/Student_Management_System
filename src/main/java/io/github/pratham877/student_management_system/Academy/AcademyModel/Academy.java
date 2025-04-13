package io.github.pratham877.student_management_system.Academy.AcademyModel;



import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;


@Table(name="Academy")
public class Academy {
    @Id
    private String department;
    @Column(nullable = false)
    private String course;
    @Column(nullable = false)
    private int year;
    @Column(nullable = false)
    private float marks;
    @Column(nullable = false)
    private List<String> enrolledSubjects;

    public Academy() {
    }

    public Academy(String department, String course, int year, float marks, List<String> enrolledSubjects) {
        this.department = department;
        this.course = course;
        this.year = year;
        this.marks = marks;
        this.enrolledSubjects = enrolledSubjects;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public List<String> getEnrolledSubjects() {
        return enrolledSubjects;
    }

    public void setEnrolledSubjects(List<String> enrolledSubjects) {
        this.enrolledSubjects = enrolledSubjects;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Academy academy = (Academy) o;
        return year == academy.year && Float.compare(marks, academy.marks) == 0 && Objects.equals(department, academy.department) && Objects.equals(course, academy.course) && Objects.equals(enrolledSubjects, academy.enrolledSubjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(department, course, year, marks, enrolledSubjects);
    }

    @Override
    public String toString() {
        return "Academy{" +
                "department='" + department + '\'' +
                ", course='" + course + '\'' +
                ", year=" + year +
                ", marks=" + marks +
                ", enrolledSubjects=" + enrolledSubjects +
                '}';
    }
}