package org.university;

import java.util.ArrayList;
import org.joda.time.*;
public class Student {
    private String Name;
    private int Age;
    private DateTime DOB;
    private long ID;
    private String username;
    private ArrayList<Course> courses;
    private ArrayList<Module> modules;

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

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getUsername(){
        this.username = this.Name+this.Age;
        return username;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
}
