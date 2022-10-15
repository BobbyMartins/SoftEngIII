package org.university;
import java.util.ArrayList;

public class Lecturer {
    private String name;
    private int age;
    private final long ID;
    private String username;
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<Module> modules = new ArrayList<>();


    public Lecturer(String name, int age, long ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public long getID() { return ID; }

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

    public void addCourse(Course course){this.courses.add(course); }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
        for (Module module : modules){
            module.setLecturer(this);
        }
    }

    public void addModules(Module module){
        this.modules.add(module);
        module.setLecturer(this);
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
