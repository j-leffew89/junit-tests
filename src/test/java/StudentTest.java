import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StudentTest {

    Student student;

    @Before
    public void setUp(){
        student = new Student(12, "Jesse");
        student.addGrade(70);
    }

    @Test
    public void testGetIDReturnsLong(){
        assertEquals(12, student.getId());
    }

    @Test
    public void testGetName(){
        assertEquals("Jesse", student.getName());
    }

    @Test
    public void TestAddGrade(){
        assertEquals(1, student.getGrades().size());

        student.addGrade(90);
        student.addGrade(90);
        student.addGrade(90);
        assertEquals( 4, student.getGrades().size());
    }

}
