import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int multiplier;
        int multiplicand;
        int score = 0;
        //System.out.println(rand.nextInt(10));


        while (score < 10) {
            multiplier = rand.nextInt(10);
            multiplicand = rand.nextInt(10);
            System.out.println("Score " + score + " question " + multiplier + "x" + multiplicand);
            if(multiplier * multiplicand == sc.nextInt()){
                score++;
            }else{
                score = 0;
            }
        }
        System.out.println("Congratulations on mastering multiplication1");
    }
}
