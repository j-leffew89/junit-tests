import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void createStudentTest(){
        long id = 1L;
        String name = "Fer";
        Student student = new Student(id, name);
        assertSame(student.getId(), id);
        assertSame(student.getName(), name);
    }

    @Test
    public void getGradesTest(){
        long id = 1L;
        String name = "Fer";
        Student student = new Student(id, name);
        assertNotNull(student.getGrades());
    }

//    public void addGrade(int grade);
    @Test
    public void addGradeTest(){

    }


    // returns the average of the students grades
//    public double getGradeAverage();

}
