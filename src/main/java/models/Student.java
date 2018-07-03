package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="students")
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int enrollmentNumber;
    private List<Course> courses;

    public Student(){

    }
    public Student(String firstName, String lastName, int age, int enrollmentNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.enrollmentNumber = enrollmentNumber;
    }



    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }
    @Column(name = "age")
    public int getAge() {
        return age;
    }
    @Column(name = "enrollment_number")
    public int getEnrollmentNumber() {
        return enrollmentNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEnrollmentNumber(int enrollmentNumber) {
        this.enrollmentNumber = enrollmentNumber;
    }
    @ManyToOne
    @JoinColumn(name ="course_id", nullable = false)
    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}

