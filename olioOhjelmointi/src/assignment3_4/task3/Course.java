package assignment3_4.task3;
import java.io.*;

public class Course implements Serializable{
    private String courseCode;
    private String courseName;
    private String instructor;

    public Course(String courseCode, String courseName, String instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    //getters
    public String getCourseCode() {
        return courseCode;
    }
    public String getCourseName() {
        return courseName;
    }
    public String getInstructor() {
        return instructor;
    }

    //setters
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
}
