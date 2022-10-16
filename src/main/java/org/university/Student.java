package org.university;

import java.util.ArrayList;
import org.joda.time.*;
public class Student {
    private String Name;
    private int Age;
    private DateTime DOB;
    private final long ID;
    private String username;
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<Module> modules = new ArrayList<>();



    public Student(String name, int age, DateTime DOB, long ID){
        this.Name = name;
        this.Age = age;
        this.ID = ID;
        this.DOB = DOB;
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public DateTime getDOB() {
        return DOB;
    }

    public void setDOB(DateTime DOB) {
        this.DOB = DOB;
    }

    public long getID() {
        return ID;
    }

    public String getUsername(){
        this.username = this.Name+this.Age;
        return username;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
    public void addCourse(Course course){this.courses.add(course);}
    public ArrayList<Module> getModules() {
        return modules;
    }
    public void addModule(Module module){this.modules.add(module);}

    @Override
    public String toString() {
        String ret_courses = "";
        String ret_modules = "";
        for (Course course: courses){
            ret_courses += course.rep(); //TODO replace with rep()
        }
        for (Module module: modules){
            ret_modules += module.rep();
        }
        String ret = "\n";
        ret += String.format("Student name: %s \n", this.Name);
        ret += String.format("Student age: %d \n", this.Age);
        ret += String.format("Student DOB: %s \n", this.DOB);
        ret += String.format("Student ID: %d \n", this.ID);
        ret += String.format("Student Username: %s \n", getUsername());
        ret += String.format("Student Courses: %s \n", ret_courses);
        ret += String.format("Student Modules: %s \n", ret_modules);

        return ret;
    }

    //function to return string representation of student from different classes to prevent StackOverflowError
    public String rep(){
        String ret = "";
        ret += String.format("\n\tStudent name: %s \n", this.Name);
        ret += String.format("\tStudent age: %d \n", this.Age);
        ret += String.format("\tStudent DOB: %s \n", this.DOB);
        ret += String.format("\tStudent ID: %d \n", this.ID);
        ret += String.format("\tStudent Username: %s \n", getUsername());
        return ret;
    }
}
