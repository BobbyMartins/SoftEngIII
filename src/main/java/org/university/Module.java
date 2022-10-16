package org.university;

import java.util.ArrayList;

public class Module {
    private String code;
    private String name;
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Course> associated_courses = new ArrayList<>();
    private Lecturer lecturer;

    public Module(String name, String code){
        this.code = code;
        this.name = name;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
        for (Student student : students){
             if (!student.getModules().contains(this)){
                 student.addModule(this);
             }
        }
    }

    public void addStudents(Student student){
        this.students.add(student);
        if (!student.getModules().contains(this)){
            student.addModule(this);
        }
    }

    public ArrayList<Course> getAssociated_courses() {
        return associated_courses;
    }

    public void setAssociated_courses(ArrayList<Course> associated_courses) {
        this.associated_courses = associated_courses;
        for (Course course: associated_courses) {
            if (!course.getModules().contains(this)){
                course.addModules(this);
            }
        }
    }

    public void addCourse(Course course){
        this.associated_courses.add(course);
        if (!course.getModules().contains(this)){
            course.addModules(this);
        }
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    @Override
    public String toString() {
        String ret_students = "";
        String ret_courses = "";
        for (Student student : students){
            ret_students += student.rep();
        }
        for (Course course: associated_courses){
            ret_courses += course.rep();
        }
        return "Module{ \n" +
                "   code='" + code + '\n' +
                "   name='" + name + '\n' +
                "   students=" + ret_students + '\n' +
                "   associated_courses=" + ret_courses + '\n'+
                "   lecturer=" + lecturer.getName() + '\n' +
                '}' + '\n';
    }

    public String rep(){
        String ret_students = "";
        for (Student student : students){
            ret_students += "\t\t" + student.rep();
        }
        String ret = "";
        ret += String.format("\n\tModule name: %s \n", this.name);
        ret += String.format("\tModule ID: %s \n", this.code);
        ret += String.format("\tStudents in this module: %s \n", ret_students);
        ret += String.format("\tLecturer responsible for module: %s \n", lecturer.getName());
        return ret;
    }
}
