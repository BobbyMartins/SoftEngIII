import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.university.Course;
import org.university.Lecturer;
import org.university.Module;
import org.university.Student;

import java.util.ArrayList;


public class testClass {
    String name = "Bobby";
    int age = 23;
    String username = name+age;
    Student testStudent = new Student(name, age, DateTime.parse("2002-02-28"), 1234);
    Module testModule = new Module("Mathematics", "CT456");
    Module testModule2 = new Module("Database Systems", "CT6732");
    Course testCourse = new Course("GY350", DateTime.parse("2021-09-01"), DateTime.parse("2024-10-01"));

    @Test
    public void testStudent(){
        testStudent.addModule(testModule);
        testStudent.addCourse(testCourse);
        assertEquals(username, testStudent.getUsername());
        assertEquals(testModule, testStudent.getModules().get(0));
        assertEquals(testCourse, testStudent.getCourses().get(0));
    }

    String lecName = "Michael";
    int age2 = 46;
    String username2 = lecName+age2;
    Lecturer testLecturer = new Lecturer(lecName, age2, 123445);
    @Test
    public void testLecturer(){
        ArrayList<Module> modList = new ArrayList<>();
        modList.add(testModule);
        modList.add(testModule2);
        assertEquals(username2, testLecturer.getUsername());
        testLecturer.setModules(modList);
        assertEquals(modList, testLecturer.getModules());
        assertEquals(modList.get(0).getLecturer(), testLecturer);
    }

    @Test
    public void testModule(){
        Student testStudent2 = new Student("Jackson Smith", 21, DateTime.parse("2003-07-21"), 23454);
        System.out.println(testStudent2.getID());
        ArrayList<Student> students = new ArrayList<>();
        students.add(testStudent);
        students.add(testStudent2);
        testModule.setStudents(students);
        for(Student student : students){
            assertEquals(student.getModules().get(0), testModule);
        }
    }

    @Test
    public void testCourse(){
        testCourse = new Course("DS232", DateTime.parse("2019-06-21"), DateTime.parse("2024-08-21"));
        testCourse.addStudent(testStudent);
        assert testStudent.getCourses().contains(testCourse);
    }



    // TODO add test for addStudent() method in student
}
