package org.university;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<Student> students;
    private DateTime start_date;
    private DateTime end_date;

    public Course(String name, DateTime start_date, DateTime end_date){
        this.name = name;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public DateTime getStart_date() {
        return start_date;
    }

    public void setStart_date(DateTime start_date) {
        this.start_date = start_date;
    }

    public DateTime getEnd_date() {
        return end_date;
    }

    public void setEnd_date(DateTime end_date) {
        this.end_date = end_date;
    }
}
