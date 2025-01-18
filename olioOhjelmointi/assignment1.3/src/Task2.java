import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a binary number");
        String binary = sc.nextLine();
        int decimal = 0;

        /*
        System.out.println(binary.charAt(0) + binary.length());
        System.out.println(binary.charAt(0));
        System.out.println(binary.length());
         */

        for (int i = 0; i < binary.length(); i++) {
            decimal += (int)(binary.charAt(i)-48) * Math.pow(2, binary.length()-i-1);
        }
        System.out.println(decimal);

    }
}
