import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        float first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        float second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        float third = Integer.parseInt(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (first + second + third));
        System.out.println("The product of the numbers is " + (first * second * third));
        System.out.println("The average of the numbers is " + ((first/3) + (second/3) + (third/3)));
    }
}