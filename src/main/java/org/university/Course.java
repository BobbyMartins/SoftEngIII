package org.university;
import org.joda.time.DateTime;
import java.util.ArrayList;

public class Course {
    private String code;
    private ArrayList<Student> students = new ArrayList<>();
    private DateTime start_date;
    private DateTime end_date;
    private ArrayList<Module> modules = new ArrayList<>();

    public Course(String name, DateTime start_date, DateTime end_date){
        this.code = name;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public String getName() {
        return code;
    }

    public void setName(String code) {
        this.code = code;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){
        this.students.add(student);
        student.addCourse(this);
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
        return "Course { \n" +
                "   name='" + code + '\n' +
                "   students=" + students + '\n' +
                "   start_date=" + start_date + '\n' +
                "   end_date=" + end_date + '\n' +
                '}' + '\n';
    }
}
