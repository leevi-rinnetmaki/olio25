package assignment3_4.task3;
import java.io.*;

public class Student implements Serializable{
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    //getters
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    //setters
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
}
