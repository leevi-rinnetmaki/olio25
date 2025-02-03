package assignment3_4.task3;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("olioOhjelmointi//src//assignment3_4//task3//enrollments.ser");
        Student matti = new Student(1, "Matti", 412);
        Student jarkko = new Student(2, "Jarkko", 389);
        Student leevi = new Student(3, "Leevi", 25);

        Course olioOhjelmointi = new Course("a", "olioOhjelmointi", "Heikki");
        Course projekti = new Course("b", "projekti", "Ilpo");

        Enrollment roller1 = new Enrollment(matti, olioOhjelmointi, "1613");
        Enrollment roller2 = new Enrollment(jarkko, projekti, "1636");

        try (
            FileOutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        ){
            objectOutputStream.writeObject(roller1);

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("eka");
        }


        try(
            FileInputStream inputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        ){
            Enrollment roller3 = (Enrollment)objectInputStream.readObject();
            System.out.println(roller3.getStudent().getAge());
            System.out.println(roller3);



        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("toka");
        }
    }
}
