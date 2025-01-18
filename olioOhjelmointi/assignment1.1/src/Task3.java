import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        double first = Double.parseDouble(scanner.nextLine());

        System.out.println("Give the second number:");
        double second = Double.parseDouble(scanner.nextLine());

        System.out.println("Give the third number:");
        double third = Double.parseDouble(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (first + second + third));
        System.out.println("The product of the numbers is " + (first * second * third));
        System.out.println("The average of the numbers is " + ((first/3) + (second/3) + (third/3)));
    }
}
/*
Only minor problem with the average value was with turning int to float.
I also used a slightly odd way of counting the average.
 */