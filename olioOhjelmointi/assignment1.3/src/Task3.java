import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me starting and ending number for the prime number software");
        int start = sc.nextInt();
        int end = sc.nextInt();
        boolean prime = true;

        if(start < 2){
            start=2;
        }

        while (start <= end) {
            for (int i = 2; i < start; i++) {
                if (start % i == 0) {
                    prime = false;
                }
            }
            if (prime) {
                System.out.println(start);
            }else{
                prime = true;
            }
            start++;
        }


    }
}
