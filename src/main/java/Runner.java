import db.DBHelper;
import models.Course;
import models.Level;
import models.Student;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Course course1 = new Course("Chinese History",Level.BA);
        Course course2 = new Course("Jewellery",Level.BFA);
        Course course3 = new Course("Chemical Engineering",Level.BSC);
        Course course4 = new Course("Computer Science",Level.BENG);
        Course course5 = new Course("Art History",Level.BA);
        DBHelper.saveOrUpdate(course1);
        DBHelper.saveOrUpdate(course2);
        DBHelper.saveOrUpdate(course3);
        DBHelper.saveOrUpdate(course4);
        DBHelper.saveOrUpdate(course5);

    Student student1 = new Student("Campbell", "Miller", 31, 789,course4);
    DBHelper.saveOrUpdate(student1);
    Student student2 = new Student("Derek", "Smith", 34, 456, course1);
    DBHelper.saveOrUpdate(student2);
    Student student3 = new Student("Adri", "Adrison", 28, 567, course5);
    DBHelper.saveOrUpdate(student3);



    List<Student> studentsAll = DBHelper.getAll(Student.class);

    }
}
