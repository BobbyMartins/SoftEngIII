import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.university.Lecturer;
import org.university.Module;
import org.university.Student;

import java.util.ArrayList;

public class testClass {
    String name = "Bobby";
    int age = 23;
    String username = name+age;
    Student testStudent = new Student(name, age, DateTime.parse("2002-02-28"), 12345);

    @Test
    public void testGet_Username_Student(){
        assertEquals(username, testStudent.getUsername());
    }

    String lecName = "Michael";
    int age2 = 46;
    String username2 = lecName+age2;
    Lecturer testLecturer = new Lecturer(lecName, age2, 456788);
    @Test
    public void testGet_Username_Lecturer(){
        assertEquals(username2, testLecturer.getUsername());
    }

    // TODO
}
