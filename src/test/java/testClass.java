import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.university.Student;

public class testClass {

    @Test
    public void testGet_Username(){
        String name = "Bobby";
        int age = 23;
        String username = name+age;
        Student testStudent = new Student(name, age, DateTime.parse("2002-02-28"), 12345);

        assertEquals(username, testStudent.getUsername());
    }
}
