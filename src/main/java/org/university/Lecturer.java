package org.university;
import java.util.ArrayList;

public class Lecturer {
    private String name;
    private int age;
    private int ID;
    private String username;
    private ArrayList<Course> courses;
    private ArrayList<Module> modules;

    public Lecturer(String name, int age, int ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsername() {
        this.username = this.name+this.age;
        return username;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course){
        this.courses.add(course);
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public void addModules(Module module){
        this.modules.add(module);
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\n' +
                "   age=" + age + '\n' +
                "   ID=" + ID + '\n' +
                "   username='" + username + '\n' +
                "   courses=" + courses + '\n' +
                "   modules=" + modules + '\n' +
                '}' + '\n';
    }
}
