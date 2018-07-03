package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name ="students")
public class Student {
    
    private String firstName;
    private String lastName;
    private int age;
    private int enrollmentNumber;

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
    @Column(name =)

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

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
}

