package assignment3_4.task3;
import java.io.*;

public class Enrollment implements Serializable{
    private Student student;
    private Course course;
    private String emrollmentDate;

    public Enrollment(Student student, Course course, String emrollmentDate) {
        this.student = student;
        this.course = course;
        this.emrollmentDate = emrollmentDate;
    }

    //getters
    public Student getStudent() {
        return student;
    }
    public Course getCourse() {
        return course;
    }
    public String getEmrollmentDate() {
        return emrollmentDate;
    }

    //setters
    public void setStudent(Student student) {
        this.student = student;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
    public void setEmrollmentDate(String emrollmentDate) {
        this.emrollmentDate = emrollmentDate;
    }
}
