package assignment1_4;
import java.util.Scanner;

public class Task1 {

    static int rand(int x){
        return (int)Math.floor(Math.random() * x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] firstNames = {"Matti", "Jarkko", "Ilpo", "Heikki"};
        String[] lastNames = {"Valovirta", "Vuori", "Kuivanen", "Lauranto"};

        System.out.println("How many random names do you want generated?");
        int numberOfNames = sc.nextInt();

        for (int i = 0; i < numberOfNames; i++) {
            System.out.println(firstNames[rand(4)] + " " + lastNames[rand(4)]);
        }
    }
}
